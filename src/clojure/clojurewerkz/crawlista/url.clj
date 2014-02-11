;; Copyright (c) 2011-2014 Michael S. Klishin, Alex Petrov, and the ClojureWerkz team
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns clojurewerkz.crawlista.url
  (:import [java.net URI URL MalformedURLException]
           clojurewerkz.urly.UrlLike)
  (:use [clojure.string :only [trim blank? lower-case]]
        clojurewerkz.support.string
        [clojurewerkz.urly.core :only [path-of url-like eliminate-extra-protocol-prefixes]]))

;;
;; Implementation
;;

(def ^{:private true :const true}
  ENCODED_SPACE "%20")
(def ^{:private true :const true}
  SPACE " ")

(defn- encode-spaces
  [^String s]
  (.replaceAll s SPACE ENCODED_SPACE))

(defn strip-query-string
  [^String s]
  (.replaceAll s "\\?.*$" ""))

(defn strip-fragment
  [^String s]
  (.replaceAll s "\\#.*$" ""))

(def resourcify
  (comp (fn [^String s]
          (if-let [path (path-of s)]
            (if-not (re-find #"\.([a-zA-Z0-9]+)$" (path-of s))
              (maybe-append s "/")
              s)
            ""))
        strip-query-string
        lower-case
        trim))

(defn- maybe-prepend-protocol
  "Fixes broken URLs like //jobs.arstechnica.com/list/1186 (that parse fine and both have host and are not considered absolute by java.net.URI)"
  ([^String uri-str]
     (maybe-prepend-protocol uri-str "http"))
  ([^String uri-str ^String proto]
     (let [uri (URI. uri-str)]
       (if (and (not (.isAbsolute uri))
                (not (nil? (.getHost uri))))
         (str proto ":" uri-str)
         uri-str))))

;; ...

;;
;; API
;;

(defn client-side-href?
  [^String s]
  (or (.startsWith s "#")
      (.startsWith s "(")
      (.startsWith (.toLowerCase s) "javascript")
      (blank? s)))

(defn crawlable-href?
  [^String s]
  (and (not (client-side-href? s)) (try
                                     (URI. (strip-query-string s))
                                     true
                                     (catch java.net.URISyntaxException se
                                       false)
                                     (catch Exception e
                                       false))))



(defn local-to?
  [^String uri-str ^String host]
  (let [uri (URI. (-> uri-str eliminate-extra-protocol-prefixes strip-query-string (maybe-prepend-protocol "http")))]
    (or (and (.getHost uri)
             (= (maybe-prepend (.toLowerCase host) "www.") (maybe-prepend (.toLowerCase (.getHost uri)) "www.")))
        (not (.isAbsolute uri)))))

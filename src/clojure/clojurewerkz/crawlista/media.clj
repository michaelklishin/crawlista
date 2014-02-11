;; Copyright (c) 2011-2014 Michael S. Klishin, Alex Petrov, and the ClojureWerkz team
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns clojurewerkz.crawlista.media
  (:require [pantomime.media :as pm]
            [pantomime.web   :as pw])
  (:import [org.apache.tika.mime MediaType]))

(def ^{:private true}
  html-content-media-types (set (map (comp pm/base-type pm/parse) #{"text/html" "application/xhtml+xml"})))

(defn html-content?
  "Returns true if provided input (commonly HTTP response body) is HTML or xHTML content (text/html or application/xhtml+xml)"
  ([^String body]
     (html-content-media-types (pm/base-type (pm/parse body))))
  ([^String body headers]
     (html-content-media-types (pm/base-type (pw/mime-type-of body headers)))))

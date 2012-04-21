(ns clojurewerkz.crawlista.extraction
  (:import [org.jsoup Jsoup]
           [org.jsoup.nodes Document Element]
           [java.net URI URL MalformedURLException])
  (:use    clojurewerkz.crawlista.string
           clojurewerkz.crawlista.url
           [clojurewerkz.urly.core :only [url-like eliminate-extra-protocol-prefixes host-of mutate-query
                                          absolutize normalize-url without-fragment]]))

;;
;; Implementation
;;

(defn- ^String href-from
  [^Element a]
  (.attr ^Element a "href"))

(defn- urls-from
  [anchors]
  (map href-from anchors))

(defn followable?
  [^Element anchor]
  (let [rel-value (.attr anchor "rel")]
    (or (nil? rel-value)
        (not (= "nofollow"
                (-> rel-value .toLowerCase .trim))))))

;;
;; API
;;

(defn extract-title
  (^String [^String body]
           (-> ^Document (Jsoup/parse body) .title)))

(defn extract-body-text
  (^String [^String body]
           (-> ^Document (Jsoup/parse body) .body .text)))

(defn extract-body-html
  (^String [^String body]
           (-> ^Document (Jsoup/parse body) .body .html)))



(defn extract-anchors
  "Extracts anchor elements from HTML body"
  [^String body]
  (.getElementsByTag ^Document (Jsoup/parse body) "a"))

(defn extract-local-urls
  "Extract URLs from anchor elements with hrefs local to the given page"
  [^String body uri]
  (let [host        (host-of uri)
        anchors     (extract-anchors body)
        hrefs       (urls-from anchors)]
    (set (map (fn [^String s]
                (-> (absolutize s uri) strip-fragment))
              (filter (fn [^String s]
                        (local-to? (strip-query-string s) host))
                      hrefs)))))

(defn extract-local-followable-anchors
  "Like extract-achors but filters out anchors that can be followed (do not have rel=nofollow attribute)"
  [body uri]
  (filter followable? (extract-anchors body)))

(defn extract-local-followable-urls
  "Like extract-local-urls but filters out anchors that can be followed (do not have rel=nofollow attribute)"
  [body uri]
  (let [host       (host-of uri)
        anchors    (extract-local-followable-anchors body (strip-query-string uri))
        urls       (filter crawlable-href? (urls-from anchors))]
    (set (map (fn [^String s]
                (-> (absolutize s uri) strip-fragment))
              (filter
               (fn [^String s]
                 (local-to? s host))
               urls)))))


(defn has-anchor?
  "Returns true if page body has an anchor (<a> tag) with given URL href value and text"
  ([body uri]
     (let [hrefs (urls-from (extract-anchors body))]
       (some (fn [^String s]
               (and s
                    (= (resourcify s) (resourcify uri)))) hrefs)))
  ([body uri text]
     (let [anchors (extract-anchors body)]
       (some (fn [^Element anchor]
               (let [href (.attr anchor "href")]
                 (and href
                      (= (resourcify href) (resourcify uri))
                      (= (.text anchor) text)))) anchors))))

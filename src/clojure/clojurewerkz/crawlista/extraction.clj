(ns clojurewerkz.crawlista.extraction
  (:import [org.jsoup Jsoup]
           [org.jsoup.nodes Document Element]
           [java.net URI URL MalformedURLException])
  (:use    [clojurewerkz.crawlista.string]
           [clojurewerkz.crawlista.url]))

;;
;; Implementation
;;

(defn- urls-from
  [anchors]
  (map (fn [a] (.attr ^Element a "href")) anchors))


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
  [body]
  (seq (-> (Jsoup/parse body)
           (.getElementsByTag "a"))))

(defn extract-local-anchors
  [body uri]
  (let [host        (.getHost (URL. uri))]
    (seq (-> (Jsoup/parse body)
             (.getElementsByTag "a")))))

(defn extract-local-urls
  [body uri]
  (let [host        (.getHost (URL. (strip-query-string uri)))
        anchors     (extract-local-anchors body uri)
        hrefs       (urls-from anchors)]
    (set (distinct (map (fn [^String s] (normalize-url (absolutize s uri)))
                        (filter (fn [^String s] (local-to? (strip-query-string s) host)) hrefs))))))

(defn followable?
  [^Element anchor]
  (let [rel-value (.attr anchor "rel")]
    (or (nil? rel-value)
        (not (= "nofollow"
                (-> rel-value .toLowerCase .trim))))))

(defn extract-local-followable-anchors
  [body uri]
  (filter followable? (extract-local-anchors body uri)))

(defn extract-local-followable-urls
  [body uri]
  (let [host       (.getHost (URL. uri))
        anchors    (extract-local-followable-anchors body (strip-query-string uri))
        urls       (filter crawlable-href? (urls-from anchors))]
    (set (distinct (map (fn [^String s] (normalize-url (absolutize s uri)))
                        (filter (fn [^String s] (local-to? s host)) urls))))))


(defn has-anchor?
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

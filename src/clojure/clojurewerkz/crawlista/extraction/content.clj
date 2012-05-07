(ns clojurewerkz.crawlista.extraction.content
  (:require [clojure.java.io :as io])
  (:import de.l3s.boilerpipe.extractors.ArticleExtractor
           de.l3s.boilerpipe.BoilerpipeExtractor
           org.jsoup.Jsoup
           org.jsoup.nodes.Document))

;;
;; Implementation
;;

(def ^{:private true :tag ArticleExtractor}
  article-extractor (ArticleExtractor/getInstance))

;;
;; API
;;

(defn extract-title
  (^String [^String body]
           (-> ^Document (Jsoup/parse body) .title)))

(defn ^String extract-text
  "Extracts main content text. By default, Article Extractor is used"
  ([^String html]
     (.getText article-extractor html))
  ([^BoilerpipeExtractor extractor ^String html]
     (.getText extractor html)))

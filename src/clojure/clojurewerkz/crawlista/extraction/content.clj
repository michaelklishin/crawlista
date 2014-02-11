;; Copyright (c) 2011-2014 Michael S. Klishin, Alex Petrov, and the ClojureWerkz team
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

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

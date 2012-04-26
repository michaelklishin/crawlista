(ns clojurewerkz.crawlista.test.extraction.content-test
  (:require [clojure.java.io :as io])
  (:use clojurewerkz.crawlista.extraction.content
        clojure.test))


(deftest test-extract-text
  (are [article-filename begins-with ends-with] (let [result (extract-text (slurp (io/resource article-filename)))]
                                                  (is (.startsWith result begins-with))
                                                  (is (.endsWith result ends-with)))
    "html/articles/ars_on_wwdc_2012.html" "Apple's WWDC 2012 will be June 11-15" "managed to get a ticket!\n"))

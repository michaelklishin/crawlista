(ns clojurewerkz.crawlista.test.extraction.content-test
  (:require [clojure.java.io :as io])
  (:use clojurewerkz.crawlista.extraction.content
        clojure.test))

(deftest test-extract-title
  (is (= "Wired.com" (extract-title (slurp (clojure.java.io/resource "html/example1.html"))))))

(deftest test-extract-text
  (testing "ars article"
    (let [result (.trim (extract-text (slurp (io/resource "html/articles/ars_on_wwdc_2012.html"))))]
      (is (.startsWith result "Apple's WWDC 2012 will be June 11-15"))
      (is (.endsWith   result "Hope those of you who were interested managed to get a ticket!"))))
  (testing "case 1 (in English)"
    (let [result (.trim (extract-text (slurp (io/resource "html/articles/en_example1.html"))))]
      (is (.startsWith result "Tweet\nSince launching in"))
      (is (re-find #"Can it last the distance?" result))
      (is (re-find #"Since launching in January, French operator Free Mobile" result))
      (is (.endsWith result "Related research and analysis from GigaOM Pro:"))))
  (testing "case 1 (in Russian)"
    (let [result (.trim (extract-text (slurp (io/resource "html/articles/ru_example1.html"))))]
      (is (.startsWith result "— 26.04.2012 15:52 —"))
      (is (re-find #"Чуковский: бесплатные трансляции на сайте «НТВ-Плюс»" result))
      (is (.endsWith result "Это можно увидеть на нашем сайте»."))))
  (testing "en masse"
    (are [article-filename starts-with] (let [result (.trim (extract-text (slurp (io/resource article-filename))))]
                                          (is (.startsWith result starts-with)))
         "html/articles/ars_on_wwdc_2012.html" "Apple's WWDC 2012 will be June 11-15"
         "html/articles/en_example1.html"      "Tweet\nSince launching in January, French operator Free Mobile"
         "html/articles/de_example1.html"      "Fachartikel   Die Chinesen kommen")))

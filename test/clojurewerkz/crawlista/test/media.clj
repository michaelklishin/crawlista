(ns clojurewerkz.crawlista.test.media
  (:require [pantomime.media :as mt])
  (:use clojurewerkz.crawlista.media
        clojure.test))

(deftest test-html-content?
  (are [ct] (is (html-content? ct))
       "text/html"
       "text/html; charset=UTF-8"
       "application/xhtml+xml"
       (mt/parse "text/html")
       (mt/parse "application/xhtml+xml")
       (mt/parse "charset=UTF-8; text/html"))
  (are [ct] (is (not (html-content? ct)))
       "image/jpeg"
       "application/pdf"
       (mt/parse "application/postscript")
       (mt/parse "video/quicktime")))

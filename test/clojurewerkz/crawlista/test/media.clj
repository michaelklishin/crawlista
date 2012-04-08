(ns clojurewerkz.crawlista.test.media
  (:require [pantomime.media :as pm]
            [clj-http.client :as http])
  (:use clojurewerkz.crawlista.media clojure.test))

(deftest test-html-content?
  (are [ct] (is (html-content? ct))
       "text/html"
       "text/html; charset=UTF-8"
       "application/xhtml+xml"
       (pm/parse "text/html")
       (pm/parse "application/xhtml+xml")
       (pm/parse "charset=UTF-8; text/html"))
  (are [ct] (is (not (html-content? ct)))
       "image/jpeg"
       "application/pdf"
       (pm/parse "application/postscript")
       (pm/parse "video/quicktime")))


(deftest test-unified-http-response-content-type-detection
  (are [url expect-true?] (let [{:keys [^String body headers status]} (http/get url)]
                             (is (= 200 status))
                             (if expect-true?
                               (is (html-content? body headers))
                               (is (not (html-content? body headers)))))
       "http://files.travis-ci.org/docs/amqp/0.9.1/AMQP091Specification.pdf" false
       "http://github.com/robots.txt"                                        false
       "http://www.amazon.com/sitemap-manual-index.xml"                      false
       "http://docs.oracle.com/javase/7/docs/index.html"                     true
       "http://clojuredocs.org/"                                             true
       "http://upload.wikimedia.org/wikipedia/en/1/1a/Clojure-glyph.svg"     false
       "http://upload.wikimedia.org/wikipedia/commons/9/9a/PNG_transparency_demonstration_2.png" false
       "http://creativecommons.org/images/deed/cc-logo.jpg" false))

(ns clojurewerkz.crawlista.test.media-test
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
       "https://upload.wikimedia.org/wikipedia/commons/7/72/SVO_Ring.pdf"    false
       "http://www.infoq.com/robots.txt"                                     false
       "http://www.google.com/sitemap.xml"                                   false
       "http://arstechnica.com"                                              true
       "http://readwriteweb.com"                                             true
       "http://clojure.org/"                                                 true
       "http://upload.wikimedia.org/wikipedia/commons/1/1a/Clojure-glyph.svg" false
       "http://creativecommons.org/images/deed/cc-logo.jpg"                   false
       "http://elpais.com.uy/formatos/rss/index.asp?seccion=umomento"         false
       "http://tagesanzeiger.ch/panorama/vermischtes/stichwort.rss?tagId=1280" false))

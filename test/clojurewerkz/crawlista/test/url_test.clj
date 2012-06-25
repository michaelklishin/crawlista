(ns clojurewerkz.crawlista.test.url-test
  (:import [java.net URI URL])
  (:use clojurewerkz.crawlista.url
        clojure.test))

(deftest ^:focus test-relative-anchor-locality
  (is (local-to? "http://wired.com/reviews"         "wired.com"))
  (is (local-to? "http://wired.com/reviews"         "www.wired.com"))
  (is (local-to? "http://www.wired.com/reviews"     "wired.com"))
  (is (local-to? "http://http://www.wired.com/reviews"  "wired.com"))
  (is (local-to? "http://https://www.wired.com/reviews" "wired.com"))
  (is (local-to? "http://www.wired.com/reviews"     "wired.com"))
  (is (local-to? "/reviews"                         "wired.com"))
  (is (not (local-to? "http://wired.com/reviews"    "apple.com")))
  (is (not (local-to? "http://apple.com/iphone"     "wired.com")))
  (is (not (local-to? "http://apple.com/iphone"     "clojure.org")))
  (is (not (local-to? "http://bit.ly/clojure.org"   "clojure.org")))
  (is (not (local-to? "http://jobs.arstechnica.com" "arstechnica.com")))
  (is (not (local-to? "http://jobs.arstechnica.com/list/1186" "arstechnica.com")))
  (is (not (local-to? "//jobs.arstechnica.com/list/1186" "arstechnica.com"))))


(deftest test-resourcification
  (is (= "" (resourcify "http://www.kfw.de/Unternehmensbefragung_2012.pdf]")))
  (is (= "http://novemberain.com/" (resourcify "http://NOVEMBERAIN.com?query=string")))
  (is (= "http://novemberain.com/" (resourcify "http://NOVEMBERAIN.com")))
  (is (= "http://novemberain.com/" (resourcify "http://NOVEMBERAIN.com?query=string#fragment")))
  (is (= "http://novemberain.com/page.html" (resourcify "http://NOVEMBERAIN.com/page.html?query=string")))
  (is (= "http://novemberain.com/page/" (resourcify "http://NOVEMBERAIN.com/page")))
  (is (= "http://novemberain.com/page/" (resourcify "http://NOVEMBERAIN.com/page/"))))

(deftest test-client-side-hrefs
  (is (client-side-href? " "))
  (is (client-side-href? ""))
  (is (client-side-href? "#"))
  (is (client-side-href? "#/"))
  (is (client-side-href? "(0)"))
  (is (client-side-href? "javascript: void()(0)"))
  (is (client-side-href? "javascript: alert('123')")))

(deftest test-crawlable-hrefs
  (is (crawlable-href? "http://username:password@host:80/path?query=string#fragment"))
  (is (crawlable-href? "http://bit.ly/clojure.org"))
  (is (crawlable-href? "http://apple.com/iphone"))
  (is (crawlable-href? "www.apple.com/iphone"))
  (is (crawlable-href? "apple.com/iphone"))
  (is (crawlable-href? "apple.com:80/iphone"))
  (is (crawlable-href? "apple.com:/iphone"))
  (is (crawlable-href? "/reviews"))
  (is (crawlable-href? "/blobs?page=3#comments"))
  (is (not (crawlable-href? " ")))
  (is (not (crawlable-href? "")))
  (is (not (crawlable-href? "#")))
  (is (not (crawlable-href? "#/")))
  (is (not (crawlable-href? "(0)")))
  (is (not (crawlable-href? "\\\"http:\\/\\/wired.com\\/apple\\/review-the-galaxy-nexus-from-an-iphone-owners-perspective\\/\\\"")))
  (is (not (crawlable-href? "javascript: void()(0)")))
  (is (not (crawlable-href? (slurp (clojure.java.io/resource "js/href_value1.js")))))
  (is (not (crawlable-href? "javascript: alert('123')"))))

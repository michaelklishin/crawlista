(ns clojurewerkz.crawlista.test.url
  (:import [java.net URI URL])
  (:use clojurewerkz.crawlista.url
        clojure.test))

(deftest test-relative-anchor-locality
  (is (local-to? "http://wired.com/reviews"         "wired.com"))
  (is (local-to? "http://wired.com/reviews"         "www.wired.com"))
  (is (local-to? "http://www.wired.com/reviews"     "wired.com"))
  (is (local-to? "/reviews"                         "wired.com"))
  (is (not (local-to? "http://wired.com/reviews"    "apple.com")))
  (is (not (local-to? "http://apple.com/iphone"     "wired.com")))
  (is (not (local-to? "http://apple.com/iphone"     "clojure.org")))
  (is (not (local-to? "http://bit.ly/clojure.org"   "clojure.org")))
  (is (not (local-to? "http://jobs.arstechnica.com" "arstechnica.com")))
  (is (not (local-to? "http://jobs.arstechnica.com/list/1186" "arstechnica.com")))
  (is (not (local-to? "//jobs.arstechnica.com/list/1186" "arstechnica.com"))))


(deftest test-strip-query-string
  (is (= "http://novemberain.com" (strip-query-string "http://novemberain.com?query=string"))))

(deftest test-separate-query-string
  (are [input output] (is (= output (separate-query-string input)))
       "http://novemberain.com?query=string" ["http://novemberain.com" "query=string"]
       "http://www.iq-shop.de/catalogsearch/advanced/result/?___SID=U?product_type=54" ["http://www.iq-shop.de/catalogsearch/advanced/result/" "___SID=U?product_type=54"]))

(deftest test-resourcification
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

(deftest test-host-normalization-with-strings
  (are [input result] (is (= (normalize-host input) result))
       "http://www.google.com/"     "http://google.com/" ;; does not deal with path. MK.
       "www.google.com/"            "google.com/"
       "https://www.apple.com"      "https://apple.com"
       "http://www.store.apple.com" "http://store.apple.com"
       (URL. "http://www.google.com/") (URL. "http://google.com/")
       (URI. "http://www.google.com/") (URI. "http://google.com/")))

(deftest test-full-url-normalization-with-strings
  (are [input result] (is (= (normalize-url input) result))
       "http://www.google.com/"     "http://google.com"
       "www.google.com/"            "google.com"
       "https://www.apple.com"      "https://apple.com"
       "http://www.store.apple.com" "http://store.apple.com"
       "http://www.iq-shop.de/catalogsearch/advanced/result/?___SID=U?product_type=54" "http://iq-shop.de/catalogsearch/advanced/result/?___SID=U?product_type=54"))

(deftest test-absolutize-with-strings
  (is (= (absolutize ""  "http://giove.local")  "http://giove.local/"))
  (is (= (absolutize ""  "http://giove.local/") "http://giove.local/"))
  (is (= (absolutize "/" "http://giove.local")  "http://giove.local/"))
  (is (= (absolutize "/" "http://giove.local/") "http://giove.local/"))
  (is (= (absolutize "/comments?authenticate=1" "http://giove.local") "http://giove.local/comments?authenticate=1"))
  (are [input result] (is (= (absolutize input "http://giove.local/") result))
       ""                                  "http://giove.local/"
       "/"                                 "http://giove.local/"
       "/reviews"                          "http://giove.local/reviews"
       "/autopia/2011/11/evs-go-off-grid/" "http://giove.local/autopia/2011/11/evs-go-off-grid/"
       "offline.html"                      "http://giove.local/offline.html")
  (is (= (absolutize "http://www.iq-shop.de/catalogsearch/advanced/result/?___SID=U?product_type=54" "www.iq-shop.de")
         "http://www.iq-shop.de/catalogsearch/advanced/result/?___SID=U?product_type=54"))
  (is (= (absolutize "maintenance.html"  "http://giove.local/system/") "http://giove.local/system/maintenance.html"))
  (is (= (absolutize "maintenance.html"  "http://giove.local/system")  "http://giove.local/maintenance.html"))
  (is (= (absolutize "maintenance.html"  "http://giove.local/system/") "http://giove.local/system/maintenance.html"))
  (is (= (absolutize "support/1.css" "http://tc.labs.opera.com/html/link/002.htm")  "http://tc.labs.opera.com/html/link/support/1.css"))
  (is (= (absolutize "support/css"   "http://tc.labs.opera.com/html/link/002.htm")  "http://tc.labs.opera.com/html/link/support/css")))

(deftest test-absolutize-with-uris
  (are [input result] (is (= (absolutize input (URI. "http://giove.local")) result))
       (URI. "")                                  (URI. "http://giove.local")
       (URI. "/")                                 (URI. "http://giove.local/")
       (URI. "/reviews")                          (URI. "http://giove.local/reviews")
       (URI. "/autopia/2011/11/evs-go-off-grid/") (URI. "http://giove.local/autopia/2011/11/evs-go-off-grid/")))

(deftest test-whether-uri-is-root
  (is (root? "http://giove.local"))
  (is (root? "http://giove.local/"))
  (is (root? "https://giove.local"))
  (is (root? "https://giove.local/"))
  (is (root? "http://www.giove.local"))
  (is (root? "HTTPS://www.giove.local/"))
  (is (root? "https://subdomain.giove.local"))
  (is (root? "https://subdomain.giove.local/"))
  (is (root? "https://www.subdomain.giove.local"))
  (is (root? "http://www.subdomain.giove.local/"))
  (is (not (root? "http://giove.local/path")))
  (is (not (root? "https://giove.local/section/path")))
  (is (not (root? "HTTPS://www.giove.local/search?q=weather"))))

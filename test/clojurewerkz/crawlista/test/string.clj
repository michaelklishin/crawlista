(ns clojurewerkz.crawlista.test.string
  (:import (java.net URI URL))
  (:use [clojurewerkz.crawlista.string]
        [clojure.test]))

(deftest test-maybe-prepend-www
  (is (= "www.apple.com" (maybe-prepend "apple.com" "www.")))
  (is (= "www.apple.com" (maybe-prepend "APPLE.com" "www.")))
  (is (= "www.apple.com" (maybe-prepend "www.apple.com" "www."))))

(deftest test-maybe-chopl
  (is (= (maybe-chopl "www.google.com" "www.") "google.com"))
  (is (= (maybe-chopl "google.com" "goo") "gle.com"))
  (is (= (maybe-chopl "Google.COM" "google.") "com"))
  (is (= (maybe-chopl "www.www2.megacorp.net" "www.") "www2.megacorp.net")))

(deftest test-maybe-chopr
  (is (= (maybe-chopr "http://www.google.com/" "/") "http://www.google.com"))
  (is (= (maybe-chopr "google.com/" ".com/") "google"))
  (is (= (maybe-chopr "Google.COM/" "/") "google.com")))

(deftest test-hexadecimal-to-int
  (are [s i] (is (= (hex-to-int s) i))
       "0xFF00FF" 16711935
       "FF00FF"   16711935
       "0xFF0000" 16711680
       "FF0000"   16711680
       "0x001100" 4352
       "001100"   4352))

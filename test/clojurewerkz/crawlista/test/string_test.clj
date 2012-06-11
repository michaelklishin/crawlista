(ns clojurewerkz.crawlista.test.string-test
  (:import (java.net URI URL))
  (:use [clojurewerkz.crawlista.string]
        [clojure.test]))

(deftest test-chop-last-path-segment
  (are [input output] (is (= (chop-last-path-segment input) output))
       "http://giove.local/a/b/c/d/e/"       "http://giove.local/a/b/c/d/e/"
       "http://giove.local/a/b/c/index.html" "http://giove.local/a/b/c/"
       "http://giove.local/a/"               "http://giove.local/a/"
       "http://giove.local/"                 "http://giove.local/"))

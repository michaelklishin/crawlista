(ns clojurewerkz.crawlista.test.robots
  (:use [clojurewerkz.crawlista.robots]
        [clojure.test]))

(deftest test-parsing-of-input-with-just-a-one-line-comment
  (is (= {} (parse "#")))
  (is (= {} (parse "# ")))
  (is (= {} (parse "#  ")))
  (is (= {} (parse "  #  ")))
  (is (= {} (parse "# A comment")))
  (is (= {} (parse "# A comment")))  
  (is (= {} (parse "  #    Комментарий"))))

(deftest test-parsing-of-input-with-just-a-multiline-comment
  (is (= {} (parse "# A comment
                    # Another comment")))  
  (is (= {} (parse "  #    Комментарий
                   # и еще один"))))

(deftest test-parsing-of-input-with-just-a-user-agent-string
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler")))
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler  ")))  
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler # a comment")))
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler # a comment
                                     # и еще один комментарий"))))


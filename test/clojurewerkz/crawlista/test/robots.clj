(ns clojurewerkz.crawlista.test.robots
  (:use [clojurewerkz.crawlista.robots]
        [clojure.test]))

(deftest test-parsing-of-input-with-just-a-one-line-comment
  (is (= {} (parse "#")))
  (is (= {} (parse "# ")))
  (is (= {} (parse "#  ")))
  (is (= {} (parse "  #  ")))
  (is (= {} (parse "# A comment")))
  (is (= {} (parse "  #    Комментарий"))))

(deftest test-parsing-of-input-with-just-a-user-agent-string
  (let [input "User-agent: webcrawler"]
    ))


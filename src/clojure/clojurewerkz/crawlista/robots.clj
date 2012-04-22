(ns clojurewerkz.crawlista.robots
  (:import [clojurewerkz.crawlista.robots Parser]))

;;
;; Implementation
;;

(defn parse*
  [^String input]
  (let [parser (Parser.)]
    (.parse parser input)))

;;
;; API
;;

(defn parse
  [^String input]
  (let [xs (parse* input)]
    xs))

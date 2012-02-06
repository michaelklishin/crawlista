(ns clojurewerkz.crawlista.robots
  (:import [clojurewerkz.crawlista.robots Parser]))

;;
;; Implementation
;;


;;
;; API
;;

(defn parse
  [^String input]
  (let [parser (Parser.)]
    (.parse parser input)))

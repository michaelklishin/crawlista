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
  (Parser/parse input))

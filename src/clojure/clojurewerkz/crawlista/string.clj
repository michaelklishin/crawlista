(ns clojurewerkz.crawlista.string)

(defn chop-last-path-segment
  [^String s]
  (.replaceAll s "[^/]+$" ""))

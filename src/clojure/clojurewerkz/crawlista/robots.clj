;; Copyright (c) 2011-2014 Michael S. Klishin, Alex Petrov, and the ClojureWerkz team
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

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

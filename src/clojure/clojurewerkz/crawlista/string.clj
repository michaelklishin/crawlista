(ns clojurewerkz.crawlista.string
  (:use [clojure.string :only [split blank?]]))

(defn maybe-prepend
  [^String s ^String prefix]
  (.toLowerCase (if (.startsWith (.toLowerCase s) (.toLowerCase prefix))
                  s
                  (str prefix s))))

(defn maybe-append
  [^String s ^String suffix]
  (.toLowerCase (if (.endsWith (.toLowerCase s) (.toLowerCase suffix))
                  s
                  (str s suffix))))

(defn maybe-chopl
  [^String s ^String prefix]
  (let [ls (.toLowerCase s)]
    (if (.startsWith ls prefix)
      (.replaceAll ls (str "^" prefix) "")
      s)))

(defn maybe-chopr
  [^String s ^String suffix]
  (let [ls (.toLowerCase s)]
    (if (.endsWith ls suffix)
      (.replaceAll ls (str suffix "$") "")
      s)))

(defn hex-to-int
  [^String s]
    (Long/parseLong (if (.startsWith s "0x")
                      (subs s 2)
                      s) 16))

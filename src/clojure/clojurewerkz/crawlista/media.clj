(ns clojurewerkz.crawlista.media
  (:require [pantomime.media :as mt])
  (:import [org.apache.tika.mime MediaType]))

(def ^{:private true}
  html-content-media-types (set (map (comp mt/base-type mt/parse) #{"text/html" "application/xhtml+xml"})))

(defn html-content?
  "Returns true if given input represents HTML or xHTML content (text/html or application/xhtml+xml)"
  [input]
  (html-content-media-types (mt/base-type (mt/parse input))))

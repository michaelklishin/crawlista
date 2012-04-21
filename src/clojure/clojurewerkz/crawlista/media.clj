(ns clojurewerkz.crawlista.media
  (:require [pantomime.media :as pm]
            [pantomime.web   :as pw])
  (:import [org.apache.tika.mime MediaType]))

(def ^{:private true}
  html-content-media-types (set (map (comp pm/base-type pm/parse) #{"text/html" "application/xhtml+xml"})))

(defn html-content?
  "Returns true if provided input (commonly HTTP response body) is HTML or xHTML content (text/html or application/xhtml+xml)"
  ([^String body]
     (html-content-media-types (pm/base-type (pm/parse body))))
  ([^String body headers]
     (html-content-media-types (pm/base-type (pw/mime-type-of body headers)))))

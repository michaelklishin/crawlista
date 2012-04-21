(defproject clojurewerkz/crawlista "1.0.0-SNAPSHOT"
  :description "Support library for Clojure applications that crawl the Web"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure       "1.3.0"]
                 [clj-http                  "0.3.6"]
                 [org.jsoup/jsoup           "1.6.2"]
                 [clojurewerkz/urly         "1.0.0"]
                 [com.novemberain/pantomime "1.3.0"]]
  :source-paths       ["src/clojure"]
  :resource-paths     ["src/resources"]
  :java-source-paths  ["src/java"]
  :profiles           {:dev {:resource-paths ["test/resources"]}
                       :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}}
  :aliases            { "all" ["with-profile" "dev:dev,1.4"]}
  :repositories {"clojure-releases" "http://build.clojure.org/releases"
                 "sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false,
                             :releases {:checksum :fail :update :always}}}
  :warn-on-reflection true
  :test-selectors     {:default    (constantly true)
                       :focus      :focus
                       :extraction :extraction
                       :all        (constantly true)})

(defproject clojurewerkz/crawlista "1.0.0-SNAPSHOT"
  :description "Support library for Clojure applications that crawl the Web"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure       "1.3.0"]
                 [clj-http                  "0.3.6"]
                 [org.jsoup/jsoup           "1.6.2"]
                 [clojurewerkz/urly         "1.0.0-rc2"]
                 [com.novemberain/pantomime "1.3.0-rc1"]]
  :source-paths      ["src/clojure"]
  :resource-paths    ["src/resources"]
  :java-source-paths ["src/java"]
  :profiles {:dev {:resource-paths ["test/resources"]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0-beta6"]]}}
  :aliases  { "all" ["with-profile" "dev:dev,1.4"] }
  :warn-on-reflection true
  :test-selectors     {:default  (constantly true)
                       :focus    :focus
                       :all      (constantly true)})

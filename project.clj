(defproject clojurewerkz/crawlista "1.0.0-alpha4"
  :description "Support library for Clojure applications that crawl the Web"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http "0.3.3"]
                 [org.jsoup/jsoup "1.6.1"]
                 [clojurewerkz/urly "1.0.0-beta8"]
                 [com.novemberain/pantomime "1.3.0-beta1"]]
  :source-paths ["src/clojure"]
  :profiles {:dev {:resource-paths ["test/resources"]},
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0-beta5"]]}}
  :aliases { "all" ["with-profile" "dev:dev,1.4"] }
  :resource-paths ["src/resources"]
  :java-source-paths ["src/java"]
  :warn-on-reflection true
  :test-selectors   {
                     :default        (fn [v] true)
                     :focus          (fn [v] (:focus v))
                     })

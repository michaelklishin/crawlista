(defproject clojurewerkz/crawlista "1.0.0-SNAPSHOT"
  :description "Support library for Clojure applications that crawl the Web"
  :min-lein-version "2.4.3"
  :dependencies [[org.clojure/clojure          "1.3.0"]
                 [clj-http                     "0.3.6"]
                 [clojurewerkz/support         "0.5.0"]
                 [org.jsoup/jsoup              "1.6.3"]
                 [clojurewerkz/urly            "2.0.0-alpha3"]
                 [com.novemberain/pantomime    "1.3.0"]
                 ;; Boilerpipe treats NekoHTML and Xerces as optional dependencies but absolutely
                 ;; does not work without them. MK.
                 [net.sourceforge.nekohtml/nekohtml "1.9.15"]
                 [xerces/xercesImpl                  "2.9.1"]
                 [de.l3s.boilerpipe/boilerpipe      "1.2.0"]]
  :source-paths       ["src/clojure"]
  :resource-paths     ["src/resources"]
  :java-source-paths  ["src/java"]
  :profiles           {:dev {:resource-paths ["test/resources"]
                             :dependencies [[xerces/xerces "2.4.0"]]}
                       :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
                       :1.5 {:dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}}
  :aliases        {"ci"  ["with-profile" "dev:dev,1.4"]
                   "all" ["with-profile" "dev:dev,1.4:dev,1.5"]}
  :repositories {"boilerpipe"         {:url "http://boilerpipe.googlecode.com/svn/repo/"}
                 "sonatype"           {:url "http://oss.sonatype.org/content/repositories/releases"
                                       :snapshots false
                                       :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :warn-on-reflection true
  :test-selectors     {:default    (constantly true)
                       :focus      :focus
                       :extraction :extraction
                       :robots     :robots
                       :all        (constantly true)}
  :javac-options      ["-target" "1.6" "-source" "1.6"])

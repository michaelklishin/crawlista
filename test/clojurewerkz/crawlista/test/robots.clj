(ns clojurewerkz.crawlista.test.robots
  (:use clojurewerkz.crawlista.robots
        clojure.test))

(deftest ^{:robots true} test-low-level-parser
         (are [input output] (is (= (parse* input) output))
              "User-agent: webcrawler"       [{"user-agent" "webcrawler"}]
              "User-agent: Googlebot"        [{"user-agent" "Googlebot"}]
              "User-agent: Googlebot-Mobile" [{"user-agent" "Googlebot-Mobile"}]
              "User-agent: Googlebot Mobile" [{"user-agent" "Googlebot Mobile"}]
              "User-agent: *"                [{"user-agent" "*"}]
              "User-agent: baiduspider"      [{"user-agent" "baiduspider"}]
              "User-agent: msnbot"           [{"user-agent" "msnbot"}]
              "User-agent: Oracle Secure Enterprise Search"                [{"user-agent" "Oracle Secure Enterprise Search"}]
              "User-agent: EDI/1.6.0 (Edacious & Intelligent Web Crawler)" [{"user-agent" "EDI/1.6.0 (Edacious & Intelligent Web Crawler)"}]
              "User-agent: Microsoft-WebDAV-MiniRedir/5.1.2600"            [{"user-agent" "Microsoft-WebDAV-MiniRedir/5.1.2600"}]
              "User-agent: Python-urllib/1.17"            [{"user-agent" "Python-urllib/1.17"}]
              "User-agent: MS Search 5.0 Robot"           [{"user-agent" "MS Search 5.0 Robot"}]
              "User-agent: Xenu Link Sleuth"              [{"user-agent" "Xenu Link Sleuth"}]
              "User-agent: Mediapartners-Google"          [{"user-agent" "Mediapartners-Google"}]))

#_ (deftest ^{:robots true} test-parsing-of-input-with-just-a-one-line-comment
            (is (= {} (parse "#")))
            (is (= {} (parse "# ")))
            (is (= {} (parse "#  ")))
            (is (= {} (parse "  #  ")))
            (is (= {} (parse "# A comment")))
            (is (= {} (parse "# A comment")))
            (is (= {} (parse "  #    Комментарий"))))

#_ (deftest ^{:robots true} test-parsing-of-input-with-just-a-multiline-comment
            (is (= {} (parse "# A comment
                    # Another comment")))
            (is (= {} (parse "  #    Комментарий
                   # и еще один"))))

#_ (deftest ^{:robots true} test-parsing-of-input-with-just-a-user-agent-string
            (is (= {"webcrawler" []}       (parse "User-agent: webcrawler")))
            (is (= {"webcrawler" []}       (parse "User-agent: webcrawler  ")))
            (is (= {"webcrawler" []}      (parse "User-agent: webcrawler2  ")))
            (is (= {"*" []}                (parse "User-agent: *")))
            (is (= {"Googlebot" []}        (parse "User-agent: Googlebot")))
            (is (= {"Googlebot-Mobile" []} (parse "User-agent: Googlebot-Mobile")))
            (is (= {"baiduspider" []}      (parse "User-agent: baiduspider")))
            (is (= {"msnbot" []}           (parse "User-agent: msnbot")))
            (is (= {"Oracle Secure Enterprise Search" []}                (parse "User-agent: Oracle Secure Enterprise Search")))
            (is (= {"EDI/1.6.0 (Edacious & Intelligent Web Crawler)" []} (parse "User-agent: EDI/1.6.0 (Edacious & Intelligent Web Crawler)")))
            (is (= {"Microsoft-WebDAV-MiniRedir/5.1.2600" []}            (parse "User-agent: Microsoft-WebDAV-MiniRedir/5.1.2600  ")))
            (is (= {"MS Search 5.0 Robot" []}                            (parse "User-agent: MS Search 5.0 Robot")))
            (is (= {"Python-urllib/1.17" []}                             (parse "User-agent: Python-urllib/1.17")))
            (is (= {"Xenu Link Sleuth" []}                               (parse "User-agent: Xenu Link Sleuth")))
            (is (= {"Mediapartners-Google*" []}                          (parse "User-agent: Mediapartners-Google*"))))


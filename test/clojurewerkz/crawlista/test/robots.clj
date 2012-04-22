(ns clojurewerkz.crawlista.test.robots
  (:use clojurewerkz.crawlista.robots
        clojure.test))

(deftest ^{:robots true :focus true} test-low-level-parser-with-basic-examples
         (are [input output] (is (= (parse* input) output))
              "User-agent: *"                [{"user-agent" "*"}]
              "User-agent: webcrawler"       [{"user-agent" "webcrawler"}]
              "User-agent: Googlebot"        [{"user-agent" "Googlebot"}]
              "User-agent:Googlebot"         [{"user-agent" "Googlebot"}]
              "User-agent:Googlebot #GOOG"      [{"user-agent" "Googlebot"}]
              "User-agent:Googlebot # Гуглобот" [{"user-agent" "Googlebot"}]
              "User-agent: Megabot   "          [{"user-agent" "Megabot"}]
              "\t\tUser-agent:\t\t\tMegabot   " [{"user-agent" "Megabot"}]
              "User-agent: webcrawler\nUser-agent: netcrawler" [{"user-agent" "webcrawler"}
                                                                {"user-agent" "netcrawler"}]))

(deftest ^{:robots true} test-low-level-parser
         (are [input output] (is (= (parse* input) output))
              "User-agent: webcrawler"       [{"user-agent" "webcrawler"}]
              "User-agent: Googlebot"        [{"user-agent" "Googlebot"}]
              "User-agent: Megabot   "       [{"user-agent" "Megabot"}]
              "User-agent: Googlebot-Mobile" [{"user-agent" "Googlebot-Mobile"}]
              "User-agent: Xyzzybot\nUser-agent: Xyzzybot-Mobile" [{"user-agent" "Xyzzybot"}
                                                                   {"user-agent" "Xyzzybot-Mobile"}]
              "User-agent: Googlebot Mobile" [{"user-agent" "Googlebot Mobile"}]
              "User-agent: *"                [{"user-agent" "*"}]
              "User-agent: baiduspider"      [{"user-agent" "baiduspider"}]
              "User-agent: msnbot"           [{"user-agent" "msnbot"}]
              ;; "User-agent: msnbot # MSN"           [{"user-agent" "msnbot"}]
              "User-agent: Oracle Secure Enterprise Search"                [{"user-agent" "Oracle Secure Enterprise Search"}]
              "User-agent: EDI/1.6.0 (Edacious & Intelligent Web Crawler)" [{"user-agent" "EDI/1.6.0 (Edacious & Intelligent Web Crawler)"}]
              "User-agent: Microsoft-WebDAV-MiniRedir/5.1.2600"            [{"user-agent" "Microsoft-WebDAV-MiniRedir/5.1.2600"}]
              "User-agent: Python-urllib/1.17"            [{"user-agent" "Python-urllib/1.17"}]
              "User-agent: MS Search 5.0 Robot"           [{"user-agent" "MS Search 5.0 Robot"}]
              "User-agent: Xenu Link Sleuth"              [{"user-agent" "Xenu Link Sleuth"}]
              "User-agent: Mediapartners-Google\nUser-agent: curl"    [{"user-agent" "Mediapartners-Google"}
                                                                       {"user-agent" "curl"}]
              "User-agent: Python-urllib/1.17\nUser-agent:curl"      [{"user-agent" "Python-urllib/1.17"}
                                                                      {"user-agent" "curl"}]
              " #Big search engines\nUser-agent: msnbot # MSN\nUser-agent: Googlebot # Google" [{"user-agent" "msnbot"}
                                                                                                {"user-agent" "Googlebot"}]
              " #Big search engines\n#User-agent: msnbot # MSN\nUser-agent: Googlebot # Google" [{"user-agent" "Googlebot"}]))

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


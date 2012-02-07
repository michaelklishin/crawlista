(ns clojurewerkz.crawlista.test.robots
  (:use [clojurewerkz.crawlista.robots]
        [clojure.test]))

(deftest test-parsing-of-input-with-just-a-one-line-comment
  (is (= {} (parse "#")))
  (is (= {} (parse "# ")))
  (is (= {} (parse "#  ")))
  (is (= {} (parse "  #  ")))
  (is (= {} (parse "# A comment")))
  (is (= {} (parse "# A comment")))  
  (is (= {} (parse "  #    Комментарий"))))

(deftest test-parsing-of-input-with-just-a-multiline-comment
  (is (= {} (parse "# A comment
                    # Another comment")))  
  (is (= {} (parse "  #    Комментарий
                   # и еще один"))))

(deftest test-parsing-of-input-with-just-a-user-agent-string
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler")))
  (is (= { "webcrawler" [] } (parse "User-agent: webcrawler  ")))  
  (is (= { "*" [] }                (parse "User-agent: *")))
  (is (= { "Googlebot" [] }        (parse "User-agent: Googlebot")))
  (is (= { "Googlebot-Mobile" [] } (parse "User-agent: Googlebot-Mobile")))
  (is (= { "baiduspider" [] }      (parse "User-agent: baiduspider")))
  (is (= { "msnbot" [] }           (parse "User-agent: msnbot")))
  (is (= { "Oracle Secure Enterprise Search" [] }                (parse "User-agent: Oracle Secure Enterprise Search")))
  (is (= { "EDI/1.6.0 (Edacious & Intelligent Web Crawler)" [] } (parse "User-agent: EDI/1.6.0 (Edacious & Intelligent Web Crawler)")))
  (is (= { "Microsoft-WebDAV-MiniRedir/5.1.2600" [] }            (parse "User-agent: Microsoft-WebDAV-MiniRedir/5.1.2600  ")))
  (is (= { "MS Search 5.0 Robot" [] }                            (parse "User-agent: MS Search 5.0 Robot")))
  (is (= { "Python-urllib/1.17" [] }                             (parse "User-agent: Python-urllib/1.17")))
  (is (= { "Xenu Link Sleuth" [] }                               (parse "User-agent: Xenu Link Sleuth")))
  (is (= { "Mediapartners-Google*" [] }                          (parse "User-agent: Mediapartners-Google*"))))


(ns clojurewerkz.crawlista.test.extraction
  (:import [java.net URI URL])
  (:use [clojurewerkz.crawlista.extraction]
        [clojurewerkz.crawlista.url]
        [clojure.test]))

(deftest test-extract-title
  (is (= "Wired.com" (extract-title (slurp (clojure.java.io/resource "html/wired.com.html"))))))


(deftest test-extract-local-urls
  (let [body     (slurp (clojure.java.io/resource "html/wired.com.html"))
        result   (extract-local-urls body "http://wired.com")]
    (is (=
         ["http://wired.com"
          "http://wired.com/wiredscience/2011/11/absolute-with-www"
          "http://wired.comwww.wired.com/wiredscience/2011/11/link-without-http"
          "http://wired.com/dangerroom/2011/11/absolute-without-domain"
          "http://wired.comdangerroom/2011/11/relative"
          "http://wired.com/auth?goauth_start=1&goauth_service=linkedin&goauth_action=login&loc="
          "http://wired.com/gadgets/news/2011/11/arms-new-tools-make-it-easier-for-android-devs-to-use-native-code.ars?comments=1"] (vec result)))))

(deftest test-extract-local-followable-urls-case-1
  (let [body     (slurp (clojure.java.io/resource "html/wired.com.html"))
        result   (extract-local-followable-urls body "http://wired.com")]
    (is (=
         ["http://wired.com"
          "http://wired.com/wiredscience/2011/11/absolute-with-www"
          "http://wired.comwww.wired.com/wiredscience/2011/11/link-without-http"
          "http://wired.com/dangerroom/2011/11/absolute-without-domain"
          "http://wired.comdangerroom/2011/11/relative"
          "http://wired.com/gadgets/news/2011/11/arms-new-tools-make-it-easier-for-android-devs-to-use-native-code.ars?comments=1"] (vec result)))))


(deftest test-extract-local-followable-urls-case-2
  (let [body     (slurp (clojure.java.io/resource "html/arstechnica.com.html"))
        result   (vec (extract-local-followable-urls body "http://arstechnica.com"))
        expected ["http://arstechnica.com"
                  "http://arstechnica.com/apple"
                  "http://arstechnica.com/apple/guides/2011/11/can-the-iphone-4s-replace-a-real-digital-camera-for-many-yes.ars"
                  "http://arstechnica.com/apple/news/2011/12/battery-life-woes-continue-to-plague-iphone-4s-users.ars"
                  "http://arstechnica.com/apple/news/2011/12/it-appears-the-syrian-government.ars?comments=1"
                  "http://arstechnica.com/apple/news/2011/12/mac-os-x-1073-includes.ars?comments=1"
                  "http://arstechnica.com/apple/news/2011/12/thai-flooding-finally-hits-apple-with-2tb-drive-shortage.ars"
                  "http://arstechnica.com/apple/reviews/2011/11/why-steve-jobs-cried.ars"
                  "http://arstechnica.com/ask-ars"
                  "http://arstechnica.com/author/ben-kuchera"
                  "http://arstechnica.com/author/casey-johnston"
                  "http://arstechnica.com/author/chris-foresman"
                  "http://arstechnica.com/author/jacqui-cheng"
                  "http://arstechnica.com/author/john-timmer"
                  "http://arstechnica.com/author/jon-brodkin"
                  "http://arstechnica.com/author/matthew-lasar"
                  "http://arstechnica.com/author/nate-anderson"
                  "http://arstechnica.com/author/ohrmazd"
                  "http://arstechnica.com/author/peter-bright"
                  "http://arstechnica.com/author/ryan-paul"
                  "http://arstechnica.com/author/scott-johnson"
                  "http://arstechnica.com/author/sean-gallagher"
                  "http://arstechnica.com/author/wired-uk"
                  "http://arstechnica.com/author/wiredcom"
                  "http://arstechnica.com/business"
                  "http://arstechnica.com/business/consumerization-of-it"
                  "http://arstechnica.com/business/news/2011/11/bulldozer-server-benchmarks-are-here-and-theyre-a-catastrophe.ars"
                  "http://arstechnica.com/business/news/2011/11/private-app-stores-does-your-company-need-its-own.ars"
                  "http://arstechnica.com/business/news/2011/12/bill-would-end-overtime-pay-requirement-for-many-more-it-workers.ars"
                  "http://arstechnica.com/business/news/2011/12/week-in-it-the-end-of-internal-e-mail-and-tracking-cell-phone-signals.ars"
                  "http://arstechnica.com/civis" "http://arstechnica.com/civis/ucp.php?mode=login&return_to=http%3A%2F%2Farstechnica.com%2Findex.php"
                  "http://arstechnica.com/features"
                  "http://arstechnica.com/gadgets"
                  "http://arstechnica.com/gadgets/news/2011/12/apple-managed-to-extend-the.ars?comments=1"
                  "http://arstechnica.com/gadgets/news/2011/12/mobile-operator-turns-flagship-store-into-androidland.ars"
                  "http://arstechnica.com/gadgets/news/2011/12/rims-troubles-continue-blackberry-playbook-costing-company-485-million.ars"
                  "http://arstechnica.com/gadgets/news/2011/12/the-shards-bleeding-edge-anatomy-of-a-21st-century-skyscraper.ars"
                  "http://arstechnica.com/gadgets/reviews/2011/11/dont-call-it-a-tablet-the-kindle-fire-reviewed.ars"
                  "http://arstechnica.com/gadgets/reviews/2011/11/lean-mean-consuming-machine-reviewing-the-nook-tablet.ars"
                  "http://arstechnica.com/gaming"
                  "http://arstechnica.com/gaming/news/2011/11/2011-childs-play-drive-signed-ultima-halo-360-hardware-aliens-themed-nerf-gun.ars"
                  "http://arstechnica.com/gaming/news/2011/12/drm-free-gaming-distributor-gogcom-trades-convenience-for-safety.ars"
                  "http://arstechnica.com/gaming/news/2011/12/markus-notch-person-steps-down-as-lead-minecraft-developer.ars"
                  "http://arstechnica.com/gaming/news/2011/12/microsofts-bid-to-rule-your-living-room-with-the-xbox-360-begins-tomorrow.ars"
                  "http://arstechnica.com/gaming/reviews/2011/11/modern-warfare-3-single-player-on-pc-the-canonization-of-violence.ars"
                  "http://arstechnica.com/guides"
                  "http://arstechnica.com/hardware"
                  "http://arstechnica.com/media"
                  "http://arstechnica.com/microsoft"
                  "http://arstechnica.com/microsoft/news/2011/12/why-microsoft-should-and-shouldnt-support-the-legacy-windows-desktop-on-arm.ars"
                  "http://arstechnica.com/microsoft/news/2011/12/with-wp7-mango-available-for-all-microsoft-pushes-ahead-with-new-updates.ars"
                  "http://arstechnica.com/open-source"
                  "http://arstechnica.com/reviews"
                  "http://arstechnica.com/science"
                  "http://arstechnica.com/science/news/2011/11/how-the-collapse-of-a-scientific-hypothesis-led-to-a-lawsuit-and-arrest.ars"
                  "http://arstechnica.com/science/news/2011/12/-a-us-house-committee.ars?comments=1"
                  "http://arstechnica.com/science/news/2011/12/-voyager-1-has-confirmed.ars?comments=1"
                  "http://arstechnica.com/science/news/2011/12/new-approach-to-determining-human-impact-on-climate-gives-same-answer.ars"
                  "http://arstechnica.com/science/news/2011/12/new-approach-to-determining-human-impact-on-climate-gives-same-answer.ars/2"
                  "http://arstechnica.com/science/news/2011/12/short-circuiting-the-immune-system-to-block-hiv.ars"
                  "http://arstechnica.com/science/news/2011/12/transparent-crab-shell-holds-the-secret-to-bendable-screens.ars"
                  "http://arstechnica.com/science/news/2011/12/week-in-science-collapsing-ideas-and-long-distance-voyagers.ars"
                  "http://arstechnica.com/security"
                  "http://arstechnica.com/site/tv.ars"
                  "http://arstechnica.com/software"
                  "http://arstechnica.com/staff"
                  "http://arstechnica.com/subscriptions"
                  "http://arstechnica.com/tech-policy"
                  "http://arstechnica.com/tech-policy/news/2011/12/apple-motorola-att-sprint-t-mobile-latest-to-be-sued-over-carrier-iq-tracking.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/carrier-iq-hit-with-privacy-lawsuits-as-more-security-researchers-weigh-in.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/data-caps-a-crude-and-unfair-tool-for-easing-online-congestion.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/fcc-to-probe-san-francisco-subway-cell-phone-interruption-policy.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/gallery-how-the-surveillance-industry-markets-spyware-to-governments.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/setting-intelligent-internet-policy-requires-data-we-dont-have-and-arent-getting.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/suspension-of-disbelief-magicians-friends-targeted-by-new-phishing-scam.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/verizon-snags-36b-worth-of-spectrum-licenses-as-att-hits-fcc-roadbloack.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/week-on-the-web-kindle-vs-nook-att-vs-the-fcc-ie10-vs-windows-7.ars"
                  "http://arstechnica.com/tech-policy/news/2011/12/wikileaks-founder-julian-assange-will.ars?comments=1"
                  "http://arstechnica.com/telecom"
                  "http://arstechnica.com/web"]]
    (is (= 81 (count result)))
    (is (= (sort expected) (sort result)))))


(deftest test-has-anchor
  (let [body (slurp (clojure.java.io/resource "html/arstechnica.com_full.html"))]
    (is (has-anchor? body "/apple"))
    (is (has-anchor? body "/apple" "Apple"))
    (is (not (has-anchor? body "/apple" "Open Source")))
    (is (has-anchor? body "/open-source" "Open Source"))
    (is (has-anchor? body "http://www.wired.com" "Wired"))
    (is (has-anchor? body "http://www.style.com" "Style"))))

## Changes between Crawlista 1.0.0-alpha7 and 1.0.0-alpha8

No changes yet.



## Changes between Crawlista 1.0.0-alpha7 and 1.0.0-alpha8

### Improvements to clojurewerkz.crawlista.media/html-content?

`clojurewerkz.crawlista.media/html-content?` now has 2-arity form that accepts HTTP response body
and headers and performs smarter MIMEtype (content type) detection. The rationale for this is that
there are broken Web applications, frameworks and servers that serve PDF and PNG documents as text/html.
By using both response body detection techniques (magic bytes, special tags for XML subtypes, etc) and Content-Type
HTTP header Crawlista can provide more accurate detection of HTML content.

### clj-http 0.3.6

[clj-http](https://github.com/dakrone/clj-http) has been upgraded to 0.3.6.



## Changes between Crawlista 1.0.0-alpha6 and 1.0.0-alpha7

### Pantomime 1.3.0-rc1

[Pantomime](https://github.com/michaelklishin/pantomime) has been upgraded to 1.3.0-rc1.

### JSoup 1.6.2

[JSoup](https://jsoup.org) has been upgraded to 1.6.2.



## Changes between Crawlista 1.0.0-alpha5 and 1.0.0-alpha6

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0-rc2.



## Changes between Crawlista 1.0.0-alpha4 and 1.0.0-alpha5

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0-rc1.


## Changes between Crawlista 1.0.0-alpha3 and 1.0.0-alpha4

### Bug fixes

 * `crawlista.url/separate-query-string` now correctly handles URLs with query string like this: `?a=1?b=2`
 * `crawlista.url/local-to?` now eliminates extra protocols (so `http://https://apple.com` becomes `https://apple.com`)

### Test suite improvements

Extraction test suite now has a few more example documents that do not close `<body>` and `<html>` tags, has extra protocol
prefixes and so on.

### Urly 1.0.0-beta8

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0-beta8.



## Changes between Crawlista 1.0.0-alpha2 and 1.0.0-alpha3

### Media (MIME) type classification functions

New `clojurewerkz.crawlista.media` namespace is dedicated to media type classification (from Web crawling
POV). Handling and detection of media (MIME) types is handled by [Pantomime](https://github.com/michaelklishin/pantomime/) 1.3.0-beta1
and [Apache Tika](http://tika.apache.org/).



## Changes between Crawlista 1.0.0-alpha1 and 1.0.0-alpha2

### Leiningen 2

Crawlista now uses [Leiningen 2](https://github.com/technomancy/leiningen/wiki/Upgrading).

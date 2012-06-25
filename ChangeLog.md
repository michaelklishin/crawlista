## Changes between Crawlista 1.0.0-alpha17 and 1.0.0-alpha18

[Urly](https://github.com/michaelklishin/urly) dependecy has been upgraded to `2.0.0-alpha3`.
Added handling of bad urls to resourcification, bad/unparsable url will return an empty string now.


## Changes between Crawlista 1.0.0-alpha16 and 1.0.0-alpha17

[Clojurewerkz Support](https://github.com/clojurewerkz/support) dependecy has been upgraded to `0.5.0`.


## Changes between Crawlista 1.0.0-alpha15 and 1.0.0-alpha16

### JSoup 1.6.3

[JSoup](https://jsoup.org) has been upgraded to 1.6.3.


## Changes between Crawlista 1.0.0-alpha14 and 1.0.0-alpha15

### extract-title moved to `clojurewerkz.crawlista.extraction.content`

`extract-title` was moved to the `clojurewerkz.crawlista.extraction.content` namespace


## Changes between Crawlista 1.0.0-alpha13 and 1.0.0-alpha14

### Links Extraction moved into a separate namespace

Links extraction functions have been moved to the `clojurewerkz.crawlista.extraction.links` namespace.


### Content Extraction

New `clojurewerkz.crawlista.extraction.content` namespaces provides functions that extract page content using
[Boilerpipe Core](http://code.google.com/p/boilerpipe/). For more theoretical background on the extraction algorithm(s),
see [this paper](http://www.l3s.de/~kohlschuetter/boilerplate/) and [this video lecture](http://videolectures.net/wsdm2010_kohlschutter_bdu/).

Boilerpipe 1.2.0 is licensed under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).


## Changes between Crawlista 1.0.0-alpha12 and 1.0.0-alpha13

### Pantomime 1.3.0

[Pantomime](https://github.com/michaelklishin/urly) has been upgraded to 1.3.0.


## Changes between Crawlista 1.0.0-alpha11 and 1.0.0-alpha12

### Less Aggressive Normalization

This is a breaking change: Crawlista's extraction functions now perform less aggressive normalization
(not stripping off `www.`, for example) and this may result in effectively duplicate URLs extracted but
also means you won't get URLs that won't work for certain sites (that depend on `www.` prefixes or
the presence of the trailing slash in path, etc).


### Urly 1.0.0

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0 (final).


## Changes between Crawlista 1.0.0-alpha10 and 1.0.0-alpha11

### clojurewerkz.crawlista.extraction/extract-anchors no longer returns nil

`clojurewerkz.crawlista.extraction/extract-anchors` no longer returns nil when there are no anchors on the page.
Instead, it returns an empty list (an object that implements `java.util.List`).


### Urly 1.0.0-rc5

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0-rc5.



## Changes between Crawlista 1.0.0-alpha9 and 1.0.0-alpha10

### Conservative encoding of unencoded characters

Crawlista now will encode unencoded spaces in query strings. This is a conservative strategy
that avoids double-encoding but solves issues with broken Web applications and content management
systems that do not escape query parameter values.



## Changes between Crawlista 1.0.0-alpha8 and 1.0.0-alpha9

### Urly 1.0.0-rc3

[Urly](https://github.com/michaelklishin/urly) has been upgraded to 1.0.0-rc3.



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

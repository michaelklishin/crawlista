# What is Crawlista

Crawlista is a support library for Clojure applications that crawl the Web.

[![Continuous Integration status](https://secure.travis-ci.org/michaelklishin/crawlista.png)](http://travis-ci.org/michaelklishin/crawlista)


## Features

 * Detection of crawlable content (using [Pantomime](https://github.com/michaelklishin/pantomime))
 * Extraction of links with normalization (using [Urly](https://github.com/michaelklishin/urly))
 * Detection of link presence
 * Extraction of content (like article text) from pages (using [Boilerpipe Core](http://code.google.com/p/boilerpipe/))


## Usage

### Installation

With Leiningen

    [clojurewerkz/crawlista "1.0.0-alpha17"]

Artifacts are [published to clojars.org](https://clojars.org/clojurewerkz/crawlista).



## Supported Clojure versions

Crawlista is built from the ground up for Clojure 1.3 and up.



## Documentation & Examples

Crawlista is a work in progress. Please see our test suite for code examples. Once APIs and core functionality stabilizes,
we will begin writing documentation guides and update this document.



## Crawlista Is a ClojureWerkz Project

Crawlista is part of the [group of Clojure libraries known as ClojureWerkz](http://clojurewerkz.org), together with
[Neocons](https://github.com/michaelklishin/neocons), [Langohr](https://github.com/michaelklishin/langohr), [Elastisch](https://github.com/clojurewerkz/elastisch), [Welle](https://github.com/michaelklishin/welle), [Monger](https://github.com/michaelklishin/monger), [Quartzite](https://github.com/michaelklishin/quartzite) and several others.



## Continuous Integration

[![Continuous Integration status](https://secure.travis-ci.org/michaelklishin/crawlista.png)](http://travis-ci.org/michaelklishin/crawlista)

CI is hosted by [travis-ci.org](http://travis-ci.org)



## Development

Crawlista uses [Leiningen 2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against all supported Clojure versions using

    lein all test

Then create a branch and make your changes on it. Once you are done with your changes and all
tests pass, submit a pull request on Github.


### Regenerating robots.txt Parser

If you make changes to the [Ragel](http://www.complang.org/ragel/)-based `robots.txt` parser in Crawlista, you need to regenerate it:

    ragel -J -o src/java/clojurewerkz/crawlista/robots/Parser.java src/rl/clojurewerkz/crawlista/robots/Parser.rl
    lein javac

and then run `robots.txt` parser test suite with

    lein test :robots


## License

Copyright (C) 2011-2016 Michael S. Klishin, Alex Petrov, and the ClojureWerkz team.

Distributed under the Eclipse Public License, the same as Clojure.

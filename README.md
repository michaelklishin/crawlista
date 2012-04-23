# What is Crawlista

Crawlista is a support library for Clojure applications that crawl the Web.

[![Continuous Integration status](https://secure.travis-ci.org/michaelklishin/crawlista.png)](http://travis-ci.org/michaelklishin/crawlista)


## Usage

### Installation

With Leiningen

    [clojurewerkz/crawlista "1.0.0-alpha13"]

or, if you are comfortable with using snapshots,

    [clojurewerkz/crawlista "1.0.0-SNAPSHOT"]

New snapshots are [published to clojars.org](https://clojars.org/clojurewerkz/crawlista) every day (if there are any changes).


## Crawlista is a Work In Progress

Crawlista is a work in progress. Please see our test suite for code examples.


## Continuous Integration

[![Continuous Integration status](https://secure.travis-ci.org/michaelklishin/crawlista.png)](http://travis-ci.org/michaelklishin/crawlista)

CI is hosted by [travis-ci.org](http://travis-ci.org)


## Supported Clojure versions

Crawlista is built from the ground up for Clojure 1.3 and up.


## Development

Crawlista uses [Leiningen 2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against all supported Clojure versions using

    lein2 all test

Then create a branch and make your changes on it. Once you are done with your changes and all
tests pass, submit a pull request on Github.


### Regenerating robots.txt Parser

If you make changes to the [Ragel](http://www.complang.org/ragel/)-based `robots.txt` parser in Crawlista, you need to regenerate it:

    ragel -J -o src/java/clojurewerkz/crawlista/robots/Parser.java src/rl/clojurewerkz/crawlista/robots/Parser.rl
    lein2 javac

and then run `robots.txt` parser test suite with

    lein2 test :robots


## License

Copyright (C) 2011-2012 Michael S. Klishin

Distributed under the Eclipse Public License, the same as Clojure.

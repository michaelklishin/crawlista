package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;

%%{
  machine robots;

  blankcomment = space* . '#' . any*;

  main := blankcomment*;
}%%

public class Parser {
  %% write data;

  public static IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    PersistentHashMap result = create();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
        throw new ParseException("Unparseable input: " + input, p);
    }

    return result;
  }
}

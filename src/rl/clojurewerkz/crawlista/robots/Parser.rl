package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;

%%{
  machine robots;

  CRLF = "\r" ? "\n";
  CTL = (cntrl | 127);
  LWSP = " " | "\t";
  LWS = CRLF ? LWSP *;
  TEXT = any -- CTL;
  LINE = TEXT -- CRLF;
  tspecials = "(" | ")" | "<" | ">" | "@" | "," | ";"
             | ":" | "\\" | "\"" | "/" | "[" | "]"
             | "?" | "=" | "{" | "}" | " " | "\t"
             ;

  comment = LWSP* . '#' . any*;
  commentline = comment . CRLF;

  token = TEXT -- tspecials;

  agent = token+;
  agentline = "User-agent:" . LWSP* . agent . commentline? . CRLF;
  record = agentline;

  main := commentline* | ( commentline* . record )+ . (commentline*);
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
        throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return result;
  }
}

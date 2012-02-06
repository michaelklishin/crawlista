package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;

%%{
  machine robots;

  action agentline_start {}

  action agent_start {}
  action agent_end   {}


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

  agent = token+ >agent_start %/agent_end;
  agentline = "User-agent:" . LWSP* . agent . commentline? . CRLF >agentline_start %/agentline_start;
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

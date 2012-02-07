package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentVector;


%%{
  machine robots;

  action agentline_start {
    ansp = 0;
  }

  action agent_start {
    ansp = p;
  }

  action agent_end   {
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));

    result.assoc(lastSeenUserAgentName.trim(), PersistentVector.create());
  }


  CRLF = "\r" ? "\n";
  CTL = (cntrl | 127);
  LWSP = " " | "\t";
  LWS = CRLF ? LWSP *;
  TEXT = any -- CTL;
  LINE = TEXT -- CRLF;
  tspecials = "(" | ")" | "<" | ">" | "@" | "," | ";"
             | ":" | "\\" | "\"" | "/" | "[" | "]"
             | "?" | "=" | "{" | "}" | "\t" | "#"
             ;

  comment = LWSP* . '#' . any*;
  commentline = comment . CRLF;

  token = LINE -- tspecials;

  agent = ('*' | TEXT+) >agent_start %agent_end %/agent_end;
  agentline = "User-agent: " . agent . CRLF >agentline_start %/agentline_start;
  record = agentline;

  main := commentline* | ( commentline* . record )+ . (commentline*);
}%%

public class Parser {
  %% write data;

  public IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    ITransientMap result = PersistentHashMap.create().asTransient();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return result.persistent();
  }
}

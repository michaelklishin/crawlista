package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.ITransientVector;
import clojure.lang.IPersistentVector;
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
    System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }


  SP    = " ";
  HT    = "\t";
  HASH  = "#";
  CRLF  = "\r" ? "\n";

  CTL   = (cntrl | 127);
  TEXT  = any -- CTL;
  ID    = any -- HASH;

  blank        = (space | HT)*;
  blankline    = blank* CRLF;

  comment      = blank* HASH TEXT*;
  commentline  = comment CRLF;
  blankcomment = blank? commentline;
  commentblank = commentline* blank blankcomment*;

  agent        = ('*' | ID+) >agent_start %/agent_end;
  agentline    = "User-agent:" space* agent CRLF >agentline_start;

  # record       = commentline* agentline (commentline | agentline)*;
  record       = agentline;

  main := blankcomment*
       | blankcomment* record (commentblank record)* blankcomment*;
}%%

public class Parser {
  %% write data;

  public IPersistentVector parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

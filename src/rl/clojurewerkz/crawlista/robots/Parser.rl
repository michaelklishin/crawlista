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

  action agent_start {
    // System.out.println("action: agent_start. p = " + p);
    ansp = p;
  }

  action agent_end   {
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }


  SP             = " ";
  HT             = "\t";
  HASH           = "#";
  LF             = "\n";
  CR             = "\r";
  CRLF           = CR? LF;

  CTL            = (cntrl | 127);
  TEXT           = any -- CTL;
  ID             = any -- HASH -- CRLF;
  AGENT_INITIAL  = 'a'..'z' | 'A'..'Z';
  WILDCARD       = '*';

  blank          = (space | HT)*;
  blankline      = blank* CRLF;

  comment        = HASH TEXT*;
  commentline    = blank* comment CRLF;
  blankcomment   = blank? commentline;
  commentblank   = commentline* blank blankcomment*;

  wildcard_agent = WILDCARD;
  named_agent    = AGENT_INITIAL ID*;

  agent          = (wildcard_agent | named_agent) >agent_start %/agent_end %agent_end;
  agentline      = (space | HT)* "User-agent:" (space | HT)* agent comment? CRLF;

  record         = commentline* agentline commentline?;

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

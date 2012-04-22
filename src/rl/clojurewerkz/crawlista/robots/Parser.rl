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

  #
  # Agents
  #

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


  #
  # Disallow rules
  #

  action disallow_rule_start {
    // System.out.println("action: disallow_rule_start. p = " + p);
    drsp = p;
  }

  action disallow_rule_end   {
    // System.out.println("action: disallow_rule_end. p = " + p);

    String rule = new String(data, drsp, (p - drsp));
    // we matched "disallow none" case (Disallow:)
    if(rule.equals("Disallow:")) {
      rule = "";
    }

    // System.out.println("See disallow_rule: " + rule);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("disallow", rule.trim()));
  }


  SP             = " ";
  HT             = "\t";
  HASH           = "#";
  LF             = "\n";
  CR             = "\r";
  CRLF           = CR? LF;

  COLON          = ":";

  CTL            = (cntrl | 127);
  TEXT           = any -- CTL;
  ID             = any -- HASH -- CRLF;
  AGENT_INITIAL  = 'a'..'z' | 'A'..'Z';
  WILDCARD       = '*';

  SLASH          = '/';

  blank          = (space | HT)*;
  blankline      = blank* CRLF;

  comment        = HASH TEXT*;
  commentline    = blank* comment CRLF;
  blankcomment   = blank? commentline;
  commentblank   = commentline* blank blankcomment*;


  U              = 'U' | 'u';
  S              = 'S' | 's';
  E              = 'E' | 'e';
  R              = 'R' | 'r';

  A              = 'A' | 'a';
  G              = 'G' | 'g';
  N              = 'N' | 'n';
  T              = 'T' | 't';

  D              = 'D' | 'd';
  I              = 'I' | 'i';
  L              = 'L' | 'l';
  O              = 'O' | 'o';
  W              = 'W' | 'w';

  agent_prefix   = U S E R "-" A G E N T COLON;

  wildcard_agent  = WILDCARD;
  named_agent     = AGENT_INITIAL ID*;

  agent           = (wildcard_agent | named_agent) >agent_start %/agent_end %agent_end;

  uchar           = (TEXT -- space);
  pchar           = uchar | ":" | "@" | "&" | "=" | SLASH;
  segment         = pchar*;
  fsegment        = pchar*;
  path            = fsegment (SLASH segment)*;
  disallow_rule   = path >disallow_rule_start %/disallow_rule_end %disallow_rule_end;

  disallow_prefix = D I S A L L O W COLON;

  agentline       = (space | HT)* agent_prefix    (space | HT)* agent          comment? CRLF;
  disallowline    = (space | HT)* disallow_prefix CRLF |
                    (space | HT)* disallow_prefix (space | HT)* disallow_rule  comment? CRLF;
  ruleline        = disallowline;

  record          = commentline* agentline (commentline agentline)*
                    | ruleline (commentline ruleline)*;

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

    // disallow rule start position
    int drsp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

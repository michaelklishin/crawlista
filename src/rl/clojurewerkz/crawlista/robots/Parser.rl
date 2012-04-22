package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.*;;


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
    // System.out.println("Daw agent: " + lastSeenUserAgentName);

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

    // System.out.println("Saw disallow_rule: " + rule);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("disallow", rule.trim()));
  }



  #
  # Allow rules
  #

  action allow_rule_start {
    // System.out.println("action: allow_rule_start. p = " + p);
    arsp = p;
  }

  action allow_rule_end   {
    // System.out.println("action: allow_rule_end. p = " + p);

    String rule = new String(data, arsp, (p - arsp));
    // we matched "allow none" case (Allow:)
    if(rule.equals("Allow:")) {
      rule = "";
    }

    // System.out.println("Saw allow_rule: " + rule);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("allow", rule.trim()));
  }


  #
  # Sitemap entries
  #

  action sitemap_rule_start {
    // System.out.println("action: sitemap_rule_start. p = " + p);
    slsp = p;
  }

  action sitemap_rule_end   {
    // System.out.println("action: sitemap_rule_end. p = " + p);

    String rule = new String(data, slsp, (p - slsp));
    // we matched empty sitemap line (Sitemap:)
    if(!rule.equals("Sitemap:")) {
      // System.out.println("Saw sitemap_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("sitemap", rule.trim()));
    }
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

  M              = 'M' | 'm';
  P              = 'P' | 'p';

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

  allow_rule      = path >allow_rule_start %/allow_rule_end %allow_rule_end;
  allow_prefix    = A L L O W COLON;

  sitemap_rule    = path >sitemap_rule_start %/sitemap_rule_end %sitemap_rule_end;
  sitemap_prefix  = S I T E M A P COLON;

  agentline       = (space | HT)* agent_prefix    (space | HT)* agent          comment? CRLF;
  disallowline    = (space | HT)* disallow_prefix CRLF |
                    (space | HT)* disallow_prefix (space | HT)* disallow_rule  comment? CRLF;
  allowline       = (space | HT)* allow_prefix CRLF |
                    (space | HT)* allow_prefix     (space | HT)* allow_rule    comment? CRLF;
  sitemapline     = (space | HT)* sitemap_prefix CRLF |
                    (space | HT)* sitemap_prefix   (space | HT)* sitemap_rule  comment? CRLF;
  ruleline        = disallowline | allowline | sitemapline;

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

    // allow rule start position
    int arsp = 0;

    // sitemap line start position
    int slsp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

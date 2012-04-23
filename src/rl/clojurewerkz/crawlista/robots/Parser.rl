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


  #
  # Host entries
  #

  action host_rule_start {
    // System.out.println("action: host_rule_start. p = " + p);
    hnsp = p;
  }

  action host_rule_end   {
    // System.out.println("action: host_rule_end. p = " + p);

    String rule = new String(data, hnsp, (p - hnsp));
    // we matched empty host line (Host:)
    if(!rule.equals("Host:")) {
      // System.out.println("Saw host_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("host", rule.trim()));
    }
  }


  #
  # Noindex entries
  #

  action noindex_rule_start {
    // System.out.println("action: noindex_rule_start. p = " + p);
    nisp = p;
  }

  action noindex_rule_end   {
    // System.out.println("action: noindex_rule_end. p = " + p);

    String rule = new String(data, nisp, (p - nisp));
    // we matched empty noindex line (Noindex:)
    if(!rule.equals("Noindex:")) {
      // System.out.println("Saw noindex_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("noindex", rule.trim()));
    }
  }


  #
  # Crawl-delay entries
  #

  action crawldelay_rule_start {
    // System.out.println("action: crawldelay_rule_start. p = " + p);
    cdsp = p;
  }

  action crawldelay_rule_end   {
    // System.out.println("action: crawldelay_rule_end. p = " + p);

    String rule = new String(data, cdsp, (p - cdsp));
    if(!rule.equals("Crawldelay:")) {
      // System.out.println("Saw crawldelay_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("crawl-delay", Long.valueOf(rule.trim())));
    }
  }



  SP             = " ";
  HT             = "\t";
  HASH           = "#";
  LF             = "\n";
  CR             = "\r";
  CRLF           = CR? LF;

  # space built-in seems to be matching newlines and producing overly eager
  # matches as a result
  SPHT           = SP | HT;

  COLON          = ":";

  CTL            = (cntrl | 127);
  TEXT           = any -- CTL;
  ID             = any -- HASH -- CRLF;
  AGENT_INITIAL  = 'a'..'z' | 'A'..'Z' | '0'-'9';
  WILDCARD       = '*';

  SLASH          = '/';

  blank          = SPHT*;
  blankline      = blank* CRLF;

  comment        = HASH TEXT*;
  commentline    = blank* comment CRLF;
  blankcomment   = CRLF | blank? commentline;
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

  C              = 'C' | 'c';
  Y              = 'Y' | 'y';
  X              = 'X' | 'x';

  H              = 'H' | 'h';

  agent_prefix   = U S E R "-" A G E N T COLON;

  wildcard_agent  = WILDCARD SPHT*;
  named_agent     = AGENT_INITIAL ID*;

  agent           = (wildcard_agent | named_agent) >agent_start %/agent_end %agent_end;

  uchar           = (TEXT -- HASH -- CR -- LF);
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

  host_rule       = path >host_rule_start %/host_rule_end %host_rule_end;
  host_prefix     = H O S T COLON;

  crawldelay_rule    = digit+ >crawldelay_rule_start %/crawldelay_rule_end %crawldelay_rule_end;
  crawldelay_prefix  = C R A W L "-" D E L A Y COLON;

  noindex_rule    = path >noindex_rule_start %/noindex_rule_end %noindex_rule_end;
  noindex_prefix  = N O I N D E X COLON;

  agentline       = SPHT* agent_prefix       SPHT* agent          comment? CRLF;
  disallowline    = SPHT* disallow_prefix    SPHT* CRLF
                    | SPHT* disallow_prefix  SPHT* disallow_rule  comment? CRLF;
  allowline       = SPHT* allow_prefix CRLF |
                    SPHT* allow_prefix      SPHT* allow_rule    comment? CRLF;
  sitemapline     = SPHT* sitemap_prefix CRLF |
                    SPHT* sitemap_prefix    SPHT* sitemap_rule  comment? CRLF;

  hostline        = SPHT* host_prefix CRLF |
                    SPHT* host_prefix    SPHT* host_rule  comment? CRLF;

  crawldelayline  = SPHT* crawldelay_prefix SPHT* crawldelay_rule comment? CRLF;
  noindexline     = SPHT* noindex_prefix    SPHT* noindex_rule    comment? CRLF;

  ruleline        = disallowline | allowline | sitemapline | noindexline | crawldelayline | hostline;

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

    // hostname line start position
    int hnsp = 0;

    // noindex line start position
    int nisp = 0;

    // crawl-delay line start position
    int cdsp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    %% write init;
    %% write exec;

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}


// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.*;;



// line 250 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 18 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    2,    2,    3,    2,    4,    5,    2,    6,    7,    2,    8,
	    9
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,   15,   20,   21,   23,   25,   27,   29,   30,   38,   55,
	   72,   87,   92,   93,   95,   97,   99,  101,  102,  104,  106,  108,
	  110,  112,  113,  117,  122,  123,  128,  130,  132,  134,  136,  138,
	  140,  142,  143,  151,  157,  159,  161,  163,  165,  167,  169,  170,
	  178,  184,  186,  188,  190,  192,  194,  196,  197,  205,  211,  213,
	  215,  217,  218,  220,  222,  224,  226,  228,  229,  236,  241,  244,
	  250,  267
	};
}

private static final short _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	    9,   32,   35,   65,   67,   68,   78,   83,   85,   97,   99,  100,
	  110,  115,  117,   10,   13,  127,    0,   31,   10,   76,  108,   76,
	  108,   79,  111,   87,  119,   58,    9,   10,   13,   32,   35,  127,
	    0,   31,    9,   10,   13,   32,   35,   65,   67,   68,   78,   83,
	   85,   97,   99,  100,  110,  115,  117,    9,   10,   13,   32,   35,
	   65,   67,   68,   78,   83,   85,   97,   99,  100,  110,  115,  117,
	    9,   32,   35,   65,   67,   68,   78,   83,   85,   97,   99,  100,
	  110,  115,  117,   10,   13,  127,    0,   31,   10,   82,  114,   65,
	   97,   87,  119,   76,  108,   45,   68,  100,   69,  101,   76,  108,
	   65,   97,   89,  121,   58,    9,   32,   48,   57,   10,   13,   35,
	   48,   57,   10,   10,   13,  127,    0,   31,   73,  105,   83,  115,
	   65,   97,   76,  108,   76,  108,   79,  111,   87,  119,   58,    9,
	   10,   13,   32,   35,  127,    0,   31,   10,   13,   35,  127,    0,
	   31,   79,  111,   73,  105,   78,  110,   68,  100,   69,  101,   88,
	  120,   58,    9,   10,   13,   32,   35,  127,    0,   31,   10,   13,
	   35,  127,    0,   31,   73,  105,   84,  116,   69,  101,   77,  109,
	   65,   97,   80,  112,   58,    9,   10,   13,   32,   35,  127,    0,
	   31,   10,   13,   35,  127,    0,   31,   83,  115,   69,  101,   82,
	  114,   45,   65,   97,   71,  103,   69,  101,   78,  110,   84,  116,
	   58,    9,   32,   42,   65,   90,   97,  122,    9,   10,   13,   32,
	   35,   10,   13,   35,   10,   13,   35,  127,    0,   31,    9,   10,
	   13,   32,   35,   65,   67,   68,   78,   83,   85,   97,   99,  100,
	  110,  115,  117,    9,   10,   13,   32,   35,   65,   67,   68,   78,
	   83,   85,   97,   99,  100,  110,  115,  117,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,   15,    3,    1,    2,    2,    2,    2,    1,    6,   17,   17,
	   15,    3,    1,    2,    2,    2,    2,    1,    2,    2,    2,    2,
	    2,    1,    2,    3,    1,    3,    2,    2,    2,    2,    2,    2,
	    2,    1,    6,    4,    2,    2,    2,    2,    2,    2,    1,    6,
	    4,    2,    2,    2,    2,    2,    2,    1,    6,    4,    2,    2,
	    2,    1,    2,    2,    2,    2,    2,    1,    3,    5,    3,    4,
	   17,   17
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    0,    1,    0,    0,    0,    0,    0,    0,    1,    0,    0,
	    0,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    1,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    1,
	    1,    0,    0,    0,    0,    0,    0,    0,    1,    1,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    2,    0,    0,    1,
	    0,    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,   16,   21,   23,   26,   29,   32,   35,   37,   45,   63,
	   81,   97,  102,  104,  107,  110,  113,  116,  118,  121,  124,  127,
	  130,  133,  135,  139,  144,  146,  151,  154,  157,  160,  163,  166,
	  169,  172,  174,  182,  188,  191,  194,  197,  200,  203,  206,  208,
	  216,  222,  225,  228,  231,  234,  237,  240,  242,  250,  256,  259,
	  262,  265,  267,  270,  273,  276,  279,  282,  284,  290,  296,  300,
	  306,  324
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_indicies_0()
{
	return new byte [] {
	    0,    0,    2,    3,    4,    5,    6,    7,    8,    3,    4,    5,
	    6,    7,    8,    1,    9,   10,    1,    1,    2,    9,    1,   11,
	   11,    1,   12,   12,    1,   13,   13,    1,   14,   14,    1,   15,
	    1,   15,   16,   17,   18,   20,    1,    1,   19,   21,   22,   23,
	   21,    2,    3,    4,    5,    6,    7,    8,    3,    4,    5,    6,
	    7,    8,    1,   24,   22,   23,   24,   25,    3,    4,    5,    6,
	    7,    8,    3,    4,    5,    6,    7,    8,    1,   24,   24,   25,
	    3,    4,    5,    6,    7,    8,    3,    4,    5,    6,    7,    8,
	    1,   22,   23,    1,    1,   25,   22,    1,   26,   26,    1,   27,
	   27,    1,   28,   28,    1,   29,   29,    1,   30,    1,   31,   31,
	    1,   32,   32,    1,   33,   33,    1,   34,   34,    1,   35,   35,
	    1,   36,    1,   36,   36,   37,    1,   38,   39,   40,   41,    1,
	   42,    1,   42,   43,    1,    1,   44,   45,   45,    1,   46,   46,
	    1,   47,   47,    1,   48,   48,    1,   49,   49,    1,   50,   50,
	    1,   51,   51,    1,   52,    1,   52,   53,   54,   55,   57,    1,
	    1,   56,   58,   59,   61,    1,    1,   60,   62,   62,    1,   63,
	   63,    1,   64,   64,    1,   65,   65,    1,   66,   66,    1,   67,
	   67,    1,   68,    1,   68,   69,   70,   71,   73,    1,    1,   72,
	   74,   75,   77,    1,    1,   76,   78,   78,    1,   79,   79,    1,
	   80,   80,    1,   81,   81,    1,   82,   82,    1,   83,   83,    1,
	   84,    1,   84,   85,   86,   87,   89,    1,    1,   88,   90,   91,
	   93,    1,    1,   92,   94,   94,    1,   95,   95,    1,   96,   96,
	    1,   97,    1,   98,   98,    1,   99,   99,    1,  100,  100,    1,
	  101,  101,    1,  102,  102,    1,  103,    1,  103,  103,  104,  105,
	  105,    1,  106,  107,  108,  106,  109,    1,  107,  111,  109,  110,
	  112,  113,  115,    1,    1,  114,    0,    9,   10,    0,    2,    3,
	    4,    5,    6,    7,    8,    3,    4,    5,    6,    7,    8,    1,
	   21,    9,   10,   21,   44,    3,    4,    5,    6,    7,    8,    3,
	    4,    5,    6,    7,    8,    1,    0
	};
}

private static final byte _robots_indicies[] = init__robots_indicies_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    0,    2,    4,   15,   30,   40,   49,   58,   72,    3,    5,
	    6,    7,    8,    9,   73,   28,    9,   71,   29,   10,   11,   14,
	   12,   13,   16,   17,   18,   19,   20,   21,   22,   23,   24,   25,
	   26,   27,   73,   28,   29,   27,   73,   28,   29,   31,   32,   33,
	   34,   35,   36,   37,   38,   73,   28,   38,   39,   29,   73,   28,
	   39,   29,   41,   42,   43,   44,   45,   46,   47,   73,   28,   47,
	   48,   29,   73,   28,   48,   29,   50,   51,   52,   53,   54,   55,
	   56,   73,   28,   56,   57,   29,   73,   28,   57,   29,   59,   60,
	   61,   62,   63,   64,   65,   66,   67,   68,   69,   70,   69,   73,
	   28,   29,   70,   70,   73,   28,   71,   29
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,   28,   28,    9,    9,   28,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,   21,   23,   23,   23,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,   25,   25,    5,    5,   25,    7,    7,
	    0,    7,    0,    0,    0,    0,    0,    0,    0,   34,   34,   17,
	   17,   34,   19,   19,    0,   19,    0,    0,    0,    0,    0,    0,
	    0,   31,   31,   13,   13,   31,   15,   15,    0,   15,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    1,    1,    0,    3,
	    3,    3,    0,    3,   11,   11,    0,   11
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   23,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    7,    7,    0,    0,    0,    0,    0,    0,    0,   19,
	   19,    0,    0,    0,    0,    0,    0,    0,   15,   15,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,    3,   11,
	    0,    0
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 72;
static final int robots_first_final = 72;
static final int robots_error = 0;

static final int robots_en_main = 72;


// line 254 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

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

    // noindex line start position
    int nisp = 0;

    // crawl-delay line start position
    int cdsp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    
// line 258 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 283 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 265 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _robots_key_offsets[cs];
	_trans = _robots_index_offsets[cs];
	_klen = _robots_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _robots_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _robots_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _robots_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _robots_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _robots_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _robots_indicies[_trans];
	cs = _robots_trans_targs[_trans];

	if ( _robots_trans_actions[_trans] != 0 ) {
		_acts = _robots_trans_actions[_trans];
		_nacts = (int) _robots_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _robots_actions[_acts++] )
			{
	case 0:
// line 16 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_start. p = " + p);
    ansp = p;
  }
	break;
	case 1:
// line 21 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("Daw agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
	case 2:
// line 35 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: disallow_rule_start. p = " + p);
    drsp = p;
  }
	break;
	case 3:
// line 40 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
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
	break;
	case 4:
// line 61 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: allow_rule_start. p = " + p);
    arsp = p;
  }
	break;
	case 5:
// line 66 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
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
	break;
	case 6:
// line 86 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: sitemap_rule_start. p = " + p);
    slsp = p;
  }
	break;
	case 7:
// line 91 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: sitemap_rule_end. p = " + p);

    String rule = new String(data, slsp, (p - slsp));
    // we matched empty sitemap line (Sitemap:)
    if(!rule.equals("Sitemap:")) {
      // System.out.println("Saw sitemap_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("sitemap", rule.trim()));
    }
  }
	break;
	case 8:
// line 109 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: noindex_rule_start. p = " + p);
    nisp = p;
  }
	break;
	case 9:
// line 114 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: noindex_rule_end. p = " + p);

    String rule = new String(data, nisp, (p - nisp));
    // we matched empty noindex line (Noindex:)
    if(!rule.equals("Noindex:")) {
      // System.out.println("Saw noindex_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("noindex", rule.trim()));
    }
  }
	break;
	case 10:
// line 132 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: crawldelay_rule_start. p = " + p);
    cdsp = p;
  }
	break;
	case 11:
// line 137 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: crawldelay_rule_end. p = " + p);

    String rule = new String(data, cdsp, (p - cdsp));
    if(!rule.equals("Crawldelay:")) {
      // System.out.println("Saw crawldelay_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("crawl-delay", Long.valueOf(rule.trim())));
    }
  }
	break;
// line 476 "src/java/clojurewerkz/crawlista/robots/Parser.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _robots_eof_actions[cs];
	int __nacts = (int) _robots_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _robots_actions[__acts++] ) {
	case 1:
// line 21 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("Daw agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
	case 3:
// line 40 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
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
	break;
	case 5:
// line 66 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
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
	break;
	case 7:
// line 91 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: sitemap_rule_end. p = " + p);

    String rule = new String(data, slsp, (p - slsp));
    // we matched empty sitemap line (Sitemap:)
    if(!rule.equals("Sitemap:")) {
      // System.out.println("Saw sitemap_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("sitemap", rule.trim()));
    }
  }
	break;
	case 9:
// line 114 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: noindex_rule_end. p = " + p);

    String rule = new String(data, nisp, (p - nisp));
    // we matched empty noindex line (Noindex:)
    if(!rule.equals("Noindex:")) {
      // System.out.println("Saw noindex_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("noindex", rule.trim()));
    }
  }
	break;
	case 11:
// line 137 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: crawldelay_rule_end. p = " + p);

    String rule = new String(data, cdsp, (p - cdsp));
    if(!rule.equals("Crawldelay:")) {
      // System.out.println("Saw crawldelay_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("crawl-delay", Long.valueOf(rule.trim())));
    }
  }
	break;
// line 586 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 284 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

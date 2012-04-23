
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.*;;



// line 281 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 18 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    2,    2,    3,    2,    4,    5,    2,
	    6,    7,    2,    8,    9,    2,   10,   11
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,   17,   22,   23,   25,   27,   29,   31,   32,   40,   59,
	   78,   95,  100,  101,  103,  105,  107,  109,  110,  112,  114,  116,
	  118,  120,  121,  125,  130,  131,  136,  138,  140,  142,  144,  146,
	  148,  150,  151,  159,  165,  167,  169,  171,  172,  180,  186,  188,
	  190,  192,  194,  196,  198,  199,  207,  213,  215,  217,  219,  221,
	  223,  225,  226,  234,  240,  242,  244,  246,  247,  249,  251,  253,
	  255,  257,  258,  266,  271,  274,  280,  299
	};
}

private static final short _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	    9,   32,   35,   65,   67,   68,   72,   78,   83,   85,   97,   99,
	  100,  104,  110,  115,  117,   10,   13,  127,    0,   31,   10,   76,
	  108,   76,  108,   79,  111,   87,  119,   58,    9,   10,   13,   32,
	   35,  127,    0,   31,    9,   10,   13,   32,   35,   65,   67,   68,
	   72,   78,   83,   85,   97,   99,  100,  104,  110,  115,  117,    9,
	   10,   13,   32,   35,   65,   67,   68,   72,   78,   83,   85,   97,
	   99,  100,  104,  110,  115,  117,    9,   32,   35,   65,   67,   68,
	   72,   78,   83,   85,   97,   99,  100,  104,  110,  115,  117,   10,
	   13,  127,    0,   31,   10,   82,  114,   65,   97,   87,  119,   76,
	  108,   45,   68,  100,   69,  101,   76,  108,   65,   97,   89,  121,
	   58,    9,   32,   48,   57,   10,   13,   35,   48,   57,   10,   10,
	   13,  127,    0,   31,   73,  105,   83,  115,   65,   97,   76,  108,
	   76,  108,   79,  111,   87,  119,   58,    9,   10,   13,   32,   35,
	  127,    0,   31,   10,   13,   35,  127,    0,   31,   79,  111,   83,
	  115,   84,  116,   58,    9,   10,   13,   32,   35,  127,    0,   31,
	   10,   13,   35,  127,    0,   31,   79,  111,   73,  105,   78,  110,
	   68,  100,   69,  101,   88,  120,   58,    9,   10,   13,   32,   35,
	  127,    0,   31,   10,   13,   35,  127,    0,   31,   73,  105,   84,
	  116,   69,  101,   77,  109,   65,   97,   80,  112,   58,    9,   10,
	   13,   32,   35,  127,    0,   31,   10,   13,   35,  127,    0,   31,
	   83,  115,   69,  101,   82,  114,   45,   65,   97,   71,  103,   69,
	  101,   78,  110,   84,  116,   58,    9,   32,   42,   48,   65,   90,
	   97,  122,    9,   10,   13,   32,   35,   10,   13,   35,   10,   13,
	   35,  127,    0,   31,    9,   10,   13,   32,   35,   65,   67,   68,
	   72,   78,   83,   85,   97,   99,  100,  104,  110,  115,  117,    9,
	   10,   13,   32,   35,   65,   67,   68,   72,   78,   83,   85,   97,
	   99,  100,  104,  110,  115,  117,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,   17,    3,    1,    2,    2,    2,    2,    1,    6,   19,   19,
	   17,    3,    1,    2,    2,    2,    2,    1,    2,    2,    2,    2,
	    2,    1,    2,    3,    1,    3,    2,    2,    2,    2,    2,    2,
	    2,    1,    6,    4,    2,    2,    2,    1,    6,    4,    2,    2,
	    2,    2,    2,    2,    1,    6,    4,    2,    2,    2,    2,    2,
	    2,    1,    6,    4,    2,    2,    2,    1,    2,    2,    2,    2,
	    2,    1,    4,    5,    3,    4,   19,   19
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    0,    1,    0,    0,    0,    0,    0,    0,    1,    0,    0,
	    0,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    1,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    0,    0,    0,    1,    1,    0,    0,
	    0,    0,    0,    0,    0,    1,    1,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    2,    0,    0,    1,    0,    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,   18,   23,   25,   28,   31,   34,   37,   39,   47,   67,
	   87,  105,  110,  112,  115,  118,  121,  124,  126,  129,  132,  135,
	  138,  141,  143,  147,  152,  154,  159,  162,  165,  168,  171,  174,
	  177,  180,  182,  190,  196,  199,  202,  205,  207,  215,  221,  224,
	  227,  230,  233,  236,  239,  241,  249,  255,  258,  261,  264,  267,
	  270,  273,  275,  283,  289,  292,  295,  298,  300,  303,  306,  309,
	  312,  315,  317,  324,  330,  334,  340,  360
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    1,    2,    4,   15,   30,   40,   46,   55,   64,    4,   15,
	   30,   40,   46,   55,   64,    0,   78,    3,    0,    0,    2,   78,
	    0,    5,    5,    0,    6,    6,    0,    7,    7,    0,    8,    8,
	    0,    9,    0,    9,   79,   28,    9,   29,    0,    0,   77,   10,
	   11,   14,   10,    2,    4,   15,   30,   40,   46,   55,   64,    4,
	   15,   30,   40,   46,   55,   64,    0,   12,   11,   14,   12,   13,
	    4,   15,   30,   40,   46,   55,   64,    4,   15,   30,   40,   46,
	   55,   64,    0,   12,   12,   13,    4,   15,   30,   40,   46,   55,
	   64,    4,   15,   30,   40,   46,   55,   64,    0,   11,   14,    0,
	    0,   13,   11,    0,   16,   16,    0,   17,   17,    0,   18,   18,
	    0,   19,   19,    0,   20,    0,   21,   21,    0,   22,   22,    0,
	   23,   23,    0,   24,   24,    0,   25,   25,    0,   26,    0,   26,
	   26,   27,    0,   79,   28,   29,   27,    0,   79,    0,   79,   28,
	    0,    0,   29,   31,   31,    0,   32,   32,    0,   33,   33,    0,
	   34,   34,    0,   35,   35,    0,   36,   36,    0,   37,   37,    0,
	   38,    0,   38,   79,   28,   38,   29,    0,    0,   39,   79,   28,
	   29,    0,    0,   39,   41,   41,    0,   42,   42,    0,   43,   43,
	    0,   44,    0,   44,   79,   28,   44,   29,    0,    0,   45,   79,
	   28,   29,    0,    0,   45,   47,   47,    0,   48,   48,    0,   49,
	   49,    0,   50,   50,    0,   51,   51,    0,   52,   52,    0,   53,
	    0,   53,   79,   28,   53,   29,    0,    0,   54,   79,   28,   29,
	    0,    0,   54,   56,   56,    0,   57,   57,    0,   58,   58,    0,
	   59,   59,    0,   60,   60,    0,   61,   61,    0,   62,    0,   62,
	   79,   28,   62,   29,    0,    0,   63,   79,   28,   29,    0,    0,
	   63,   65,   65,    0,   66,   66,    0,   67,   67,    0,   68,    0,
	   69,   69,    0,   70,   70,    0,   71,   71,    0,   72,   72,    0,
	   73,   73,    0,   74,    0,   74,   74,   75,   76,   76,   76,    0,
	   75,   79,   28,   75,   29,    0,   79,   76,   29,   76,   79,   28,
	   29,    0,    0,   77,    1,   78,    3,    1,    2,    4,   15,   30,
	   40,   46,   55,   64,    4,   15,   30,   40,   46,   55,   64,    0,
	   10,   78,    3,   10,   29,    4,   15,   30,   40,   46,   55,   64,
	    4,   15,   30,   40,   46,   55,   64,    0,    0
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,   32,   32,    9,   32,    0,    0,    9,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,   25,    0,   27,   27,   27,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   29,   29,    5,   29,    0,    0,    5,    7,    7,
	    7,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,   38,   38,   17,   38,    0,    0,   17,   19,
	   19,   19,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,   41,   41,   21,   41,    0,    0,   21,   23,   23,   23,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	   35,   35,   13,   35,    0,    0,   13,   15,   15,   15,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    1,    1,    1,    1,    0,
	    0,    3,    3,    0,    3,    0,    3,    3,    3,    0,   11,   11,
	   11,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   27,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    7,    7,    0,    0,    0,    0,   19,   19,    0,    0,
	    0,    0,    0,    0,    0,   23,   23,    0,    0,    0,    0,    0,
	    0,    0,   15,   15,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    3,    3,   11,    0,    0
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 78;
static final int robots_first_final = 78;
static final int robots_error = 0;

static final int robots_en_main = 78;


// line 285 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

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

    
// line 270 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 317 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 277 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
    // System.out.println("action: host_rule_start. p = " + p);
    hnsp = p;
  }
	break;
	case 9:
// line 114 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: host_rule_end. p = " + p);

    String rule = new String(data, hnsp, (p - hnsp));
    // we matched empty host line (Host:)
    if(!rule.equals("Host:")) {
      // System.out.println("Saw host_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("host", rule.trim()));
    }
  }
	break;
	case 10:
// line 132 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: noindex_rule_start. p = " + p);
    nisp = p;
  }
	break;
	case 11:
// line 137 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
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
	case 12:
// line 155 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: crawldelay_rule_start. p = " + p);
    cdsp = p;
  }
	break;
	case 13:
// line 160 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
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
// line 509 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
    // System.out.println("action: host_rule_end. p = " + p);

    String rule = new String(data, hnsp, (p - hnsp));
    // we matched empty host line (Host:)
    if(!rule.equals("Host:")) {
      // System.out.println("Saw host_rule: " + rule);

      IPersistentMap m = PersistentHashMap.create();
      result.conj(m.assoc("host", rule.trim()));
    }
  }
	break;
	case 11:
// line 137 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
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
	case 13:
// line 160 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
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
// line 634 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 318 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

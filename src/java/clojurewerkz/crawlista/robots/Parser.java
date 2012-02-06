
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;


// line 44 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 20 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,    3,    4,    6,    8,   10,   12,   14,   16,   18,   20,
	   22,   24,   42,   61,   65,   66,   67,   69,   71,   73,   75,   77,
	   79,   81,   83,   85,   87,  105,  122,  123,  124,  125,  126,  127,
	  128,  129,  130,  131,  132,  133,  150,  169,  172,  173,  175,  179,
	  180,  182,  184,  186,  188,  190,  192,  194,  196,  198,  200,  218,
	  235,  236,  240,  242,  245,  248,  250,  256
	};
}

private static final short _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	    9,   32,   35,   10,   10,  115,   10,  101,   10,  114,   10,   45,
	   10,   97,   10,  103,   10,  101,   10,  110,   10,  116,   10,   58,
	    9,   10,   32,   44,   47,  123,  125,  127,    0,   31,   34,   35,
	   40,   41,   58,   64,   91,   93,    9,   10,   13,   32,   34,   35,
	   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,   64,   91,
	   93,    9,   10,   32,   35,   10,   10,   10,  115,   10,  101,   10,
	  114,   10,   45,   10,   97,   10,  103,   10,  101,   10,  110,   10,
	  116,   10,   58,    9,   10,   32,   44,   47,  123,  125,  127,    0,
	   31,   34,   35,   40,   41,   58,   64,   91,   93,   10,   13,   44,
	   47,  123,  125,  127,    0,   32,   34,   35,   40,   41,   58,   64,
	   91,   93,   10,  115,  101,  114,   45,   97,  103,  101,  110,  116,
	   58,    9,   32,   44,   47,  123,  125,  127,    0,   31,   34,   35,
	   40,   41,   58,   64,   91,   93,    9,   10,   13,   32,   34,   35,
	   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,   64,   91,
	   93,    9,   32,   35,   10,   10,   13,    9,   10,   32,   35,   10,
	   10,  115,   10,  101,   10,  114,   10,   45,   10,   97,   10,  103,
	   10,  101,   10,  110,   10,  116,   10,   58,    9,   10,   32,   44,
	   47,  123,  125,  127,    0,   31,   34,   35,   40,   41,   58,   64,
	   91,   93,   10,   13,   44,   47,  123,  125,  127,    0,   32,   34,
	   35,   40,   41,   58,   64,   91,   93,   10,    9,   32,   35,   85,
	   10,   85,   10,   13,   85,   10,   13,   85,   10,   85,    9,   10,
	   13,   32,   35,   85,    9,   32,   35,   85,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    2,    8,   11,    4,    1,    1,    2,    2,    2,    2,    2,    2,
	    2,    2,    2,    2,    8,    7,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    7,   11,    3,    1,    2,    4,    1,
	    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    8,    7,
	    1,    4,    2,    3,    3,    2,    6,    4
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    5,    4,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    5,    5,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    5,    4,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    5,    5,
	    0,    0,    0,    0,    0,    0,    0,    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,    4,    6,    9,   12,   15,   18,   21,   24,   27,   30,
	   33,   36,   50,   66,   71,   73,   75,   78,   81,   84,   87,   90,
	   93,   96,   99,  102,  105,  119,  132,  134,  136,  138,  140,  142,
	  144,  146,  148,  150,  152,  154,  167,  183,  187,  189,  192,  197,
	  199,  202,  205,  208,  211,  214,  217,  220,  223,  226,  229,  243,
	  256,  258,  263,  266,  270,  274,  277,  284
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_indicies_0()
{
	return new byte [] {
	    0,    0,    2,    1,    3,    2,    3,    4,    2,    3,    5,    2,
	    3,    6,    2,    3,    7,    2,    3,    8,    2,    3,    9,    2,
	    3,   10,    2,    3,   11,    2,    3,   12,    2,    3,   13,    2,
	   13,    3,   13,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    2,   14,   15,   16,   17,   15,    2,   19,    2,    2,    2,    2,
	    2,    2,    2,    2,    2,   18,   15,    3,   15,   19,    2,   20,
	   19,   21,   19,   20,   22,   19,   20,   23,   19,   20,   24,   19,
	   20,   25,   19,   20,   26,   19,   20,   27,   19,   20,   28,   19,
	   20,   29,   19,   20,   30,   19,   20,   31,   19,   31,   20,   31,
	   19,   19,   19,   19,   19,   19,   19,   19,   19,   19,   32,   33,
	   34,   19,   19,   19,   19,   19,   19,   19,   19,   19,   19,   35,
	   36,    2,   37,    1,   38,    1,   39,    1,   40,    1,   41,    1,
	   42,    1,   43,    1,   44,    1,   45,    1,   46,    1,   46,   46,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,   47,   48,
	   49,   50,   48,    1,   52,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,   51,   48,   48,   52,    1,   53,   52,   54,   55,   52,
	   56,   53,   56,   19,   52,   57,   52,   53,   58,   52,   53,   59,
	   52,   53,   60,   52,   53,   61,   52,   53,   62,   52,   53,   63,
	   52,   53,   64,   52,   53,   65,   52,   53,   66,   52,   53,   67,
	   52,   67,   53,   67,   52,   52,   52,   52,   52,   52,   52,   52,
	   52,   52,   68,   54,   55,   52,   52,   52,   52,   52,   52,   52,
	   52,   52,   52,   69,   70,    1,    0,    0,    2,   71,    1,    3,
	   72,    2,   33,   34,   73,   19,   33,   34,   73,   19,    3,   72,
	    2,   56,   54,   55,   56,   19,   74,   52,    0,    0,    2,   71,
	    1,    0
	};
}

private static final byte _robots_indicies[] = init__robots_indicies_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    0,    2,   62,    4,    5,    6,    7,    8,    9,   10,   11,
	   12,   13,   14,   15,   65,   30,   14,   16,   63,   64,   19,   20,
	   21,   22,   23,   24,   25,   26,   27,   28,   29,   64,   17,   29,
	   65,   32,   33,   34,   35,   36,   37,   38,   39,   40,   41,   42,
	   43,   67,   60,   42,   44,   45,   66,   47,   46,   66,   49,   50,
	   51,   52,   53,   54,   55,   56,   57,   58,   59,   59,   67,   31,
	    3,   18,   48
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    3,    0,    1,    1,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    3,    1,    1,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,
	    0,    1,    1,    0,    0,    0,    1,    1,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    3,    0,    0,    0,
	    0,    0,    0
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    5,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    5,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    5,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    5,
	    0,    0,    0,    0,    1,    1,    1,    1
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 61;
static final int robots_first_final = 61;
static final int robots_error = 0;

static final int robots_en_main = 61;


// line 48 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public static IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    PersistentHashMap result = create();

    
// line 225 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 62 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 232 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 14 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{ ansp = 0; }
	break;
	case 1:
// line 16 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{ ansp = p; System.out.println("agent_start, ansp = " + ansp); }
	break;
// line 320 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
	case 0:
// line 14 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{ ansp = 0; }
	break;
	case 2:
// line 17 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    String last_seen_agent_name = new String(data, ansp, (p - ansp));
    System.out.println("Seen UA " + last_seen_agent_name);
  }
	break;
// line 352 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 63 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
        throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return result;
  }
}

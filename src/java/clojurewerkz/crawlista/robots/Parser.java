
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.ITransientVector;
import clojure.lang.IPersistentVector;
import clojure.lang.PersistentVector;



// line 59 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 23 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    2,    0,    1,    2,    1,
	    0
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,    4,    9,   10,   11,   12,   13,   14,   15,   16,   17,
	   18,   19,   20,   24,   27,   34,   39,   43,   44,   45,   46,   47,
	   48,   49,   50,   51,   52,   53,   57,   60,   67,   71,   75,   79,
	   83,   87,   91,   95,   99,  103,  107,  113,  120,  125,  130,  131,
	  132,  136,  140,  144,  148,  152,  156,  160,  164,  168,  172,  178,
	  185,  191,  198,  203,  210,  215,  222,  229,  234,  241
	};
}

private static final short _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	   32,   35,    9,   13,   10,   13,  127,    0,   31,   10,  115,  101,
	  114,   45,   97,  103,  101,  110,  116,   58,   32,   35,    9,   13,
	   10,   13,   35,   10,   13,   32,   35,   85,    9,   12,   10,   13,
	  127,    0,   31,   32,   35,    9,   13,  115,  101,  114,   45,   97,
	  103,  101,  110,  116,   58,   32,   35,    9,   13,   10,   13,   35,
	   10,   13,   32,   35,   85,    9,   12,   10,   13,   35,  115,   10,
	   13,   35,  101,   10,   13,   35,  114,   10,   13,   35,   45,   10,
	   13,   35,   97,   10,   13,   35,  103,   10,   13,   35,  101,   10,
	   13,   35,  110,   10,   13,   35,  116,   10,   13,   35,   58,   10,
	   13,   32,   35,    9,   12,   10,   13,   32,   35,   85,    9,   12,
	   10,   13,  127,    0,   31,   32,   35,   85,    9,   13,   10,   10,
	   10,   13,   35,  115,   10,   13,   35,  101,   10,   13,   35,  114,
	   10,   13,   35,   45,   10,   13,   35,   97,   10,   13,   35,  103,
	   10,   13,   35,  101,   10,   13,   35,  110,   10,   13,   35,  116,
	   10,   13,   35,   58,   10,   13,   32,   35,    9,   12,   10,   13,
	   32,   35,   85,    9,   12,   10,   13,   32,   35,    9,   12,   10,
	   13,   32,   35,   85,    9,   12,   32,   35,   85,    9,   13,   10,
	   13,   32,   35,   85,    9,   12,   32,   35,   85,    9,   13,   10,
	   13,   32,   35,   85,    9,   12,   10,   13,   32,   35,   85,    9,
	   12,   32,   35,   85,    9,   13,   10,   13,   32,   35,   85,    9,
	   12,   10,   13,   32,   35,   85,    9,   12,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    2,    3,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    2,    3,    5,    3,    2,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    2,    3,    5,    4,    4,    4,    4,
	    4,    4,    4,    4,    4,    4,    4,    5,    3,    3,    1,    1,
	    4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    5,
	    4,    5,    3,    5,    3,    5,    5,    3,    5,    5
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    0,    1,    1,    1,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    1,    0,    1,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    1,    1,    1,    1,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,    4,    9,   11,   13,   15,   17,   19,   21,   23,   25,
	   27,   29,   31,   35,   39,   46,   51,   55,   57,   59,   61,   63,
	   65,   67,   69,   71,   73,   75,   79,   83,   90,   95,  100,  105,
	  110,  115,  120,  125,  130,  135,  140,  146,  153,  158,  163,  165,
	  167,  172,  177,  182,  187,  192,  197,  202,  207,  212,  217,  223,
	  230,  236,  243,  248,  255,  260,  267,  274,  279,  286
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_indicies_0()
{
	return new byte [] {
	    0,    2,    0,    1,    3,    4,    1,    1,    2,    3,    1,    5,
	    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,   11,
	    1,   12,    1,   13,    1,   14,    1,   16,    1,   16,   15,   18,
	   19,    1,   17,   18,   21,   20,   22,   23,   20,   17,   24,   25,
	    1,    1,   22,   26,   22,   26,    1,   27,    1,   28,    1,   29,
	    1,   30,    1,   31,    1,   32,    1,   33,    1,   34,    1,   35,
	    1,   36,    1,   38,    1,   38,   37,   40,   41,    1,   39,   40,
	   43,   42,   22,   44,   42,   39,   40,   41,    1,   45,   39,   40,
	   41,    1,   46,   39,   40,   41,    1,   47,   39,   40,   41,    1,
	   48,   39,   40,   41,    1,   49,   39,   40,   41,    1,   50,   39,
	   40,   41,    1,   51,   39,   40,   41,    1,   52,   39,   40,   41,
	    1,   53,   39,   40,   41,    1,   54,   39,   55,   56,   38,    1,
	   38,   37,   55,   58,   57,   22,   59,   57,   37,   60,   61,    1,
	    1,   62,   63,   22,   64,   63,    1,   60,    1,   24,    1,   18,
	   19,    1,   65,   17,   18,   19,    1,   66,   17,   18,   19,    1,
	   67,   17,   18,   19,    1,   68,   17,   18,   19,    1,   69,   17,
	   18,   19,    1,   70,   17,   18,   19,    1,   71,   17,   18,   19,
	    1,   72,   17,   18,   19,    1,   73,   17,   18,   19,    1,   74,
	   17,   76,   77,   75,    1,   75,   15,   76,   79,   78,   22,   80,
	   78,   15,   81,   82,   16,    1,   16,   15,   81,   84,   83,   22,
	   80,   83,   15,    0,    2,   85,    0,    1,   18,   21,   20,   62,
	   23,   20,   17,   26,   22,   64,   26,    1,   40,   43,   42,   62,
	   44,   42,   39,   55,   58,   57,   62,   59,   57,   37,   63,   62,
	   64,   63,    1,   76,   79,   78,   62,   80,   78,   15,   81,   84,
	   83,   62,   80,   83,   15,    0
	};
}

private static final byte _robots_indicies[] = init__robots_indicies_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    0,    2,   62,    3,    5,    6,    7,    8,    9,   10,   11,
	   12,   13,   14,   15,   60,   15,   63,   15,   16,   16,   17,   48,
	   64,   47,   18,   20,   21,   22,   23,   24,   25,   26,   27,   28,
	   29,   30,   42,   30,   65,   30,   31,   31,   32,   33,   34,   35,
	   36,   37,   38,   39,   40,   41,   42,   66,   42,   43,   43,   32,
	   67,   46,   44,   45,   19,   49,   50,   51,   52,   53,   54,   55,
	   56,   57,   58,   58,   68,   58,   59,   59,   48,   69,   60,   61,
	   61,    4
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    3,    3,    0,    1,    1,    0,    1,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    3,    3,    0,    1,    1,    0,    1,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,   10,   10,    3,   10,    3,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    3,    7,    7,    3,    7,    3,   10,   10,    3,
	   10,    0
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    5,    5,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    5,    5,    5,    5,    5,    5,
	    5,    5,    5,    5,    5,    5,    5,    5,    0,    0,    0,    0,
	    5,    5,    5,    5,    5,    5,    5,    5,    5,    5,    5,    5,
	    5,    5,    0,    5,    0,    5,    5,    0,    5,    5
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 62;
static final int robots_first_final = 62;
static final int robots_error = 0;

static final int robots_en_main = 62;


// line 63 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public IPersistentVector parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    
// line 230 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 77 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 237 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 17 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    ansp = 0;
  }
	break;
	case 1:
// line 21 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    ansp = p;
  }
	break;
// line 329 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
	case 2:
// line 25 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
// line 360 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 78 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

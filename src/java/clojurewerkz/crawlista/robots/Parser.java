
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentVector;



// line 51 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 21 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    2,    2,    0
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,    3,    4,    6,    8,   10,   12,   14,   16,   18,   20,
	   22,   24,   42,   61,   65,   66,   68,   70,   72,   74,   76,   78,
	   80,   82,   84,   86,  104,  123,  124,  125,  126,  127,  128,  129,
	  130,  131,  132,  133,  134,  151,  170,  173,  174,  178,  180,  182,
	  184
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
	   93,    9,   10,   32,   35,   10,   10,  115,   10,  101,   10,  114,
	   10,   45,   10,   97,   10,  103,   10,  101,   10,  110,   10,  116,
	   10,   58,    9,   10,   32,   44,   47,  123,  125,  127,    0,   31,
	   34,   35,   40,   41,   58,   64,   91,   93,    9,   10,   13,   32,
	   34,   35,   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,
	   64,   91,   93,   10,  115,  101,  114,   45,   97,  103,  101,  110,
	  116,   58,    9,   32,   44,   47,  123,  125,  127,    0,   31,   34,
	   35,   40,   41,   58,   64,   91,   93,    9,   10,   13,   32,   34,
	   35,   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,   64,
	   91,   93,    9,   32,   35,   10,    9,   32,   35,   85,   10,   85,
	   10,   85,   10,   85,    9,   32,   35,   85,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    2,    8,   11,    4,    1,    2,    2,    2,    2,    2,    2,    2,
	    2,    2,    2,    8,   11,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    7,   11,    3,    1,    4,    2,    2,    2,
	    4
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    5,    4,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    5,    4,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    5,    4,    0,    0,    0,    0,    0,    0,
	    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,    4,    6,    9,   12,   15,   18,   21,   24,   27,   30,
	   33,   36,   50,   66,   71,   73,   76,   79,   82,   85,   88,   91,
	   94,   97,  100,  103,  117,  133,  135,  137,  139,  141,  143,  145,
	  147,  149,  151,  153,  155,  168,  184,  188,  190,  195,  198,  201,
	  204
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
	    2,    2,    2,    2,    2,   18,   20,    3,   20,   21,    2,   22,
	   21,   22,   23,   21,   22,   24,   21,   22,   25,   21,   22,   26,
	   21,   22,   27,   21,   22,   28,   21,   22,   29,   21,   22,   30,
	   21,   22,   31,   21,   22,   32,   21,   32,   22,   32,   21,   21,
	   21,   21,   21,   21,   21,   21,   21,   21,   33,   19,   34,   19,
	   19,   21,   19,   21,   21,   21,   21,   21,   21,   21,   21,   21,
	   35,   36,    2,   37,    1,   38,    1,   39,    1,   40,    1,   41,
	    1,   42,    1,   43,    1,   44,    1,   45,    1,   46,    1,   46,
	   46,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,   47,
	   48,   49,   50,   48,    1,   19,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,   51,   52,   52,   21,    1,   53,    1,    0,    0,
	    2,   54,    1,    3,   55,    2,   22,   56,   21,    3,   55,    2,
	    0,    0,    2,   54,    1,    0
	};
}

private static final byte _robots_indicies[] = init__robots_indicies_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    0,    2,   45,    4,    5,    6,    7,    8,    9,   10,   11,
	   12,   13,   14,   15,   47,   29,   14,   16,   15,   16,   46,   18,
	   19,   20,   21,   22,   23,   24,   25,   26,   27,   28,   46,   28,
	   47,   31,   32,   33,   34,   35,   36,   37,   38,   39,   40,   41,
	   42,   48,   43,   41,   42,   48,   30,    3,   17
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    3,    7,    7,    7,    0,    7,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,    7,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,
	    7,    7,    7,    0,    0,    0,    0,    0,    0
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    5,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    5,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    5,    0,    0,    0,    0,    1,    1,
	    1
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 44;
static final int robots_first_final = 44;
static final int robots_error = 0;

static final int robots_en_main = 44;


// line 55 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    ITransientMap result = PersistentHashMap.create().asTransient();

    
// line 204 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 69 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 211 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 15 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    ansp = 0;
  }
	break;
	case 1:
// line 19 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    ansp = p;
  }
	break;
	case 2:
// line 23 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));

    result.assoc(lastSeenUserAgentName, PersistentVector.create());
  }
	break;
// line 311 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 15 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    ansp = 0;
  }
	break;
	case 2:
// line 23 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));

    result.assoc(lastSeenUserAgentName, PersistentVector.create());
  }
	break;
// line 346 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 70 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return result.persistent();
  }
}

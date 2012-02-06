
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;


// line 35 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 20 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_key_offsets_0()
{
	return new byte [] {
	    0,    0,    3,    4,    5,    6,    7,    8,    9,   10,   11,   12,
	   13,   14,   30,   49,   52,   53,   55,   59,   60,   62,   64,   66,
	   68,   70,   72,   74,   76,   78,   80,   97,  113,  114,  118,  119
	};
}

private static final byte _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	    9,   32,   35,   10,  115,  101,  114,   45,   97,  103,  101,  110,
	  116,   58,    9,   32,   34,   44,   47,  123,  125,  127,    0,   31,
	   40,   41,   58,   64,   91,   93,    9,   10,   13,   32,   34,   35,
	   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,   64,   91,
	   93,    9,   32,   35,   10,   10,   13,    9,   10,   32,   35,   10,
	   10,  115,   10,  101,   10,  114,   10,   45,   10,   97,   10,  103,
	   10,  101,   10,  110,   10,  116,   10,   58,    9,   10,   32,   34,
	   44,   47,  123,  125,  127,    0,   31,   40,   41,   58,   64,   91,
	   93,   10,   13,   34,   44,   47,  123,  125,  127,    0,   32,   40,
	   41,   58,   64,   91,   93,   10,    9,   32,   35,   85,   10,    9,
	   10,   13,   32,   35,   85,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    8,   11,    3,    1,    2,    4,    1,    2,    2,    2,    2,
	    2,    2,    2,    2,    2,    2,    9,    8,    1,    4,    1,    6
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    4,    4,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    4,    4,    0,    0,    0,    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,    4,    6,    8,   10,   12,   14,   16,   18,   20,   22,
	   24,   26,   39,   55,   59,   61,   64,   69,   71,   74,   77,   80,
	   83,   86,   89,   92,   95,   98,  101,  115,  128,  130,  135,  137
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    1,    2,    0,   34,    2,    4,    0,    5,    0,    6,    0,
	    7,    0,    8,    0,    9,    0,   10,    0,   11,    0,   12,    0,
	   13,    0,   13,   13,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,   14,   15,   33,   32,   15,    0,   31,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,   14,   15,   15,   16,    0,   17,
	   16,   35,   19,   16,   18,   17,   18,    2,   16,   35,   16,   17,
	   21,   16,   17,   22,   16,   17,   23,   16,   17,   24,   16,   17,
	   25,   16,   17,   26,   16,   17,   27,   16,   17,   28,   16,   17,
	   29,   16,   17,   30,   16,   30,   17,   30,   16,   16,   16,   16,
	   16,   16,   16,   16,   16,   16,   31,   35,   19,   16,   16,   16,
	   16,   16,   16,   16,   16,   16,   16,   31,   33,    0,    1,    1,
	    2,    3,    0,   34,    2,   18,   35,   19,   18,    2,   20,   16,
	    0
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


static final int robots_start = 33;
static final int robots_first_final = 33;
static final int robots_error = 0;

static final int robots_en_main = 33;


// line 39 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public static IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    PersistentHashMap result = create();

    
// line 130 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 50 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 137 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	int _klen;
	int _trans = 0;
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
case 5:
	}
	break; }
	}

// line 51 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
        throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return result;
  }
}

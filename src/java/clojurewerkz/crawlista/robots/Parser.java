
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.PersistentHashMap;

import static clojure.lang.PersistentHashMap.create;


// line 17 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 20 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_key_offsets_0()
{
	return new byte [] {
	    0,    0,    4,    8
	};
}

private static final byte _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	   32,   35,    9,   13,   32,   35,    9,   13,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    2,    2,    0
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    0
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static byte[] init__robots_index_offsets_0()
{
	return new byte [] {
	    0,    0,    4,    8
	};
}

private static final byte _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    3,    1,    0,    1,    3,    1,    0,    3,    0
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


static final int robots_start = 2;
static final int robots_first_final = 2;
static final int robots_error = 0;

static final int robots_en_main = 2;


// line 21 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public static IPersistentMap parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    PersistentHashMap result = create();

    
// line 100 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 32 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 107 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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

// line 33 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
        throw new ParseException("Unparseable input: " + input, p);
    }

    return result;
  }
}

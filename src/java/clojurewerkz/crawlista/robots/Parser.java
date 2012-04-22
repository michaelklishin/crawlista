
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.ITransientVector;
import clojure.lang.IPersistentVector;
import clojure.lang.PersistentVector;



// line 63 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 23 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static byte[] init__robots_key_offsets_0()
{
	return new byte [] {
	    0,    0,    5,   10,   11,   12,   13,   14,   15,   16,   17,   18,
	   19,   20,   21,   29,   32,   35
	};
}

private static final byte _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	   32,   35,   85,    9,   13,   10,   13,  127,    0,   31,   10,  115,
	  101,  114,   45,   97,  103,  101,  110,  116,   58,   32,   42,    9,
	   13,   65,   90,   97,  122,   10,   13,   35,   10,   13,   35,   32,
	   35,   85,    9,   13,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    3,    3,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    2,    3,    3,    3
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    3,    0,    0,    1
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static byte[] init__robots_index_offsets_0()
{
	return new byte [] {
	    0,    0,    5,   10,   12,   14,   16,   18,   20,   22,   24,   26,
	   28,   30,   32,   38,   42,   46
	};
}

private static final byte _robots_index_offsets[] = init__robots_index_offsets_0();


private static byte[] init__robots_indicies_0()
{
	return new byte [] {
	    0,    2,    3,    0,    1,    4,    5,    1,    1,    2,    4,    1,
	    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,   11,    1,
	   12,    1,   13,    1,   14,    1,   15,    1,   15,   16,   15,   17,
	   17,    1,   18,   19,   20,    1,   18,   22,   20,   21,    0,    2,
	    3,    0,    1,    0
	};
}

private static final byte _robots_indicies[] = init__robots_indicies_0();


private static byte[] init__robots_trans_targs_0()
{
	return new byte [] {
	    1,    0,    2,    4,   17,    3,    5,    6,    7,    8,    9,   10,
	   11,   12,   13,   14,   15,   16,   17,    3,    2,   16,   16
	};
}

private static final byte _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    1,    1,    3,    3,    3,    0,    3
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    3,    3,    0
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 17;
static final int robots_first_final = 17;
static final int robots_error = 0;

static final int robots_en_main = 17;


// line 67 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

  public IPersistentVector parse(String input) throws ParseException {
    char[] data = input.toCharArray();
    int cs;
    int eof = data.length;
    int p = 0;
    int pe = eof;

    // agent name start position
    int ansp = 0;

    ITransientVector result = PersistentVector.create().asTransient();

    
// line 160 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 81 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 167 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
    // System.out.println("action: agent_start. p = " + p);
    ansp = p;
  }
	break;
	case 1:
// line 22 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
// line 265 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 22 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
// line 297 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 82 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

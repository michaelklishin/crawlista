
// line 1 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
package clojurewerkz.crawlista.robots;


import java.text.ParseException;

import clojure.lang.IPersistentMap;
import clojure.lang.ITransientMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.ITransientVector;
import clojure.lang.IPersistentVector;
import clojure.lang.PersistentVector;



// line 129 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"


public class Parser {
  
// line 23 "src/java/clojurewerkz/crawlista/robots/Parser.java"
private static byte[] init__robots_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    2,    1,    3,
	    2,    2,    3,    2,    3,    1,    2,    3,    2,    3,    1,    2,
	    3
	};
}

private static final byte _robots_actions[] = init__robots_actions_0();


private static short[] init__robots_key_offsets_0()
{
	return new short [] {
	    0,    0,    8,   13,   14,   16,   18,   20,   22,   24,   26,   28,
	   29,   40,   55,   61,   69,   74,   76,   78,   80,   82,   84,   86,
	   88,   89,  100,  115,  121,  122,  129,  137,  145,  153,  161,  169,
	  177,  185,  192,  200,  208,  216,  223,  231,  239,  247,  255,  263,
	  270,  286,  294,  297,  300,  313,  318,  323,  328,  333,  338,  343,
	  348,  352,  363,  369,  374,  379,  384,  388,  393,  398,  403,  408,
	  413,  417,  428,  437,  443,  445,  447,  449,  450,  452,  454,  456,
	  458,  460,  461,  466,  474,  475,  476,  483,  488,  496,  504,  512,
	  520,  528,  536,  544,  551,  562,  569,  580,  588,  596,  604,  611,
	  619,  627,  635,  643,  651,  658,  674,  683,  689,  695,  698,  705,
	  706,  711,  719,  734,  742,  750,  765,  778,  786,  801,  814
	};
}

private static final short _robots_key_offsets[] = init__robots_key_offsets_0();


private static char[] init__robots_trans_keys_0()
{
	return new char [] {
	   32,   35,   68,   85,  100,  117,    9,   13,   10,   13,  127,    0,
	   31,   10,   73,  105,   83,  115,   65,   97,   76,  108,   76,  108,
	   79,  111,   87,  119,   58,   10,   13,   32,   35,  127,    0,    8,
	    9,   12,   14,   31,   10,   13,   32,   35,   68,   85,  100,  117,
	  127,    0,    8,    9,   12,   14,   31,   10,   13,   35,  127,    0,
	   32,   32,   35,   68,   85,  100,  117,    9,   13,   10,   13,  127,
	    0,   31,   73,  105,   83,  115,   65,   97,   76,  108,   76,  108,
	   79,  111,   87,  119,   58,   10,   13,   32,   35,  127,    0,    8,
	    9,   12,   14,   31,   10,   13,   32,   35,   68,   85,  100,  117,
	  127,    0,    8,    9,   12,   14,   31,   10,   13,   35,  127,    0,
	   32,   10,   10,   13,   32,   35,  127,    0,   31,   10,   13,   35,
	   73,  105,  127,    0,   32,   10,   13,   35,   83,  115,  127,    0,
	   32,   10,   13,   35,   65,   97,  127,    0,   32,   10,   13,   35,
	   76,  108,  127,    0,   32,   10,   13,   35,   76,  108,  127,    0,
	   32,   10,   13,   35,   79,  111,  127,    0,   32,   10,   13,   35,
	   87,  119,  127,    0,   32,   10,   13,   35,   58,  127,    0,   32,
	   10,   13,   35,   83,  115,  127,    0,   32,   10,   13,   35,   69,
	  101,  127,    0,   32,   10,   13,   35,   82,  114,  127,    0,   32,
	   10,   13,   35,   45,  127,    0,   32,   10,   13,   35,   65,   97,
	  127,    0,   32,   10,   13,   35,   71,  103,  127,    0,   32,   10,
	   13,   35,   69,  101,  127,    0,   32,   10,   13,   35,   78,  110,
	  127,    0,   32,   10,   13,   35,   84,  116,  127,    0,   32,   10,
	   13,   35,   58,  127,    0,   32,   10,   13,   32,   35,   42,  127,
	    0,    8,    9,   12,   14,   31,   65,   90,   97,  122,   32,   42,
	    9,   13,   65,   90,   97,  122,   10,   13,   35,   10,   13,   35,
	   32,   35,   42,   68,   85,  100,  117,    9,   13,   65,   90,   97,
	  122,   10,   13,   35,   73,  105,   10,   13,   35,   83,  115,   10,
	   13,   35,   65,   97,   10,   13,   35,   76,  108,   10,   13,   35,
	   76,  108,   10,   13,   35,   79,  111,   10,   13,   35,   87,  119,
	   10,   13,   35,   58,   10,   13,   32,   35,  127,    0,    8,    9,
	   12,   14,   31,   10,   13,   35,  127,    0,   32,   10,   13,   35,
	   83,  115,   10,   13,   35,   69,  101,   10,   13,   35,   82,  114,
	   10,   13,   35,   45,   10,   13,   35,   65,   97,   10,   13,   35,
	   71,  103,   10,   13,   35,   69,  101,   10,   13,   35,   78,  110,
	   10,   13,   35,   84,  116,   10,   13,   35,   58,   10,   13,   32,
	   35,   42,    9,   12,   65,   90,   97,  122,   10,   32,   42,    9,
	   13,   65,   90,   97,  122,   10,   13,   35,  127,    0,   32,   83,
	  115,   69,  101,   82,  114,   45,   65,   97,   71,  103,   69,  101,
	   78,  110,   84,  116,   58,   10,   13,  127,    0,   31,   32,   35,
	   68,   85,  100,  117,    9,   13,   10,   10,   10,   13,   32,   35,
	  127,    0,   31,   10,   13,  127,    0,   31,   10,   13,   35,   73,
	  105,  127,    0,   32,   10,   13,   35,   83,  115,  127,    0,   32,
	   10,   13,   35,   65,   97,  127,    0,   32,   10,   13,   35,   76,
	  108,  127,    0,   32,   10,   13,   35,   76,  108,  127,    0,   32,
	   10,   13,   35,   79,  111,  127,    0,   32,   10,   13,   35,   87,
	  119,  127,    0,   32,   10,   13,   35,   58,  127,    0,   32,   10,
	   13,   32,   35,  127,    0,    8,    9,   12,   14,   31,   10,   13,
	   32,   35,  127,    0,   31,   10,   13,   32,   35,  127,    0,    8,
	    9,   12,   14,   31,   10,   13,   35,   83,  115,  127,    0,   32,
	   10,   13,   35,   69,  101,  127,    0,   32,   10,   13,   35,   82,
	  114,  127,    0,   32,   10,   13,   35,   45,  127,    0,   32,   10,
	   13,   35,   65,   97,  127,    0,   32,   10,   13,   35,   71,  103,
	  127,    0,   32,   10,   13,   35,   69,  101,  127,    0,   32,   10,
	   13,   35,   78,  110,  127,    0,   32,   10,   13,   35,   84,  116,
	  127,    0,   32,   10,   13,   35,   58,  127,    0,   32,   10,   13,
	   32,   35,   42,  127,    0,    8,    9,   12,   14,   31,   65,   90,
	   97,  122,   10,   32,   42,    9,   13,   65,   90,   97,  122,   10,
	   13,   35,  127,    0,   32,   10,   13,   35,  127,    0,   32,   10,
	   13,   35,   10,   13,   32,   35,  127,    0,   31,   10,   10,   13,
	  127,    0,   31,   32,   35,   68,   85,  100,  117,    9,   13,   10,
	   13,   32,   35,   68,   85,  100,  117,  127,    0,    8,    9,   12,
	   14,   31,   32,   35,   68,   85,  100,  117,    9,   13,   32,   35,
	   68,   85,  100,  117,    9,   13,   10,   13,   32,   35,   68,   85,
	  100,  117,  127,    0,    8,    9,   12,   14,   31,   32,   35,   42,
	   68,   85,  100,  117,    9,   13,   65,   90,   97,  122,   32,   35,
	   68,   85,  100,  117,    9,   13,   10,   13,   32,   35,   68,   85,
	  100,  117,  127,    0,    8,    9,   12,   14,   31,   32,   35,   42,
	   68,   85,  100,  117,    9,   13,   65,   90,   97,  122,   32,   35,
	   68,   85,  100,  117,    9,   13,    0
	};
}

private static final char _robots_trans_keys[] = init__robots_trans_keys_0();


private static byte[] init__robots_single_lengths_0()
{
	return new byte [] {
	    0,    6,    3,    1,    2,    2,    2,    2,    2,    2,    2,    1,
	    5,    9,    4,    6,    3,    2,    2,    2,    2,    2,    2,    2,
	    1,    5,    9,    4,    1,    5,    6,    6,    6,    6,    6,    6,
	    6,    5,    6,    6,    6,    5,    6,    6,    6,    6,    6,    5,
	    6,    2,    3,    3,    7,    5,    5,    5,    5,    5,    5,    5,
	    4,    5,    4,    5,    5,    5,    4,    5,    5,    5,    5,    5,
	    4,    5,    3,    4,    2,    2,    2,    1,    2,    2,    2,    2,
	    2,    1,    3,    6,    1,    1,    5,    3,    6,    6,    6,    6,
	    6,    6,    6,    5,    5,    5,    5,    6,    6,    6,    5,    6,
	    6,    6,    6,    6,    5,    6,    3,    4,    4,    3,    5,    1,
	    3,    6,    9,    6,    6,    9,    7,    6,    9,    7,    6
	};
}

private static final byte _robots_single_lengths[] = init__robots_single_lengths_0();


private static byte[] init__robots_range_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    3,    3,    1,    1,    1,    0,    0,    0,    0,    0,    0,    0,
	    0,    3,    3,    1,    0,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    5,    3,    0,    0,    3,    0,    0,    0,    0,    0,    0,    0,
	    0,    3,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    3,    3,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    1,    1,    0,    0,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    3,    1,    3,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    5,    3,    1,    1,    0,    1,    0,
	    1,    1,    3,    1,    1,    3,    3,    1,    3,    3,    1
	};
}

private static final byte _robots_range_lengths[] = init__robots_range_lengths_0();


private static short[] init__robots_index_offsets_0()
{
	return new short [] {
	    0,    0,    8,   13,   15,   18,   21,   24,   27,   30,   33,   36,
	   38,   47,   60,   66,   74,   79,   82,   85,   88,   91,   94,   97,
	  100,  102,  111,  124,  130,  132,  139,  147,  155,  163,  171,  179,
	  187,  195,  202,  210,  218,  226,  233,  241,  249,  257,  265,  273,
	  280,  292,  298,  302,  306,  317,  323,  329,  335,  341,  347,  353,
	  359,  364,  373,  379,  385,  391,  397,  402,  408,  414,  420,  426,
	  432,  437,  446,  453,  459,  462,  465,  468,  470,  473,  476,  479,
	  482,  485,  487,  492,  500,  502,  504,  511,  516,  524,  532,  540,
	  548,  556,  564,  572,  579,  588,  595,  604,  612,  620,  628,  635,
	  643,  651,  659,  667,  675,  682,  694,  701,  707,  713,  717,  724,
	  726,  731,  739,  752,  760,  768,  781,  792,  800,  813,  824
	};
}

private static final short _robots_index_offsets[] = init__robots_index_offsets_0();


private static short[] init__robots_indicies_0()
{
	return new short [] {
	    0,    2,    3,    4,    3,    4,    0,    1,    5,    6,    1,    1,
	    2,    5,    1,    7,    7,    1,    8,    8,    1,    9,    9,    1,
	   10,   10,    1,   11,   11,    1,   12,   12,    1,   13,   13,    1,
	   14,    1,   15,   16,   14,   18,    1,    1,   14,    1,   17,   15,
	   20,   19,   18,   21,   22,   21,   22,    1,    1,   19,    1,   17,
	   23,   24,   26,    1,    1,   25,   27,   28,   29,    4,   29,    4,
	   27,    1,   30,   31,    1,    1,   28,   32,   32,    1,   33,   33,
	    1,   34,   34,    1,   35,   35,    1,   36,   36,    1,   37,   37,
	    1,   38,   38,    1,   39,    1,   40,   41,   39,   43,    1,    1,
	   39,    1,   42,   40,   45,   44,   43,   46,   47,   46,   47,    1,
	    1,   44,    1,   42,   48,   49,   51,    1,    1,   50,   30,    1,
	   48,   49,   28,   51,    1,    1,   52,   48,   49,   51,   53,   53,
	    1,    1,   50,   48,   49,   51,   54,   54,    1,    1,   50,   48,
	   49,   51,   55,   55,    1,    1,   50,   48,   49,   51,   56,   56,
	    1,    1,   50,   48,   49,   51,   57,   57,    1,    1,   50,   48,
	   49,   51,   58,   58,    1,    1,   50,   48,   49,   51,   59,   59,
	    1,    1,   50,   48,   49,   51,   39,    1,    1,   50,   48,   49,
	   51,   60,   60,    1,    1,   50,   48,   49,   51,   61,   61,    1,
	    1,   50,   48,   49,   51,   62,   62,    1,    1,   50,   48,   49,
	   51,   63,    1,    1,   50,   48,   49,   51,   64,   64,    1,    1,
	   50,   48,   49,   51,   65,   65,    1,    1,   50,   48,   49,   51,
	   66,   66,    1,    1,   50,   48,   49,   51,   67,   67,    1,    1,
	   50,   48,   49,   51,   68,   68,    1,    1,   50,   48,   49,   51,
	   69,    1,    1,   50,   71,   72,   70,   51,   73,    1,    1,   70,
	    1,   74,   74,   50,   70,   75,   70,   76,   76,    1,   77,   78,
	   79,    1,   77,   81,   79,   80,   82,   28,   75,   83,   84,   83,
	   84,   82,   76,   76,    1,   77,   81,   79,   85,   85,   80,   77,
	   81,   79,   86,   86,   80,   77,   81,   79,   87,   87,   80,   77,
	   81,   79,   88,   88,   80,   77,   81,   79,   89,   89,   80,   77,
	   81,   79,   90,   90,   80,   77,   81,   79,   91,   91,   80,   77,
	   81,   79,   92,   80,   93,   94,   92,   96,   80,   80,   92,   80,
	   95,   97,   98,  100,   80,   80,   99,   77,   81,   79,  101,  101,
	   80,   77,   81,   79,  102,  102,   80,   77,   81,   79,  103,  103,
	   80,   77,   81,   79,  104,   80,   77,   81,   79,  105,  105,   80,
	   77,   81,   79,  106,  106,   80,   77,   81,   79,  107,  107,   80,
	   77,   81,   79,  108,  108,   80,   77,   81,   79,  109,  109,   80,
	   77,   81,   79,  110,   80,  111,  112,  110,   79,   76,  110,   76,
	   76,   80,  113,   70,   75,   70,   76,   76,    1,   97,  114,  100,
	    1,    1,   50,  115,  115,    1,  116,  116,    1,  117,  117,    1,
	  118,    1,  119,  119,    1,  120,  120,    1,  121,  121,    1,  122,
	  122,    1,  123,  123,    1,   70,    1,  124,  125,    1,    1,  126,
	  127,   28,    3,    4,    3,    4,  127,    1,  124,    1,  128,    1,
	   23,   24,  129,   26,    1,    1,  130,  128,  131,    1,    1,  129,
	   23,   24,   26,  132,  132,    1,    1,   25,   23,   24,   26,  133,
	  133,    1,    1,   25,   23,   24,   26,  134,  134,    1,    1,   25,
	   23,   24,   26,  135,  135,    1,    1,   25,   23,   24,   26,  136,
	  136,    1,    1,   25,   23,   24,   26,  137,  137,    1,    1,   25,
	   23,   24,   26,  138,  138,    1,    1,   25,   23,   24,   26,  139,
	    1,    1,   25,  140,  141,   39,  142,    1,    1,   39,    1,   17,
	  143,  144,  126,  146,    1,    1,  145,  147,   41,   39,   43,    1,
	    1,   39,    1,   42,   23,   24,   26,  148,  148,    1,    1,   25,
	   23,   24,   26,  149,  149,    1,    1,   25,   23,   24,   26,  150,
	  150,    1,    1,   25,   23,   24,   26,  151,    1,    1,   25,   23,
	   24,   26,  152,  152,    1,    1,   25,   23,   24,   26,  153,  153,
	    1,    1,   25,   23,   24,   26,  154,  154,    1,    1,   25,   23,
	   24,   26,  155,  155,    1,    1,   25,   23,   24,   26,  156,  156,
	    1,    1,   25,   23,   24,   26,  157,    1,    1,   25,  158,  159,
	   70,   26,  160,    1,    1,   70,    1,  161,  161,   25,  162,   70,
	   75,   70,   76,   76,    1,  163,  164,  165,    1,    1,   25,  163,
	  166,  165,   80,   80,  167,  168,   81,   79,   80,  169,  170,  171,
	  173,    1,    1,  172,  174,    1,  174,  175,    1,    1,  171,    0,
	    2,    3,    4,    3,    4,    0,    1,   15,   20,   19,  176,   21,
	   22,   21,   22,    1,    1,   19,    1,   17,   27,  126,   29,    4,
	   29,    4,   27,    1,   27,   28,   29,    4,   29,    4,   27,    1,
	   40,   45,   44,   43,   46,   47,   46,   47,    1,    1,   44,    1,
	   42,   82,   28,   75,   83,   84,   83,   84,   82,   76,   76,    1,
	  127,   28,    3,    4,    3,    4,  127,    1,   40,   45,   44,  177,
	   46,   47,   46,   47,    1,    1,   44,    1,   42,   82,  126,   75,
	   83,   84,   83,   84,   82,   76,   76,    1,  127,  126,    3,    4,
	    3,    4,  127,    1,    0
	};
}

private static final short _robots_indicies[] = init__robots_indicies_0();


private static short[] init__robots_trans_targs_0()
{
	return new short [] {
	    1,    0,    2,    4,   76,  121,    3,    5,    6,    7,    8,    9,
	   10,   11,   12,  122,   12,   14,   90,   13,   13,   92,  103,  123,
	   89,   14,   90,   15,   16,   17,  124,   28,   18,   19,   20,   21,
	   22,   23,   24,   25,  125,   25,   27,   29,   26,   26,   30,   38,
	  124,   28,   27,   29,   29,   31,   32,   33,   34,   35,   36,   37,
	   39,   40,   41,   42,   43,   44,   45,   46,   47,   48,   49,  126,
	   74,   75,   62,   50,   51,  124,   28,   16,   51,   51,   52,   53,
	   63,   54,   55,   56,   57,   58,   59,   60,   61,  125,   61,   62,
	   29,  124,   51,   62,   29,   64,   65,   66,   67,   68,   69,   70,
	   71,   72,   73,  126,   73,  126,   28,   77,   78,   79,   80,   81,
	   82,   83,   84,   85,  127,   88,   86,   87,  123,   91,   90,   89,
	   93,   94,   95,   96,   97,   98,   99,  100,  128,  102,   90,  127,
	   88,  101,  101,  128,  104,  105,  106,  107,  108,  109,  110,  111,
	  112,  113,  129,  114,  115,  116,  129,  123,   89,   90,  117,  116,
	  123,  130,  119,  120,  118,  118,  130,  119,  118,  101
	};
}

private static final short _robots_trans_targs[] = init__robots_trans_targs_0();


private static byte[] init__robots_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   12,   12,    5,   12,    0,   12,    5,    5,    7,
	    7,    0,    7,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,   12,   12,    5,   12,    0,   12,    5,    5,
	    7,    7,    0,    7,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    7,
	    7,    1,    1,    1,    1,    3,    3,    3,    0,    3,    0,    1,
	    1,    0,    0,    0,    0,    0,    0,    0,    0,   21,   21,    5,
	   21,    9,    9,    0,    9,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    3,    3,    0,    9,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,   18,   18,   18,    7,
	    7,    0,    7,   12,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    7,    7,    1,    1,    0,   15,   15,   15,   15,    0,
	    3,    7,    7,    0,    0,    7,    0,    0,   12,   12
	};
}

private static final byte _robots_trans_actions[] = init__robots_trans_actions_0();


private static byte[] init__robots_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    7,    7,    7,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    7,    7,    7,    0,    7,    7,    7,    7,    7,    7,    7,
	    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,
	    7,    0,    3,    3,    0,    3,    3,    3,    3,    3,    3,    3,
	    3,    9,    9,    3,    3,    3,    3,    3,    3,    3,    3,    3,
	    3,    3,    0,    9,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    7,    0,    7,    7,    7,    7,
	    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,
	    7,    7,    7,    7,    7,    7,    0,   15,   15,    3,    7,    0,
	    0,    0,    7,    0,    0,    7,    0,    0,    7,    0,    0
	};
}

private static final byte _robots_eof_actions[] = init__robots_eof_actions_0();


static final int robots_start = 121;
static final int robots_first_final = 121;
static final int robots_error = 0;

static final int robots_en_main = 121;


// line 133 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

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

    ITransientVector result = PersistentVector.create().asTransient();

    
// line 366 "src/java/clojurewerkz/crawlista/robots/Parser.java"
	{
	cs = robots_start;
	}

// line 150 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
    
// line 373 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 21 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_start. p = " + p);
    ansp = p;
  }
	break;
	case 1:
// line 26 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
	case 2:
// line 40 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: disallow_rule_start. p = " + p);
    drsp = p;
  }
	break;
	case 3:
// line 45 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: disallow_rule_end. p = " + p);

    String rule = new String(data, drsp, (p - drsp));
    // we matched "disallow none" case (Disallow:)
    if(rule.equals("Disallow:")) {
      rule = "";
    }

    // System.out.println("See disallow_rule: " + rule);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("disallow", rule.trim()));
  }
	break;
// line 495 "src/java/clojurewerkz/crawlista/robots/Parser.java"
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
// line 26 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: agent_end. p = " + p);
    String lastSeenUserAgentName = new String(data, ansp, (p - ansp));
    // System.out.println("See agent: " + lastSeenUserAgentName);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("user-agent", lastSeenUserAgentName.trim()));
  }
	break;
	case 3:
// line 45 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"
	{
    // System.out.println("action: disallow_rule_end. p = " + p);

    String rule = new String(data, drsp, (p - drsp));
    // we matched "disallow none" case (Disallow:)
    if(rule.equals("Disallow:")) {
      rule = "";
    }

    // System.out.println("See disallow_rule: " + rule);

    IPersistentMap m = PersistentHashMap.create();
    result.conj(m.assoc("disallow", rule.trim()));
  }
	break;
// line 544 "src/java/clojurewerkz/crawlista/robots/Parser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 151 "src/rl/clojurewerkz/crawlista/robots/Parser.rl"

    if(cs == robots_error) {
      throw new ParseException("Unparseable input: " + input + ", p = " + p, p);
    }

    return (IPersistentVector)result.persistent();
  }
}

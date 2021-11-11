// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: /Users/alex/Desktop/School/eclipse-workspace/Duplicate-Code-Detector-Team-W7-2/lib/src/main/jflex/jflexScanner.jflex

/* Partially derived from JFlexDemo by Steven Zeil https://git.cs.odu.edu/zeil/jflexdemo/-/blob/master/src/main/jflex/demo.jflex
* closely modeled after "lexical.flex" by  Jeanderson Barros Candido and Thiago Ferreira Patricio https://github.com/jeandersonbc/compilers.cpp/blob/master/specs/lexical.flex
*/



package edu.odu.cs.cs350;
//@SuppressWarnings("unused")


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class jflexScanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\6\1\7\1\10\1\0\1\11\1\12\1\0\2\10"+
    "\1\13\1\14\1\10\1\15\1\16\1\17\12\20\1\21"+
    "\1\10\1\22\1\23\1\24\1\10\1\0\3\25\1\26"+
    "\1\27\5\25\1\30\3\25\1\31\2\25\1\32\4\25"+
    "\1\33\1\25\1\34\1\25\1\10\1\35\1\10\1\36"+
    "\1\37\1\0\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\25\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\25\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\10\1\70\1\10\1\71"+
    "\6\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\1\4\1\5\2\6"+
    "\2\5\1\4\1\5\1\7\1\4\1\10\1\11\1\10"+
    "\2\12\1\10\22\12\1\10\1\3\1\10\1\0\1\13"+
    "\1\0\1\11\1\6\1\14\1\0\1\2\1\0\1\15"+
    "\12\12\1\16\5\12\1\16\24\12\2\0\47\12\1\0"+
    "\27\12\1\17\6\12\1\20\1\21\5\12\1\22\27\12"+
    "\1\23\1\12\1\16\12\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\72\0\164\0\256\0\350\0\72\0\u0122"+
    "\0\u015c\0\u0122\0\u0196\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8"+
    "\0\u02f2\0\256\0\u032c\0\u0366\0\u03a0\0\u0122\0\u03da\0\u0414"+
    "\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4"+
    "\0\u061e\0\u0658\0\u0692\0\u06cc\0\u0706\0\u0740\0\u077a\0\u07b4"+
    "\0\u07ee\0\72\0\72\0\350\0\72\0\u0828\0\72\0\72"+
    "\0\72\0\u0862\0\u089c\0\u027e\0\u0122\0\u08d6\0\u0910\0\u094a"+
    "\0\u0984\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a"+
    "\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0366\0\u0c76\0\u0cb0"+
    "\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80"+
    "\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac\0\u11e6\0\u1220"+
    "\0\u125a\0\u1294\0\u12ce\0\u1308\0\u1342\0\u137c\0\u13b6\0\u13f0"+
    "\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586\0\u15c0"+
    "\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c\0\u1756\0\u1790"+
    "\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960"+
    "\0\u199a\0\u19d4\0\u1a0e\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30"+
    "\0\u1b6a\0\u1ba4\0\u1bde\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00"+
    "\0\u1d3a\0\u1d74\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0"+
    "\0\u1f0a\0\u1f44\0\u1f7e\0\u0366\0\u1fb8\0\u1ff2\0\u202c\0\u2066"+
    "\0\u20a0\0\u20da\0\u0366\0\u0366\0\u2114\0\u214e\0\u2188\0\u21c2"+
    "\0\u21fc\0\u0366\0\u2236\0\u2270\0\u22aa\0\u22e4\0\u231e\0\u2358"+
    "\0\u2392\0\u23cc\0\u2406\0\u2440\0\u247a\0\u24b4\0\u24ee\0\u2528"+
    "\0\u2562\0\u259c\0\u25d6\0\u2610\0\u264a\0\u2684\0\u26be\0\u26f8"+
    "\0\u2732\0\u0366\0\u276c\0\u27a6\0\u27e0\0\u281a\0\u2854\0\u288e"+
    "\0\u28c8\0\u2902\0\u293c\0\u2976\0\u29b0\0\u29ea";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\3\24\1\25\4\24\1\2"+
    "\1\26\1\2\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\24\1\36\1\24\1\37\1\24\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\3\24"+
    "\1\51\1\52\74\0\1\3\112\0\1\53\46\0\7\54"+
    "\1\55\25\54\1\56\34\54\23\0\1\57\60\0\1\60"+
    "\10\0\1\57\62\0\1\52\6\0\1\57\63\0\1\52"+
    "\5\0\1\57\1\15\60\0\1\61\71\0\1\62\3\0"+
    "\1\63\3\0\1\57\66\0\1\17\16\0\1\64\53\0"+
    "\1\7\72\0\1\65\1\53\71\0\1\53\1\65\65\0"+
    "\1\24\4\0\10\24\2\0\31\24\22\0\1\24\4\0"+
    "\2\24\1\66\5\24\2\0\31\24\22\0\1\24\4\0"+
    "\10\24\2\0\13\24\1\67\7\24\1\70\5\24\22\0"+
    "\1\24\4\0\10\24\2\0\16\24\1\71\1\24\1\72"+
    "\10\24\22\0\1\24\4\0\10\24\2\0\1\24\1\73"+
    "\6\24\1\74\2\24\1\75\2\24\1\76\12\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\77\10\24\1\100"+
    "\12\24\22\0\1\24\4\0\10\24\2\0\13\24\1\73"+
    "\12\24\1\101\2\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\102\7\24\1\103\1\24\1\104\2\24\1\105"+
    "\12\24\22\0\1\24\4\0\10\24\2\0\16\24\1\70"+
    "\12\24\22\0\1\24\4\0\10\24\2\0\6\24\1\106"+
    "\6\24\1\107\13\24\22\0\1\24\4\0\10\24\2\0"+
    "\16\24\1\110\12\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\111\10\24\1\112\4\24\1\113\5\24\22\0"+
    "\1\24\4\0\10\24\2\0\17\24\1\114\11\24\22\0"+
    "\1\24\4\0\10\24\2\0\20\24\1\115\2\24\1\116"+
    "\5\24\22\0\1\24\4\0\10\24\2\0\5\24\1\117"+
    "\23\24\22\0\1\24\4\0\10\24\2\0\10\24\1\120"+
    "\1\121\10\24\1\122\2\24\1\123\3\24\22\0\1\24"+
    "\4\0\10\24\2\0\10\24\1\124\7\24\1\125\6\24"+
    "\1\126\1\24\22\0\1\24\4\0\10\24\2\0\15\24"+
    "\1\127\3\24\1\130\7\24\22\0\1\24\4\0\10\24"+
    "\2\0\16\24\1\131\12\24\22\0\1\24\4\0\10\24"+
    "\2\0\10\24\1\132\20\24\25\0\1\57\44\0\1\53"+
    "\1\0\2\54\4\0\64\54\13\133\1\134\56\133\2\63"+
    "\1\3\2\63\1\4\64\63\20\0\1\24\4\0\7\24"+
    "\1\135\2\0\31\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\136\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\22\24\1\137\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\16\24\1\140\12\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\141\23\24\22\0\1\24\4\0\10\24\2\0"+
    "\21\24\1\142\7\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\105\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\143\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\15\24\1\144\13\24\22\0\1\24\4\0\10\24\2\0"+
    "\3\24\1\145\2\24\1\146\22\24\22\0\1\24\4\0"+
    "\10\24\2\0\23\24\1\147\5\24\22\0\1\24\4\0"+
    "\10\24\2\0\17\24\1\150\2\24\1\151\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\13\24\1\152\15\24\22\0"+
    "\1\24\4\0\10\24\2\0\15\24\1\153\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\16\24\1\154\12\24\22\0"+
    "\1\24\4\0\10\24\2\0\20\24\1\106\10\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\106\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\15\24\1\155\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\25\24\1\106\3\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\156\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\13\24\1\157\15\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\160\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\11\24\1\161\4\24\1\162"+
    "\12\24\22\0\1\24\4\0\10\24\2\0\2\24\1\163"+
    "\26\24\22\0\1\24\4\0\10\24\2\0\7\24\1\164"+
    "\12\24\1\165\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\16\24\1\166\12\24\22\0\1\24\4\0\10\24\2\0"+
    "\7\24\1\167\20\24\1\170\22\0\1\24\4\0\10\24"+
    "\2\0\1\24\1\171\16\24\1\172\10\24\22\0\1\24"+
    "\4\0\10\24\2\0\11\24\1\173\17\24\22\0\1\24"+
    "\4\0\10\24\2\0\11\24\1\174\17\24\22\0\1\24"+
    "\4\0\10\24\2\0\23\24\1\175\5\24\22\0\1\24"+
    "\4\0\10\24\2\0\17\24\1\176\11\24\22\0\1\24"+
    "\4\0\10\24\2\0\11\24\1\177\7\24\1\200\7\24"+
    "\22\0\1\24\4\0\10\24\2\0\11\24\1\110\17\24"+
    "\22\0\1\24\4\0\10\24\2\0\11\24\1\201\1\24"+
    "\1\202\15\24\22\0\1\24\4\0\10\24\2\0\11\24"+
    "\1\203\17\24\2\0\13\133\1\204\56\133\13\0\1\134"+
    "\3\0\1\3\72\0\1\24\4\0\6\24\1\205\1\24"+
    "\2\0\31\24\22\0\1\24\4\0\10\24\2\0\7\24"+
    "\1\206\21\24\22\0\1\24\4\0\10\24\2\0\16\24"+
    "\1\106\12\24\22\0\1\24\4\0\10\24\2\0\13\24"+
    "\1\106\15\24\22\0\1\24\4\0\10\24\2\0\1\24"+
    "\1\207\27\24\22\0\1\24\4\0\10\24\2\0\5\24"+
    "\1\106\23\24\22\0\1\24\4\0\10\24\2\0\21\24"+
    "\1\210\7\24\22\0\1\24\4\0\10\24\2\0\21\24"+
    "\1\211\1\212\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\13\24\1\213\15\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\214\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\2\24\1\203\26\24\22\0\1\24\4\0\10\24\2\0"+
    "\13\24\1\215\15\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\216\23\24\22\0\1\24\4\0\10\24\2\0"+
    "\21\24\1\175\7\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\217\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\107\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\7\24\1\106\21\24\22\0\1\24\4\0\10\24\2\0"+
    "\26\24\1\220\2\24\22\0\1\24\4\0\10\24\2\0"+
    "\13\24\1\221\15\24\22\0\1\24\4\0\10\24\2\0"+
    "\20\24\1\222\10\24\22\0\1\24\4\0\10\24\2\0"+
    "\24\24\1\223\4\24\22\0\1\24\4\0\10\24\2\0"+
    "\22\24\1\224\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\13\24\1\225\15\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\226\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\23\24\1\216\5\24\22\0\1\24\4\0\10\24\2\0"+
    "\20\24\1\107\10\24\22\0\1\24\4\0\10\24\2\0"+
    "\15\24\1\227\13\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\230\23\24\22\0\1\24\4\0\10\24\2\0"+
    "\22\24\1\231\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\110\11\24\1\232\5\24\22\0\1\24\4\0"+
    "\10\24\2\0\22\24\1\233\6\24\22\0\1\24\4\0"+
    "\10\24\2\0\21\24\1\106\7\24\22\0\1\24\4\0"+
    "\10\24\2\0\5\24\1\234\23\24\22\0\1\24\4\0"+
    "\10\24\2\0\5\24\1\235\23\24\22\0\1\24\4\0"+
    "\10\24\2\0\16\24\1\236\12\24\22\0\1\24\4\0"+
    "\10\24\2\0\11\24\1\237\17\24\22\0\1\24\4\0"+
    "\10\24\2\0\4\24\1\106\24\24\22\0\1\24\4\0"+
    "\10\24\2\0\1\24\1\240\27\24\22\0\1\24\4\0"+
    "\10\24\2\0\13\24\1\142\15\24\2\0\13\133\1\204"+
    "\3\133\1\3\52\133\20\0\1\24\4\0\4\24\1\241"+
    "\3\24\2\0\31\24\22\0\1\24\4\0\10\24\2\0"+
    "\15\24\1\242\13\24\22\0\1\24\4\0\10\24\2\0"+
    "\12\24\1\106\16\24\22\0\1\24\4\0\10\24\2\0"+
    "\21\24\1\243\7\24\22\0\1\24\4\0\10\24\2\0"+
    "\22\24\1\244\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\245\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\22\24\1\246\6\24\22\0\1\24\4\0\10\24\2\0"+
    "\23\24\1\247\5\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\250\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\20\24\1\251\10\24\22\0\1\24\4\0\10\24\2\0"+
    "\13\24\1\252\15\24\22\0\1\24\4\0\10\24\2\0"+
    "\3\24\1\253\25\24\22\0\1\24\4\0\10\24\2\0"+
    "\17\24\1\254\11\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\255\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\1\24\1\256\27\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\257\23\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\260\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\21\24\1\261\7\24\22\0\1\24\4\0\10\24\2\0"+
    "\5\24\1\201\23\24\22\0\1\24\4\0\10\24\2\0"+
    "\16\24\1\262\12\24\22\0\1\24\4\0\10\24\2\0"+
    "\11\24\1\263\17\24\22\0\1\24\4\0\10\24\2\0"+
    "\3\24\1\264\25\24\22\0\1\24\4\0\10\24\2\0"+
    "\3\24\1\265\25\24\22\0\1\24\4\0\10\24\2\0"+
    "\4\24\1\266\4\24\1\201\3\24\1\267\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\15\24\1\243\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\7\24\1\167\21\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\270\6\24\22\0"+
    "\1\24\4\0\5\24\1\271\2\24\2\0\31\24\22\0"+
    "\1\24\4\0\10\24\2\0\1\24\1\174\27\24\22\0"+
    "\1\24\4\0\10\24\2\0\15\24\1\272\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\27\24\1\273\1\24\22\0"+
    "\1\24\4\0\10\24\2\0\13\24\1\107\15\24\22\0"+
    "\1\24\4\0\10\24\2\0\3\24\1\274\25\24\22\0"+
    "\1\24\4\0\10\24\2\0\15\24\1\106\13\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\275\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\276\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\277\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\300\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\3\24\1\301\25\24\22\0"+
    "\1\24\4\0\10\24\2\0\3\24\1\302\25\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\303\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\6\24\1\106\22\24\22\0"+
    "\1\24\4\0\10\24\2\0\3\24\1\304\25\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\243\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\10\24\1\106\20\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\262\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\1\24\1\305\27\24\22\0"+
    "\1\24\4\0\10\24\2\0\11\24\1\306\17\24\22\0"+
    "\1\24\4\0\1\24\1\106\6\24\2\0\31\24\22\0"+
    "\1\24\4\0\10\24\2\0\23\24\1\142\5\24\22\0"+
    "\1\24\4\0\10\24\2\0\17\24\1\142\11\24\22\0"+
    "\1\24\4\0\10\24\2\0\11\24\1\307\17\24\22\0"+
    "\1\24\4\0\10\24\2\0\17\24\1\107\11\24\22\0"+
    "\1\24\4\0\10\24\2\0\20\24\1\234\10\24\22\0"+
    "\1\24\4\0\10\24\2\0\16\24\1\105\12\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\302\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\22\24\1\310\6\24\22\0"+
    "\1\24\4\0\10\24\2\0\5\24\1\105\23\24\22\0"+
    "\1\24\4\0\10\24\2\0\1\311\30\24\22\0\1\24"+
    "\4\0\10\24\2\0\14\24\1\142\14\24\22\0\1\24"+
    "\4\0\10\24\2\0\13\24\1\312\15\24\22\0\1\24"+
    "\4\0\10\24\2\0\22\24\1\252\6\24\22\0\1\24"+
    "\4\0\10\24\2\0\5\24\1\313\23\24\22\0\1\24"+
    "\4\0\10\24\2\0\1\24\1\314\27\24\22\0\1\24"+
    "\4\0\10\24\2\0\5\24\1\244\23\24\22\0\1\24"+
    "\4\0\10\24\2\0\4\24\1\302\24\24\22\0\1\24"+
    "\4\0\10\24\2\0\21\24\1\315\7\24\22\0\1\24"+
    "\4\0\10\24\2\0\21\24\1\316\7\24\22\0\1\24"+
    "\4\0\10\24\2\0\5\24\1\166\23\24\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10788];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\42\1\2\11\1\0\1\11"+
    "\1\0\3\11\1\0\1\1\1\0\46\1\2\0\47\1"+
    "\1\0\112\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  StringBuilder string = new StringBuilder();
  
  private Token symbol(TokenKinds type) {
    return new Token(type, yyline+1, yycolumn+1);
  }

  private Token symbol(TokenKinds type, String value) {
    return new Token(type, yyline+1, yycolumn+1, value);
  }
  




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public jflexScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                return symbol(TokenKinds.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException("Illegal character \""+yytext()+
                                                              "\" at line "+yyline+", column "+yycolumn);
            }
            // fall through
          case 20: break;
          case 2:
            { /* Ignore: don't return anything. */
            }
            // fall through
          case 21: break;
          case 3:
            { return symbol(TokenKinds.UNARY_OPERATOR,yytext() );
            }
            // fall through
          case 22: break;
          case 4:
            { return symbol(TokenKinds.SEPARATOR,yytext() );
            }
            // fall through
          case 23: break;
          case 5:
            { return symbol(TokenKinds.ARITHMETIC_OPERATOR,yytext() );
            }
            // fall through
          case 24: break;
          case 6:
            { return symbol(TokenKinds.OVERLOADED_LEXEME,yytext() );
            }
            // fall through
          case 25: break;
          case 7:
            { return symbol(TokenKinds.INTEGER_LITERAL, yytext());
            }
            // fall through
          case 26: break;
          case 8:
            { return symbol(TokenKinds.RL_OPERATOR,yytext() );
            }
            // fall through
          case 27: break;
          case 9:
            { return symbol(TokenKinds.ASSIGNMENT,yytext() );
            }
            // fall through
          case 28: break;
          case 10:
            { return symbol(TokenKinds.IDENTIFIER, yytext());
            }
            // fall through
          case 29: break;
          case 11:
            { return symbol(TokenKinds.STRING_LITERAL,yytext());
            }
            // fall through
          case 30: break;
          case 12:
            { return symbol(TokenKinds.PM_OPERATOR,yytext() );
            }
            // fall through
          case 31: break;
          case 13:
            { return symbol(TokenKinds.SHIFT_OPERATOR,yytext() );
            }
            // fall through
          case 32: break;
          case 14:
            { return symbol(TokenKinds.KEYWORD,yytext() );
            }
            // fall through
          case 33: break;
          case 15:
            { return symbol(TokenKinds.LITERAL,yytext() );
            }
            // fall through
          case 34: break;
          case 16:
            { return symbol(TokenKinds.CLASS_DEF,yytext() );
            }
            // fall through
          case 35: break;
          case 17:
            { return symbol(TokenKinds.QUALIFIER,yytext() );
            }
            // fall through
          case 36: break;
          case 18:
            { return symbol(TokenKinds.VIRT_SPECIFIER,yytext() );
            }
            // fall through
          case 37: break;
          case 19:
            { return symbol(TokenKinds.ACCESS_MODIFIER,yytext() );
            }
            // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

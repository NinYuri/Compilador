/* The following code was generated by JFlex 1.4.3 on 4/30/24, 8:01 PM */

package proyecto_compilador;
import java.io.*;
import static proyecto_compilador.Tokens.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/30/24, 8:01 PM from the specification file
 * <tt>C:/Users/Developer/OneDrive/Documentos/University/Archivos/PDF's/Autómatas/Proyecto_compilador/src/proyecto_compilador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\15\1\11\2\0\1\16\22\0\1\14\1\51\1\7\2\0"+
    "\1\45\1\52\1\12\1\31\1\32\1\20\1\6\1\55\1\2\1\4"+
    "\1\17\12\3\1\0\1\54\1\47\1\46\1\50\2\0\32\1\1\0"+
    "\1\10\2\0\1\1\1\0\1\25\1\13\1\42\1\33\1\5\1\37"+
    "\1\24\1\43\1\34\2\1\1\40\1\26\1\35\1\23\1\21\1\1"+
    "\1\22\1\41\1\36\2\1\1\44\3\1\1\27\1\53\1\30\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\2\1\5"+
    "\1\1\1\6\1\1\3\6\1\7\1\10\2\2\1\11"+
    "\1\12\1\13\1\14\6\2\1\15\1\16\1\17\1\20"+
    "\1\21\2\1\1\22\1\23\1\2\1\0\1\24\1\4"+
    "\1\0\1\2\1\25\1\0\1\26\3\0\1\27\1\0"+
    "\1\30\1\31\3\2\1\32\6\2\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\0\1\2\2\0\1\4"+
    "\1\2\1\26\1\42\3\0\3\2\1\43\1\2\1\44"+
    "\4\2\1\0\1\2\1\0\1\45\1\0\1\27\2\2"+
    "\1\46\1\47\2\2\1\50\1\2\1\0\1\2\1\51"+
    "\1\52\1\2\1\53\2\2\1\54\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[115];
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
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\u0170\0\56\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\56\0\56\0\56\0\56\0\u030e\0\u033c"+
    "\0\u036a\0\u0398\0\u03c6\0\u03f4\0\u0422\0\u0450\0\u047e\0\u04ac"+
    "\0\u04da\0\u0508\0\u0536\0\56\0\56\0\u0564\0\346\0\56"+
    "\0\u0592\0\u05c0\0\u05ee\0\56\0\u0170\0\56\0\u061c\0\u064a"+
    "\0\u0678\0\u06a6\0\u06d4\0\56\0\56\0\u0702\0\u0730\0\u075e"+
    "\0\u0564\0\u078c\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872\0\56"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\u08a0\0\u08ce"+
    "\0\u08fc\0\u092a\0\u092a\0\u0958\0\u0170\0\56\0\u0986\0\u09b4"+
    "\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c\0\u0564\0\u0a9a\0\u0564\0\u0ac8"+
    "\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0564\0\u0c0a"+
    "\0\56\0\u0c38\0\u0c66\0\u0564\0\u0564\0\u0c94\0\u0cc2\0\u0564"+
    "\0\u0cf0\0\u0d1e\0\u0d4c\0\u0564\0\u0564\0\u0d7a\0\u0564\0\u0da8"+
    "\0\u0dd6\0\u0564\0\u0564";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[115];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\3\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\4\3\1\23\1\24\1\25\1\26"+
    "\1\3\1\27\1\3\1\30\1\31\1\3\1\32\1\33"+
    "\1\3\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\57\0\1\46\3\0\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\12\46\14\0\1\5\1\47"+
    "\41\0\1\50\12\0\1\5\1\51\1\52\53\0\1\51"+
    "\53\0\1\46\3\0\1\46\5\0\1\46\5\0\6\46"+
    "\4\0\5\46\1\53\4\46\57\0\1\54\7\0\7\55"+
    "\1\56\1\57\45\55\10\60\1\61\1\60\1\0\43\60"+
    "\14\0\1\14\56\0\1\15\56\0\1\16\56\0\1\62"+
    "\1\63\25\0\1\64\55\0\1\65\10\0\1\46\3\0"+
    "\1\46\5\0\1\46\5\0\1\46\1\66\4\46\4\0"+
    "\12\46\12\0\1\46\3\0\1\67\5\0\1\46\5\0"+
    "\6\46\4\0\12\46\12\0\1\46\3\0\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\2\46\1\70\1\46\1\71"+
    "\5\46\12\0\1\46\3\0\1\46\5\0\1\46\5\0"+
    "\6\46\4\0\10\46\1\72\1\46\12\0\1\46\3\0"+
    "\1\46\5\0\1\46\5\0\2\46\1\73\3\46\4\0"+
    "\5\46\1\74\4\46\12\0\1\46\3\0\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\3\46\1\75\6\46\12\0"+
    "\1\46\3\0\1\46\5\0\1\46\5\0\6\46\4\0"+
    "\10\46\1\76\1\46\12\0\1\46\3\0\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\10\46\1\77\1\46\57\0"+
    "\1\100\55\0\1\101\55\0\1\102\55\0\1\103\55\0"+
    "\1\104\61\0\1\105\56\0\1\106\3\0\1\46\1\107"+
    "\1\110\1\111\1\46\5\0\1\46\5\0\6\46\4\0"+
    "\12\46\14\0\1\51\1\0\1\52\52\0\1\112\1\113"+
    "\2\0\1\112\50\0\1\46\1\107\1\110\1\111\1\46"+
    "\5\0\1\46\5\0\6\46\4\0\6\46\1\114\3\46"+
    "\11\0\7\55\1\115\1\57\45\55\12\0\1\116\53\0"+
    "\1\117\45\0\11\62\1\0\44\62\20\120\1\121\35\120"+
    "\1\0\1\46\1\107\1\110\1\111\1\46\5\0\1\46"+
    "\5\0\2\46\1\122\3\46\4\0\1\46\1\123\10\46"+
    "\12\0\1\46\1\107\1\110\1\111\1\46\5\0\1\46"+
    "\5\0\4\46\1\124\1\46\4\0\12\46\12\0\1\46"+
    "\1\107\1\110\1\111\1\46\5\0\1\46\5\0\6\46"+
    "\4\0\3\46\1\125\6\46\12\0\1\46\1\107\1\110"+
    "\1\111\1\126\5\0\1\46\5\0\6\46\4\0\12\46"+
    "\12\0\1\46\1\107\1\110\1\111\1\46\5\0\1\46"+
    "\5\0\1\46\1\127\4\46\4\0\12\46\12\0\1\46"+
    "\1\107\1\110\1\111\1\46\5\0\1\46\5\0\2\46"+
    "\1\130\3\46\4\0\12\46\12\0\1\46\1\107\1\110"+
    "\1\111\1\46\5\0\1\46\5\0\1\46\1\131\4\46"+
    "\4\0\12\46\12\0\1\46\1\107\1\110\1\111\1\46"+
    "\5\0\1\46\5\0\4\46\1\132\1\46\4\0\12\46"+
    "\12\0\1\46\1\107\1\110\1\111\1\46\5\0\1\46"+
    "\5\0\6\46\4\0\1\46\1\133\10\46\14\0\1\110"+
    "\1\111\52\0\1\134\1\0\1\110\1\135\1\136\5\0"+
    "\1\134\5\0\6\134\4\0\12\134\14\0\1\135\55\0"+
    "\1\113\53\0\1\46\1\107\1\110\1\111\1\137\5\0"+
    "\1\46\5\0\6\46\4\0\12\46\21\0\1\60\1\0"+
    "\2\60\6\0\1\60\12\0\3\60\16\0\20\120\1\140"+
    "\35\120\17\0\1\141\1\121\36\0\1\46\1\107\1\110"+
    "\1\111\1\46\5\0\1\46\5\0\3\46\1\142\2\46"+
    "\4\0\12\46\12\0\1\46\1\107\1\110\1\111\1\46"+
    "\5\0\1\46\5\0\6\46\4\0\2\46\1\143\7\46"+
    "\12\0\1\46\1\107\1\110\1\111\1\46\5\0\1\46"+
    "\5\0\6\46\4\0\1\144\11\46\12\0\1\46\1\107"+
    "\1\110\1\111\1\46\5\0\1\46\5\0\6\46\4\0"+
    "\2\46\1\145\7\46\12\0\1\46\1\107\1\110\1\111"+
    "\1\46\5\0\1\46\5\0\4\46\1\146\1\46\4\0"+
    "\12\46\12\0\1\46\1\107\1\110\1\111\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\1\46\1\147\10\46\12\0"+
    "\1\46\1\107\1\110\1\111\1\46\5\0\1\46\5\0"+
    "\1\46\1\150\4\46\4\0\12\46\12\0\1\46\1\107"+
    "\1\110\1\111\1\46\5\0\1\46\5\0\6\46\4\0"+
    "\5\46\1\151\4\46\12\0\1\134\1\107\1\110\1\111"+
    "\1\134\5\0\1\134\5\0\6\134\4\0\12\134\12\0"+
    "\1\134\1\0\1\135\1\0\1\136\5\0\1\134\5\0"+
    "\6\134\4\0\12\134\12\0\1\134\1\107\1\110\1\111"+
    "\1\134\1\152\4\0\1\134\5\0\6\134\4\0\12\134"+
    "\11\0\17\120\1\141\1\140\35\120\1\0\1\46\1\107"+
    "\1\110\1\111\1\46\5\0\1\46\5\0\1\46\1\153"+
    "\4\46\4\0\12\46\12\0\1\46\1\107\1\110\1\111"+
    "\1\46\5\0\1\46\5\0\6\46\4\0\3\46\1\154"+
    "\6\46\12\0\1\46\1\107\1\110\1\111\1\46\5\0"+
    "\1\46\5\0\6\46\4\0\3\46\1\155\6\46\12\0"+
    "\1\46\1\107\1\110\1\111\1\46\5\0\1\46\5\0"+
    "\6\46\4\0\2\46\1\156\7\46\12\0\1\46\1\107"+
    "\1\110\1\111\1\157\5\0\1\46\5\0\6\46\4\0"+
    "\12\46\14\0\1\160\53\0\1\46\1\107\1\110\1\111"+
    "\1\46\5\0\1\46\5\0\4\46\1\161\1\46\4\0"+
    "\12\46\12\0\1\46\1\107\1\110\1\111\1\46\5\0"+
    "\1\46\5\0\3\46\1\162\2\46\4\0\12\46\12\0"+
    "\1\134\1\0\1\160\1\0\1\134\5\0\1\134\5\0"+
    "\6\134\4\0\12\134\12\0\1\46\1\107\1\110\1\111"+
    "\1\46\5\0\1\46\5\0\5\46\1\163\4\0\12\46"+
    "\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3588];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\10\1\4\11\15\1\2\11"+
    "\1\1\1\0\1\11\1\1\1\0\1\1\1\11\1\0"+
    "\1\11\3\0\1\1\1\0\2\11\12\1\7\11\1\0"+
    "\1\1\2\0\3\1\1\11\3\0\12\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\11\10\1\1\0\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[115];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
Analisis c=new Analisis();
int estado = 0;
int nu=0;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { c.linea=yyline; lexeme=yytext();return comma;
          }
        case 46: break;
        case 36: 
          { c.linea=yyline; lexeme=yytext();return for_keyword;
          }
        case 47: break;
        case 16: 
          { c.linea=yyline; lexeme=yytext();return greater_than;
          }
        case 48: break;
        case 33: 
          { c.linea=yyline; lexeme=yytext();return logical_or;
          }
        case 49: break;
        case 5: 
          { c.linea=yyline; lexeme=yytext();return plus;
          }
        case 50: break;
        case 9: 
          { c.linea=yyline; lexeme=yytext();return open_key;
          }
        case 51: break;
        case 32: 
          { c.linea=yyline; lexeme=yytext();return logical_and;
          }
        case 52: break;
        case 45: 
          { estado = 1;c.linea=yyline; lexeme=yytext();return program;
          }
        case 53: break;
        case 18: 
          { c.linea=yyline; lexeme=yytext();return semicolon;
          }
        case 54: break;
        case 4: 
          { c.linea=yyline; lexeme=yytext();return num;
          }
        case 55: break;
        case 11: 
          { c.linea=yyline; lexeme=yytext();return open_parenth;
          }
        case 56: break;
        case 22: 
          { c.linea=yyline; lexeme=yytext();return litcad;
          }
        case 57: break;
        case 8: 
          { c.linea=yyline; lexeme=yytext();return mult;
          }
        case 58: break;
        case 44: 
          { c.linea=yyline; lexeme=yytext();return stringType;
          }
        case 59: break;
        case 28: 
          { c.linea=yyline; lexeme=yytext();return equals_to;
          }
        case 60: break;
        case 23: 
          { /* Ignore */
          }
        case 61: break;
        case 43: 
          { c.linea=yyline; lexeme=yytext();return while_keyword;
          }
        case 62: break;
        case 3: 
          { c.linea=yyline; lexeme=yytext();return minus;
          }
        case 63: break;
        case 35: 
          { c.linea=yyline; lexeme=yytext();return integer;
          }
        case 64: break;
        case 14: 
          { c.linea=yyline; lexeme=yytext();return equal;
          }
        case 65: break;
        case 7: 
          { c.linea=yyline; lexeme=yytext();return div;
          }
        case 66: break;
        case 30: 
          { c.linea=yyline; lexeme=yytext();return greater_or_equals;
          }
        case 67: break;
        case 29: 
          { c.linea=yyline; lexeme=yytext();return less_or_equals;
          }
        case 68: break;
        case 24: 
          { c.linea=yyline; lexeme=yytext();return div_equals;
          }
        case 69: break;
        case 27: 
          { c.linea=yyline; lexeme=yytext();return res_equals;
          }
        case 70: break;
        case 37: 
          { c.linea=yyline; lexeme=yytext();return else_keyword;
          }
        case 71: break;
        case 25: 
          { c.linea=yyline; lexeme=yytext();return mult_equals;
          }
        case 72: break;
        case 10: 
          { c.linea=yyline; lexeme=yytext();return close_key;
          }
        case 73: break;
        case 17: 
          { c.linea=yyline; lexeme=yytext();return not;
          }
        case 74: break;
        case 40: 
          { c.linea=yyline; lexeme=yytext();return character;
          }
        case 75: break;
        case 12: 
          { c.linea=yyline; lexeme=yytext();return close_parenth;
          }
        case 76: break;
        case 31: 
          { c.linea=yyline; lexeme=yytext();return different_to;
          }
        case 77: break;
        case 34: 
          { c.linea=yyline; lexeme=yytext();return litcar;
          }
        case 78: break;
        case 2: 
          { if (estado == 1) { // Si se encontró la palabra clave program 
        c.linea = yyline;
        lexeme = yytext();
        estado = 2;
        return idp;
    } else {
        c.linea = yyline;
        lexeme = yytext();
        return id; // Token para identificador normal
    }
          }
        case 79: break;
        case 21: 
          { c.linea=yyline; lexeme=yytext();return plus_equals;
          }
        case 80: break;
        case 13: 
          { c.linea=yyline; lexeme=yytext();return res;
          }
        case 81: break;
        case 20: 
          { c.linea=yyline; lexeme=yytext();return minus_equals;
          }
        case 82: break;
        case 26: 
          { c.linea=yyline; lexeme=yytext();return if_keyword;
          }
        case 83: break;
        case 15: 
          { c.linea=yyline; lexeme=yytext();return less_than;
          }
        case 84: break;
        case 39: 
          { c.linea=yyline; lexeme=yytext();return then;
          }
        case 85: break;
        case 38: 
          { c.linea=yyline; lexeme=yytext();return read;
          }
        case 86: break;
        case 6: 
          { /*Ignore*/
          }
        case 87: break;
        case 41: 
          { c.linea=yyline; lexeme=yytext();return print;
          }
        case 88: break;
        case 42: 
          { c.linea=yyline; lexeme=yytext();return floatType;
          }
        case 89: break;
        case 1: 
          { c.linea=yyline; lexeme=yytext();return Error;
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            c.linea=yyline; lexeme=yytext();return Error;
          }
      }
    }
  }


}

/* The following code was generated by JFlex 1.4.3 on 5/28/24, 2:54 AM */

package proyecto_compilador;
import java.io.*;
import static proyecto_compilador.Tokens.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/28/24, 2:54 AM from the specification file
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
    "\11\0\1\15\1\11\2\0\1\16\22\0\1\14\1\52\1\7\2\0"+
    "\1\46\1\53\1\12\1\40\1\41\1\20\1\6\1\56\1\2\1\4"+
    "\1\17\12\3\1\57\1\55\1\50\1\47\1\51\2\0\32\1\1\0"+
    "\1\10\2\0\1\1\1\0\1\25\1\13\1\31\1\30\1\5\1\33"+
    "\1\24\1\44\1\35\2\1\1\42\1\26\1\27\1\23\1\21\1\1"+
    "\1\22\1\43\1\34\1\32\1\1\1\45\3\1\1\36\1\54\1\37"+
    "\uff82\0";

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
    "\1\1\1\6\1\1\1\2\3\6\1\7\1\10\6\2"+
    "\1\11\1\12\1\13\1\14\2\2\1\15\1\16\1\17"+
    "\1\20\1\21\2\1\1\22\1\23\1\24\1\2\1\0"+
    "\1\25\1\4\1\0\2\2\1\26\1\0\1\27\3\0"+
    "\1\2\1\30\1\0\1\31\1\32\12\2\1\33\2\2"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\0"+
    "\1\2\2\0\1\4\2\2\1\27\1\43\1\0\1\2"+
    "\2\0\5\2\1\44\5\2\1\45\2\2\1\0\1\2"+
    "\1\0\4\2\1\46\1\47\1\0\1\30\3\2\1\50"+
    "\1\2\1\51\3\2\1\52\1\53\2\2\1\0\2\2"+
    "\1\54\3\2\1\55\1\2\1\56\1\2\1\57\1\2"+
    "\1\60\6\2\1\61\1\2\1\62\4\2\1\63\5\2"+
    "\1\64\1\2\1\65\3\2\1\66\1\67\3\2\1\70"+
    "\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[174];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\60\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\60"+
    "\0\60\0\60\0\60\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\u0540\0\u0570\0\u05a0\0\60\0\60\0\60\0\u05d0"+
    "\0\360\0\60\0\u0600\0\u0630\0\u0660\0\u0690\0\60\0\u0180"+
    "\0\60\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\60"+
    "\0\60\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900"+
    "\0\u0930\0\u0960\0\u0990\0\u05d0\0\u09c0\0\u09f0\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0ab0\0\u0ae0\0\u0b10\0\u0180\0\60\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u05d0"+
    "\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u05d0\0\u0de0\0\u0e10"+
    "\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\u05d0"+
    "\0\u05d0\0\u0f90\0\60\0\u0fc0\0\u0ff0\0\u1020\0\u05d0\0\u1050"+
    "\0\u05d0\0\u1080\0\u10b0\0\u10e0\0\u05d0\0\u05d0\0\u1110\0\u1140"+
    "\0\u1170\0\u11a0\0\u11d0\0\u05d0\0\u1200\0\u1230\0\u1260\0\u05d0"+
    "\0\u1290\0\u05d0\0\u12c0\0\u05d0\0\u12f0\0\u05d0\0\u1320\0\u1350"+
    "\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u05d0\0\u1440\0\u05d0\0\u1470"+
    "\0\u14a0\0\u14d0\0\u1500\0\u05d0\0\u1530\0\u1560\0\u1590\0\u15c0"+
    "\0\u15f0\0\u05d0\0\u1620\0\u05d0\0\u1650\0\u1680\0\u16b0\0\u05d0"+
    "\0\u05d0\0\u16e0\0\u1710\0\u1740\0\u05d0\0\u05d0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[174];
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
    "\1\2\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\6\3\1\24\1\3\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\3\1\34\1\3"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\61\0\1\50\3\0\1\50\5\0"+
    "\1\50\5\0\15\50\4\0\4\50\15\0\1\5\1\51"+
    "\42\0\1\52\13\0\1\5\1\53\1\54\55\0\1\53"+
    "\55\0\1\50\3\0\1\50\5\0\1\50\5\0\6\50"+
    "\1\55\6\50\4\0\1\56\3\50\61\0\1\57\10\0"+
    "\7\60\1\61\1\62\47\60\10\63\1\64\1\63\1\0"+
    "\45\63\1\0\1\50\3\0\1\50\5\0\1\50\5\0"+
    "\2\50\1\65\12\50\4\0\4\50\26\0\1\15\60\0"+
    "\1\16\60\0\1\17\60\0\1\66\1\67\26\0\1\70"+
    "\57\0\1\71\11\0\1\50\3\0\1\50\5\0\1\50"+
    "\5\0\1\50\1\72\13\50\4\0\4\50\13\0\1\50"+
    "\3\0\1\73\5\0\1\50\5\0\15\50\4\0\4\50"+
    "\13\0\1\50\3\0\1\50\5\0\1\50\5\0\15\50"+
    "\4\0\2\50\1\74\1\50\13\0\1\50\3\0\1\50"+
    "\5\0\1\50\5\0\2\50\1\75\1\50\1\76\4\50"+
    "\1\77\3\50\4\0\1\100\3\50\13\0\1\50\3\0"+
    "\1\50\5\0\1\50\5\0\1\50\1\101\13\50\4\0"+
    "\2\50\1\102\1\50\13\0\1\50\3\0\1\50\5\0"+
    "\1\50\5\0\6\50\1\103\3\50\1\104\2\50\4\0"+
    "\4\50\13\0\1\50\3\0\1\50\5\0\1\50\5\0"+
    "\13\50\1\105\1\50\4\0\4\50\13\0\1\50\3\0"+
    "\1\50\5\0\1\50\5\0\15\50\4\0\2\50\1\106"+
    "\1\50\61\0\1\107\57\0\1\110\57\0\1\111\57\0"+
    "\1\112\57\0\1\113\63\0\1\114\60\0\1\115\4\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\15\50\4\0\4\50\15\0\1\53\1\0\1\54\54\0"+
    "\1\121\1\122\2\0\1\121\52\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\7\50\1\123\5\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\15\50\4\0\1\50\1\124\2\50"+
    "\12\0\7\60\1\125\1\62\47\60\12\0\1\126\55\0"+
    "\1\127\50\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\2\50\1\130\12\50\4\0\4\50\12\0"+
    "\11\66\1\0\46\66\20\131\1\132\37\131\1\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\2\50"+
    "\1\133\11\50\1\134\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\4\50\1\135"+
    "\6\50\1\136\1\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\4\50\1\137"+
    "\10\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\1\50\1\140\13\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\15\50\4\0\1\141\3\50\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\6\50"+
    "\1\142\6\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\2\50\1\143\12\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\11\50\1\144\3\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\145\5\0\1\50"+
    "\5\0\15\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\13\50\1\146\1\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\1\50\1\147\13\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\14\50\1\150\4\0\4\50\15\0\1\117\1\120"+
    "\54\0\1\151\1\0\1\117\1\152\1\153\5\0\1\151"+
    "\5\0\15\151\4\0\4\151\15\0\1\152\57\0\1\122"+
    "\55\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\1\154\11\50\1\155\1\50\1\156\4\0\3\50"+
    "\1\157\13\0\1\50\1\116\1\117\1\120\1\160\5\0"+
    "\1\50\5\0\15\50\4\0\4\50\22\0\1\63\1\0"+
    "\2\63\6\0\1\63\4\0\1\63\3\0\2\63\24\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\15\50\4\0\1\161\3\50\12\0\20\131\1\162\37\131"+
    "\17\0\1\163\1\132\40\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\3\50\1\164\4\50\1\165"+
    "\4\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\6\50\1\166\6\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\7\50\1\167\5\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\11\50\1\170\3\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\1\50\1\171"+
    "\13\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\15\50\4\0\1\50\1\172"+
    "\2\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\10\50\1\173\4\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\4\50\1\174\10\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\175\5\0\1\50\5\0\15\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\6\50\1\176\6\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\14\50\1\177\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\15\50\4\0\1\200"+
    "\3\50\13\0\1\151\1\116\1\117\1\120\1\151\5\0"+
    "\1\151\5\0\15\151\4\0\4\151\13\0\1\151\1\0"+
    "\1\152\1\0\1\153\5\0\1\151\5\0\15\151\4\0"+
    "\4\151\13\0\1\151\1\116\1\117\1\120\1\151\1\201"+
    "\4\0\1\151\5\0\15\151\4\0\4\151\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\1\50"+
    "\1\202\13\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\11\50\1\203\3\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\12\50\1\204\2\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\15\50\4\0\2\50\1\205\1\50\12\0\17\131"+
    "\1\163\1\162\37\131\1\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\1\50\1\206\13\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\207\5\0"+
    "\1\50\5\0\15\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\13\50\1\210"+
    "\1\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\1\50\1\211\13\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\212\5\0"+
    "\1\50\5\0\15\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\13\50\1\213"+
    "\1\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\13\50\1\214\1\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\6\50\1\215\6\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\216\5\0\1\50\5\0"+
    "\15\50\4\0\4\50\15\0\1\217\55\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\2\50\1\220"+
    "\12\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\6\50\1\221\6\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\14\50\1\222\4\0\4\50\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\4\50"+
    "\1\223\10\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\7\50\1\224\5\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\6\50\1\225\6\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\14\50\1\226\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\3\50\1\227"+
    "\11\50\4\0\4\50\13\0\1\151\1\0\1\217\1\0"+
    "\1\151\5\0\1\151\5\0\15\151\4\0\4\151\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\3\50\1\230\4\50\1\231\4\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\10\50\1\232\4\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\15\50\4\0"+
    "\1\233\3\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\5\50\1\234\7\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\11\50\1\235\3\50\4\0\4\50\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\2\50"+
    "\1\236\12\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\1\50\1\237\13\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\240"+
    "\5\0\1\50\5\0\15\50\4\0\4\50\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\13\50"+
    "\1\241\1\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\242\5\0\1\50\5\0\15\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\1\50\1\243\13\50\4\0\4\50\13\0\1\50"+
    "\1\116\1\117\1\120\1\50\5\0\1\50\5\0\6\50"+
    "\1\244\6\50\4\0\4\50\13\0\1\50\1\116\1\117"+
    "\1\120\1\50\5\0\1\50\5\0\4\50\1\245\10\50"+
    "\4\0\4\50\13\0\1\50\1\116\1\117\1\120\1\50"+
    "\5\0\1\50\5\0\7\50\1\246\5\50\4\0\4\50"+
    "\13\0\1\50\1\116\1\117\1\120\1\50\5\0\1\50"+
    "\5\0\14\50\1\247\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\250\5\0\1\50\5\0\15\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\5\50\1\251\7\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\50\5\0\1\50\5\0"+
    "\11\50\1\252\3\50\4\0\4\50\13\0\1\50\1\116"+
    "\1\117\1\120\1\50\5\0\1\50\5\0\2\50\1\253"+
    "\12\50\4\0\4\50\13\0\1\50\1\116\1\117\1\120"+
    "\1\50\5\0\1\50\5\0\1\50\1\254\13\50\4\0"+
    "\4\50\13\0\1\50\1\116\1\117\1\120\1\50\5\0"+
    "\1\50\5\0\6\50\1\255\6\50\4\0\4\50\13\0"+
    "\1\50\1\116\1\117\1\120\1\256\5\0\1\50\5\0"+
    "\15\50\4\0\4\50\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6000];
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
    "\1\0\1\11\7\1\1\11\15\1\4\11\11\1\3\11"+
    "\1\1\1\0\1\11\1\1\1\0\2\1\1\11\1\0"+
    "\1\11\3\0\2\1\1\0\2\11\15\1\7\11\1\0"+
    "\1\1\2\0\4\1\1\11\1\0\1\1\2\0\16\1"+
    "\1\0\1\1\1\0\6\1\1\0\1\11\15\1\1\0"+
    "\55\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[174];
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
    while (i < 122) {
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
        case 44: 
          { c.linea=yyline; lexeme=yytext();return end_if;
          }
        case 58: break;
        case 19: 
          { c.linea=yyline; lexeme=yytext();return comma;
          }
        case 59: break;
        case 36: 
          { c.linea=yyline; lexeme=yytext();return for_keyword;
          }
        case 60: break;
        case 16: 
          { c.linea=yyline; lexeme=yytext();return greater_than;
          }
        case 61: break;
        case 51: 
          { estado = 1; c.linea=yyline; lexeme=yytext();return program;
          }
        case 62: break;
        case 34: 
          { c.linea=yyline; lexeme=yytext();return logical_or;
          }
        case 63: break;
        case 5: 
          { c.linea=yyline; lexeme=yytext();return plus;
          }
        case 64: break;
        case 11: 
          { estado = 0; c.linea=yyline; lexeme=yytext();return open_parenth;
          }
        case 65: break;
        case 9: 
          { c.linea=yyline; lexeme=yytext();return open_key;
          }
        case 66: break;
        case 39: 
          { c.linea=yyline; lexeme=yytext();return bool;
          }
        case 67: break;
        case 33: 
          { c.linea=yyline; lexeme=yytext();return logical_and;
          }
        case 68: break;
        case 18: 
          { c.linea=yyline; lexeme=yytext();return semicolon;
          }
        case 69: break;
        case 4: 
          { c.linea=yyline; lexeme=yytext();return num;
          }
        case 70: break;
        case 23: 
          { c.linea=yyline; lexeme=yytext();return litcad;
          }
        case 71: break;
        case 8: 
          { c.linea=yyline; lexeme=yytext();return mult;
          }
        case 72: break;
        case 50: 
          { c.linea=yyline; lexeme=yytext();return stringType;
          }
        case 73: break;
        case 46: 
          { c.linea=yyline; lexeme=yytext();return falseType;
          }
        case 74: break;
        case 29: 
          { c.linea=yyline; lexeme=yytext();return equals_to;
          }
        case 75: break;
        case 24: 
          { /* Ignore */
          }
        case 76: break;
        case 48: 
          { c.linea=yyline; lexeme=yytext();return while_keyword;
          }
        case 77: break;
        case 3: 
          { c.linea=yyline; lexeme=yytext();return minus;
          }
        case 78: break;
        case 56: 
          { c.linea=yyline; lexeme=yytext(); return endfunction;
          }
        case 79: break;
        case 2: 
          { if (estado == 1) { // Si se encontró la palabra clave program 
        c.linea = yyline;
        lexeme = yytext();
        estado = 0;
        return idProgram;
    } else if(estado == 2) {
        c.linea = yyline;
        lexeme = yytext();
        estado = 0;
        return idP;
    } else if(estado == 3) {
        c.linea = yyline;
        lexeme = yytext();
        estado = 0;
        return idF;
    } else {
        c.linea = yyline;
        lexeme = yytext();
        return id; // Token para identificador normal
    }
          }
        case 80: break;
        case 54: 
          { estado = 2; c.linea=yyline; lexeme=yytext(); return procedure;
          }
        case 81: break;
        case 49: 
          { c.linea=yyline; lexeme=yytext();return retorna;
          }
        case 82: break;
        case 37: 
          { c.linea=yyline; lexeme=yytext();return integer;
          }
        case 83: break;
        case 14: 
          { c.linea=yyline; lexeme=yytext();return equal;
          }
        case 84: break;
        case 7: 
          { c.linea=yyline; lexeme=yytext();return div;
          }
        case 85: break;
        case 31: 
          { c.linea=yyline; lexeme=yytext();return greater_or_equals;
          }
        case 86: break;
        case 30: 
          { c.linea=yyline; lexeme=yytext();return less_or_equals;
          }
        case 87: break;
        case 25: 
          { c.linea=yyline; lexeme=yytext();return div_equals;
          }
        case 88: break;
        case 28: 
          { c.linea=yyline; lexeme=yytext();return res_equals;
          }
        case 89: break;
        case 38: 
          { c.linea=yyline; lexeme=yytext();return else_keyword;
          }
        case 90: break;
        case 26: 
          { c.linea=yyline; lexeme=yytext();return mult_equals;
          }
        case 91: break;
        case 10: 
          { c.linea=yyline; lexeme=yytext();return close_key;
          }
        case 92: break;
        case 17: 
          { c.linea=yyline; lexeme=yytext();return not;
          }
        case 93: break;
        case 41: 
          { c.linea=yyline; lexeme=yytext();return character;
          }
        case 94: break;
        case 12: 
          { c.linea=yyline; lexeme=yytext();return close_parenth;
          }
        case 95: break;
        case 32: 
          { c.linea=yyline; lexeme=yytext();return different_to;
          }
        case 96: break;
        case 35: 
          { c.linea=yyline; lexeme=yytext();return litcar;
          }
        case 97: break;
        case 52: 
          { c.linea=yyline; lexeme=yytext();return end_while;
          }
        case 98: break;
        case 20: 
          { c.linea=yyline; lexeme=yytext();return dots;
          }
        case 99: break;
        case 53: 
          { estado = 3; c.linea=yyline; lexeme=yytext(); return function;
          }
        case 100: break;
        case 22: 
          { c.linea=yyline; lexeme=yytext();return plus_equals;
          }
        case 101: break;
        case 13: 
          { c.linea=yyline; lexeme=yytext();return res;
          }
        case 102: break;
        case 55: 
          { c.linea=yyline; lexeme=yytext();return endprogram;
          }
        case 103: break;
        case 21: 
          { c.linea=yyline; lexeme=yytext();return minus_equals;
          }
        case 104: break;
        case 42: 
          { c.linea=yyline; lexeme=yytext();return trueType;
          }
        case 105: break;
        case 27: 
          { c.linea=yyline; lexeme=yytext();return if_keyword;
          }
        case 106: break;
        case 15: 
          { c.linea=yyline; lexeme=yytext();return less_than;
          }
        case 107: break;
        case 57: 
          { c.linea=yyline; lexeme=yytext();return endprocedure;
          }
        case 108: break;
        case 43: 
          { c.linea=yyline; lexeme=yytext();return then;
          }
        case 109: break;
        case 40: 
          { c.linea=yyline; lexeme=yytext();return read;
          }
        case 110: break;
        case 6: 
          { /*Ignore*/
          }
        case 111: break;
        case 45: 
          { c.linea=yyline; lexeme=yytext();return print;
          }
        case 112: break;
        case 47: 
          { c.linea=yyline; lexeme=yytext();return floatType;
          }
        case 113: break;
        case 1: 
          { c.linea=yyline; lexeme=yytext();return Error;
          }
        case 114: break;
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

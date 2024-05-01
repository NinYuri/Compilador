package proyecto_compilador;
import java.io.*;
import static proyecto_compilador.Tokens.*;


%%
%class Lexer
%type Tokens
%line
%column
L=[a-zA-Z_]+
D=-?[0-9]+|-?(([0-9]+[.]?[0-9]*)|([.][0-9]+))(e[+-]?[0-9]+)?
CA=\"(\\.|[^\"])*\"
CAR='([^'\\]|\\\\[btnfr"'\\"\\\\])'
espacio=[ ]+
espa=[\t]+
esp=[\r]+
salto=[\n]
%{
    public String lexeme;
Analisis c=new Analisis();
int estado = 0;
int nu=0;
%}
%%


"//" .* { /* Ignore */}
"/*" [^*] ~"*/" | "/*" "*"+ "/" { /* Ignore */ }
{espacio} {/*Ignore*/}
{espa} {/*Ignore*/}
{esp} {/*Ignore*/}
{salto} {/*Ignore*/}
<YYINITIAL> "program" {estado = 1;c.linea=yyline; lexeme=yytext();return program;}
<YYINITIAL> "{" {c.linea=yyline; lexeme=yytext();return open_key;}
<YYINITIAL> "}" {c.linea=yyline; lexeme=yytext();return close_key;}
<YYINITIAL> "(" {c.linea=yyline; lexeme=yytext();return open_parenth;}
<YYINITIAL> ")" {c.linea=yyline; lexeme=yytext();return close_parenth;}
<YYINITIAL> "read" {c.linea=yyline; lexeme=yytext();return read;}
<YYINITIAL> "print" {c.linea=yyline; lexeme=yytext();return print;}
<YYINITIAL> "int" {c.linea=yyline; lexeme=yytext();return integer;}
<YYINITIAL> "float" {c.linea=yyline; lexeme=yytext();return floatType;}
<YYINITIAL> "string" {c.linea=yyline; lexeme=yytext();return stringType;}
<YYINITIAL> "char" {c.linea=yyline; lexeme=yytext();return character;}
<YYINITIAL> "then" {c.linea=yyline; lexeme=yytext();return then;}
<YYINITIAL> "if" {c.linea=yyline; lexeme=yytext();return if_keyword;}
<YYINITIAL> "else" {c.linea=yyline; lexeme=yytext();return else_keyword;}
<YYINITIAL> "while" {c.linea=yyline; lexeme=yytext();return while_keyword;}
<YYINITIAL> "for" {c.linea=yyline; lexeme=yytext();return for_keyword;}
<YYINITIAL> "+" {c.linea=yyline; lexeme=yytext();return plus;}
<YYINITIAL> "-" {c.linea=yyline; lexeme=yytext();return minus;}
<YYINITIAL> "*" {c.linea=yyline; lexeme=yytext();return mult;}
<YYINITIAL> "/" {c.linea=yyline; lexeme=yytext();return div;}
<YYINITIAL> "%" {c.linea=yyline; lexeme=yytext();return res;}
<YYINITIAL> "=" {c.linea=yyline; lexeme=yytext();return equal;}
<YYINITIAL> "<" {c.linea=yyline; lexeme=yytext();return less_than;}
<YYINITIAL> ">" {c.linea=yyline; lexeme=yytext();return greater_than;}
<YYINITIAL> "!" {c.linea=yyline; lexeme=yytext();return not;}
<YYINITIAL> "!=" {c.linea=yyline; lexeme=yytext();return different_to;}
<YYINITIAL> "==" {c.linea=yyline; lexeme=yytext();return equals_to;}
<YYINITIAL> "<=" {c.linea=yyline; lexeme=yytext();return less_or_equals;}
<YYINITIAL> ">=" {c.linea=yyline; lexeme=yytext();return greater_or_equals;}
<YYINITIAL> "+=" {c.linea=yyline; lexeme=yytext();return plus_equals;}
<YYINITIAL> "-=" {c.linea=yyline; lexeme=yytext();return minus_equals;}
<YYINITIAL> "*=" {c.linea=yyline; lexeme=yytext();return mult_equals;}
<YYINITIAL> "/=" {c.linea=yyline; lexeme=yytext();return div_equals;}
<YYINITIAL> "%=" {c.linea=yyline; lexeme=yytext();return res_equals;}
<YYINITIAL> "&&" {c.linea=yyline; lexeme=yytext();return logical_and;}
<YYINITIAL> "||" {c.linea=yyline; lexeme=yytext();return logical_or;}
<YYINITIAL> ";" {c.linea=yyline; lexeme=yytext();return semicolon;}
<YYINITIAL> "," {c.linea=yyline; lexeme=yytext();return comma;}
<YYINITIAL> {L}({L}{D})* {if (estado == 1) { // Si se encontró la palabra clave program 
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
<YYINITIAL> {D} {c.linea=yyline; lexeme=yytext();return num;}
<YYINITIAL> {CAR} {c.linea=yyline; lexeme=yytext();return litcar;}
<YYINITIAL> {CA} {c.linea=yyline; lexeme=yytext();return litcad;}
. {c.linea=yyline; lexeme=yytext();return Error;}































/*
 * Simple HTML rendering test.
   - sample html cases : https://en.wikipedia.org/wiki/Help:Wikitext
 */

grammar Rendering;
/*
 * Parser.
 */
document : blocks ;

blocks : (block NEWLINE)* ;

block : STARs TEXT    # STAR
      | EQs TEXT EQs  # HEADER
      | HLINEs		  # HLINE
      | TEXT          # PLAINTEXT
      ;

/*
 * Lexer.
 */

NEWLINE : [\r\n]+ ;
STARs : STAR+ ;
EQs : EQ+ ;
HLINEs : HLINE+ ;
TEXT : ~[\r\n*=]+ ;

/*
 * Fragments.
 */
fragment
STAR    : '*' ;
EQ      : '=' ;
HLINE   : '-' ;

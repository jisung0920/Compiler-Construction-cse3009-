grammar Expr;		
prog:	expr NEWLINE ;
expr:	expr op=('*'|'/') expr # MD
    |	expr ('+'|'-') expr # AS
    |	INT					# INT
    |	'(' expr ')'		# PS
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;

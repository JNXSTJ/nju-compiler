grammar SysYLexer;

@header {
package simpleexpr;
}

prog : stat* EOF ;

stat : BType
     ;

ASSIGN: '=' ;
BType: 'int' ;
IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;
BREAK: 'break' ;
VOID: 'void' ;
CONST: 'const' ;
SEMI : ';' ;
PRINT : 'print' ;
MUL : '*' ;
DIV : '/' ;
PLUS: '+' ;
MINUS: '-' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBR: '[' ;
RBR: ']' ;
LB: '{' ;
RB: '}' ;
COMMA: ',' ;
LT: '<' ;
GT: '>' ;
LE: '<=' ;
GE: '>=' ;
EQ: '==' ;
NEQ: '!=' ;
NOT: '!' ;
AND: '&&' ;
OR: '||' ;
MOD: '%' ;
CONTINUE: 'continue' ;
RETURN: 'return' ;

IDENT : IndentifierNondigit Indentifier*;
NUMBER: IntConst;
IntConst: DecimalConst | OctalConst | HexadecimalConst;
//DecimalConst: NonzeroDigit | DecimalConst DIGIT;
DecimalConst: NonzeroDigit DIGIT*;
//OctalConst: '0' | OctalConst OctalDigit;
OctalConst: '0' OctalDigit*;
//HexadecimalConst: HexadecimalPrefix HexadecimalDigit | HexadecimalConst HexadecimalDigit ;
HexadecimalConst: HexadecimalPrefix HexadecimalDigit+;

WS : [ \t\r\n]+ -> skip ;

SL_COMMENT : '//' .*? '\n' -> skip ;
//SL_COMMENT2 : '//' ~[\n]* '\n' -> skip;
DOC_COMMENT : '/**' .*? '*/' -> skip ;
ML_COMMENT : '/*' .*? '*/' -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment WORD : LETTER | DIGIT | '_' ;
fragment HexadecimalPrefix : '0x' | '0X' ;
fragment NonzeroDigit : [1-9] ;
fragment OctalDigit: [0-7] ;
fragment HexadecimalDigit : [0-9a-fA-F] ;
fragment IndentifierNondigit: [a-zA-Z] ;
fragment Indentifier: [a-zA-Z0-9] ;
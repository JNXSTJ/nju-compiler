grammar SysYLexer;

@header {
package simpleexpr;
}

prog : stat* EOF ;

stat : expr ';'
     | IDENT '=' expr ';'
     | 'print' expr ';'
     ;

expr : expr ('*' | '/') expr
     | expr ('+' | '-') expr
     | '(' expr ')'
     | IDENT
     | INT
     | FLOAT
     ;

NUMBER: IntConst;
BType: 'int';
IntConst: DecimalConst | OctalConst | HexadecimalConst;
//DecimalConst: NonzeroDigit | DecimalConst DIGIT;
DecimalConst: NonzeroDigit DIGIT*;
//OctalConst: '0' | OctalConst OctalDigit;
OctalConst: '0' OctalDigit*;
//HexadecimalConst: HexadecimalPrefix HexadecimalDigit | HexadecimalConst HexadecimalDigit ;
HexadecimalConst: HexadecimalPrefix HexadecimalDigit+;
HexadecimalPrefix : '0x' | '0X';
NonzeroDigit : [1-9];
OctalDigit: [0-7];
HexadecimalDigit : [0-9a-fA-F];

IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;
BREAK: 'break' ;
VOID: 'void' ;
CONST: 'const' ;
SEMI : ';' ;
ASSIGN : '=' ;
PRINT : 'print' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBR: '[' ;
RBR: ']' ;
LB: '{' ;
RB: '}' ;
COMMA: ',' ;
LESS: '<' ;
BIGGER: '>' ;
LE: '<=' ;
GE: '>=' ;
EQU: '==' ;
NEQ: '!=' ;
EXC: '!' ;
AND: '&&' ;
OR: '||' ;
MOD: '%' ;
CONTINUE: 'continue' ;
RETURN: 'return' ;

IDENT : (LETTER | '_') WORD* ;
INT : '0' | ([1-9] DIGIT*) ;
FLOAT : INT '.' DIGIT*
      | '.' DIGIT+
      ;

WS : [ \t\r\n]+ -> skip ;

SL_COMMENT : '//' .*? '\n' -> skip ;
//SL_COMMENT2 : '//' ~[\n]* '\n' -> skip;
DOC_COMMENT : '/**' .*? '*/' -> skip ;
ML_COMMENT : '/*' .*? '*/' -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment WORD : LETTER | DIGIT | '_' ;
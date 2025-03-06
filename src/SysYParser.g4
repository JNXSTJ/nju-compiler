parser grammar SysYParser;

@header {
package simpleexpr;
}

options {
    tokenVocab = SysYLexer;
}

program: compUnit;

compUnit:  (decl | funcDef) (decl | funcDef)* SEMI ;
decl: constDecl | varDecl ;
constDecl: CONST BType constDef (COMMA constDef )* SEMI ;
constDef: IDENT ( LBR constExp RBR )* ASSIGN constInitVal SEMI ;
constInitVal: constExp | LB ( constInitVal (COMMA constInitVal )* )? RB ;
varDecl: BType varDef (COMMA varDef )* SEMI ;
varDef: IDENT (LBR constExp RBR )* | IDENT (LBR constExp RBR )* ASSIGN initVal;
initVal: exp | LB (initVal (COMMA initVal )* )? RB ;
funcDef: funcType IDENT LPAREN funcFParams? RPAREN block ;
funcType: VOID | BType ;
funcFParams:  funcFParam (COMMA funcFParam )* ;
//FuncFParam: BType IDENT  [ '[' ']' { '[' Exp ']' } ];
funcFParam: BType IDENT arrayDim* ;
arrayDim  : LBR exp? RBR ;
block: LB  blockItem* RB ;
blockItem: decl | stmt;
stmt: lVal ASSIGN exp SEMI | exp? SEMI | block
| IF LPAREN cond RPAREN stmt (ELSE stmt)?
| WHILE LPAREN cond RPAREN stmt
| BREAK SEMI | CONTINUE SEMI
| RETURN exp? SEMI ;

exp: addExp;
cond: lOrExp;
lVal: IDENT (LBR exp RBR )*;
primaryExp: LPAREN exp RPAREN | lVal | NUMBER;

unaryExp: primaryExp | IDENT LPAREN funcRParams? RPAREN
| unaryOp unaryExp;
unaryOp: ADD | SUB | EXC;
funcRParams: exp (COMMA exp )*;
//MulExp: UnaryExp | MulExp ('*' | '/' | '%') UnaryExp;
mulExp: unaryExp ((MUL | DIV | MOD) unaryExp)*;
//AddExp: MulExp | AddExp ('+' | '-') MulExp;
addExp: mulExp ((ADD | SUB) mulExp)*;
//RelExp: AddExp | RelExp ('<' | '>' | '<=' | '>=' ) AddExp;
relExp: addExp ((LESS | BIGGER | LE | GE ) addExp)*;
//EqExp: RelExp | EqExp ('==' | '!=') RelExp;
eqExp: relExp ((EQU | NEQ) relExp)*;
//LAndExp: EqExp | LAndExp '&&' EqExp;
lAndExp: eqExp (AND eqExp)*;
//LOrExp: LAndExp | LOrExp '||' LAndExp;
lOrExp:  lAndExp (OR lAndExp)* ;
constExp: addExp;


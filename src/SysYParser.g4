parser grammar SysYParser;

@header {
package simpleexpr;
}

options {
    tokenVocab = SysYLexer;
}

program: compUnit ;

compUnit: (decl | funcDef)* EOF ;  // 允许空文件

decl
    : constDecl
    | varDecl
    ;

constDecl
    : CONST BType constDef (COMMA constDef)* SEMI ;
constDef
    : IDENT (LBR constExp RBR)* ASSIGN constInitVal ;
constInitVal
    : constExp
    | LB ( constInitVal (COMMA constInitVal )* )? RB
    ;

varDecl
    : BType varDef (COMMA varDef)* SEMI ;  // 分号结束

varDef
    : IDENT (LBR constExp RBR)* (ASSIGN initVal)?
    ; // 合并分支

initVal
    : exp
    | LB (initVal (COMMA initVal )* )? RB
    ;

funcName: IDENT;

funcDef
    : funcType funcName LPAREN funcFParams? RPAREN block
    ;

funcType
    : VOID
    | BType
    ;

funcFParams
    : funcFParam (COMMA funcFParam )*
    ;

funcFParam
    : BType IDENT ( LBR RBR (LBR exp RBR) * ) ?
    ;

block
    : LB (blockItem)* RB
    ;

blockItem
    : decl
    | stmt
    ;

stmt
    : lVal ASSIGN exp SEMI
    | (exp)? SEMI
    | block
    | IF LPAREN cond RPAREN stmt (ELSE stmt)?
    | WHILE LPAREN cond RPAREN stmt
    | BREAK SEMI | CONTINUE SEMI
    | RETURN (exp)? SEMI
    ;


exp
   : LPAREN exp RPAREN
   | lVal
   | number
   | IDENT LPAREN funcRParams? RPAREN
   | unaryOp exp
   | exp (MUL | DIV | MOD) exp
   | exp (PLUS | MINUS) exp
   ;

cond
   : exp
   | cond (LT | GT | LE | GE) cond
   | cond (EQ | NEQ) cond
   | cond AND cond
   | cond OR cond
   ;

lVal
   : IDENT (LBR exp RBR)*
   ;

number
   : IntConst
   ;

unaryOp
   : PLUS
   | MINUS
   | NOT
   ;

funcRParams
   : param (COMMA param)*
   ;

param
   : exp
   ;

constExp
   : exp
   ;

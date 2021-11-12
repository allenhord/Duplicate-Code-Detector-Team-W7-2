/* Partially derived from JFlexDemo by Steven Zeil https://git.cs.odu.edu/zeil/jflexdemo/-/blob/master/src/main/jflex/demo.jflex
* closely modeled after "lexical.flex" by  Jeanderson Barros Candido and Thiago Ferreira Patricio https://github.com/jeandersonbc/compilers.cpp/blob/master/specs/lexical.flex
*/



package edu.odu.cs.cs350;
//@SuppressWarnings("unused")

%%

%public
%class jflexScanner


%line
%column

%type Token

%{
  StringBuilder string = new StringBuilder();
  
  private Token symbol(TokenKinds type) {
    return new Token(type, yyline+1, yycolumn+1);
  }

  private Token symbol(TokenKinds type, String value) {
    return new Token(type, yyline+1, yycolumn+1, value);
  }
  


%}

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]
//  closely modeled after "lexical.flex" by  Jeanderson Barros Candido and Thiago Ferreira Patricio https://github.com/jeandersonbc/compilers.cpp/blob/master/specs/lexical.flex

/*comments*/
Comments= {lineComment} | {multiLineComment}
lineComment="//" {InputCharacter}* {LineTerminator}?
multiLineComment="/*" [^*] ~"*/" | "/*" "*" +"/" 

/* identifiers */

letter          = [A-Za-z]
L               = [a-zA-Z_]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
Identifier      = {letter}({alphanumeric}|{other_id_char})*

/* integer literals */
IntegerLiteral = [0-9][0-9]* | [0-9][_0-9]*[0-9]

%%


  /* keywords */
  "KEYWORD"                     { return symbol(TokenKinds.KEYWORD,yytext() ); }
  
  /* Keywords */

    "static_assert"          { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "typename"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "decltype"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "noexcept"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "default"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "alignas"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "alignof"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
   
    "asm"                	 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "atomic_cancel"          { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "atomic_commit"          { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "atomic_noexcept"        { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "bitand"          		 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "bitor"           		 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "catch"          		 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "char8_t"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "char16_t"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "char32_t"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "compl"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "concept"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "consteval"              { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "constexpr"              { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "constinit"              { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "const_cast"             { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "co_await"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "co_return"              { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "co_yield"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "delete"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "dynamic_cast"           { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "enum"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "export"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "namespace"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    
    "inline"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "mutable"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
   
    
    "extern"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "reflexpr"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "typeid"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "operator"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "reinterpret_cast"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "requires"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "static_cast"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "synchronized"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "template"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "thread_local"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "throw"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "try"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "wchar_t"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    
  
    "using"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "this"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    
    "bool"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "break"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "auto"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "break"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "case"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "char"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "continue"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "do"                     { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "double"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "else"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "float"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "for"                    { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "goto"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "if"                     { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "int"                    { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "long"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "register"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "return"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "short"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "signed"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "static"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "switch"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "typedef"                { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "unsigned"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "void"                   { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "while"                  { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "operator"               { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "new"                    { return symbol(TokenKinds.KEYWORD,yytext() ); }
    "string"                 { return symbol(TokenKinds.KEYWORD,yytext() ); }

    /* Access modifiers */
    
    "protected"             {return symbol(TokenKinds.ACCESS_MODIFIER,yytext() ); }
    "public"                {return symbol(TokenKinds.ACCESS_MODIFIER,yytext() ); }
    "private"				{return symbol(TokenKinds.ACCESS_MODIFIER,yytext() ); }
    "friend"                { return symbol(TokenKinds.ACCESS_MODIFIER,yytext() ); }

    /* Literals */

    "false"                 {return symbol(TokenKinds.LITERAL,yytext() ); }
    "true"                  {return symbol(TokenKinds.LITERAL,yytext() ); }
    "nullptr"                {return symbol(TokenKinds.LITERAL,yytext() ); }

    /* Class Definition */

    "struct"                {return symbol(TokenKinds.CLASS_DEF,yytext() ); }
    "class"                 {return symbol(TokenKinds.CLASS_DEF,yytext() ); }
    "union"                 {return symbol(TokenKinds.CLASS_DEF,yytext() ); }

    /* Virt Specifiers */

    "explicit"              {return symbol(TokenKinds.VIRT_SPECIFIER,yytext() ); }
    "final"                 {return symbol(TokenKinds.VIRT_SPECIFIER,yytext() ); }
    "virtual"                 { return symbol(TokenKinds.VIRT_SPECIFIER,yytext() ); }

    /* Qualifiers */

    "volatile"              {return symbol(TokenKinds.QUALIFIER,yytext() ); }
    "const"                 {return symbol(TokenKinds.QUALIFIER,yytext() ); }

    /* Unary Operators */

    "!"                     {return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    "++"                    {return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    "--"                    {return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    "~"                     {return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    "not"                { return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    "sizeof"                 { return symbol(TokenKinds.UNARY_OPERATOR,yytext() ); }
    

    /* Assignment */

    ">>="                   {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "<<="                   {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "-="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "="                     {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "+="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "*="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "/="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "%="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "&="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "^="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }
    "|="                    {return symbol(TokenKinds.ASSIGNMENT,yytext() ); }

    /* PM Operators */

    "->*"                   {return symbol(TokenKinds.PM_OPERATOR,yytext() ); }
    ".*"                    {return symbol(TokenKinds.PM_OPERATOR,yytext() ); }

    /* Shift Operators */

    "<<"                    {return symbol(TokenKinds.SHIFT_OPERATOR,yytext() ); }
    ">>"                    {return symbol(TokenKinds.SHIFT_OPERATOR,yytext() ); }

    /* Relational and Logical Operators */

    "^"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "||"                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "|"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "!="                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "=="                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "<="                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    ">="                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "<"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    ">"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "not_eq"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "or"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "or_eq"                     {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "xor"                 { return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "xor_eq"                 { return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
        "&&"                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
     "&="                    {return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
     "and"                	 { return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    "and_eq"                 { return symbol(TokenKinds.RL_OPERATOR,yytext() ); }
    
    
    
    

    /* Arithmetic Operators */

    "-"                     {return symbol(TokenKinds.ARITHMETIC_OPERATOR,yytext() ); }
    "+"                     {return symbol(TokenKinds.ARITHMETIC_OPERATOR,yytext() ); }
    "/"                     {return symbol(TokenKinds.ARITHMETIC_OPERATOR,yytext() ); }
    "%"                     {return symbol(TokenKinds.ARITHMETIC_OPERATOR,yytext() ); }

    /* Overloaded Lexemes */


    
    "*"                     {return symbol(TokenKinds.OVERLOADED_LEXEME,yytext() ); }
    "&"                     {return symbol(TokenKinds.OVERLOADED_LEXEME,yytext() ); }

    /* Separators */

    ";"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "?"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "["                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "]"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "::"                    {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    ","                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "->"                    {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    ":"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "}"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "{"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "("                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    ")"                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "."                     {return symbol(TokenKinds.SEPARATOR,yytext() ); }
    "#"						{return symbol(TokenKinds.SEPARATOR,yytext() ); }
  
  
  /*  integer literal */
  {IntegerLiteral}            { return symbol(TokenKinds.INTEGER_LITERAL, yytext()); }
	
	/*  string literal */
	\"([^\\\"]|\\.)*\"     { return symbol(TokenKinds.STRING_LITERAL,yytext()); }
	
	/* identifier */
  {Identifier}                   { return symbol(TokenKinds.IDENTIFIER, yytext()); } 
  
  /* white spaces and comments are ignored*/
{WhiteSpace}                  {/* Ignore: don't return anything. */}  
{Comments}					 {/* Ignore: don't return anything. */}  


/* error fallback */
[^]                              { throw new RuntimeException("Illegal character \""+yytext()+
                                                              "\" at line "+yyline+", column "+yycolumn); }
<<EOF>>                          { return symbol(TokenKinds.EOF); }

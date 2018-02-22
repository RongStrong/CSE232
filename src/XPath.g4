grammar XPath;

ap
 : doc SLASH rp 							#ap_child
 | doc DSLASH rp							#ap_all
 ;

rp
 : tagName							#rp_tagName
 | STAR								#rp_star
 | DOT								#rp_dot
 | DDOT								#rp_ddot
 | TEXT LPAREN RPAREN				#rp_text
 | AT attName						#rp_at
 | LPAREN rp RPAREN					#rp_paren
 | rp SLASH rp						#rp_slash
 | rp DSLASH rp						#rp_dslash
 | rp LBRACKET filter RBRACKET		#rp_filter
 | rp COMMA rp						#rp_comma
 ;
 
doc: 'doc' LPAREN '"' fileName '"' RPAREN 
| 'document' LPAREN '"' fileName '"' RPAREN
;
 
filter
 : rp								#filter_rp
 | rp EQUAL rp						#filter_eq
 | rp CEQUAL rp						#filter_ceq
 | rp DEQUAL rp						#filter_deq
 | rp IS rp							#filter_is
 | LPAREN filter RPAREN				#filter_paren
 | filter AND filter				#filter_and
 | filter OR filter					#filter_or
 | NOT filter						#filter_not
 ;
 
tagName : NAME ;					

attName : NAME ;

fileName : FILENAME ;

NOT : 'not' ;

OR : 'or' ;

AND : 'and' ;

IS : 'is' ;

DEQUAL : '==' ;

EQUAL : '=' ;

CEQUAL : 'eq' ;
 
TEXT : 'text'; 
 
LPAREN : '(' ;
 
RPAREN : ')' ;
 
LBRACKET : '[' ;
 
RBRACKET : ']' ;
 
SLASH : '/' ;
 
STAR : '*' ;
 
DSLASH : '//' ;
 
DOT : '.' ;
 
DDOT : '..' ; 

AT : '@' ;
 
COMMA : ',' ;



NAME : [A-Za-z0-9_\-]+ ;

FILENAME : [A-Za-z0-9_./] + '.xml';

WHITESPACE: [ \t\r\n]+ -> skip;

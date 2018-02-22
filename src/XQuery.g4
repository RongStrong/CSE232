grammar XQuery;

import XPath;

xq
 : var							#xq_var
 | StringConstant				#xq_stringconst
 | ap							#xq_ap
 | LPAREN xq RPAREN				#xq_paren
 | xq COMMA xq					#xq_comma
 | xq SLASH rp 					#xq_slash
 | xq DSLASH rp					#xq_dslash
 | LANGLE tagName RANGLE LBRACE xq RBRACE LANGLE SLASH tagName RANGLE	#xq_tag
 | forClause letClause? whereClause? returnClause #xq_flwr
 | letClause xq					#xq_let
 | joinClause 					#xq_join
 ;
 
joinClause : JOIN LPAREN xq COMMA xq COMMA joinAttr COMMA joinAttr LPAREN;
forClause : FOR var IN xq (COMMA var IN xq)* ;
letClause : LET var ':=' xq (COMMA var ':=' xq)* ;
whereClause : WHERE cond ;
returnClause : RETURN xq ;


cond
 : xq EQUAL xq					#cond_eq
 | xq CEQUAL xq 				#cond_ceq
 | xq DEQUAL xq 				#cond_deq
 | xq IS xq 					#cond_is
 | EMPTY LPAREN xq RPAREN 		#cond_empty
 | SOME var IN xq (COMMA var IN xq)* SATISFIES cond    #cond_satisfy
 | LPAREN cond RPAREN 			#cond_paren
 | cond AND cond				#cond_and
 | cond OR cond					#cond_or
 | NOT cond						#cond_not
 ;
 
 
LANGLE : '<' ;
RANGLE : '>' ;
LBRACE : '{' ;
RBRACE : '}' ;
JOIN : 'join' ;
IN : 'in' ;
LET : 'let' ;
FOR : 'for' ;
WHERE : 'where' ;
RETURN : 'return' ;
EMPTY : 'empty' ;
SOME : 'some' ;
SATISFIES : 'satisfies' ; 

joinAttr : LBRACKET NAME ? (COMMA NAME)* RBRACKET; 
var : '$' NAME;
StringConstant: '"'+[a-zA-Z0-9,.!?; ''""-]+'"';


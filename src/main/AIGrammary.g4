grammar AIGrammary;

commendline_rule: (mov_xor_commend | push_commend | int_commend) '\n';

mov_xor_commend:    (('mov ' |'mov\t') | ('xor '| |'mov\t'))    expr   ','  REGISTER ;
push_commend:   ('push '|'push\t')   expr ;
int_commend:    ('int '|'int\t')    INTERRUPTION_NUMBER;
expr: expr '+' subexpression |expr '-' subexpression  | subexpression;
subexpression: subexpression '*' function | subexpression '/' function | function;
function: data | '('expr')';
data: NUMBER | REGISTER;
REGISTER: '%'('eax'| 'ebx'| 'ecx'| 'edx');
INTERRUPTION_NUMBER: '0x80';    /* Interval number must be given -> without it, 0x80 is interpreted as NUMBER! */
NUMBER: [0-9]+;
WS : ' ' -> skip;   /* Skipping white spaces*/
TABS :'\t' -> skip;


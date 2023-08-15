Função ( x * y ) / z

Entradas

$a0 = x ( 6 ) [ Multiplicando ]
$a1 = y ( 3 ) [ Multiplicador ]
$a3 = z ( 6 ) [ Divisor ]

Saidas

$v0 = ( x * y )
$v1 = $v0 / z
$t1 = resto

Inicio:
1    add $v0, $zero, $zero           // v0 instancia no valor ( 0 ) [ 1 - 4 ]
2    add $t0, $zero, $zero           // t0 instancia no valor ( 0 ) [ 5 - 8 ]

/*MULT*/
Loop1:
3    add $v0, $v0, $a0               // v0 = v0 + a0 ( 6 ) => v0 = 6 [ 9 - 12 ]
4    addi $t0, $t0, 1                // t0 = t0 + 1 => t0 = 1 [ 13 - 16 ]
5    beq $t0, $a1, DIV               // t0 ( 1 ) NÃO é igual a a1 ( 3 ) [ 17 - 19 ]
6    j Loop1                         // volta para o Label ( Loop1 ) [ 20 - 23 ]

7    add $v0, $v0, $a0               // v0 = v0 ( 6 ) + a0 ( 6 ) => v0 = 12 [ 24 - 27 ]
8    addi $t0, $t0, 1                // t0 = t0 ( 1 ) + 1 => t0 = 2 [ 28 - 31 ]
9    beq $t0, $a1, DIV               // t0 ( 2 ) NÃO É IGUAL a a1 ( 3 ) [ 32 - 34 ]
10   j Loop1                         // volta para o Label ( Loop1 ) [ 35 - 37 ]

11   add $v0, $v0, $a0               // v0 = v0 ( 12 ) + a0 ( 6 ) => v0 = 18 [ 38 - 41 ]
12   addi $t0, $t0, 1                // t0 = t0 ( 2 ) + 1 => t0 = 3 [ 42 - 45 ]
13   beq $t0, $a1, DIV               // t0 ( 3 ) É IGUAL a a1 ( 3 ), então desvia para o Label ( DIV ) [ 46 - 48 ]

DIV:    
14   add $a2, $zero, $v0             // a2 = 0 + v0 ( 18 ) => a2 = 18 [ 49 - 52 ]
15   add $v1, $zero, $zero           // v0 instancia no valor ( 0 ) [ 53 - 56 ]
16   add $t4, $zero, $zero           // t4 instancia no valor ( 0 ) [ 57 - 60 ] 

Loop2:
17   slt $t4, $a2, $a3               // a2 ( 18 ) é menor que a3 ? ( 6 ), se for atribui 1 para t4 se não, atribui 0 para t4 [ 61 - 64 ]
18   bne $t4, $zero, END             // t4 ( 0 ) NÃO É IGUAL a 0, então continua o código [ 65 - 67 ]
19   sub $a2, $a2, $a3               // a2 = a2 ( 18 ) - a3 ( 6 ) => 12 [ 68 - 71 ]
20   addi $v1, $v1, 1                // v1 = v1 ( 0 ) + 1 => v1 = 1 [ 72 - 75 ]
21   j Loop2                         // volta para o Label ( Loop2 ) [ 76 - 78 ]

22   slt $t4, $a2, $a3               // a2 ( 12 ) é menor que a3 ? ( 6 ), se for atribui 1 para t4 se não, atribui 0 para t4 [ 79 - 82 ]
23   bne $t4, $zero, END             // t4 ( 0 ) NÃO É IGUAL a 0, então continua o código [ 83 - 85 ]
24   sub $a2, $a2, $a3               // a2 = a2 ( 12 ) - a3 ( 6 ) => 6 [ 86 - 89 ]
25   addi $v1, $v1, 1                // v1 = v1 ( 1 ) + 1 => v1 = 2 [ 90 - 93 ]
26   j Loop2                         // volta para o Label ( Loop2 ) [ 94 - 96 ]

27   slt $t4, $a2, $a3               // a2 ( 6 ) é menor que a3 ? ( 6 ), se for atribui 1 para t4 se não, atribui 0 para t4 [ 97 - 100 ]
28   bne $t4, $zero, END             // t4 ( 0 ) NÃO É IGUAL a 0, então continua o código [ 101 - 103 ]
29   sub $a2, $a2, $a3               // a2 = a2 ( 6 ) - a3 ( 6 ) => 0 [ 104 - 107 ]
30   addi $v1, $v1, 1                // v1 = v1 ( 2 ) + 1 => v1 = 3 [ 108 - 111 ]
31   j Loop2                         // volta para o Label ( Loop2 ) [ 112 - 114 ]

32   slt $t4, $a2, $a3               // a2 ( 0 ) é menor que a3 ? ( 6 ), se for atribui 1 para t4 se não, atribui 0 para t4 [ 115 - 118 ]
33   bne $t4, $zero, END             // t4 ( 1 ) É IGUAL a 0, então desvia para o Label ( END ) [ 119 - 121 ]

END:
34   add $t1, $a2, $zero            // t1 = a2 ( 0 ) + 0 => t1 = 0 [ Calculo do Resto ] [ 122 - 125 ]

35   Jr $ra                         // Retorna para que chamou o procedimento [ 126 - 128 ]

QUESTÕES :

1.1 - Quais os sinais de controle MONOCICLO nos ciclos 18 e 34.

Resolução :

Ciclo 18 => bne $t4, $zero, END

Sinais de Controle:

Reg Dt = X
Reg Write = 0
ALU Src = 0
MemTo Reg = X
Mem Read = 0
Mem Write = 0
Branch = 0
NBranch= 1
AluOp2 = 0
AluOp1 = 0
AluOp0 = 1
DVI = 0

//

Ciclo 34 => add $t1, $a2, $zero

Sinais de Controle:

Reg Dt = 1
Reg Write = 1
ALU Src = 0
MemTo Reg = 0
Mem Read = 0
Mem Write = 0
Branch = 0
NBranch= 0
AluOp2 = 0
AluOp1 = 1
AluOp0 = 0
DVI = 0

1.2 - Em qual ciclo ocorrem as instruções MULTICICLO e os respectivos sinais de controle.

(a) add $a2, $zero, $v0 ( fase de decodificação )
(b) bne $t4, $zero, END ( 2º ocorrencia ) ( fase de execução )
(c) add $t1, $a2, $zero ( fase de escrita no registrador )

Resolução:

(a) A instrução [ add $a2, $zero, $v0 ], ocorre no ciclo nº 14 ( 52º ciclo contando ciclos por instrução e 4º ciclo interno (ADD) )

Sinais de Controle:

ALUSrcA = 1
ALUSrcB = 00
ALUOp = 10
RegDt = 1
RegWrite = 1
MemToReg = 0

(b) A instrução [ bne $t4, $zero, END ], ocorre no ciclo nº 23 ( 85º ciclo contando ciclos por instrução e 3º ciclo interno (BNE) )

Sinais de Controle:

ALUSrcA = 1
ALUSrcB = 00
ALUOp = 01
PCWriteCond 
PCSource = 01

(c) A instrução [ add $t1, $a2, $zero ], ocorre no ciclo nº 34 ( 123º ciclo contando ciclos por instrução e 2º ciclo interno (ADD) )

Sinais de Controle:

ALUSrcA = 1
ALUSrcB = 00
ALUOp = 10
RegDt = 1
RegWrite = 1
MemToReg = 0

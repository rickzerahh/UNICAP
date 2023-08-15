Inicio:
    add $v0, $zero, $zero        
    add $t0, $zero, $zero          

/*MULT*/
Loop1:
    add $v0, $v0, $a0               
    addi $t0, $t0, 1                
    beq $t0, $a1, DIV               
    j Loop1                         
    
    add $v0, $v0, $a0               
    addi $t0, $t0, 1                
    beq $t0, $a1, DIV               

DIV:    
    add $a2, $zero, $v0             
    add $v1, $zero, $zero         
    add $t4, $zero, $zero           

Loop2:
    slt $t4, $a2, $a3               
    bne $t4, $zero, END             
    sub $a2, $a2, $a3               
    addi $v1, $v1, 1                
    j Loop2                         

END:
    add $t1, $a2, $zero        

    Jr $ra                       
   
1.1 - Quais os sinais de controle MONOCICLO nos ciclos 18 e 34.

1.2 - Em qual ciclo ocorrem as instruções MULTICICLO e os respectivos sinais de controle.

(a) add $a2, $zero, $v0 ( fase de decodificação )
(b) bne $t4, $zero, END ( 2º ocorrencia ) ( fase de execução )
(c) add $t1, $a2, $zero ( fase de escrita no registrador )

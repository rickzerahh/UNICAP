package ed1.LDE.atividade4;

import java.util.Scanner;

public class TesteLDE {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LDEInteiros numeros = new LDEInteiros();
        int op;
        int num;
        do {
            exibirOpcoes();
            op = in.nextInt(); in.nextLine();
            switch(op) {
                case 1: System.out.print("Informe o número a ser inserido: ");
                        num = in.nextInt();
                        numeros.inserirInicio (num);
                        break;
                case 2: System.out.print("Informe o número a ser inserido: ");
                        num = in.nextInt();
                        numeros.inserirFinal (num);
                        break;
                case 3: numeros.exibir();
                        break;
                case 4: System.out.println("Em desenvolvimento ");
                        break;
                case 5: System.out.println("Em desenvolvimento ");
                        break;
                case 6: System.out.println("Em desenvolvimento ");
                        break;
                case 7: System.out.println("Em desenvolvimento ");
                        break;
                case 0: System.out.println("Fim de programa");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);       
        in.close(); 
    }
    
    public static void exibirOpcoes() {
        System.out.println("Opções");
        System.out.println("1 – Inserir um novo número no início da lista");
        System.out.println("2 – Inserir um novo número no final da lista");
        System.out.println("3 – Exibir todos os números da lista");
        System.out.println("4 – Exibir todos os números da lista do contrário");
        System.out.println("5 – Remover o primeiro número da lista");
        System.out.println("6 – Remover o último número da lista");
        System.out.println("7 – Remover um dado número da lista");
        System.out.println("0 – Sair do programa");
        System.out.println("Informe a opção desejada: ");
    }
}
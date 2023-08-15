package Queue;
import ed1.Queue;
import java.util.Scanner;
public class AplicacaoQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> fila = new Queue<Integer>();
        int op, num;
        do {
            opcoes();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: if (fila.isFull() == false) {
                            System.out.println("Informe o número: ");
                            num = in.nextInt();
                            fila.enQueue(num);
                        } else {
                            System.out.println("Queue full");
                        }
                        break;
                case 2: if (fila.isEmpty() == false) {
                           num = fila.deQueue();
                           System.out.println("Valor desenfileirado: " + num);
                        } else {
                           System.out.println("Queue empty");
                        }
                        break;
                case 3:if (fila.isEmpty() == false) {
                        num = fila.head();
                        System.out.println("Valor no início da fila: " + num);
                        } else {
                           System.out.println("Queue empty");
                        }
                        break;
                case 0: System.out.println("Fim de programa");
                        break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
    public static void opcoes() {
        System.out.println("1 - Enfileirar");
        System.out.println("2 - Desenfileirar");
        System.out.println("3 - Ver inicio");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada:");
    }        
}

package revisao;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        double i;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite o Valor");
        i = s.nextDouble();
        if ( i % 2 == 0 ){
          System.out.println( i + " é um número PAR.");
        } else {
        System.out.println( i + " é um número IMPAR.");
        }
        s.close();
      }
}
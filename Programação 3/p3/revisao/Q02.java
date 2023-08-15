package revisao;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        double i;
        Scanner s = new Scanner(System.in);
        i = s.nextDouble();
        
        if( i % 3 == 0){
            System.out.println(i + " é um número divisível por 3.");
        }else{
            System.out.println(i + " não é um número divisível por 3.");
        }
        s.close();
    }
}

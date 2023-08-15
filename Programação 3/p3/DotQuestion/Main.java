package questaoponto;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1, 1);
        Ponto p2 = new Ponto(5, 4);
        double distancia = p1.calcularDistancia(p2);
        System.out.println(distancia);
    }
}
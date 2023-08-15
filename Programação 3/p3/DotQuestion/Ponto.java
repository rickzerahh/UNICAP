package questaoponto;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public double calcularDistancia(Ponto outroPonto) {
        int difX = this.x - outroPonto.getX();
        int difY = this.y - outroPonto.getY();
        return Math.sqrt((difX * difX) + (difY * difY));
    }
}
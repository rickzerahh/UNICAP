package ed1.Queue;
public class Queue <T> {
    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull() {
        return false;
    }
    public void enQueue (T info) { // enfileirar
        QueueNode<T> novo = new QueueNode<T>(info);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }
    public T deQueue() {
        QueueNode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;
            this.fim = null;
        }
        else{
            this.inicio = this.inicio.getProx();
        }
        return aux.getInfo();       
    }
    public T head () {
        return this.inicio.getInfo();
    }
}

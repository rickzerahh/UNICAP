package ed1.Queue;
class QueueNode <T> { // visibilidade de pacote
    private T info;
    private QueueNode<T> prox;   
    QueueNode (T info) {
        this.info = info;
    }
    void setInfo (T info) {
        this.info = info;
    }    
    void setProx (QueueNode<T> prox) {
        this.prox = prox;
    }  
    T getInfo() {
        return this.info;
    }  
    QueueNode<T> getProx() {
        return this.prox;
    }
}

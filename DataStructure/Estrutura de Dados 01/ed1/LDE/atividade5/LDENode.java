package ed1.LDE.atividade5;

public class LDENode <T extends Comparable<T>> {
    private LDENode<T> anterior;
    private T info;
    private LDENode<T> proximo;

    public LDENode (T valor) {
        this.info = valor;
    }

    public void setAnterior(LDENode<T> novoAnterior) {
        this.anterior = novoAnterior;
    }

    public LDENode<T> getAnt() {
        return this.anterior;
    }

    public void setInfo (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setProximo (LDENode<T> novoProximo) {
        this.proximo = novoProximo;
    }

    public LDENode<T> getProx() {
        return this.proximo;
    }
}
package ed1.LDE.prova;

public class LDENode {
    private LDENode ant;
    private LDENode info;
    private LDENode prox;

    public LDENode (LDENode valor){
        this.info = valor;
    }
    public LDENode getAnt() {
        return this.ant;
    }

    public void setAnt(LDENode ant) {
        this.ant = ant;
    }

    public LDENode getInfo() {
        return this.info;
    }

    public void setInfo(LDENode info) {
        this.info = info;
    }

    public LDENode getProx() {
        return this.prox;
    }

    public void setProx(LDENode prox) {
        this.prox = prox;
    }
}
package ed1.LSE.atividade02;

public class LSENode {
    private Funcionario info;
    private LSENode prox;

    public LSENode (Funcionario info){ // Construtor do LSENode
        this.info = info;
    }
    public void setInfo(Funcionario info){ // Set Info, no Objeto da Classe LSENode
        this.info = info;
    }
    public void setProx(LSENode novoProx){ // Set Prox, no Objeto da Classe LSENode
        this.prox = novoProx;
    }
    public Funcionario getInfo(){ // Get Info, no Objeto da Classe LSENode
        return this.info;
    }
    public LSENode getProx(){ // Get Prox, no Objeto da Classe LSENode
        return this.prox;   
    }
}
package ed1.LDE.atividade4;

public class LDEInteiros {

    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
   
    // BUSCA SEQUENCIAL SIMPLES
    // A função de busca é a mesma da LSE, não muda a lógica.
    // A função de busca recebe como parâmetro o valor a ser buscado.
    // A função de busca retorna a referência do nó que possui o valor procurado.
    // Caso não encontre o valor na lista, a função retorna null.
    public LDENode buscar(Integer valor) {
        LDENode aux;
        boolean achou = false;

        aux = this.primeiro;
        while (aux != null) {
            if (aux.getInfo().compareTo(valor) == 0) {
                achou = true;
                break;
            }
            aux = aux.getProx();
        }
        if (achou == true) {
            return aux;
        } else {
            return null;
        }
    }

    public void inserirFinal(Integer valor) { // inserir o novo após o último
        LDENode novo = new LDENode(valor);
        LDENode retorno = buscar(valor);
        if (retorno == null) {  // não achou, pode inserir
            if (this.isEmpty() == true) { // lista vazia
                this.primeiro = novo;
                this.ultimo = novo;
                this.qtd++;
            } else {  // lista não vazia
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.qtd++;
            }
            System.out.println("Inserção efetuada.");
        } else {
            System.out.println("Valor repetido. Inserção não efetuada.");
        }
    }

    public void inserirInicio(Integer valor) { // inserir o novo antes do primeiro
        LDENode novo = new LDENode(valor);
        LDENode retorno = buscar(valor);
        if (retorno == null) {  // não achou, pode inserir
            if (this.isEmpty() == true) { // lista vazia
                this.primeiro = novo;
                this.ultimo = novo;
                this.qtd++;
            } else {  // lista não vazia
                novo.setProx(this.primeiro);
                this.primeiro.setAnt(novo);
                this.primeiro = novo;
                this.qtd++;
            }
            System.out.println("Inserção efetuada.");
        } else {
            System.out.println("Valor repetido. Inserção não efetuada.");
        }
    }
    
    // O método de exibição do primeiro ao último é idêntico ao da LSE
    public void exibir () {
        LDENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}
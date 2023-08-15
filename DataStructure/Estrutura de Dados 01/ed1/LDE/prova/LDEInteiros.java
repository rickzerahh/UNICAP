package ed1.LDE.prova;

public class LDEInteiros {
    /*
    MÉTODO 1 ( SOLICITADO NA QUESTAO )

    public void inserirOrdenadoDecrescenteComRepetidos(Integer valor) {
        LDENode novo = new LDENode(valor);
        LDENode aux, anterior;
        if (this.isEmpty() == true) { // inserir na lista vazia
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
        } else if (valor.compareTo(this.prim.getInfo()) > 0) { // inserir antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ult.getInfo()) < 0) { // inserir depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
        } else {
            aux = this.prim.getProx(); // segundo
            while (true) {
                if (valor.compareTo(aux.getInfo()) >= 0) { // achei local de inserção
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }
    */

    /*
    MÉTODO 2 ( SOLICITADO NA QUESTAO )

    public void juntar(LDEInteiros lista2) {

        this.ult.setProx(lista2.prim);
        lista2.prim.setAnt(this.ult);
        this.ult = lista2.ult; // atualiza o último nó de lista1
        this.qtd += lista2.qtd; // soma a quantidade de nós das duas listas
        }
    lista2.esvaziar(); // esvazia lista2
    }
    */
}
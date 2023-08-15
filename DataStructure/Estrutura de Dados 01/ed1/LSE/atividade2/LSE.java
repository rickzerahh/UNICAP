package ed1.LSE.atividade02;

public class LSE {
    private LSENode primeiro;

    public boolean isEmpty(){ // Função para testar se a lista está vazia
        if(this.primeiro == null){
            return true;
        }else{
                return false;
            }
        }

        public void exibirTodos(){
            LSENode aux;
            Funcionario f;
            if(this.isEmpty() == true){
                System.out.println("A Lista se Encontra Vazia !");
            }else{
                aux = this.primeiro;
                while(aux != null){
                    f = aux.getInfo();
                    System.out.println(f);
                    aux = aux.getProx();
                }
            }
        }

    public void inserir (Funcionario f){
        LSENode novo; // Novo vai referênciar o Objeto da Classe LSENode (INFO, PROX)
        novo = new LSENode(f); // Referênciou a Classe Funcionário (f)
        novo.setInfo(f);
        // USAR SOMENTE SE A LISTA ESTIVER VAZIA !
        if(this.isEmpty() == true){ // Verifica se a Lista está Vazia e Insere o novo na Lista !
        this.primeiro = novo;
        }else{
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }
    public void exibir() {
        LSENode atual = this.primeiro;
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getProx();
        }
    }
}
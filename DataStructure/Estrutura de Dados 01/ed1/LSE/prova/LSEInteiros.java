package ed1.LSE.prova;

public class LSEInteiros {
    private No inicio;

   private class No {
       int valor;
       No proximo;

       No(int valor) {
           this.valor = valor;
           this.proximo = null;
       }
   }
   public void adicionar(int valor) {
       No novoNo = new No(valor);

       if (inicio == null) {
           inicio = novoNo;
       } else {
           No atual = inicio;
           while (atual.proximo != null) {
               atual = atual.proximo;
           }
           atual.proximo = novoNo;
       }
   }
   public void somar(LSEInteiros listaA, LSEInteiros listaB) {
       if (listaA.inicio == null || listaB.inicio == null) {
           System.out.println("Pelo menos uma das listas está vazia !");
       }

       No atualA = listaA.inicio;
       No atualB = listaB.inicio;

       while (atualA != null && atualB != null) {
           adicionar(atualA.valor + atualB.valor);
           atualA = atualA.proximo;
           atualB = atualB.proximo;
       }
       if (atualA != null || atualB != null) {
           System.out.println("As listas não possuem o mesmo tamanho !");
           inicio = null;
       }
        /* Outro meio de ver se o tamanho é equivalente das duas listas
       tamA = listaA.qtdNos();
       tamB = listaB.qtdNos();

       if(tamA != tamB){
           System.out.println("As listas não possuem o mesmo tamanho !");
           inicio = null;
       }
        */
   }
   public void imprimir() {
       No atual = inicio;
       while (atual != null) {
           System.out.print(atual.valor + " ");
           atual = atual.proximo;
       }
       System.out.println();
   }
}
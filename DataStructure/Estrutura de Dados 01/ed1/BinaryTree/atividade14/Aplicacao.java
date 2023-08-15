package ed1.BinaryTree.atividade14;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        try(Scanner s = new Scanner (System.in)){
        Cadastro estoque = new Cadastro();
        int op;
        do {
            exibirOpcoes();
            op = s.nextInt();
            switch (op){
                case 1: estoque.cadastrarProduto();
                        break;
                case 2: estoque.exibirDadosProduto();
                        break;
                case 3: estoque.exibirTodosProdutos();
                        break;
                case 4: estoque.alterarPreco();
                        break;
                case 5: estoque.alterarQtdEstoque();
                        break;
                case 6: estoque.removerProduto();
                        break;
                case 0: System.out.println("Programa Finalizado !");
                        break;
                default: System.out.println("A Opção Desejada é Inválida");
            } 
        } while (op != 0);
        }
    }
    
    public static void exibirOpcoes () {
        System.out.println("Opções: ");
        System.out.println("1 - Cadastrar um Produto");
        System.out.println("2 - Exibir Dados de um Produto");
        System.out.println("3 - Exibir Todos os Produtos em Estoque");
        System.out.println("4 - Alterar Preço do Produto");
        System.out.println("5 - Alterar Quantidade de um Produto no Estoque");
        System.out.println("6 - Remover um Produto");
        System.out.println("0 - Sair");
        System.out.println("Insira uma Opção: ");   
    }
}
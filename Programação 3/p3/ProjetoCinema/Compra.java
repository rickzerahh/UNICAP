package ProjetoCinema;

public class Compra {
    private int qtdBilhetes;
    private Sessao sessao;
    private Usuario usuario;

    public Compra(int qtdBilhetes, Sessao sessao, Usuario usuario) {
        this.qtdBilhetes = qtdBilhetes;
        this.sessao = sessao;
        this.usuario = usuario;
    }

    public void comprarBilhete() {
        if (qtdBilhetes > 1) {
            int qtdDisponivel = sessao.verificarDisponibilidade(qtdBilhetes);

            if (qtdDisponivel == qtdBilhetes) {
                int[] poltronas = sessao.sugerirPoltronas(qtdBilhetes);
                sessao.venderPoltronas(poltronas);
                System.out.println("Compra realizada com sucesso!\nPoltronas: " + Arrays.toString(poltronas));
            } else {
                System.out.println("Não há poltronas disponíveis para a quantidade desejada.");
            }
        } else {
            int poltrona = sessao.sugerirPoltrona();
            if (poltrona != -1) {
                sessao.venderPoltrona(poltrona);
                System.out.println("Compra realizada com sucesso!\nPoltrona: " + poltrona);
            } else {
                System.out.println("Não há poltronas disponíveis para a quantidade desejada.");
            }
        }
    }

    public void alterarBilhete(int novaQtdBilhetes) {
        int qtdDisponivel = sessao.verificarDisponibilidade(novaQtdBilhetes);
        if (qtdDisponivel == novaQtdBilhetes) {
            if (qtdBilhetes == 1) {
                int poltrona = sessao.sugerirPoltrona();
                if (poltrona != -1) {
                    sessao.cancelarPoltrona(sessao.getPoltrona());
                    sessao.venderPoltrona(poltrona);
                    System.out.println("Bilhete alterado com sucesso!\nPoltrona: " + poltrona);
                } else {
                    System.out.println("Não há poltronas disponíveis para a quantidade desejada.");
                }
            } else {
                int[] poltronas = sessao.sugerirPoltronas(novaQtdBilhetes);
                sessao.cancelarPoltronas(sessao.getPoltronas());
                sessao.venderPoltronas(poltronas);
                System.out.println("Bilhete alterado com sucesso!\nPoltronas: " + Arrays.toString(poltronas));
            }
            this.qtdBilhetes = novaQtdBilhetes;
        } else {
            System.out.println("Não há poltronas disponíveis para a quantidade desejada.");
        }
    }

    public void cancelarBilhete() {
        if (qtdBilhetes > 1) {
            sessao.cancelarPoltronas(sessao.getPoltronas());
        } else {
            sessao.cancelarPoltrona(sessao.getPoltrona());
        }
        System.out.println("Bilhete cancelado com sucesso!");
    }
}
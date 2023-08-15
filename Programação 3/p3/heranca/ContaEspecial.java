package heranca;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String cliente, int num_conta, double saldo, double limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double novoSaldo = this.getSaldo() - valor;
        if (novoSaldo < -this.limite) {
            System.out.println("Limite de saque ultrapassado.");
        } else {
            this.setSaldo(novoSaldo);
        }
    }
}

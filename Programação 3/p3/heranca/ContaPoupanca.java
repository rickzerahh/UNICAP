package heranca;

public class ContaPoupanca extends ContaBancaria{
    private int dia_rendimento;

    public ContaPoupanca(String cliente, int num_conta, double saldo, int dia_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_rendimento = dia_rendimento;
    }

    public int getDia_rendimento() {
        return dia_rendimento;
    }

    public void setDia_rendimento(int dia_rendimento) {
        this.dia_rendimento = dia_rendimento;
    }

    public void calcularNovoSaldo(double taxa) {
        double novoSaldo = this.getSaldo() + (this.getSaldo() * taxa);
        this.setSaldo(novoSaldo);
    }
}

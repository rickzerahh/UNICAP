package heranca;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private double saldo;

    public ContaBancaria ( String cliente, int num_conta, double saldo ){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar ( double valor ){
        if(saldo - valor < 0){
            System.out.println("Saldo insuficiente.");
        }else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        }
    }

    public void depositar ( double valor ){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente + " | Número da conta: " + num_conta + " | Saldo: R$" + saldo);
    }

    public void setCliente ( String cliente ){
        this.cliente = cliente;
    }

    public void setConta ( int num_conta ){
        this.num_conta = num_conta;
    }

    public void setSaldo ( double saldo ){
        this.saldo = saldo;
    }

    public String getCliente (){
        return cliente;
    }

    public int getNum_Conta (){
        return num_conta;
    }

    public double getSaldo (){
        return saldo;
    }
}

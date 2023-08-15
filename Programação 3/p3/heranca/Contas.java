package heranca;

import java.util.ArrayList;

public class Contas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        
        // Incluindo dados das contas
        ContaPoupanca poupanca1 = new ContaPoupanca("Maria", 1, 1000, 1);
        ContaPoupanca poupanca2 = new ContaPoupanca("João", 2, 500, 5);
        ContaEspecial especial1 = new ContaEspecial("Ana", 3, 2000, 500);
        ContaEspecial especial2 = new ContaEspecial("Pedro", 4, 3000, 1000);
        
        contas.add(poupanca1);
        contas.add(poupanca2);
        contas.add(especial1);
        contas.add(especial2);
        
        // Sacando de uma conta
        contas.get(0).sacar(300);
        
        // Depositando em uma conta
        contas.get(1).depositar(100);
        
        // Calculando novo saldo de uma poupança
        ((ContaPoupanca) contas.get(0)).calcularNovoSaldo(0.01f);
        
        // Mostrando dados das contas
        for (ContaBancaria conta : contas) {
            System.out.println("Cliente: " + conta.getCliente() + ", Conta: " + conta.getNum_Conta() + ", Saldo: " + conta.getSaldo());
            
            if (conta instanceof ContaPoupanca) {
                System.out.println("Dia de rendimento: " + ((ContaPoupanca) conta).getDia_rendimento());
            } else if (conta instanceof ContaEspecial) {
                System.out.println("Limite: " + ((ContaEspecial) conta).getLimite());
            }
        }
    }
}

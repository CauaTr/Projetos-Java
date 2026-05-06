package Exercicios.first;

public class ContaPoupanca extends Conta {
    protected double taxa = 2.0;

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor + taxa > saldo)
            System.out.println("Saldo Insuficiente");
        else {
            saldo -= (valor - taxa);
            System.out.println("Transação Concluida!\nValor Retirado: R$" + valor + "\nSaldo atual: " + saldo);
        }
    }
}

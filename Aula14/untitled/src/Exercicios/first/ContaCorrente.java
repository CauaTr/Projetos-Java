package Exercicios.first;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo)
            System.out.println("Saldo Insuficiente");
        else {
            saldo -= valor;
            System.out.println("Transação Concluida!\nValor Retirado: R$" + valor + "\nSaldo atual: " + saldo);
        }
    }
}

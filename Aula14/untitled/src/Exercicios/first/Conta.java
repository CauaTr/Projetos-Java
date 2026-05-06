package Exercicios.first;

public abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor < 0)
            System.out.println("Valor inválido!");
        else
            this.saldo += valor;
    }

    public abstract void sacar(double valor);
}

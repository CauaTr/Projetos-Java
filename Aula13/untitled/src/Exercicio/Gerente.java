package Exercicio;

public class Gerente extends Funcionario{
    static private double bonusFixo = 2000.0;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioBase()+bonusFixo;
    }
}

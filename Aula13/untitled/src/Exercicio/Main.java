package Exercicio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("abc", 5000);
        System.out.println(g.calcularSalarioFinal());

        Gerente g2 = new Gerente("abc", 5000){//diferente de g != de g2
            @Override
            public double calcularSalarioFinal() {
                return super.calcularSalarioFinal()+500;
            }
        };//só existe essa implementação em g2 e quando g2 sumir some a implentação tb.
        System.out.println(g2.calcularSalarioFinal());
    }
}

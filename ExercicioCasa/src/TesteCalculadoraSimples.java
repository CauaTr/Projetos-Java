import java.util.Scanner;

public class TesteCalculadoraSimples {
    public static void main(String[] args) {
    CalculadoraSimples cal = new CalculadoraSimples();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        cal.num1 = input.nextInt();

        System.out.println("Digite outro número: ");
        cal.num2 = input.nextInt();

        int soma = cal.somar(cal.num1, cal.num2);
        int sub = cal.subtrair(cal.num1, cal.num2);
        int mult = cal.multiplicar(cal.num1, cal.num2);
        int div = cal.dividir(cal.num1, cal.num2);

        System.out.println("A soma entre os números é: " + soma);
        System.out.println("A subtração dos números é: " + sub);
        System.out.println("A multiplicação dos números é: " + mult);
        System.out.println("A divisão dos números é: " + div);
    }
}

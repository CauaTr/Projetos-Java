package Exercicio;
import java.util.Scanner;

public class Menu {
    static void main() {


        Scanner input = new Scanner(System.in);
        for (; true; ) {
            System.out.println("Escolha um valor de 1 a 4: ");
            int i = input.nextInt();
            if (i <= 4 && i >= 1) {
                System.out.println("O valor escrito foi: " + i);
                break;
            } else {
                System.out.println("Erro! O valor digitado não é válido!");
                continue;
            }
        }
    }
}

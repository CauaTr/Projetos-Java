package Exercicio;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (;true;) {
            System.out.println("Escolha um valor de 1 a 4: ");
            int i = input.nextInt();
            if (i > 4){
                System.out.println("Erro! Valor acima de 4");
                continue;
            }
            else if (i < 1) {
                System.out.println("Erro! Valor abaixo de 1");
                continue;
            }
            else {
                System.out.println("O valor escrito foi: " + i);
                break;
            }
        }
    }
}

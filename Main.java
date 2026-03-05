//Import de Utility
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Adicionar o scanner no código
        Scanner input = new Scanner(System.in);

        //Pede o tipo de operação
        System.out.println("Qual operação você deseja fazer?\nsoma = '+'\nsubração = '-'\nmuliplicação = '*'\ndivisão = '/'");
        char operador = input.next().charAt(0);
        
        //Coleta do primeiro número
        System.out.println("Primeiro número:");
        float primeiroVal = input.nextFloat();//Fazer em float porque não necessáriamente o usuário vai colocar um número inteiro
        //Coleta do segundo número
        System.out.println("Segundo número:");
        float segundoVal = input.nextFloat();

//Operação com base no valor de 'operador'
switch (operador) {
            //Soma
            case '+':
            System.out.println(primeiroVal + " + " + segundoVal + " = " + (primeiroVal + segundoVal));
            break;
            //Subtração
            case '-':
            System.out.println(primeiroVal + " - " + segundoVal + " = " + (primeiroVal - segundoVal));
            break;
            //Multiplicação
            case '*':
            System.out.println(primeiroVal + " x " + segundoVal + " = " + (primeiroVal * segundoVal));
            break;
            //Divisão
            case '/':
            System.out.println(primeiroVal + " / " + segundoVal + " = " + (primeiroVal / segundoVal));
            break;
        }
    }
}

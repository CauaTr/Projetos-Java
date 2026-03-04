//Import de Utility
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Adicionar o scanner no código
        Scanner input = new Scanner(System.in);
        //Coleta do primeiro número
        System.out.println("Primeiro número:");
        float primeiroVal = input.nextFloat();//Fazer em float porque não necessáriamente o usuário vai colocar um número inteiro
        //Coleta do segundo número
        System.out.println("Segundo número:");
        float segundoVal = input.nextFloat();


        //Soma
        System.out.println(primeiroVal + " + " + segundoVal + " = " + (primeiroVal+segundoVal));
        //Subtração
        System.out.println(primeiroVal + " - " + segundoVal + " = " + (primeiroVal-segundoVal));
        //Multiplicação
        System.out.println(primeiroVal + " x " + segundoVal + " = " + (primeiroVal*segundoVal));
        //Divisão
        System.out.println(primeiroVal + " / " + segundoVal + " = " + (primeiroVal/segundoVal));
    }
}
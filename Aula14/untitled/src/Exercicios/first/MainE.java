package Exercicios.first;

import java.util.Scanner;

public class MainE {
    public static void main(String[] args) {
        Conta c;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o tipo de conta que você tem?\n1 - Poupanca\n2 - Corrente");
        int conta = Integer.parseInt(input.nextLine());

        while (true){
            if (conta == 1){
                c = new ContaPoupanca(5, 200);
                break;
            }

            if (conta == 2){
                c = new ContaCorrente(5, 200);
                break;
            }

            else {
                System.out.println("Tipo inválido, tente outro entre 1 e 2:");
            }

        }
        while (true){
            System.out.println("1 - Depositar\n2 - Sacar\n3 - Sair\nDigite sua opção");
            int opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1){
                System.out.println("Quanto você gostaria de depositar?: ");
                double deposito = Integer.parseInt(input.nextLine());
                c.depositar(deposito);
                break;
            }

            if (opcao == 2){
                System.out.println("Quanto você gostaria de sacar?: ");
                double saque = Integer.parseInt(input.nextLine());
                c.sacar(saque);
                break;
            }

            if (opcao == 3){
                break;
            }

            else {
                System.out.println("Número inválido, tente outro entr 1 e 3");
            }
        }
    }
}

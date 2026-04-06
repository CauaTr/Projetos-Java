import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //criar um menu para testar
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva soma se quiser somar " +
                "ou subtração se quiser subtrair");
        String opcao= sc.nextLine();
        switch(opcao){
            case "soma": //if (opcao.equals("soma")) equivalente
                System.out.println("Escreva 1 valor ");
                int valor= Integer.parseInt(sc.nextLine());
                /* double valorx = Double.parseDouble(sc.nextLine());*/
                //converte String em int e armazena em valor
                System.out.println("Escreva 1 valor ");
                int valor2= Integer.parseInt(sc.nextLine());
                //converte String em int e armazena em valor
                System.out.println("A soma é:" + Calculadora.soma(valor,valor2));
                break;
            //break serve para que não verifique os próximos cases
            case "subtracao":
                System.out.println("Escreva 1 valor ");
                int valor3= Integer.parseInt(sc.nextLine());
                /* double valorx = Double.parseDouble(sc.nextLine());*/
                //converte String em int e armazena em valor
                System.out.println("Escreva 1 valor ");
                int valor4= Integer.parseInt(sc.nextLine());
                //converte String em int e armazena em valor
                System.out.println("A soma é:" +Calculadora.subtracao(valor3,valor4));
                break;
            default:
                System.out.println("Escreveu opção errada");
                break;
        }
    }
}

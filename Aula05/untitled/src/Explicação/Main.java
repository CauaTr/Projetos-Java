package Explicação;

public class Main {
    public static void main(String[] args) {
        Estatico e = new Estatico();
        e.soma(5);
        System.out.println(e.altera("Estou alterando o valor de texto"));
        Estatico e2 = new Estatico();
        e2.soma(55);
        //variavel resultado é static
        //é da classe
        System.out.println(Estatico.resultado);
        System.out.println(e2.altera("Estou"));
    }
}

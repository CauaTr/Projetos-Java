
public class Main {
    public static void main(String[] args) {
        //Alunos receberem 2 notas e essas notas devem ser positivas
        // se o aluno receber uma nota negativa ou > do que 10 atribuir o valor 0
        Nota henrique = new Nota(-2,11);//quando gerei pelo construtor
        henrique.setNota1(7); // alterei quando quis
        henrique.setNota2(-3);
        System.out.println(henrique.getNota1());
        System.out.println(henrique.getNota2());
        henrique.calculoMedia();//reuso do código
    }
}
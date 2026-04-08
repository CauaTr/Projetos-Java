package RevisãoComposição;

public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Artur","123141","rua24324","(11)99523-5254","(11)9954-5534");

        System.out.println(pessoa.getTelefoneComercial());

        pessoa.setTelefone(new Telefone("(11)99807-4356","(11)99560-4623"));

        System.out.println(pessoa.getTelefone().getTelefoneComercial());
    }
}
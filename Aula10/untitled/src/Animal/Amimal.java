package Animal;

public class Amimal extends Mamifero{
    protected String nome;
    protected int idade;
    protected Habitat habitat;

    protected Amimal(String nome, int idade, String tipo, double area) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = new Habitat(tipo, area);
    }

    public void emitirSom(){}

}

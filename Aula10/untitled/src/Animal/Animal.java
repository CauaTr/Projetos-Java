package Animal;

public class Amimal{
    protected String nome;
    protected int idade;
    protected Habitat habitat;

    protected Amimal(String nome, int idade, String tipo, double area) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = new Habitat(tipo, area);
    }

    public void emitirSom(){
        System.out.println("Som");
    }

    public String getInfo(){
        return "Nome: " + nome + "\nIdade: " + idade + "\n" + habitat.getDescricao();
    }

}

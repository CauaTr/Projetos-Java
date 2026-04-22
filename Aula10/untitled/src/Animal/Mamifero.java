package Animal;

public class Mamifero extends Animal{
    protected int tempoGestacao;

    public Mamifero(String nome, int idade, String tipo, double area, int tempoGestacao) {
        super(nome, idade, tipo, area);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public void amamentar(){}

    @Override
    public String getInfo(){
        return super.getInfo() + "\nTempo de Gestação: " + tempoGestacao;
    }
}

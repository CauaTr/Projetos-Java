public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista(String titulo, int ano, String nome, String nacionalidade, int edicao) {
        super(titulo, ano, nome, nacionalidade);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void folhear(){
        System.out.println("Título da Revista: " + super.getTitulo());
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nEdição: " + edicao;
    }
}

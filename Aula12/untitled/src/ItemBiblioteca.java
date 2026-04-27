public class ItemBiblioteca {
    private String titulo;
    private int ano;
    private Autor autor;

    public ItemBiblioteca(String titulo, int ano, String nome, String nacionalidade) {
        this.titulo = titulo;
        this.ano = ano;
        autor = new Autor(nome, nacionalidade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getInfo(){
        return "Titulo: " + titulo +
                "\nAno: " + ano +
                autor.getInfo();
    }
}

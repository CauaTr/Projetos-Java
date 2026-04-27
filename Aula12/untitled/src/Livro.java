public class Livro extends ItemBiblioteca{
    private int numPaginas;

    public Livro(String titulo, int ano, String nome, String nacionalidade, int numPaginas) {
        super(titulo, ano, nome, nacionalidade);
        this.numPaginas = numPaginas;
    }

    public void Ler(){
        System.out.println("Titulo do Livro: " + super.getTitulo());
    }

    @Override
    public String getInfo(){
        return super.getInfo() +
                "\nNúmero de Páginas: " + numPaginas;
    }
}

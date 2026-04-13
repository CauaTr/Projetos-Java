public class DiscoArmazenamento {
    private String tipo;
    private int capacidadeGB;

    public DiscoArmazenamento(String tipo, int capacidadeGB) {
        this.tipo = tipo;
        this.capacidadeGB = capacidadeGB;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadeGB() {
        return capacidadeGB;
    }

    public void setCapacidadeGB(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }
}

public class CPU {

    //Variáveis
    private String modelo;
    private int nucleo;

    //Construtor
    public CPU(String modelo, int nucleo) {
        this.modelo = modelo;
        this.nucleo = nucleo;
    }

    //Get e Set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleo() {
        return nucleo;
    }

    public void setNucleo(int nucleo) {
        this.nucleo = nucleo;
    }
}

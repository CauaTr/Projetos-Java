package Heranca;

public class Imovel {
    int id;
    String endereco;
    double valor;

    public Imovel(int id, String endereco, double valor) {
        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Imovel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeDados(){
        System.out.println("id: " + id);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + valor);
    }
}

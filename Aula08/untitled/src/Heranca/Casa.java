package Heranca;

public class Casa extends Imovel{
    double terreno;

    public Casa(int id, String endereco, double valor, double terreno){
        super(id,endereco,valor);
        this.terreno = terreno;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Área do Terreno: " + terreno);
    }
}

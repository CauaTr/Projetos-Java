package Explicação;

public class Estatico {
    //Static é variável da classe, não do objeto
    static int resultado = 0;//Conteudo da classe, pode ser chamado mesmo sem a classe ser convocada
    static String texto = "";

    public int soma (int valor){
        resultado = resultado + valor;
        return resultado;
    }

    public String altera (String valor){
        texto = valor;
        return texto;
    }
}

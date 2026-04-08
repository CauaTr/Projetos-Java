public class ManipulaString {
    public static void main(String[] args) {
        String teste = "Henrique Dias Pastor";
        String teste2 = "Henrique DIAs Pastor";
        //Conta a quantidade de elemento, mesmo se o espaço é vazio
        System.out.println(teste.length());

        //Converte todas as escritas para letra minúscula/maiúscula respectivamente
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());

        String a = teste.toLowerCase();
        String b = teste2.toLowerCase();

        //Compara se dois elementos são iguais
        boolean avalia = a.equals(b);
        System.out.println(avalia);

        String textoNovo = "    Henrique Dias Pastor       ";

        //Trata dados do Formulário (remove os espaços antes e depois dos caracteres)
        System.out.println(textoNovo);
        System.out.println(textoNovo.trim());

        String nome = "Henrique Dias Pastor";

        //Extrai uma parte da String de (tal posição) até (outra posição)
        String abc = nome.substring(0,8);
        System.out.println(abc);

        //Substitui partes da String
        System.out.println(nome.replace("Dias", "D."));

        //Verifica se a informação está dentro da String (espaços fazem diferença)
        boolean esta = nome.contains("Henrique");
        System.out.println(esta);

        //Verifica se a String inicia/termina (ou começa/finaliza a partir de uma certa posição) com o caracter informado
        System.out.println(nome.startsWith("D", 9));
        System.out.println(nome.endsWith("N"));

        String nomes = "Henrique, Pedro, Henrique, Paulo, Wilson";

        //Verifica em que posição a (1ª, 2ª, 3ª...) instância do elemento aparece na frase (-1 significa que não existe)
        System.out.println(nomes.indexOf("Henrique", 2));
    }
}

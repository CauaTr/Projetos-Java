public class Utilidades {
    void mostrarMensagem(){
        System.out.println("Bem-vindo(a) ao programa!");
    }
    void exibirProduto(String nome, double preco, int quantidade){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: " + (preco*quantidade));
    }
    void mostrarAluno(String nome, double data){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota do aluno: " + data);
    }
    void  mostrarAreaRetangulo(double base, double altura){
        System.out.println("A área do retangulo é: " + (base*altura));
    }
}

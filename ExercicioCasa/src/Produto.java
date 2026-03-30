public class Produto {
    String nome;
    double valor;
    int quantidade;

    Produto(String nome,double valor,int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    Produto(){
    }

    void mostrarProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total em Estoque: " + (valor*quantidade));
    }

    void alterarNome(String novoNome){
        nome = novoNome;
    }

    void alterarValor(double novoValor){
        valor = novoValor;
    }

    void alterarQuantidade(int novaQuantidade){
        quantidade = novaQuantidade;
    }
}


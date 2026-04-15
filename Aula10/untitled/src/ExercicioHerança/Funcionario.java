package ExercicioHerança;

public class Funcionario extends Pessoa{
    private int registro;


    public Funcionario(String nome, int cpf, int registro) {
        super(nome, cpf);
        this.registro = registro;
    }

    public void printInformacoes(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Número de Registro: " + registro);
    }
}

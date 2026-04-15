package ExercicioHerança;

public class Supervisor extends Funcionario{
    private String departamento;


    public Supervisor(String nome, int cpf, int registro, String departamento) {
        super(nome, cpf, registro);
        this.departamento = departamento;
    }

    @Override
    public void printInformacoes(){
        System.out.println("Departamento: " + departamento);
    }
}

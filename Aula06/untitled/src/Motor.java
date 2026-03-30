public class Motor {
    private int potencia;
    private int numero;

    //Se eu quero inicializar na construição do objeto
    public Motor(int potencia, int numero){
        this.potencia = potencia;
        this.numero = numero;
    }


    //Construtor padrao uma vez alterei o construtor inicial
    public Motor(){}

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
    }

    public void mostraMotor(){
        System.out.println("Potência: " + potencia);
        System.out.println("Número Motor: " + numero);
    }
}

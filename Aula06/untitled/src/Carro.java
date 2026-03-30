public class Carro {
    String modelo;
    Motor motor; //Motor é uma variável global, mas é um objeto


    public Carro (String modelo, int potencia, int numero){
        this.modelo = modelo;
        this.motor = new Motor(potencia, numero);
    }

    public Carro (){}

    public void mostraCarro(){
        System.out.println("Modelo: " + modelo );
        motor.mostraMotor();
    }

    public void setPotencia(int potencia){
        motor.setPotencia(potencia);
    }

    public int getPotencia(){
        return motor.getPotencia();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
}
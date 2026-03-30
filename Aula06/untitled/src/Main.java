public class Main {
    public static void main(String[] args) {
    Carro c = new Carro("abc", 100, 5);
    c.mostraCarro();
    Motor m = new Motor(1000, 2);
    c.setMotor(m);
    c.setMotor(new Motor(1333, 34));
    c.mostraCarro();
    }
}

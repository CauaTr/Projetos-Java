package Animal;

public class Habitat {
    protected String tipo;
    protected double area;

    public Habitat() {
    }

    public Habitat(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDescricao() {
        return "Tipo: " + tipo + "\nÁrea: " + area;
    }
}

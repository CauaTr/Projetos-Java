public abstract class Exemplo {
    int a;
    double b;

    Exemplo(int a){
        this.a = a;
    }

    Exemplo(double b){
        this.b = b;
    }

    Exemplo(double z, int y){
        this.z = z;
        this.y = y;
    }

    Exemplo(){

    }

    Exemplo(int z, double y){
        this.b = y;
        this.a = z;
    }

    public abstract void getInfo();
    //Não tem implementação
    //O filho tem que implementar

    public abstract void getA();

    public double soma(int a, int b){ //2 parâmetros
        return a+b;
    }

    public double soma (int a, int b, int c){ //3 parâmetros polimorfismo
        return a+b+c;
    }
    public double soma(double a, double b){//Os tipos dos parâmetros
        return a+b;
    }
    public void soma(int a){//3 parâmetros polimorfismo
        System.out.println(a);
    }

    double x = soma(1,2,3);
    double y = soma(2.0, 3.0);
    double z = soma(2,3);
}

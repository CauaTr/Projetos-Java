public class CalculadoraSimples {
    int num1;
    int num2;

    CalculadoraSimples(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    CalculadoraSimples(){

    }

    int somar (int num1, int num2){
        return num1+num2;
    }

    int subtrair (int num1, int num2){
        return num1-num2;
    }

    int multiplicar (int num1, int num2){
        return num1*num2;
    }

    int dividir (int num1, int num2){
        return num1/num2;
    }
}

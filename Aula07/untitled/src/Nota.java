public class Nota {
    double nota1;
    double nota2;
    //nota1 e nota2 são variáveis globais
    //existem durante o ciclo do objeto
    // se o aluno receber uma nota negativa ou > do que 10 atribuir o valor 0
    //1-quando criamos o objeto
    //2-quando quisermos alterar o valor da nota a qualquer momento

    public Nota(double nota1, double nota2) {
        //quando crio o objeto garanto que a nota é entre 0 e 10
        if (nota1>=0 && nota1<=10) {//entre 0 e 10
            this.nota1 = nota1;
        }else{ //<0 ou > 10
            nota1=0;
        }

        if (nota2>=0 && nota2<=10) {//<10 e >0
            this.nota2 = nota2;
        }else{
            nota2=0;
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        //Caso queira alterar a nota garanto que a nota é entre 0 e 10
        if (nota1>=0 && nota1<=10) {//entre 0 e 10
            this.nota1 = nota1;
        }else{ //<0 ou > 10
            nota1=0;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2>=0 && nota2<=10){ //<10 e >0
            this.nota2 = nota2;
            this.nota1=3;
        }else{
            nota2=0;
        }
    }
    public void calculoMedia(){
        double media = (nota1 + nota2)/2;
        //media existe enquanto está sendo executado o método calculoMedia;
        //media é variável de classe
        if (media>=5 && media <= 7){//if único elemento obrigatório
            System.out.println("R");
        }else if (media>7 && media <= 9){ //else if opcional
            System.out.println("B");
        }
        else if (media>9 && media <= 10){
            System.out.println("MB");
        }
        else{ //else if opcional
            System.out.println("I");
        }

    }
}

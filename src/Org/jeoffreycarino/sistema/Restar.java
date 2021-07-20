
package Org.hanssaravia.sistema;

public class Restar {

    static int valor1;
    static int valor;
    int Valor1;
    int valor2;

    public Restar(int Valor1, int valor2) {
        this.Valor1 = Valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return Valor1;
    }

    public void setValor1(int Valor1) {
        this.Valor1 = Valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int  Eliminacion(int valor1,int valor2){
        return  valor1 - valor2;
}
}
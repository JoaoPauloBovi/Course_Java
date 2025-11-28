package Desafios;

public class DesafioTemperaturaFahrenheit {
    public static void main(String[] args) {

        double Fareheigh = 86;
        final int ajuste  = 32;
        final double divisao = 5.0 / 9.0;

        double celsius = (Fareheigh - ajuste) * 5;


        //  System.out.println((Fareheigh - ajuste * 5) / 9 +"°C");
        System.out.println(celsius / 9 + "°C");

    }
}

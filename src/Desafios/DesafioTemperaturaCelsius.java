package Desafios;

import java.util.Scanner;

public class DesafioTemperaturaCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em °C para conversão? ");
        double numero = entrada.nextDouble();

        double mult = 1.8;
        double ajuste = 32;

        double fahrenheit = (numero * mult) + ajuste;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        entrada.close();

    }
}

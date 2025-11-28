package Desafios;

import java.util.Scanner;

public class DesafioPotencia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O resultado do valor ao quadro: " + quadrado);
        System.out.println("O resultado do valor ao cubo: " + cubo);

        entrada.close();
    }
}

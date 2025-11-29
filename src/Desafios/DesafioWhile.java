package Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double nota = entrada.nextDouble();

        while (nota == -1){
            System.out.println("Você saiu");
        }

        entrada.close();
    }
}

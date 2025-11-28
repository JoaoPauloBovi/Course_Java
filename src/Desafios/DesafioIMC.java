package Desafios;

import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        String peso = entrada.nextLine().replace(",",".");

        System.out.println("Digite a sua altura ");
        String altura = entrada.nextLine().replace(",",".");

        double peso1 = Double.parseDouble(peso);
        double altura1 = Double.parseDouble(altura);

        double imc = peso1 / (altura1 * altura1);

        System.out.printf("Seu IMC: %.2f", imc);

        entrada.close();
    }
}

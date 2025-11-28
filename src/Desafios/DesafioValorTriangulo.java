package Desafios;

import java.util.Scanner;

public class DesafioValorTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        String base1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite a altura do triangulo: ");
        String altura1 = entrada.nextLine().replace(",", ".");;

        Double base = Double.parseDouble(base1);
        Double altura = Double.parseDouble(altura1);

        double area = (base * altura) / 2;

        System.out.println("Área do triangulo: " + area);

        entrada.close();

    }
}

package Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler numero 1
        // Ler numero 2
        // Pedir sinal + - * /
        // Fazer a operação utilizando a operaçao
        // Não pode usar Estruturas de controle !

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite um operador: ");
        String operador = entrada.next();

        System.out.println("Digite outro numero: ");
        double numero2 = entrada.nextDouble();

        double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
        resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
        resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
        resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
        resultado = "%".equals(operador) ? numero1 % numero2 : resultado;

        System.out.printf(" %.2f, %s %.2f = %.2f", numero1, operador, numero2, resultado);

        entrada.close();
    }
}

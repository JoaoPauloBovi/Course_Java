package Fundamentos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        // "do" faz com que o while execute pelo menos 1x
        do{
            System.out.println("diga algo: ");
            System.out.println("quer sair?");
            texto = entrada.nextLine();

        } while (!texto.equalsIgnoreCase("sair"));

        entrada.close();
    }
}

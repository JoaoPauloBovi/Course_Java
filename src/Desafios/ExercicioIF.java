package Desafios;

import java.util.Scanner;

public class ExercicioIF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano que você nasceu: ");
        int nascimento = entrada.nextInt();

        int idade = 2025 - nascimento;

        System.out.println("Sua idade é " + idade);

        if (idade < 16){
            System.out.println("Não vota");

        } else if ((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("Voto é opcional");

        }else {
            System.out.println("Voto é obrigatório");
        }

        entrada.close();
    }
}

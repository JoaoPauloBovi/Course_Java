package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s = new String ("2");
        System.out.println("2" == s);

        // usar o .equals vai comparar o conteúdo / ideal para String
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);
        String s1 = entrada.next();
        // a funçao .trim retira os espaços digitados no console
        System.out.println("2" == s1.trim());

        System.out.println("2".equals( s1.trim()));



        entrada.close();
    }
}

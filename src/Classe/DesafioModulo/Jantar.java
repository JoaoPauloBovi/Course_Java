package Classe.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 90);
        Comida c1 = new Comida("Macarão", 0.200);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c1);

    }
}
package Classe;

public class PessoaExerciseTeste {
    public static void main(String[] args) {

        PessoaExercise p1 = new PessoaExercise();
        p1.nome = "João";
        p1.altura = 1.87;
        p1.peso = 98;

        var p2 = new PessoaExercise();
        p2.nome = "Paulo";
        p2.altura = 1.90;
        p2.peso = 60;

        System.out.println(p2.imc());
        System.out.println(p1.imc());
    }
}

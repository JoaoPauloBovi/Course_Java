package Fundamentos;

public class Ternario {
    public static void main(String[] args) {

        double media = 7;
//        String resultadoParcial = media >= 5 ? "de recuperação" : "reprovado";
//        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
//        System.out.println(" O aluno está " + resultadoFinal);

        String resultadoFinal = media <= 4.0 ?
                "aprovado." : "de recuperação.";
        System.out.println("O aluno esta "+ resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";
        System.out.println("Tem desconto? " + resultado);

    }
}

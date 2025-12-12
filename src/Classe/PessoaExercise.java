package Classe;

public class PessoaExercise {

    String nome;
    double altura;
    double peso;


    Double imc(){
        return peso / (altura * 2);
    }


}


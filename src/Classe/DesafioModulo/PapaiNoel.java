package Classe.DesafioModulo;

public class PapaiNoel {

    String nome;
    double peso;

    PapaiNoel(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void guardar(BolsaDoPapaiNoel guardar){
        this.peso += guardar.peso;
    }

    String pesoDoTreno(){
        return "O Trenó do Papai Noel tem " + this.peso + " kg de presentes para " + nome;
    }
}

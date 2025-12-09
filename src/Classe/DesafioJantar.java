package Classe;

public class DesafioJantar {
    public static void main(String[] args) {

        DesafioPessoa p1 = new DesafioPessoa();
        p1.nome = "João";
        p1.peso = 90;

        DesafioComida c1 = new DesafioComida();
        c1.nomeComida = "Macarrão";
        c1.pesoComida = 0.200;

        c1.engordar(p1.peso * c1.pesoComida);

        System.out.println(c1.engordar(p1.peso));
    }
}

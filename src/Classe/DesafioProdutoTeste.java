package Classe;

public class DesafioProdutoTeste {
    public static void main(String[] args) {

        DesafioProduto p1 = new DesafioProduto();
            p1.nome ="Tv";
            p1.preco = 1000;

            var p2 = new DesafioProduto();
            p2.nome = "Mouse";
            p2.preco = 120;

            var p3 = new DesafioProduto();
            p3.nome = "Teclado";
            p3.preco = 200;

            DesafioProduto.desconto = 0.50;

        System.out.println("Valor da Tv com desconto R$" + p1.precoDesconto());
        System.out.println("Valor do Mouse com desconto R$" + p2.precoDesconto());
        System.out.println("Valor do Teclado com desconto R$" + p3.precoDesconto());

    }

}

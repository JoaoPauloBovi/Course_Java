package Classe.DesafioModulo;

public class Treno {
    public static void main(String[] args) {

        PapaiNoel papai = new PapaiNoel("João", 150);
        BolsaDoPapaiNoel bolsa = new BolsaDoPapaiNoel("presentes do joao" ,200);

        papai.guardar(bolsa);
        System.out.println(papai.pesoDoTreno());
        papai.guardar(bolsa);
        System.out.println(papai.pesoDoTreno());
    }
}

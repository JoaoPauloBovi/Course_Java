package Fundamentos;

public class WhileDeterminado {
    public static void main(String[] args) {

        int contador = 0;
        while (contador <= 10){
            System.out.printf("i = %d\n", contador);
            contador++;
            //contador = contador + 1 ;
        }

        int cc = 0;
        while (cc <= 5){
            System.out.println("Cambalhota" + cc);
            cc++;
        }

        //continue
        int cc1 = 0;
        while (cc1 <= 5) {
            cc1++;
            if (cc1 == 1 || cc1 == 3){
                continue;
            }
            System.out.println("Cambalhota " + cc1);
        }

        // break
        int cc2 = 0;
        while (cc2 <= 10) {
            cc2++;
            if (cc2 == 1 || cc2 == 3){
                continue;
            } if (cc2 == 7){
                break;
            }
            System.out.println("Cambalhota " + cc2);
        }
    }
}

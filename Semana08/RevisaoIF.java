
import java.util.Scanner;

public class RevisaoIF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inteiros;
        Integer n2;

        float numerosDecimais;
        double muitaPrecisao;

        boolean vOuF;

        // byte short long

        char letra = 'a';

        String texto = "A";


        int valor = 15;

        // if (condicao for satisfeita) { executa }
        if ( valor >= 18) {

        }

        if (valor < 18) {

        }


        if (valor >= 18) {

        } else {

        }

        System.out.println("Digite um valor");
        valor = in.nextInt();

        if (valor < 10) {
            // logica caso o valor seja menor a 10
        } else if (valor < 15) {
            // menor que 15
        } else if (valor < 18) {
            // menor que 18
        } else {
            // caso contrario de TODOS os outros ifs
        }

        String cor = in.next();
        // indique se é uma cor RGB

        if (cor.equals("red") || cor.equals("green") || cor.equals("blue")) {
            System.out.println("EH RGB");
        } else {
            System.out.println("NAO");
        }

        /*
            comparando char 
                ==       pq é um tipo primitvo

            comparando String
                .equals  pq STRING é uma CLASSE java

        */


    }
}
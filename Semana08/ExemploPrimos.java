
/*
 Dado um valor inteiro inputado pelo usuairo, identificar se é primo ou nao
 
 Número primo é um numero divisivel apenas por 1 e por ele mesmo

*/

import java.util.Scanner;

public class ExemploPrimos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        int divisor = 1;
        int cont = 0;

        while ( divisor <= numero ) {
            // vou tentar dividir
            int resto = numero % divisor;
            if (resto == 0) {
                System.out.println("Numero divisivel por " + divisor);
                cont++;
            }
            divisor++;
        }

        if (cont == 2) {
            System.out.println(".. é primo");
        } else {
            System.out.println(".. NAO primo");
        }
    }

}
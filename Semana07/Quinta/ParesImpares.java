import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;
        int cont = 0;
        int pares = 0;
        int impares = 0;

        while (cont < 10) {
            num = in.nextInt();
            if (num % 2 == 0) {
                System.out.println("PAR");
                pares++;    // pares = pares + 1;
            } else {
                System.out.println("IMPAR");
                impares++;
            }

            cont++;
        }

        System.out.println("pares " + pares);
        System.out.println("impares " + impares);
    }
}
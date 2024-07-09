import java.util.Scanner;

public class For02 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int valorInicial = in.nextInt();
        int valorFinal = in.nextInt();

        int divisor = in.nextInt();


        for (int i = valorInicial; i <= valorFinal; i++) {
            System.out.println("TESTANDO " + i);
            if (i % divisor == 0) {
                System.out.println("i " + i );
            }
        }

    }
}
import java.util.Scanner;

public class For03 {

    public static void main (String[] args) {
        // MOSTRAR OS 10 PRIMEIROS ELEMENTOS DE UMA PA (progressao aritmetica) COMEÇANDO EM X, COM RAZAO Y;
        // x = 10; y = 2;
        // 10, 12, 14, 16, 18, 20, 22, 24, 26, 28
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        // for (int n = 0; n < 10; n++) {
        //    System.out.prinln(x);
        //    x = x + y;
        // }

        for ( ; x <= x + y * 10; x = x + y) {
            System.out.println(x);
        }

    }
}
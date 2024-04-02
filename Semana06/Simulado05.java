import java.util.Scanner;

public class Simulado05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2, n3;
        int q1, q2, q3, saque; 
        /*
            n1 2
            n2 10
            n3 50

            sacar 138

            2 x 50         138 / 50 = 2
                           138 % 50 = 38

            3 x 10          38 / 10 = 3
                            38 % 10 = 8

            4 x 2           8 / 2 = 4    
        */

        System.out.println("Informe os valores das notas disponiveis e o valor do saque");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        saque = in.nextInt();

        q3 = saque / n3;
        saque = saque % n3;

        q2 = saque / n2;
        saque = saque % n2;

        q1 = saque / n1;


        System.out.printf("%d x R$ %d,00\n", q1, n1);
        System.out.printf("%d x R$ %d,00\n", q2, n2);
        System.out.printf("%d x R$ %d,00\n", q3, n3);

    }
}
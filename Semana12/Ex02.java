import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        int div3 = 0;
        int div5 = 0;
        int div35 = 0;

        for (int i = 0; i < 10; i++) {
            valor = in.nextInt();
            
            if (valor % 3 == 0) {
                div3++;
            }

            if (valor % 5 == 0) {
                div5++;
            }

            if (valor % 3 == 0 && valor % 5 == 0) {
                div35++;
            }

        }
        System.out.println("DIVIVEIS POR 3: " + div3);
        System.out.println("DIVIVEIS POR 5: " + div5);
        System.out.println("DIVIVEIS POR 3 e 5: " + div35);
    }
}



import java.util.Scanner;

public class Variavel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;

        int cont = 0;
        while (cont < 5){
            if (cont == 0) {
                menor = 10;
            }
            cont++;
        }

        System.out.println("MENOR " + menor);
    }
}
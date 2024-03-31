
import java.util.Scanner;

public class TrocaAsVezes {

    // FACA UM PROGRAMA QUE LEIA 2 VARIAVEIS, A e B e troque o valor delas caso o valor A > B
    // E MOSTRE A e B NO FINAL

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, aux;
        a = in.nextInt();
        b = in.nextInt();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }


        System.out.println(a + " " + b);
    }
}
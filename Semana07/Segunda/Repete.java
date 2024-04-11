import java.util.Scanner;

public class Repete {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;

        while (x < 5) {
            // executa aqui quando a condicao for true
            System.out.println("OI VC! " + x);
            x++;    // x = x + 1
        }
        // quando for false, segue a execucao do codigo..
        
        // mostrar os numeros de 10 a 1 (contagem   regressiva)
        x = 10;
        while (x > 0) {
            System.out.println("X " + x);
            x--;
        }

        // mostrar os numeros pares de 0 a 20
        x = 0;
        while (x <= 20) {
            System.out.println("X " + x);
            x = x + 2;
        }


        x = 0;
        while (x <= 20) {
            if (x % 2 == 0)
                System.out.println("X " + x);

            x++;
        }


        // mostrar os numeros que sao multiplos de 3 em um intervalo [a, b] escolhido pelo usuario
        a = in.nextInt();
        b = in.nextInt();

        while (a <= b) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }


        // mostrar os numeros que sao multiplos de 5 em um intervalo [a, b] escolhido pelo usuario

        // mostrar os numeros de 1 a 100.. quando o numero for multiplo de 3, mostrar a palavra FIZZ, quando for multiplo de 5, mostrar a palavra BUZZ, se for multiplo de 3 e 5, mostrar a palavra FIZZBUZZ.

    }
}
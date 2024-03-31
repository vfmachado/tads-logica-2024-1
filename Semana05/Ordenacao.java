/*
    FACA UM PROGRAMA QUE LEIA 3 VALORES E MOSTRE ELES DE MANEIRA ORDENADA

    POR EXEMPLO:    
    entrada     5   2    7
    saida       2   5    7

    entrada     1   2    7
    saida       1   2    7

    entrada     3   2   1
    saida       1   2   3
*/

import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c;
        int menor, meio, maior;

        System.out.println("Informe os 3 numeros");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();


        // && => operador "E" verifica se ambas condicoes são verdadeiras
        if (a < b && a < c) {
            if (b < c) {
                // a b c
                System.out.println(a + " " + b + " " + c);
                menor = a;
                meio = b;
                maior = c;
            } else {
                // a c b
            }
        }

        if (b < c && b < a && a < c) {
            // b a c
        }
        if (b < c && b < a && c < a) {
            // b c a
        }

        // repetir para o "c a b" e "c b a"


        System.out.printf("%d %d %d\n", menor, meio, maior);
    }
}
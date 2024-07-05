/*

CALCULAR A MEDIA ENTRE 8 VALORES, SEM CONSIDERAR O MENOR E O MAIOR DOS VALORES DIGITADOS.

1 7 7 7 7 7 7 10


*/

import java.util.Scanner;

public class ExercicioMedia {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int contador = 0;
        float valor, media = 0;

        float menor = 0;
        float maior = 0;
        while (contador < 8) {
            System.out.println("REPETINDO " + contador);
            System.out.println("Informe um valor");
            valor = in.nextFloat();

            if (contador == 0 || valor < menor) {
                menor = valor;
            }

            if (contador == 0 || valor > maior) {
                maior = valor;
            }

            media = media + valor;

            contador++;
        }

        System.out.println("SOMA TOTAL " + media);
        media = media - menor - maior;
        media = media / 6;
        System.out.println("MEDIA " + media);

        System.out.println("MENOR " + menor);
        System.out.println("MAIOR " + maior);
    }
}
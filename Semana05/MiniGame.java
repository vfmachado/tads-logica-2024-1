/*

    FACA UM PROGRAMA EM JAVA QUE RECEBA A PONTUACAO DE DUAS CARTAS, ATAQUE E DEFESA RESPECTIVAMENTE.

    O PROGRAMA DEVE SORTEAR UM VALOR (0 PARA ATAQUE / 1 PARA DEFESA) E DIZER QUAL A CARTA GANHADORA.

    PARA SORTEAR UM VALOR VC IRÁ UTILIZAR A CLASSE RANDOM

*/

import java.util.Scanner;
import java.util.Random;

public class MiniGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int valorAleatorio = aleatorio.nextInt(2); // 0 a 1
        final int ATAQUE = 0;
        final int DEFESA = 1;

        // int valorAleatorio = aleatorio.nextInt(10); // 0 a 9
        // int valorAleatorio = aleatorio.nextInt(6) + 5; // 5 a 10
        System.out.println("VALOR SORTEADO " + valorAleatorio);


        int carta1Atq, carta1Def, carta2Atq, carta2Def;
        System.out.println("Informe os atributos atq/def das duas cartas");

        carta1Atq = in.nextInt();
        carta1Def = in.nextInt();
        carta2Atq = in.nextInt();
        carta2Def = in.nextInt();

        int vencedor = 0;


        if (valorAleatorio == ATAQUE) {
            System.out.println("ATAQUE FOI SORTEADO");
            if (carta1Atq > carta2Atq) {
                vencedor = 1;
            } else if (carta2Atq >  carta1Atq) {
                vencedor = 2;
            } 
        }

         if (valorAleatorio == DEFESA) {
            System.out.println("DEFESA FOI SORTEADO");
            if (carta1Def > carta2Def) {
                vencedor = 1;
            } else if (carta2Def > carta1Def) {
                vencedor = 2;
            } 
        }

        if ( vencedor == 0) {
            System.out.println("EMPATE");
        } else {
            System.out.println("CARTA " + vencedor + " GANHOU");
        }


    }
}
/*

(Peso 2,0) Escreva um programa que leia um valor inteiro n > 0 e desenhe na tela
um triângulo com asteriscos (*) que possua a quantidade de linhas n.
Exemplo: n=3
*****
 ***
  *

*/

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int inicioAsteriscos = n * 2 - 1;
        for (int linha = 0; linha < n; linha++) {
            for (int asteriscos = inicioAsteriscos; asteriscos > 0; asteriscos--) {
                System.out.print("*");
            }
            inicioAsteriscos = inicioAsteriscos - 2;
            System.out.println();
        }

    }
}
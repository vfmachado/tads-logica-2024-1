// faça um programa que fique em um laco de repeticao até que seja digitado uma posicao invalida para o vetor; o programa deve iniciar um vetor de 20 posicoes com valores aleatorios e, durante a execucao do laço, solitica ao usuario duas posicoes e troca os valores de posicao.
/*
    10      40          50      20      30 

    0 1
    40      10      50      20      30
    -1 0    // encerro o programa
    
    import java.util.Random;
    Random r = new Random();
    for (int i = 0; i < 20; i++) 
        v[i] = r.nextInt(20);
 */

 // FAÇA UM PROGRAMA QUE CONSTRUA UM TRIANGULO DA PASCAL DE N LINHAS, ONDE N É A ALTURA DO TRIANGULO DIGITADA PELO USUARIO
 /*
    1   1
    1   2   1
    1   3   3   1
    1   4   6   4   1
  */

  // FAÇA UM PROGRAMA QUE ORDENE UM VETOR =)

import java.util.Random;
import java.util.Scanner;

public class TrocaVetor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int [] v = new int[20];

        System.out.print("v = [ ");
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(20);
            System.out.print(v[i] + "  ");
        }
        System.out.println("]");

        while (true) {
            System.out.println("informe duas posicoes");
            int posicao1 = in.nextInt();
            int posicao2 = in.nextInt();
            
            if (posicao1 < 0 || posicao1 >= 20) break;
            if (posicao2 < 0 || posicao2 >= 20) break;

            int a = v[posicao1];
            v[posicao1] = v[posicao2];
            v[posicao2] = a;
            
            System.out.print("v = [ ");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");
            }
            System.out.println("]");
        }
    }
    



}
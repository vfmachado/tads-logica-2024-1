import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] vetor = new int[5];  // posicoes de 0 a 4

        // dentro dos colchetes é posicao
        // nome do vetor + posicao = um valor
        vetor[0] = 10;    

        vetor[0] = 5;
        vetor[1] = 5;
        vetor[2] = 5;
        vetor[3] = 5;
        vetor[4] = 5;


        int v2 [] = new int[10];
        // posicao 0 o valor 0, na posicao valor 1, 2 2, 3, 3
        v2[0] = 0;
        v2[1] = 1;
        v2[2] = 2;
        v2[3] = 3;
        v2[4] = 4;

        for (int i = 0; i < 10; i++) {
            v2[i] = i * 10;
        }
        
    }
}

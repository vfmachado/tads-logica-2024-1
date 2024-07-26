import java.util.Scanner;

public class Vetores03 {
    public static void main(String[] args) {

        // FAÇA UM PROGRAMA QUE ENQUANTO O USUARIO DIGITAR UMA POSICAO VALIDA PARA UM VETOR, PERMITE QUE O USUÁRIO DIGITE UM VALOR PARA ESTA POSICAO.
        // A CADA MODIFICAÇÃO, O VETOR DEVE SER MOSTRADO.
        // O TAMANHO DO VETOR É ESCOLHIDO PELO USUÁRIO

        /*
         tam 5;

        2 5
        0 0 2 0 0

        0 10
        10 0 2 0 0 

        4 -6
        10 0 2 0 -6

        0 5
        5 0 2 0 -6

        1 7
        5 7 2 0 -6

        -1
        o programa encerrou =)

         */
        Scanner in = new Scanner(System.in);
        int [] vetor;
        int tamanho;

        System.out.println("Informe o tamanho do vetor");
        tamanho = in.nextInt();
        vetor = new int[tamanho];

        while (true) {
            int posicao, valor;
            System.out.println("\ninforme uma posicao e um valor");

            posicao = in.nextInt();
            
            if (posicao < 0 || posicao >= tamanho) {
                System.out.println("POSICAO INVALIDA");
                
                System.out.println("Deseja continuar (y/n)?");
                char resposta = in.next().charAt(0);
                if (resposta == 'n') break;
                else continue;
                
            }
                
            valor = in.nextInt();
            vetor[posicao] = valor;

            // mostrar o vetor
            System.out.print("[ ");
            for (int i = 0; i < tamanho; i ++) {
                System.out.print(vetor[i] + "  ");
            }
            System.out.println("]");
        }
    }
}

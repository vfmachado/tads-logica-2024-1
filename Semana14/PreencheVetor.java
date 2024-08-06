import java.util.Scanner;

public class PreencheVetor {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracao do vetor
        int [] v;

        // inicializacao com tamanho 10
        v = new int[10];

        // exemplo de declaracao com inicializacao
        // int [] v2 = {10, 20, 30, 40, 50, 60};

        while (true) {

            System.out.println("INFORME UMA POSICAO E UM VALOR");
            int posicao = in.nextInt();
            int valor = in.nextInt();

            if (posicao >= 0 && posicao < v.length) {
                v[posicao] = v[posicao] + valor;
            } else {
                System.out.println("POSICAO INVALIDA.");
            }

            // v.length => tamanho de vetor
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");
            }
            System.out.println();

        }
    }


}

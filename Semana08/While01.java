
import java.util.Scanner;

// FATORIAL
// FAÇA UM PROGRAMA QUE MOSTRE OS VALORES DE 1 ATÉ N (INCLUSIVO) (N É ESCOLHIDO PELO USUARIO)
// CALCULE A MULTIPLICAÇÃO ENTRE TODOS OS VALORES

public class While01 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int cont = 1;
        int mult = 1;

        while (cont <= N) {
            System.out.println("CONT " + cont);
            mult = mult * cont;
            cont++;
        }

        System.out.println("FATORIAL " + fat);

    }
}

// FIBONACCI
// FAÇA UM PROGRAMA QUE LEIA UM VALOR N QUE INDIQUE QUANTOS VALORES DA SEQUENCIA DE FIBONACCI SERÃO MOSTRADOS PARA O USUÁRIO
// 1 1 2 3 5 8 13 21
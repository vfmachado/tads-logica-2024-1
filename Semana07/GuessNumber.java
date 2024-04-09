import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(20) + 1;

        int escolhido  = in.nextInt();
        int tentativas = 1;

        while (tentativas < 5 && escolhido != sorteado) {
            
            System.out.println("Errou, tente outro!");
            tentativas++;
            // if (escolhido < sorteado) {
            //     System.out.println("Tente mais alto");
            // } else {
            //     System.out.println("Tente menor");
            // }
            escolhido = in.nextInt();
        }

        if (escolhido == sorteado)
            System.out.println("ACERTOU EM " + tentativas + " TENTATIVAS");
        else
            System.out.println("SEM SORTE.. o NUMERO ERA " + sorteado);
    }
}
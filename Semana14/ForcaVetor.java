import java.util.Scanner;

public class ForcaVetor {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
        Scanner in = new Scanner(System.in);
        char[] palavra = args[0].toCharArray();
        boolean[] acertos = new boolean[palavra.length];
        int vidas = 3;
        while (vidas > 0) {

            System.out.println("CHUTE UMA LETRA");
            char letra = in.next().charAt(0);

            boolean tem = false;
            for (int i = 0; i < palavra.length; i++) {
                // char letraAtual = palavra[i];
                // if (letra == letraAtual) {
                if (letra == palavra[i]) {
                    System.out.println("PARABENS TEM ESSA LETRA NA POSICAO " + i);
                    acertos[i] = true;
                    tem = true;
                } 
            }

            if (!tem) {
                System.out.println("ERRROOOUUUU ");
                vidas--;
            }

            int quantidadeAcertos = 0;
            for (int i = 0; i < palavra.length; i++) {
                if (acertos[i]) {
                    quantidadeAcertos++;
                    System.out.print(palavra[i] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();

            if (quantidadeAcertos == palavra.length) {
                break;
            }
        }

        if (vidas > 0 ) {
            System.out.println("VC GANHOU!");
        } else {
            System.out.println("PERDEU E A PALAVRA ERA " + args[0]);
        }

    }
}

import java.util.Scanner;

public class Simulado06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int j1Numero1, j1Numero2, pontuacao;
        String j1Naipe1, j1Naipe2;

        System.out.println("Numero e naipe das cartas compradas");
        j1Numero1 = in.nextInt();
        j1Naipe1 = in.next();

        j1Numero2 = in.nextInt();
        j1Naipe2 = in.next();

        // comparacao de textos é com equals
        // 'a' == 'a'  (char)
        // "a".equals("a")  (string)
        if (j1Naipe1.equals(j1Naipe2)) {
            
            // 10 e 11  (11 - 10  = 1) (seq)
            // 2 e 5     (5 - 2  = 3)
            // 4 e 3   (4 - 3 = 1) (seq)
            if (j1Numero2 - j1Numero1 == 1 ||  j1Numero1 - j1Numero2 == 1) {
                pontuacao = j1Numero1 * j1Numero2;
            } else {
                if (j1Numero1 > j1Numero2) {
                    pontuacao = j1Numero1;
                } else {
                    pontuacao = j1Numero2;
                }
            }
        } else {
            
            if (j1Numero2 - j1Numero1 == 1 ||  j1Numero1 - j1Numero2 == 1) {
                pontuacao = j1Numero1 + j1Numero2;
            } else {

                if (j1Numero1 > j1Numero2) {
                    pontuacao = j1Numero1 - j1Numero2;
                } else {
                    pontuacao = j1Numero2 - j1Numero1;
                }

            }
        }

        if (j1Numero1 == j1Numero2) {
            pontuacao = j1Numero1 * j1Numero2;
        }

        System.out.println("PONTUACAO DO PRIMEIRO JOGADOR " + pontuacao);
    }
}
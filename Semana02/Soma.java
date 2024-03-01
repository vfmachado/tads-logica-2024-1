import java.util.Scanner;

// ALTERE O CODIGO FONTE ABAIXO PARA RECEBER 2 VALORES DO USUARIO
// E MOSTRAR O RESULTADO DA SOMA E DA DIFERENÇA ENTRE ESSES VALORES
public class Soma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1, v2, soma; // varias variaveis na mesma linha desde que do mesmo tipo
        int diferenca;

        System.out.println("Digite dois valores");

        // nextInt() => indica que o usuario vai digitar um valor inteiro
        v1 = in.nextInt();
        v2 = in.nextInt();
        
        soma = v1 + v2;
        diferenca = v1 - v2;

        System.out.println("SOMA = " + soma);
        System.out.println("DIF  = " + diferenca);

    }
}
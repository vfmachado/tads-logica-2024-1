import java.util.Scanner;

public class Simulado07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();

        int ultDigito, invertido; 

        // DICA: COMO PEGAR O ÚLTIMO DIGITO?
        // 1234     4

        ultDigito = numero % 10;        // 1234 % 10 = 4
        invertido = ultDigito;          // 4

        numero = numero / 10;           // 123

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);


        ultDigito = numero % 10;        // 123 % 10 = 3 
        invertido = invertido * 10 + ultDigito;     // 4 * 10 + 3       40 + 3 = 43
        numero = numero / 10;       // 123 / 10 = 12

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

        ultDigito = numero % 10;
        invertido = invertido * 10 + ultDigito;
        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

        ultDigito = numero % 10;
        invertido = invertido * 10 + ultDigito;
        numero = numero / 10;

        System.out.println("INVERTIDO " + invertido);
        System.out.println("NUMERO " + numero);

    }
}
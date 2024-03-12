import java.util.Scanner;

public class ExScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, ires;
        float f1, f2, fres;
        double d1, d2, dres;
        String palavra;
        char caracter;
        boolean booleano;

        System.out.println("INFORME 2 NUMEROS INTEIROS");
        n1 = in.nextInt();
        n2 = in.nextInt();

        System.out.println("INFORME 2 NUMEROS FLOAT");
        f1 = in.nextFloat();
        f2 = in.nextFloat();

        System.out.println("INFORME 2 NUMEROS DOUBLE");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        System.out.println("Informe true ou false");
        booleano = in.nextBoolean();

        System.out.println("Informe uma palavra e uma letra");
        palavra = in.next();

        // primeira letra de uma String
        caracter = in.next().charAt(0);

        // forçando uma conversao de tipos
        int letraNum = (int) caracter;

        int eraDouble = (int) d1;
    }
}
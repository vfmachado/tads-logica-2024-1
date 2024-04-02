import java.util.Scanner;

public class Simulado04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        // a == b && a == c

        // ESTA INCORRETO DIZER
        // A == B == C => ISSO NAO FUNCIONA!!!
        // O OPERADOR == FUNCIONA COM DOIS OPERANDOS (UM DE CADA LADO)

        System.out.println("Informe os lados do triangulo"); 
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b && a == c) {
            System.out.println("EQUILATERO");
        } else if (a == b || a == c || b == c) {
            System.out.println("ISOSCELES");
        } else {
            System.out.println("ESCALENO");
        }

    }
}
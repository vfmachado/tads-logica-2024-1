import java.util.Scanner;

public class DivisivelPor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        // a é par ?
        boolean par = a % 2 == 0;

        // a é ímpar?
        // boolean impar = a % 2 == 1;
        boolean impar = !par;

        // a é multiplo de 5 ?
        boolean mul5 = a % 5 == 0;

        // a é multiplo de 3 ?
        boolean mul3 = a % 3 == 0;

        // a é multiplo de 3 e de 5?
        // boolean  mul35 = mul5 && mul3;
        // boolean  mul35  = a % 5 == 0 && a % 3 == 0;
        boolean mul35 = a % 15 == 0;


        // a é divisor de 100? 
        boolean div100 = 100 % a == 0;


        // quero saber se o ano é um ano bissexto
        int ano = 2024;
        boolean bissexto = ano % 4 == 0  && ano % 100 != 0;

        if (bissexto) {
            
        }


        float preco = 19.9f;
        
        // hoje é dia de promoção e vc nao paga os centavos
        // preco que deveria pagar é 19

        int precoInt = (int) preco;
        
        int idade1 = 32, idade2 = 31;
        int divisao = 2;
        float media = (float)(idade1 + idade2) /divisao;
        System.out.println("MEDIA IDADES " + media);

    }
}

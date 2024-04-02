import java.util.Scanner;

public class Simulado01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            valor Ingresso      100 

            quantidade socios   10         10 * 100 * 0.7       10 * 100 - 10 * 100 * 0.3
                desconto (1 - x)
                acrescimento (1 + acresc)

                por exemplo: 
                    30% de desconto
                        1 - 30%
                        30% = 30/100 = 0.3
                        1 - 0.3
                        0.7

                    acrescimo de 10%
                    1 + 10/100 = 1.1

            quantidade criancas 5          0

            quantidade normal   20      20 * 100

            publico total 10 + 5 + 20
            renda total 10 * 100 * 0.7   +  20 * 100
            valores que deixaram de ser arrecadados     5 * 100 * 10 * 100 * 0.3
        */
        int socios, criancas, pagantes;
        float ingresso;

        int publicoTotal;
        float rendaTotal, rendaNaoArrecadada;

        System.out.println("Informe o valor do ingresso, quantidade de socios, criancas e pagantes");

        ingresso = in.nextFloat();
        socios = in.nextInt();
        criancas = in.nextInt();
        pagantes = in.nextInt();

        publicoTotal = socios + criancas + pagantes;
        rendaTotal = socios * ingresso * 0.7f + pagantes * ingresso;
        rendaNaoArrecadada = criancas * ingresso + socios * ingresso * 0.3f;

        System.out.println("PUBLICO TOTAL " + publicoTotal);
        System.out.println("RENDA TOTAL " + rendaTotal);
        System.out.println("RENDA NAO ARRECADADA " + rendaNaoArrecadada);


    }
}
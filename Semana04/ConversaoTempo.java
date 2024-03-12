/*
FAÇA UM PROGRAMA QUE RECEBA UM TEMPO EM SEGUNDOS E CONVERTA PARA O FORMATO
    HH:mm:ss
*/

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int segundos, hh, mm, ss, resto;
        
        System.out.println("ME INFORME O TEMPO EM SEGUNDOS");
        segundos = in.nextInt();

        hh = segundos / 3600;
        resto = segundos % 3600;

        mm = resto / 60;
        ss = resto % 60;

        System.out.println("HORAS: " + hh);
        System.out.println("MINUTOS: " + mm);
        System.out.println("SEGUNDOS: " + ss);

        System.out.printf("\n\t %02d : %02d : %02d\n\n", hh, mm, ss );
        /*
        %d => int
            %02d      formata o numero para aparecer com "2 casas"

        %f => float / double
            %.2f      formata para duas casas decimais

        %s => string
        */

        
    

    }
}
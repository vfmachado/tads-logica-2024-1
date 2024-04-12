

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, menor = -999999; /// qualquer valor
        int cont = 0;

        // QUEREMOS GARANTIR QUE A CONDICAO SERÁ INICIALMENTE VERDADEIRA
        while (cont < 5) { // repeticao determinada

            System.out.println("VALOR:  ");
            valor = in.nextInt();

            if (cont == 0) {
                menor = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
            
            // DENTRO DO WHILE PRECISA DE ALGO QUE MODIFIQUE OS VALORES UTILIZADOS NA CONDICAO PARA GARANTIR QUE IRA SAIR/TERMINAR O LACO
            cont++;

        }

        System.out.println("MENOR VALOR DIGITADO " + menor);
        // while (valor >= 0) {    // repeticao nao determinada
        //     valor = in.nextInt();
        // }
    }
}
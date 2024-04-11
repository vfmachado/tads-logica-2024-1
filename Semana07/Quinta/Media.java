/*
    1. FACA UM PROGRAMA QUE CALCULE A MEDIA ARITMETICA SIMPLES ENTRE 5 VALORES DIGITADOS PELO USUARIO
 
        - nao devem ser declaradas 5 variaveis de valor, ja aprendemos a usar o while

    while (expressao_logica) {
        aqui se true
    }
    aqui se false

    while (cont < 5) {
        System.out.println("CONT " + cont);
        cont++;
    }
*/

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // perguntar para o usuário QUANTOS VALORES serão utilizados para o calculo da media

        // a menor nota sera desconsiderada, ou seja, a quantidade informada pelo usuario sera um a mais do que a utilizada na media;

        Scanner in = new Scanner(System.in);
        float valor, media = 0;
        int quantidade;

        System.out.println("Informe a quantidade de notas");
        quantidade = in.nextInt();

        int cont = 0;
        while (cont < quantidade) {
            System.out.println("Informe um valor");
            valor = in.nextFloat();
            media = media + valor;
            System.out.println("SOMA ATUAL " + media);
            cont++;
        }        

        media = media / quantidade;
        System.out.println("MEDIA DOS 5 valores eh " + media);

    }
}

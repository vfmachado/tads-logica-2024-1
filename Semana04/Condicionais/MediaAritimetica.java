/*
CALCULAR A MEDIA ARITIMETICA SIMPLES ENTRE 3 NOTAS DE UM ALUNO
*/

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float n1, n2, n3, media;
        boolean aprovado;
        final float NOTA_APROVACAO = 7.0f;

        System.out.println("Informe as 3 notas");

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("MEDIA = " + media);

        aprovado = media >= NOTA_APROVACAO;

        /*
        se condicao entao
        if (BOOLEAN) {
            // AQUI DENTRO VAI TUDO QUE EU QUISER QUE ESTEJA AMARRADO A CONDICAO
        }
        */

        if (media >= NOTA_APROVACAO) {
            System.out.println("APROVADO");
        }

        if (!aprovado) {
            System.out.println("EXAME");
        }


    }
}



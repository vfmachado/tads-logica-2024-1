/*

LER OS VALORES DAS 3 NOTAS DO ALUNO E CASO A MEDIA SEJA MENOR QUE 7, CALCULAR A NOTA NECESSARIA PARA O EXAME E INDICA-LA SABENDO QUE A FORMULA PARA SER APROVADO NO EXAME EH

    MF = (MS x 0,6) + (EF x 0,4) ≥ 5

        MF = media final
        MS = media semestre
        EF = nota do exame

    EX = (5 - MS * 0.6) / 0.4;
*/


import java.util.Scanner;

public class ExameCompleto {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float n1, n2, n3, media, exame;
        boolean aprovado;
        final float NOTA_APROVACAO = 7.0f;

        System.out.println("Informe as 3 notas");

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("MEDIA = " + media);

        aprovado = media >= NOTA_APROVACAO;

        if (aprovado) {
            System.out.println("APROVADO");
            if (media >= 9) {
                System.out.println("CLASSIFICACAO A");
            } else if (media >= 8) {
                System.out.println("CLASSIFICACAO B");
            } else {
                System.out.println("CLASSIFICACAO C");
            }

        } else {
            // System.out.println("EXAME...");
            exame = (5 - media * 0.6f) / 0.4f;  // o f adicionado no 0.6f e 0.4f é para indicar o compilador que estou fazendo uma operacao com float. por padrão, 0.6 ou 0.4 ou 0.qualquer coisa, o compilador entende como double;
           
            if (exame > 10) {
                Syste.out.println("VC NAO PODE FAZER EXAME")
            } else {
                System.out.printf("VC PRECISA TIRAR %.1f PARA SER APROVADO", exame);
            }
        }


        // nota_EXame = (5 - Media * 0.6) / 0.4;
    }
}


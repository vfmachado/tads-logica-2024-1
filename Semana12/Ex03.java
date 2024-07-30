import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        int alunos = in.nextInt();

        float n1, n2, media;
        float maiorMedia = 0;

        while (alunos > 0) {
            alunos--;


            n1 = in.nextFloat();
            n2 = in.nextFloat();
            media = (n1 + n2)/2;

            System.out.println("ESTE ALUNO TEM MEDIA " + media);

            if (media >  maiorMedia) {
                maiorMedia = media;
            }
        }

    }
}

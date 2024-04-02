import java.util.Scanner;

public class Simulado03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // notas e optativa
        // n1  n2    opt
        // 0    1    10
        // 10   8    5

        // variaveis e entrada
        float n1, n2, opt, media = 0;
        String situacao;

        System.out.println("Informe as notas e a opt (-1 caso nao queira)");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        opt = in.nextFloat();

        // logica
        if (opt == -1) {
            media = (n1 + n2)/2;
        } else if (n1 <= n2) { 
            media = (opt + n2)/2;
        } else {
            media = (n1 + opt)/2;
        }
        
        if (media >= 6) {
            situacao = "APROVADO";
        } else if (media >= 3) {
            situacao = "EXAME";
        } else {
            situacao = "REPROVADO";
        }

        // saida
        System.out.println("MEDIA " + media);
        System.out.println("SITUACAO DO ALUNO EH " + situacao);

    }
}
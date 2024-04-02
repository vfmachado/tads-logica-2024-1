import java.util.Scanner;

public class Simulado02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float custoInicial, custoFinal;
        final float PORCENTAGEM_DISTRIBUIDOR = 0.28f;
        final float PORCENTAGEM_IMPOSTO = 0.45f;

        System.out.println("Informe o custo inicial do automovel");
        custoInicial = in.nextFloat();

        custoFinal = custoInicial + custoInicial * PORCENTAGEM_DISTRIBUIDOR + custoInicial * PORCENTAGEM_IMPOSTO;
        // custoFinal = custoInicial * 1.28f + custoInicial * 0.45f;
        // custoFinal = custoInicial * 1.73f;
        // custoInicial = custoInicial * 1.28f * 1.45f;

        System.out.println("CUSTO FINAL: " + custoFinal);

    }
}
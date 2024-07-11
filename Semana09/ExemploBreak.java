
public class ExemploBreak {


    public static void main(String[] args) {
        int cont = 0;
        while (true) {
            System.out.println("ANTES DO IF COM BREAK " + cont);
            if (cont == 3) {
                break;  // FORÇA A PARADA DO LAÇO DE REPETICAO EXATAMENTE NESTE PONTO, OU SEJA, AS LINHAS DE BAIXO NAO SAO EXECUTADAS
            }

            System.out.println("DEPOIS DO IF COM BREAK " + cont);
            cont++;
        }

        // cont fora do laço continuara valendo 3.
        System.out.println("CONT FORA DO LAÇO " + cont);

    }

}
public class TrianguloPascal {
    public static void main(String[] args) {
        int N = 10;

        int [] vetor = { 1, 1};

        for (int i = 0; i < N; i++) {
            System.out.println("LINHA " + i);
            // mostrar o meu vetor
            for (int pos = 0; pos < vetor.length; pos++) {
                System.out.print(vetor[pos] + "  ");
            }
            System.out.println();

            int [] outroVetor = new int[vetor.length + 1];

            outroVetor[0] = 1;
            outroVetor[outroVetor.length - 1] = 1;

            for (int j = 1; j < outroVetor.length -1; j++) {
                outroVetor[j] = vetor[j -1] + vetor[j];
            }

            vetor = outroVetor;
        }

    }
}

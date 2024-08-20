public class SomaVetor {
    public static void main(String[] args) {
        
        // concatenar dois vetores
        int [] v1, v2, v3;
        v1 = new int[5];    // 1, 2, 3, 4, 5
        v2 = new int[7];    // 1, 2, 3, 4, 5, 6, 7

        v3 = new int[v1.length + v2.length];    // 1 2 3 4 5 1 2 3 4 5 6 7

        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            v3[v1.length + i] = v2[i];
            // 5 + 0        5 + 1       5 + 2       5 + 3
        }

        // somar dois vetores (v1 e v2)
        int [] soma;
        
        int tamanho = v1.length;
        if (v2.length > v1.length) {
            tamanho = v2.length;
        }

        soma = new int[tamanho];


        for (int i = 0; i < soma.length; i++) {
            int valor1;
            if (i >= v1.length) {
                valor1 = 0;
            } else {
                valor1 = v1[i];
            }

            int valor2;
            if (i >= v2.length) {
                valor2 = 0;
            } else {
                valor2 = v2[i];
            }

            soma[i] = valor1 + valor2;

        }
    }
}

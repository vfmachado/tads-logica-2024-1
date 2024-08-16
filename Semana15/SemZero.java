public class SemZero {
    public static void main(String[] args) {
        // 3
        int [] comZeros = {1, 2, 0, 3, 2, 0, 1, 4, 0, 5};
        int [] semZeros;
        // CRIE UM VETOR QUE TEM TODOS OS ELEMENTOS DIFERENTES DE ZERO DO PRIMEIRO VETOR; ESTE VETOR NAO PODE TER TAMANHO SOBRANDO

        int quantZeros = 0;
        for (int i = 0; i < comZeros.length; i++) {
        if (comZeros[i] == 0) {
            quantZeros++;
        }
        }
        semZeros = new int[comZeros.length - quantZeros];


        int pos = 0;
        for (int i = 0; i < comZeros.length; i++) {
            if (comZeros[i] != 0) {
                semZeros[pos] = comZeros[i];
                pos++;
            }
        }

        for (int i = 0; i < semZeros.length; i++) {
            System.out.println(semZeros[i]);
        }

    }
}

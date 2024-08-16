public class Vetores01 {
    public static void main(String[] args) {
        
        // tipo [] nome da varia = new tipo tamanho
        String []  nomes = new String[5];
        int [] numeros = { 1, 2, 3, 4, 5 };

        String [] frutas = { "pera", "uva", "maca" };

        // informe a quantidade de valores
        int n = 123;
        float [] valores = new float[n];

        nomes[0] = "vini";
        nomes[1] = "elisa";
        nomes[2] = "analua";
        nomes[3] = "theo";
        nomes[4] = "alice";

        int posicao = 0;
        while (posicao < 5) {
            System.out.println(nomes[posicao]);
            posicao++;
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);   
        }
    }
}
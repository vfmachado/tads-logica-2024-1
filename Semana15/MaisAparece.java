public class MaisAparece {
    public static void main(String[] args) {
        // 1 
        int [] v = { 1, 1, 1, 1, 1, 2, 2,4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 6, 7, 8, 8, 8, 8};
        // QUAL O VALOR QUE MAIS APARECE NO VETOR E QUANTAS VEZES?

        int valorSalvo = 0, quantidadeSalva = -1;
        int valorAtual, quantidadeAtual;

        valorAtual = v[0];
        quantidadeAtual = 1;
        
        for (int i = 1; i < v.length; i++) {
        
            if (v[i] == valorAtual) {
                quantidadeAtual++;

                if (i == v.length -1) {
                    System.out.println("VALOR " + valorAtual + " APARECE " + quantidadeAtual + " VEZES");
                }

            } else {

                System.out.println("VALOR " + valorAtual + " APARECE " + quantidadeAtual + " VEZES");

                valorAtual = v[i];
                quantidadeAtual = 1;
            }

            if (quantidadeAtual > quantidadeSalva) {
                valorSalvo = valorAtual;
                quantidadeSalva = quantidadeAtual;
            }

        }


        System.out.println("\n\nO VALOR QUE MAIS APARECEU FOI " + valorSalvo + " E APARCEU " + quantidadeSalva);
    }
}

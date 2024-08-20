public class DesvioPadrao {
    public static void main(String[] args) {
        int [] v = { 3, 4, 5, 4, 5, 6, 3 };

        // raiz quadrada de
            // soma da diferenca entre cada elemento e media ao quadrado
            // divido por N

        float media = 0;
        for (int i = 0; i < v.length; i++) {
            media  = media + v[i];
        }
        media = media / v.length;

        float soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma +  (v[i] - media) * (v[i] - media);
        }

        float somaPorN = soma / v.length;

        double desvio = Math.sqrt(somaPorN);
        System.out.println("DESVIO PADRAO DO VETOR EH " + desvio);
    }
}

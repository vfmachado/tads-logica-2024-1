public class Ex01 {
    public static void main(String[] args) {
        int n = 12;
        int soma = 0;
        float media;
        int quantidade = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("VALOR " + i);
            if (n % i == 0) {
                soma = soma + i;
                quantidade++;
                System.out.println(i + " é um divisor");
            }
        }
        media = (float) soma / quantidade;
        System.out.println("SOMA " + soma);
        System.out.println("MEDIA " + media);
        // int i = 1;
        // while (i <= n) {
        //     System.out.println("VALOR i " + i);
        //     i++;
        // }
    }
}

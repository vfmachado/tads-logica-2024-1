public class AproximacaoPi {
    

    public static void main(String[] args) {
        

        int N = 100000000;
        System.out.println(Math.PI);

        double numerador = 1;
        double denominador = 1;
        double soma = 0;
        for (int i = 0; i < N; i++) {
            
            soma = soma + numerador/denominador;

            numerador = numerador * -1;
            denominador = denominador + 2;

        }

        soma = 4 * soma;
        System.out.println(soma);
    }

}

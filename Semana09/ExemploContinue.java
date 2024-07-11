import java.util.Scanner;

public class ExemploContinue {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        System.out.println("DIGITE 10 numeros >= 0");
        while (cont < 10) {
            System.out.println("ANTES DO IF COM CONTINUE " + cont);
            System.out.println("Informe um numero positivo");
            
            int valor = in.nextInt();

            if (valor < 0) {
                continue;  // ELE FORÇA VOLTAR AO INICIO DO LAÇO DE REPETIÇÃO PULANDO AS LINHAS ABAIXO
            }

            System.out.println("DEPOIS DO IF COM CONTINUE " + cont);
            cont++;
        }

        // cont fora do laço continuara valendo 3.
        System.out.println("CONT FORA DO LAÇO " + cont);

    }

}
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = new int[10];
        // [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [ 0, 2, 0, 4, 0, 3, 0, 1, 0, 0]      // 7 ?

        while (true) {
            System.out.println("\n\n1. Mostrar vetor"+
            "\n2. Alterar valor" +
            "\n3. Menor valor do vetor" +
            "\n4. Maior valor do vetor" +
            "\n5. Media dos valores nao nulos do vetor" +
            "\n6. Alterar tamanho do vetor" +
            "\n7. 2 Valores Somam?" +
            "\n8. Valor se repete? " +
            "\n9. Valor NAO se repete? " + 
            "\n10. SAIR"

            );
            int opcao = in.nextInt();

            if (opcao == 10) break;

            // if (opcao == 1) {
            // } else if (opcao == 2) {
            // }
            switch (opcao) {
                case 1:
                    System.out.print("v = [ ");
                    for (int i = 0; i < v.length; i++) {
                        System.out.print(v[i] + "  "); // v => é o vetor    i => posicao       v[i] => buscando um elemento deste vetor 
                    }
                    System.out.println("]");
                    break;

                case 2:
                    System.out.println("informe uma posicao e um valor");
                    // validar a posicao
                    int posicao = in.nextInt();
                    int valor  = in.nextInt();

                    v[posicao] = valor;

                    break;

                case 3: 
                    int menor = 0;;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] < menor || i == 0) {
                            menor = v[i];
                        }
                    }
                    System.out.println("MENOR VALOR ENCONTRADO FOI " + menor);
                    break;

                // MEDIA DOS VALORES NAO NULOS
                case 5:
                    int naoNulos = 0;
                    int soma = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] != 0) {
                            soma  = soma + v[i];
                            naoNulos++;
                        }
                    }
                    float media = (float) soma / naoNulos;
                    System.out.println("A media dos valores nao nulos eh " + media);
                    break;

                case 6:
                    System.out.println("Qual o novo tamanho? ");
                    int tamanho = in.nextInt();

                    int [] v2 = new int[tamanho];
                    for (int i = 0; i < v2.length && i < v.length; i++) {
                        v2[i] = v[i];
                    }
                    // as variaveis ocupam um endereço de memória
                    // neste caso estamos trocando para onde aponta o endereço de v para v2;
                    // PONTEIROS
                    v = v2;

                    break;

                // 2 Valores Somam
                case 7: 
                    System.out.println("Qual o valor desejado?");
                    int soma2 = in.nextInt();

                    for (int i = 0; i < v.length; i++) {
                        int primeiro = v[i];        // i = 4
                        for (int j = i + 1; j < v.length; j++) { // j = 5
                            int segundo = v[j];

                            if (primeiro + segundo == soma2) {
                                System.out.println("ENCONTREI OS VALORES " + primeiro + " E " + segundo);
                            }

                        }
                    }

                    break;

                // algum valor nao se repete?
                case 9:
                    for (int i = 0; i < v.length; i++) {    // i = 2
                        if (v[i] == 0) continue;
                        
                        boolean repete = false;

                        for (int j = 0; j < v.length; j++) {        // j = 2
                            if (v[i] == v[j] && i != j) {   // v[i] == v[j]
                                repete = true;
                            }
                        }
                        if (!repete ) {
                            System.out.println("O valor " + v[i] +  " nao repete ");
                        } 
                    }
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }


        }



    }
}
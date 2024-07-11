/*

FACA UM PROGRAMA EM JAVA QUE, UTILIZANDO LAÇOS DE REPETIÇÃO, CALCULE O VALOR TOTAL DO LANCHE DA FAMÍLIA
PODENDO

- ADICIONAR LANCHE, COM ADICIONAIS
- ADICIONAR BEBIDA

É O CARRINHO / RESTAURANTE DO IFOOD

CRIEM UM MINI CARDAPIO, COM PELO MENOS 3 ITENS, 2 ADICIONAIS, E 2 BEBIDAS.
CADA ITEM, TEM NOME E PREÇO, NO FINAL 
QUERO VER UM "EXTRATO" DO PEDIDO + PREÇO TOTAL DO PEDIDO
*/
import java.util.Scanner;

public class ForLanche {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valor = 0;
        int opcao;
        String extrato = "";
        int totalItens = 0;

        while (true) {
            System.out.println("\n\nADICIONE UM ITEM AO PEDIDO OU FINALIZE");
            System.out.println("CARDAPIO IFOOD\n" +
            "1. HAMBURGUER  29,90\n" +
            "2. PIZZA       49,90\n" +
            "3. BURRITO     19,90\n" +
            "4. REFRI 2L    10,00\n" +
            "5. CERVEJA     15,00\n" +
            "0. FINALIZAR PEDIDO" 
            );

            opcao = in.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao == 1) {
                valor = valor + 29.90f;
                totalItens++;
                extrato = extrato + totalItens + ". HAMBURGUER  29,90\n";
            } else if (opcao == 2) {
                valor = valor + 49.90f;
                totalItens++;
                extrato = extrato + totalItens + ". PIZZA   49,90\n";
            } else if (opcao == 3) {
                valor = valor + 19.90f;
                totalItens++;
                extrato = extrato + totalItens + ". BURRITO  19,90\n";
            } else if (opcao == 4) {
                valor = valor + 10f;
                totalItens++;
                extrato = extrato + totalItens + ". REFRI  10,00\n";
            } else if (opcao == 5) {
                valor = valor + 15f;
                totalItens++;
                extrato = extrato + totalItens + ". CERVEJA  15,00\n";
            } else {
                System.out.println("OPCAO INVALIDA, NENHUM ITEM FOI ADICIONADO");
            }

            // posso colocar adicionar
            if (opcao >= 1 && opcao <= 3) {
                while (true) {
                System.out.println("ADICIONAIS\n" +
                        "1. BACON    3,90\n" +
                        "2. CHEDDAR  4,90\n" +
                        "0. Encerrar adicionais deste item"
                        );
                    int opcional = in.nextInt();

                    if (opcional == 0) break;

                    if (opcional == 1) {
                        valor = valor + 3.9f;
                        extrato = extrato + "\t+ BACON    3,90\n";
                    } else if (opcional == 2) {
                        valor = valor + 4.9f;
                        extrato = extrato + "\t+ CHEDDAR  4,90\n";
                    } else {
                        System.out.println("ADICIONAL INVALIDO");
                    }

                }
            }
        }

        System.out.printf("\n\nVALOR TOTAL R$ %.2f\n\n", valor);
        System.out.println("ITENS PEDIDOS:");
        System.out.println(extrato);
    }

}
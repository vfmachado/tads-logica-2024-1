// FAÇA UM PROGRAMA EM QUE O USUARIO DIGITE O VALOR DO PRODUTO E UMA PORCENTAGEM DE DESCONTO. NO FINAL MOSTRE O VALOR CORRIGIDO DO PRODUTO E O VALOR DE DESCONTO APLICADO

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorProduto, porcentagemDesconto;
        float valorDesconto, valorFinalProduto;

        System.out.println("Informe o valor do produto (R$) e a porcentagem (%):");
        valorProduto = in.nextFloat();
        porcentagemDesconto = in.nextFloat();

        valorDesconto = porcentagemDesconto / 100 * valorProduto ;
        valorFinalProduto = valorProduto - valorDesconto;

        System.out.println("VALOR FINAL DO PRODUTO: " + valorFinalProduto);
        System.out.println("TOTAL DE DESCONTO: " + valorDesconto);
        
    }
}
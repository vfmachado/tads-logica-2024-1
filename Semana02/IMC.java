// O IMC É A DIVISAO ENTRE O PESO (kg) DA PESSOA E A SUA ALTURA (metros) AO QUADRADO
// FAÇA UM PROGRAMA PARA AJUDAR A CALCULAR O IMC DADO A ALTURA E PESO DE UMA PESSOA

// float peso;
// peso = in.nextFloat()

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float peso, altura, imc;
        System.out.println("informe o peso e a altura");
        peso = in.nextFloat();
        altura = in.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("IMC = " + imc);
    }
}
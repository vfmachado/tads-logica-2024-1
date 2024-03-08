import java.util.Scanner;
// import java.util.*;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        System.out.println("MEU PROGRAMA FUNCIONA!");

        // tipo  nome

        int numeroInteiro; // numeros inteiros

        float numerosDecimais;   // numeros decimais (8 casas)
        double numerosComMuitasCasas;   

        String textos = "qualquer texto mesmo...";
        char letra = 'a';

        boolean verdadeiroFalso = true; // ou false

        // variavel do tipo scanner
        Scanner in;

        // inicializa o scanner apontando para a entrada padrao
        in = new Scanner(System.in);

        int idade, ano;
        String apelido;

        System.out.println("Me diga em que ano vc nasceu: ");
        ano = in.nextInt();
        idade = 2024 - ano;

        System.out.println("me diga seu apelido:");
        apelido = in.next();

        System.out.println(apelido + " em 2024 fara " + idade + " anos");


    }
}
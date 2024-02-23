/*
    FAÇA UM PROGRAMA QUE LEIA O APELIDO DE UMA PESSOA E MOSTRE ELE DUAS VEZES NA TELA.
*/

// IMPORTS FICAM ACIMA DA DECLARACAO DA CLASSE
import java.util.Scanner;

// NOME DA CLASSE IGUAL DO ARQUIVO
public class ExemploLeitura {

    // MAIN (PONTO PRINCIPAL, INICIO DA EXECUCAO)
    public static void main(String[] args) {

        // DECLARACAO
        Scanner in;

        // INICIALIZACAO
        in = new Scanner(System.in);    // TERMINAL / ENTRADA DO USUARIO
        
        // tipo / nome
        String apelido;
        // String significa tipo texto

        System.out.println("DIGITE O SEU APELIDO");
        apelido = in.next();        // a variavel apelido recebe a palavra que for digitada


        System.out.println("DUAS VEZES: ");
        System.out.println("\t" + apelido); // o + esta concatenando (juntar) as strings
        System.out.println("\t\t" + apelido);

    }
}


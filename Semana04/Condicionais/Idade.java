
    // FACA UM PROGRAMA PARA DIZER SE UMA PESSOA É MAIOR OU MENOR DE IDADE, CASO SEJA MAIOR DE IDADE, VERIFICAR SE A PESSOA É IDOSA (65+) E INFORMAR
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Informe a idade da pessoa");
        idade = in.nextInt();
        
        if (idade >= 18) {
            System.out.println("MAIOR DE IDADE");
            if (idade >= 65) {
                System.out.println("E PESSOA IDOSA");
            }
        } else {
            System.out.println("MENOR DE IDADE");
        }

       

    }

}
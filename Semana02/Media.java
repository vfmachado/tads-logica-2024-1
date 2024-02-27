import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // declarar o scanner
        Scanner in;
        // inicializar o scanner
        in = new Scanner(System.in);

        // DECLARACAO
        // tipo  nome
        String apelido;
        
        // declarar multiplas variaveis do mesmo tipo, separando por virgula
        // ambas v1 e v2 sao do tipo int
        // int => inteiro
        // -2.4b ~ 2.4b
        int v1, v2;

        // tipo vs valor

        System.out.print("Qual seu apelido? ");

        // variavel recebe algo
        apelido = in.next();
        System.out.println("Bem vindo " + apelido);

        System.out.println(apelido + ", por favor me informe dois numeros");
        // nextInt => le um valor inteiro
        v1 = in.nextInt();
        v2 = in.nextInt();

        System.out.println("O usuario " + apelido + " digitou os seguintes valores");
        System.out.println("v1 => " + v1);
        System.out.println("v2 => " + v2);

    } 
}

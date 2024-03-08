
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ascii;
        char letra, maiuscula;

        System.out.println("Me informe uma letra");
        letra = in.next().charAt(0);

        ascii = letra;

        maiuscula = (char) (ascii - 32);

        System.out.println(Character.SIZE);
        System.out.println(Integer.SIZE);

        System.out.println("CARACTER ASCCI DA LETRA " + letra + " EH " + ascii);
        System.out.println("LETRA MAISCULA " + maiuscula);


    }
}
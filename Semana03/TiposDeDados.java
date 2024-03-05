
import java.util.Scanner;

public class TiposDeDados {
    public static void main(String[] args) {

        System.out.println("FUNCIONA!!!");

        // VARIAVEL DO TIPO SCANNER
        // LEITURA PADRAO DO SISTEMA
        // TERMINAL - TECLADO
        Scanner in = new Scanner(System.in);

        int numeroInteiro;
        float numeroDecimal;
        String texto;

        // EM JAVA TODO TIPO PRIMITIVO TEM UM TIPO NAO PRIMITIVO "DE APOIO"
        Integer numInteiroTbm;
        System.out.println("MAXIMO VALOR DE UM INTEIRO " + Integer.MAX_VALUE);
        System.out.println("MENOR VALOR DE UM INTEIRO " + Integer.MIN_VALUE);
        System.out.println("TAMANHO QUE UM INT OCUPA " + Integer.SIZE );

        // Float, Double, Short, Byte, Boolean, String, Character, Long

        long numeroIntGigante = Long.MAX_VALUE;
        System.out.println("NUMERO GIGANTE " + numeroIntGigante);
        System.out.println("BITS PARA O LONG " + Long.SIZE);

        double valorDouble = 1.2872187521655;
        float valorDecimal = 1.12345678f;

        // TRANSFORMAÇÃO FORÇADA DE TIPO 
        
        int parteInteira = (int) valorDecimal;
        
        System.out.println("VALOR DECIMAL " + valorDecimal);
        System.out.println("PARTE INTEIRA " + parteInteira);

        // CASO VCS VEJAM NA INTERNET
        int valorComParser = Integer.parseInt("1235132");

    
    }
}

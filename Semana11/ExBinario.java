public class ExBinario {
    public static void main(String[] args) {

        // transforme um numero x na base decimal em formato binario

        // 6 => 110
        // 9 => 1001
        // 12 => 1100
        // 13 => 1101

        // 120

        int x = 120;
        int copia = x;
        String binario = "";

        while (x > 0) {
            System.out.println("X = " + x);
            int resto = x % 2;
            int resultadoDiv = x / 2;
            System.out.println("RESTO = " + resto);
            System.out.println("DIV = " + resultadoDiv);

            x = resultadoDiv;
            binario =  resto + binario;
        }

        // while (x > 0) {
        //     int digito = x % 2;
        //     x =  x / 2;
        //     binario =  digito + binario;
        // }

        // for ( ; x > 0;  x = x / 2) {
        //     int digito = x % 2;
        //     binario =  digito + binario;
        // }

        System.out.println("O NUMERO " + copia + " EM BINARIO EH " + binario);
    }   
}

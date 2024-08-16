public class Palindromo {
    public static void main(String[] args) {
        String palavString = "mirim";
        char [] letras = palavString.toCharArray();
        // VERIFIQUE SE A PALAVRA É UM PALINDROMO (IGUAL DE TRAS PARA FRENTE)

        boolean palindromo = true;
        for (int i = 0; i <= letras.length/2; i++) {
            if (letras[i] != letras[letras.length -1 - i]) {
                palindromo = false;
                break;
            }
        }
        
        if (palindromo) System.out.println("SIM, palindromo");
        else System.out.println("NAO!!!");


        // for (int i = 0, f = letras.length -1; i < f; i++, f--) {}
        int inicio = 0;
        int fim = letras.length -1;
        palindromo = true;
        while ( inicio < fim) {

            if (letras[inicio] != letras[fim]) {
                palindromo = false;
                break;
            }

            inicio++;
            fim--;
        }

        if (palindromo) System.out.println("SIM, palindromo");
        else System.out.println("NAO!!!");

    }
}

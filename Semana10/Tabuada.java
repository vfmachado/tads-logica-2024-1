
// FAÇA UM PROGRAMA QUE MOSTRE TODAS AS TABUADAS DO 1 AO 10
public class Tabuada {
    public static void main(String[] args) {
        
        int N = 20;
        int TETO = 10;
        
        for (int numero = 1; numero <= N; numero++) {
            System.out.println("\n\n === TABUADA DO " + numero + " ===");
            for (int x = 1; x <= TETO; x++) {
                int mult = numero * x;
                System.out.println(numero + " x " + x + " = " + mult);
            }
        }

    }
}
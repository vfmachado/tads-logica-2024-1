
public class For01 {

    public static void main (String[] args) throws Exception {

        int cont = 0;

        // enquanto
        while (cont < 10) {
            System.out.println(cont);
            cont++;      // cont = cont + 1;     cont += 1;
        }

        System.out.println("\n\n=========\n\n");

        // x como está sendo declarado aqui, só existe dentro do for.
        // quando meu laco acabar, x deixar de existir
        for (int x = 0; x < 10; x = x+2) {
            System.out.println("X = " + x);
        }
        
        System.out.println("\n\n=========\n\n");

        int y = 0;
        for ( ;  ; ) {      // equivale a while(true)
            System.out.println("Y = " + y);
            y++;

            if (y >= 5) break;     // BREAK => PARA O LAÇO DE REPETICAO EXATAMENTE NO MOMENTO EM QUE ELE É EXECUTADO

            System.out.println("DEPOIS DO IF... ");
        }

        System.out.println("\n\n=========\n\n");
        
        for (int i = 5; i >= 0; i--) {
            System.out.println("Contagem regressiva.. " + i);
            Thread.sleep(1000);
        }

    }

}
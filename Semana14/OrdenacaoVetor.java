import java.util.Random;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        
        int [] v = new int[10];
        Random r = new Random();

        System.out.print("v = [ ");
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(99);
            System.out.print(v[i] + "  ");
        }
        System.out.println("]");


        for (int i = 0; i < v.length; i++) {
            int menor = i;
            for (int j = i; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }

            // troca posicao i com a posicao menor
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;

        }


        System.out.print("v = [ ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println("]");

    }   
}

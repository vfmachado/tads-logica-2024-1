public class TrianguloPascal {
    public static void main(String[] args) {
        
        /*
        1
        1   1
        1   2   1
        1   3   3   1
        1   4   6   4   1
        ...
        */

        int [] v, aux;
        v = new int [1];
        v[0] = 1;
        
        // int [] v1 = { 1 };

        for (int N = 0; N < 10; N++) {
            
            System.out.print("v = [ ");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  "); // v => é o vetor    i => posicao       v[i] => buscando um elemento deste vetor 
            }
            System.out.println("]");


            aux = new int[v.length + 1];
            aux[0] = 1;
            aux[v.length] = 1;

            // logica aqui
            for (int i = 1; i < aux.length -1; i++) {
                aux[i] = v[i] + v[i-1];
            }

            v = aux;
        }
    }
}

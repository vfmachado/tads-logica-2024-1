public class Vetores01 {
    public static void main(String[] args) {

        // VETORES SAO ESTRUTURAS DE DADOS QUE COMPORTAM
        // MULTIPLOS VALORES DO MESMO TIPO (EM JAVA)

        // TEM UM TAMANHO FIXO ( ARRAYLIST É UMA CLASSE QUE ABSTRAI OS VETORES E PERMITE TAMANHO DINAMICO)

        // AS POSICOES / INDICES COMECAM SEMPRE DO ZERO

        // PRECISAMOS DECLARAR E INICIALIZAR UM VETOR

        // DECLARACAO - DIZER QUE É DO TIPO VETOR
        int [] numeros;

        // INICIALIZACAO IDENTIFICAMOS OS VALORES INICIAIS E QUANTIDADE
        numeros = new int[4]; // vetor de tamanho 4;

        // declarar e inicializar na mesma linha
        int [] numeros2 = { 1, 2, 3, 4};
        float [] notas = { 7, 8.5f, 4.3f, 9, 6.4f};

        int a, b, c[];  // neste caso só C é um vetor
        int [] d, e, f; // aqui todos sao vetores

        int v1[] = new int[10];
        int []v2 = new int[10];


        // faça um programa que crie um vetor de tamanho escolhido pelo usuairo;
        int [] vtam;
        int tamanho = 10;
        vtam = new int[tamanho];    

        String [] textos = new String[100000]; 
    }
}

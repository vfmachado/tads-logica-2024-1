public class Variavel {
    public static void main(String[] args) {
        System.out.println("FUNCIONA");
        // DECLARACAO DA VARIAVEL do tipo INTEIRO chamada idade
        int idade;

        // DO TIPO String para textos
        String texto;
        
        // tipo float para numeros com casas decimais (8)
        float alturaMetros;

        // idade RECEBE o que está a direita
        // ATRIBUICAO
        idade = 32;
        texto = "Vinicius Fritzen Machado - Professor das disciplinas: \nlogica\nwebii\napps\nqualidade de software";
        alturaMetros = 1.76f;
        
        /*
            quando tem um valor decimal sem o f, por exemplo
            1.5  o java (compilador) entende isso como um tipo double
            mas os double sao utilizados para muita precisao
            quando colocamos o f no final de um numero decimal
            1.5f o java entende como float

            SEMPRE devemos atribuir a variavel de acordo com o tipo
        */
        

        System.out.println("Texto => " +  texto);
        System.out.println("idade => " +  idade);
        System.out.println("alturaMetros => " +  alturaMetros);
    }
}
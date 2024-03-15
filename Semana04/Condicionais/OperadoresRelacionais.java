import java.util.Scanner;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.println("Informe 2 numeros");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        /*
        Operadores Relacionais

        >       maior
        >=      maior ou igual

        <       menor
        <=      menor ou igual

        ==      igual

        !=      diferente

        !       nao
        
        &&      e       (retorna true quando ambos valores sao verdadeiros)

        ||      ou      (retorna true quando pelo menos um valor eh verdadeiro)

        */

       boolean resultado;       // true ou false

        resultado = a > b;
        System.out.printf("%d > %d = %b\n", a, b, resultado);
        System.out.println(a + " > " + b + " = " + resultado);

        resultado = a == b;
        System.out.printf("%d == %d = %b\n", a, b, resultado);

        resultado = ( a > b ) && ( c > d );
        System.out.println(" ( a > b ) && ( c > d ) " + resultado);

        resultado = a > b || c > d || a > d;
        System.out.println(" a > b || c > d || a > d " + resultado);
        
        resultado = a != d && b > c;
        System.out.println(" a != d && b > c " + resultado);

    } 

}

public class Operadores {
    public static void main(String[] args) {

        int v1, v2, res;
        float f1, f2, fres;

        v1 = 5;
        v2 = 3;

        f1 = 1.5f;
        f2 = 2.5f;

        fres = f1 + f2;

        // float = int + float
        fres = v1 + f2;

        res = v1 + v2;
        System.out.println("v1 + v2 = " + res);


        // A ORDEM DOS PARENTESES FORÇA A SOMA E DEPOIS CONVERTE
        res = (int) (f1 + v2);
        System.out.println("f1 + v2 = " + res);

        // V1 E V2 SAO INT
        v1 = 2;
        v2 = 5;
        res = v1 - v2;  // -3
        res = v2 - v1;  // 3
        res = v1 * v2;  // 10
        res = v1 / v2;  // 0
        res = v2 / v1;  // 2
        // RES = V1 / 0;    // DARIA ERRO

        // OPERADOR DE RESTO
        res = v1 % v2;  // 2    
        res = v2 % v1;  // 1    v2 - (v2 / v1) * v1 (CUIDADO)

        

    }
}
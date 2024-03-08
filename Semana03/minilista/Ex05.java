import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // dist2pts = raiz( (x2 -x1)^2 + (y2-y1)^2)
        System.out.println(Math.sqrt(169));

        float x1, y1, x2, y2, dx, dy, somaQuad;
        double raiz;
        System.out.println("Informe os valores x1, y1, x2, y2");
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        dx = x2 - x1;
        dy = y2 - y1;

        somaQuad = dx * dx + dy * dy;
        raiz = Math.sqrt(somaQuad);

        System.out.println("DX = " + dx);
        System.out.println("DX = " + dx);
        System.out.println("DX^2 + DY^2 = " + somaQuad);
        System.out.println("DISTANCIA = " + raiz);

        System.out.printf("DISTANCIA = %.2f\n", raiz);
        // float %f
        // int   %d
        // string %s
    }
}
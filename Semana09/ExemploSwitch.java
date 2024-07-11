public class ExemploSwitch {
    public static void main(String[] args) {

        int mes = 5;

        // identificar a qual quartil pertence a esse mes
        if (mes >=1 && mes <= 4) {
            System.out.println("PRIMEIRO QUARTIL");
        } else if (mes >=5 && mes <= 8) {
            System.out.println("SEGUNDO QUARTIL");
        } else if (mes >= 9 && mes <= 12) {
            System.out.println("TERCEIRO QUARTIL");
        }

        // dado um numero de 1 a 7, identificar o dia da semana
        int dia = 5;

        if (dia == 1) {
            System.out.println("DOMINGO");
        } else if (dia == 2) { 
            System.out.println("SEGUNDA");
        } else if (dia == 3) {
            System.out.println("TERCA");
        } else if (dia == 4) {
            System.out.println("QUARTA");
        } else if (dia == 5) {
            System.out.println("QUINTA");
        } else if (dia == 6) {
            System.out.println("SEXTA");
        } else if (dia == 7) {
            System.out.println("SABADO");
        }

        // FUNCIONA PARA CASOS ISOLADOS
        // 
        switch (dia) {
            case 1:
                System.out.println("DOMINGO");
                break;  // NO SWITCH UTILIZAMOS O BREAK PARA ENCERRAR A ESCOLHA
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERCA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("DIA INVALIDO");
        }

        // PARTICULARMENTE NAO RECOMENDO MISTURAR MUITO OS CASES
        switch (dia) {
            case 7:
                System.out.println("MELHOR DIA, JA DESCANSEI E NAO TRABALHO AMANHA");
                // a falta de break, faz com que ele execute este e o caso abaixo no case 7
            case 1:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA DE SEMANA");

        }


        String relatorio = "cliente";

        switch (relatorio) {
            case "cliente": 
                System.out.println("Relatorio enviado para os clientes");
                break;
            case "fornecedor":
                System.out.println("Relatorio de compras");
                break;
            case "adminstrador":
                System.out.println("Relatorio de administração");
                break;
        }

        // se fosse fazer um jogo, onde a pessoa tivesse que navegar com o teclado, eu utilizaria o switch.
        // exemplo 2048
        String tecla = "up";
        switch (tecla) {
            case "up":
                System.out.println("MOVIMENTO PARA CIMA");
                // logica pra caramba
                
                break;
            case "down":
                System.out.println("MOVIMENTO PARA BAIXO");
                break;
            case "left":
                System.out.println("MOVIMENTO PARA ESQUERDA");
                break;
            case "right":
                System.out.println("MOVIMENTO PARA DIREITA");
                break;
        }
    }
}
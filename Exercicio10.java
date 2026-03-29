import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args, Scanner Teclado) {
        System.out.println("Insira um numero");
        double n = Teclado.nextDouble();

        String result = (n == 0) ? "nulo" : (n > 0) ? "positivo" : "negativo";
        System.out.println("O numero é " + result);

    }
}

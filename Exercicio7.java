import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro lado:");
        double a = Teclado.nextDouble();
        System.out.println("Informe o segundo lado:");
        double b = Teclado.nextDouble();
        System.out.println("Informe o terceiro lado:");
        double c = Teclado.nextDouble();

        boolean valido = (a < b + c) && (b < a + c) && (c < a + b);

        String tipo = !valido ? "Não forma um triângulo"
                : (a == b && b == c) ? "Triângulo equilátero"
                        : (a == b || a == c || b == c) ? "Triângulo isósceles" : "Triângulo escaleno";

        System.out.println(tipo);

        Teclado.close();
    }
}
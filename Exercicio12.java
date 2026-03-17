import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Informe uma nota de 0 a 10:");
        int nota = Teclado.nextInt();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Status: A");
        } else if (nota >= 7) {
            System.out.println("Status: B");
        } else if (nota >= 5) {
            System.out.println("Status: C");
        } else if (nota >= 0) {
            System.out.println("Status: D");
        } else {
            System.out.println("Nota inválida");
        }

        Teclado.close();
    }
}
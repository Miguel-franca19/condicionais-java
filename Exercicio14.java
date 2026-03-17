import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("informe o primeiro numero ");
        int n1 = Teclado.nextInt();
        System.out.println("informe o segundo numero numero ");
        int n2 = Teclado.nextInt();
        System.out.println("informe o terceiro numero ");
        int n3 = Teclado.nextInt();
        String resultado = (n1 > n2 && n1 > n3) ? "o primeiro numero é maior"
                : (n2 > n1 && n2 > n3) ? "o segundo numero é maior"
                        : (n3 > n1 && n3 > n2) ? "o terceiro numero é maior" : "todos sao iguais";
        System.out.println(resultado);

        Teclado.close();

    }
}
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args, Scanner Teclado) {
        System.out.println("Insira o primeiro numero para a verificação");
        int n = Teclado.nextInt();
        System.out.println("Insira o segundo numero para a verificação");
        int n2 = Teclado.nextInt();
        String resultado = (n>n2) ? n+" é maior" : n2+" é maior";
        System.out.println(resultado);
    }
}

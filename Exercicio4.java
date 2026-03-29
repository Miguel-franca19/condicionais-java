import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args, Scanner Teclado) {
        System.out.println("Insira uma temperatura em °C a ser verificada:");
        double temp = Teclado.nextDouble();

        String result = (temp<15) ? "fria" : (temp>=15 && temp<=25) ?
        "agradavel" : "quente";

        System.out.println("A temperatura está "+result);
    }
}
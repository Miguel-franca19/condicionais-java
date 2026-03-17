import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Insira uma temperatura em °C a ser verificada:");
        Scanner Teclado = new Scanner(System.in);
        double temp = Teclado.nextDouble();

        String result = (temp<15) ? "fria" : (temp>=15 && temp<=25) ?
        "agradavel" : "quente";

        System.out.println("A temperatura está "+result);
        Teclado.close();
    }
}
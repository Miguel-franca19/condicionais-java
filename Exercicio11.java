import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Insira a sua idade");
        int idade = Teclado.nextInt();

        String valor = (idade < 12) ? "10,00R$" : (idade >= 12 && idade < 60) ? "20,00R$" : "10,00R$";
        System.out.println("O valor do seu ingresso é " + valor);
        Teclado.close();
    }
}

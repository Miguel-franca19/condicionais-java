import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite o valor da compra:");
        double preco = Teclado.nextDouble();
        double desconto = (preco > 500) ? 0.20 : (preco >= 200) ? 0.10 : 0.0;
        double valorFinal = preco - (preco * desconto);

        System.out.println("Valor final: R$ " + valorFinal);

        Teclado.close();
    }
}
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args, Scanner Teclado) {

        System.out.println("Insira um numero");
        int n = Teclado.nextInt();

        String result = (n % 3 == 0 && n % 5 == 0) ? "O numero é divisivel por 3 e 5"
                : (n % 3 == 0) ? "O numero é divisivel apens por 3"
                        : (n % 5 == 0) ? "O umero e divisivel apenas por 5"
                                : "O numero não é divisivel por nenhum dos dois";
        System.out.println(result);

    }
}

import java.util.Scanner;
import java.util.Random;

public class Exercicio20 {
    public static void main(String[] args, Scanner Teclado) {

        System.out.println("Ola, jogador 1, escolha entre 'pedra', 'papel' ou 'tesoura'");
        String escolha1 = Teclado.nextLine();
        Random aleatorio = new Random();
        String[] escolhas = { "pedra", "papel", "tesoura" };
        String escolha2 = escolhas[aleatorio.nextInt(escolhas.length)];
        System.out.println("A escolha do jogador 2 foi " + escolha2);

        boolean empate = false;

        if (escolha1.equals("pedra")) {
            if (escolha2.equals("papel")) {
                System.out.println("Jogador 2 ganhou");
            } else if (escolha2.equals("tesoura")) {
                System.out.println("Jogador 1 ganhou");
            } else {
                empate = true;
            }
        } else if (escolha1.equals("papel")) {
            if (escolha2.equals("tesoura")) {
                System.out.println("Jogador 2 ganhou");
            } else if (escolha2.equals("pedra")) {
                System.out.println("Jogador 1 ganhou");
            } else {
                empate = true;
            }
        } else if (escolha1.equals("tesoura")) {
            if (escolha2.equals("pedra")) {
                System.out.println("Jogador 2 ganhou");
            } else if (escolha2.equals("papel")) {
                System.out.println("Jogador 1 ganhou");
            } else {
                empate = true;
            }
        }

        if (empate) {
            System.out.println("O jogo empatou");
        }



    }
}
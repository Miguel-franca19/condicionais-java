import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args, Scanner Teclado) {
        System.out.println("Insira a velocidade do veículo");
        double velocidade = Teclado.nextDouble();
        System.out.println("Insira o limite da via");
        double limite = Teclado.nextDouble();
        if (velocidade <= limite) {
            System.out.println("Sem multa");
        } else if (velocidade <= limite * 1.20) {
            System.out.println("Multa leve");
        } else if (velocidade <= limite * 1.50) {
            System.out.println("Multa grave");
        } else {
            System.out.println("Multa gravíssima + suspensão");
        }

    }
}
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Insirra o primeiro valor");
        double a = Teclado.nextDouble();
        System.out.println("Insira o segundo valor");
        double b = Teclado.nextDouble();
        System.out.println("Escolha um operador ('+', '-', '*', '/')");
        String operador = Teclado.next();
        double result = 0;

        switch (operador) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                String.valueOf(result);
                System.out.println("Operador invalido");
                break;
        }
        System.out.println("O resultado é: "+result);
        Teclado.close();
    }
}

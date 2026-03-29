import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args, Scanner Teclado){
        System.out.println("Insira um numero para a verificação");
        int n = Teclado.nextInt();
        String result = (n%2==0) ? "É par": "É impar";
        System.out.println(result);
        
    }
}
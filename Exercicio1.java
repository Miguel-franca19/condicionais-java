import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        System.out.println("Insira um numero para a verificação");
        Scanner Teclado = new Scanner(System.in);
        int n = Teclado.nextInt();
        String result = (n%2==0) ? "É par": "É impar";
        System.out.println(result);
        Teclado.close();
    }
}
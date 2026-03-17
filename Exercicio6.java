import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Informe um ano para ser verificado");
        int ano = Teclado.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        Teclado.close();
    }
}
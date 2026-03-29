import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args, Scanner Teclado) {
        String userCerto = "user";
        String senhaCerta = "1234";
        System.out.println("Digite o usuário:");
        String user = Teclado.nextLine();
        System.out.println("Digite a senha:");
        String senha = Teclado.nextLine();
        String resultado = (userCerto.equals(user) && senhaCerta.equals(senha)) ? "Acesso permitido"
                : "Acesso negado";
        System.out.println(resultado);

    }
}
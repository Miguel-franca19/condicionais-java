import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args, Scanner Teclado) {
        System.out.println("Insira a primeira nota do aluno para ser verificada");
        double n1 = Teclado.nextInt();
        System.out.println("Insira a segunda nota do aluno para ser verificada");
        double n2 = Teclado.nextInt();
        System.out.println("Insira a terceira nota do aluno para ser verificada");
        double n3 = Teclado.nextInt();
        System.out.println("Insira a quarta nota do aluno para ser verificada");
        double n4 = Teclado.nextInt();
        double media = (n1+n2+n3+n4)/4;

        if (media >= 0 && media <= 10) {
            String situacao = (media>=7)? "Aprovado" : (media<=5 && media<7) ? "Recuperação" : "Reprovado";
            System.out.println(situacao);
            System.out.println("Média: "+media);
        } else {
            System.out.println("Média invalida!! não está entre 0 e 10");
        }
    }
}

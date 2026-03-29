import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args, Scanner Teclado){
        System.out.println("Informe o seu peso");
        double peso = Teclado.nextDouble();
        System.out.println("Informe e altura");
        double altura = Teclado.nextDouble();
        double imc = peso/(altura*altura);

        String result = (imc<18.5) ? "abaixo do peso" : (imc>=18.5 && imc<25) ?
        "no peso normal" : (imc>=25 && imc<30) ? "com sobrepeso" : "com obesidade";
        String fSaudavel = (result == "no peso normal") ? "dentro" :"fora";

        System.out.println("Voce está "+result);
        System.out.println("voce está "+fSaudavel+" da faixa saudavel");

    }
}

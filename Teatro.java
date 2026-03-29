import java.util.ArrayList;
import java.util.Scanner;
//Profesor, utilizei a arraylist porque achei melhor doq usar uma array normal 
//Miguel França 2°DS

public class Teatro {
    public static void main(String[] args) {
        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(new Sala("Sala Principal", "O fantasma da opera", 50.00));
        salas.add(new Sala("Sala Beethoven", "Cronicas de narnia", 100.00));
        System.out.println("Bem vindo ao teatro devisate!!");
        Scanner Teclado = new Scanner(System.in);
        mostrarMenu(salas, Teclado);
        Teclado.close();

    }

    public static void mostrarMenu(ArrayList<Sala> salas, Scanner Teclado) {
        int escolha = 0;
        Sala salaEscolhida;
        int linha;
        char linhaLetra;
        int coluna;
        // Funcao para exibir o menu e verificar a escolha do usuario
        do {

            System.out.println("===== TEATRO DEVISATE =====");
            System.out.println("1 - Ver mapa de assentos");// feito
            System.out.println("2 - Reservar assento");// fetio
            System.out.println("3 - Comprar assento");// feito
            System.out.println("4 - Cancelar reserva");// feito
            System.out.println("5 - Relatório da sala");// feito
            System.out.println("6 - Cadastrar sala");// feito
            System.out.println("7 - Lista de exercicios");// FINALMENTE feito
            System.out.println("0 - Sair do teatro");// feito
            escolha = Teclado.nextInt();
            switch (escolha) {
                case 1:
                    salaEscolhida = escolherSala(salas, Teclado);
                    salaEscolhida.mostrarMapa();
                    System.out.println();
                    break;
                case 2:
                    salaEscolhida = escolherSala(salas, Teclado);
                    System.out.println("Escolha a linha na qual deseja reservar o seu assento (A - L):");
                    linhaLetra = Teclado.next().toUpperCase().charAt(0);
                    linha = linhaLetra - 'A';

                    System.out.println("Escolha a coluna na qual deseja reservar o seu assento (1 - 12):");
                    coluna = Teclado.nextInt() - 1;
                    salaEscolhida.reservarAssento(linha, coluna);
                    System.out.println();

                    break;
                case 3:
                    salaEscolhida = escolherSala(salas, Teclado);
                    System.out.println("Escolha a linha na qual deseja reservar o seu assento (A - L):");
                    linhaLetra = Teclado.next().toUpperCase().charAt(0);
                    linha = linhaLetra - 'A';

                    System.out.println("Escolha a coluna na qual deseja reservar o seu assento (1 - 12):");
                    coluna = Teclado.nextInt() - 1;
                    salaEscolhida.comprarAssento(linha, coluna);
                    System.out.println();

                    break;
                case 4:
                    System.out.println("4");
                    salaEscolhida = escolherSala(salas, Teclado);
                    System.out.println("Escolha a linha na qual deseja reservar o seu assento (A - L):");
                    linhaLetra = Teclado.next().toUpperCase().charAt(0);
                    linha = linhaLetra - 'A';

                    System.out.println("Escolha a coluna na qual deseja reservar o seu assento (1 - 12):");
                    coluna = Teclado.nextInt() - 1;
                    salaEscolhida.cancelarReserva(linha, coluna);
                    System.out.println();

                    break;
                case 5:
                    salaEscolhida = escolherSala(salas, Teclado);
                    salaEscolhida.relatorioDeSala();
                    System.out.println();
                    break;
                case 6:
                    cadastrarSala(salas, Teclado);
                    System.out.println();
                    break;
                case 7:
                    menuExercicios(Teclado);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Obrigado por usar o meu sistema!");
                    break;
                default:
                    System.out.println("Erro!");
                    System.out.println("Escolha uma opção válida, por favor");
                    System.out.println();
                    break;
            }
        } while (escolha != 0);

    }

    public static Sala escolherSala(ArrayList<Sala> salas, Scanner Teclado) {
        int opcao;
        do {
            System.out.println("===== ESCOLHA A SALA =====");
            for (int i = 0; i < salas.size(); i++) {
                System.out.print((i + 1) + " - " + salas.get(i).nome);
                System.out.println(" (" + salas.get(i).espetaculo + ")");
            }

            opcao = Teclado.nextInt();
            if (opcao > 0 && opcao <= salas.size()) {
                return salas.get(opcao - 1);
            } else {
                System.out.println("Opção inválida.");
            }

        } while (true);
    }

    public static void cadastrarSala(ArrayList<Sala> salas, Scanner Teclado) {
        System.out.println("Nome da sala:");
        String nome = Teclado.next();
        System.out.println("Espetáculo:");
        String espetaculo = Teclado.next();
        System.out.println("Preço:");
        double preco = Teclado.nextDouble();

        if (!nome.equals("") && !espetaculo.equals("") && preco != 0) {
            Sala nova = new Sala(nome, espetaculo, preco);
            salas.add(nova);
            System.out.println("Sala cadastrada com sucesso!");
        } else {
            System.out.println("Não deixe nenhum campo vazio!");
        }
    }

    public static void menuExercicios(Scanner Teclado) {

        String[] titulos = new String[20];
        String[] enunciados = new String[20];

        titulos[0] = "Par ou Ímpar";
        enunciados[0] = "Leia um número inteiro e informe se ele é par ou ímpar.";

        titulos[1] = "Maior de Dois Números";
        enunciados[1] = "Leia dois números inteiros e exiba qual é o maior.";

        titulos[2] = "Aprovação Escolar";
        enunciados[2] = "Leia a média de um aluno (0 a 10) e exiba se esta aprovado, reprovado ou de recuperação";

        titulos[3] = "Classificação de Temperatura";
        enunciados[3] = "Leia a temperatura em graus Celsius e classifique se está quente fria ou agradável";

        titulos[4] = "Calculadora Simples com Switch";
        enunciados[4] = "Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch.";

        titulos[5] = "Ano Bissexto";
        enunciados[5] = "Leia um ano e informe se ele é bissexto ou não.";

        titulos[6] = "Triângulo Válido";
        enunciados[6] = "Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, isósceles ou escaleno.";

        titulos[7] = "IMC";
        enunciados[7] = "Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique o IMC.";

        titulos[8] = "Dia da Semana com Switch";
        enunciados[8] = "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. Para qualquer outro número, exiba 'Dia inválido'.";

        titulos[9] = "Positivo, Negativo ou Zero";
        enunciados[9] = "Leia um número e informe se é positivo, negativo ou zero.";

        titulos[10] = "Ingresso de Cinema";
        enunciados[10] = "Leia a idade e exiba o valor do ingresso.";

        titulos[11] = "Nota por Conceito";
        enunciados[11] = "Leia uma nota (0-10) e exiba o conceito:";

        titulos[12] = "Estação do Ano com Switch";
        enunciados[12] = "Leia o número do mês (1-12) e exiba a estação do ano correspondente (considere o hemisfério sul).";

        titulos[13] = "Maior de Três Números";
        enunciados[13] = "Leia três números inteiros e exiba qual é o maior entre os três. Trate o caso de empate.";

        titulos[14] = "Verificador de Login";
        enunciados[14] = "Defina um usuário e senha fixos no código. Leia o usuário e a senha digitados e exiba 'Acesso permitido' ou 'Acesso negado'. Obrigatório: use o operador ternário para exibir a mensagem.";

        titulos[15] = "Múltiplo de 3 e 5";
        enunciados[15] = "Leia um número inteiro e informe os multiplos.";

        titulos[16] = "Desconto em Compra";
        enunciados[16] = "Uma loja dá desconto conforme o valor da compra. Leia o valor e exiba o valor final após o desconto.";

        titulos[17] = "Número Romano com Switch";
        enunciados[17] = "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano usando switch.";

        titulos[18] = "Velocidade e Multa";
        enunciados[18] = "Leia a velocidade de um veículo e o limite da via. Classifique a multa.";

        titulos[19] = "Jogo Pedra, Papel e Tesoura";
        enunciados[19] = "Leia a escolha de dois jogadores ('pedra', 'papel' ou 'tesoura') e determine quem venceu ou se houve empate usando if/else encadeado. Desafio: use o operador ternário para exibir o resultado final ('Jogador 1 venceu', 'Jogador 2 venceu' ou 'Empate').";

        int paginaAtual = 0;
        int itensPorPagina = 7;
        int totalExercicios = 20;
        int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);
        String opcao;

        do {
            int inicio = paginaAtual * itensPorPagina;
            int fim = Math.min(inicio + itensPorPagina, totalExercicios);

            System.out.println("=========  LISTA DE EXERCÍCIOS =========");
            System.out.println("Página " + (paginaAtual + 1));
            System.out.println();

            for (int i = inicio; i < fim; i++) {
                System.out.println((i + 1) + " - " + titulos[i]);
            }
            System.out.println("Opções:");
            if (paginaAtual > 0) {
                System.out.println("A - Página anterior");
            }
            if (paginaAtual < totalPaginas - 1) {
                System.out.println("P - Próxima página");
            }

            System.out.println("V - Voltar");
            System.out.print("Escolha: ");
            opcao = Teclado.next().toUpperCase();

            boolean ehNumero = opcao.length() > 0 ? true : false;
            for (int i = 0; i < opcao.length(); i++) {
                if (!Character.isDigit(opcao.charAt(i))) {
                    ehNumero = false;
                    break;
                }
            }

            if (ehNumero) {
                int numero = Integer.parseInt(opcao);
                if (numero >= 1 && numero <= totalExercicios) {
                    System.out.println();
                    System.out.println(titulos[numero - 1]);
                    System.out.println(enunciados[numero - 1]);
                    System.out.println();
                    System.out.println();
                    executarExercicio(numero, Teclado);
                } else {
                    System.out.println("Exercício inválido.");
                }
            } else {
                switch (opcao) {

                    case "P":
                        paginaAtual = (paginaAtual < totalPaginas - 1) ? paginaAtual + 1 : paginaAtual;
                        break;
                    case "A":
                        paginaAtual = (paginaAtual > 0) ? paginaAtual - 1 : paginaAtual;
                        break;
                    case "V":
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } while (!opcao.equals("V"));
    }

    public static void executarExercicio(int opcao, Scanner Teclado) {
        // teve q ser assim kkkkk
        switch (opcao) {
            case 1:
                Exercicio1.main(null, Teclado);
                System.out.println();
                break;

            case 2:
                Exercicio2.main(null, Teclado);
                System.out.println();
                break;

            case 3:
                Exercicio3.main(null, Teclado);
                System.out.println();
                break;

            case 4:
                Exercicio4.main(null, Teclado);
                System.out.println();
                break;

            case 5:
                Exercicio5.main(null, Teclado);
                System.out.println();
                break;

            case 6:
                Exercicio6.main(null, Teclado);
                System.out.println();
                break;

            case 7:
                Exercicio7.main(null, Teclado);
                System.out.println();
                break;

            case 8:
                Exercicio8.main(null, Teclado);
                System.out.println();
                break;

            case 9:
                Exercicio9.main(null, Teclado);
                System.out.println();
                break;

            case 10:
                Exercicio10.main(null, Teclado);
                System.out.println();
                break;

            case 11:
                Exercicio11.main(null, Teclado);
                System.out.println();
                break;

            case 12:
                Exercicio12.main(null, Teclado);
                System.out.println();
                break;

            case 13:
                Exercicio13.main(null, Teclado);
                System.out.println();
                break;

            case 14:
                Exercicio14.main(null, Teclado);
                System.out.println();
                break;

            case 15:
                Exercicio15.main(null, Teclado);
                System.out.println();
                break;

            case 16:
                Exercicio16.main(null, Teclado);
                System.out.println();
                break;

            case 17:
                Exercicio17.main(null, Teclado);
                System.out.println();
                break;

            case 18:
                Exercicio18.main(null, Teclado);
                System.out.println();
                break;

            case 19:
                Exercicio10.main(null, Teclado);
                System.out.println();
                break;

            case 20:
                Exercicio20.main(null, Teclado);
                System.out.println();
                break;

            default:
                break;
        }
    }

}

class Sala {
    String nome;
    String espetaculo;
    double preco;
    String[][] cadeiras = new String[12][12];

    Sala(String nome, String espetaculo, double preco) {
        this.nome = nome;
        this.espetaculo = espetaculo;
        this.preco = preco;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                cadeiras[i][j] = "[ ]";
            }
        }
    }

    public void mostrarMapa() {
        System.out.print("   ");

        for (int a = 0; a < cadeiras.length; a++) {
            System.out.printf("%3d", a + 1);
        }
        System.out.println();
        for (int i = 0; i < cadeiras.length; i++) {
            System.out.printf("%3c", (char) ('A' + i));

            for (int j = 0; j < cadeiras.length; j++) {
                System.out.printf("%3s", cadeiras[i][j]);
            }

            System.out.println();
        }
        int livres = 0;
        int ocupadas = 0;
        int reservadas = 0;
        for (int i = 0; i < cadeiras.length; i++) {
            for (int j = 0; j < cadeiras.length; j++) {
                if (cadeiras[i][j].equals("[ ]")) {
                    livres++;
                } else if (cadeiras[i][j].equals("[R]")) {
                    reservadas++;
                } else if (cadeiras[i][j].equals("[X]")) {
                    ocupadas++;
                }

            }
        }
        System.out.println("Livres: " + livres);
        System.out.println("Reservadas: " + reservadas);
        System.out.println("Ocupadas: " + ocupadas);

    }

    public void reservarAssento(int linha, int coluna) {
        if ((linha >= 0 && linha < 12) && (coluna >= 0 && coluna < 12)) {
            if (cadeiras[linha][coluna].equals("[ ]")) {
                cadeiras[linha][coluna] = "[R]";
                System.out.println("Assento reservado com sucesso!!");
            } else {
                System.out.println("Assento já reservado ou comprado");
            }
        } else {
            System.out.println("Escolha um assento dentro do mapa!!");
        }

    }

    public void comprarAssento(int linha, int coluna) {
        if ((linha >= 0 && linha < 12) && (coluna >= 0 && coluna < 12)) {
            if (cadeiras[linha][coluna].equals("[ ]")) {
                cadeiras[linha][coluna] = "[X]";
                System.out.println("Assento comprado com sucesso!!");

            } else if (cadeiras[linha][coluna].equals("[R]")) {
                cadeiras[linha][coluna] = "[X]";
                System.out.println("Assento comprado com sucesso!!");
            } else {
                System.out.println("Assento já reservado ou comprado");
            }
        } else {
            System.out.println("Escolha um assento dentro do mapa!!");
        }

    }

    public void cancelarReserva(int linha, int coluna) {
        if ((linha >= 0 && linha < 12) && (coluna >= 0 && coluna < 12)) {
            if (cadeiras[linha][coluna].equals("[R]")) {
                cadeiras[linha][coluna] = "[ ]";
                System.out.println("Reserva cancelada com sucesso!!");

            } else {
                System.out.println("O assento escolhido não está reservado");
            }
        } else {
            System.out.println("Escolha um assento dentro do mapa!!");
        }

    }

    public void relatorioDeSala() {
        int livres = 0;
        int ocupadas = 0;
        int reservadas = 0;
        int numeroDeAssentos = 0;
        for (int i = 0; i < cadeiras.length; i++) {
            for (int j = 0; j < cadeiras.length; j++) {
                if (cadeiras[i][j].equals("[ ]")) {
                    livres++;
                } else if (cadeiras[i][j].equals("[R]")) {
                    reservadas++;
                } else if (cadeiras[i][j].equals("[X]")) {
                    ocupadas++;
                }
                numeroDeAssentos++;

            }

        }
        System.out.println();

        double totalArrecadado = ocupadas * preco;
        double totalEmReservas = reservadas * (preco / 2);
        double receitaPotencial = (totalEmReservas * 2) + totalArrecadado;
        double potencialMaximo = numeroDeAssentos * preco;

        System.out.println("=====RELATORIO DA SALA=====");
        System.out.println();
        System.out.println("Assentos livres: " + livres);
        System.out.println("Assentos reservados: " + reservadas);
        System.out.println("Assentos ocupados: " + ocupadas);
        System.out.println("Preço do ingresso: " + preco + "R$");
        System.out.println();
        System.out.println("Total arrecadado: " + totalArrecadado + "R$");
        System.out.println("Total em reservas: " + totalEmReservas + "R$");
        System.out.println("Receita potencial: " + receitaPotencial + "R$");
        System.out.println();
        System.out.println("Receita maxima da sala: " + potencialMaximo + "R$");
    }

}
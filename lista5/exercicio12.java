package lista5;

import java.util.Random;
import java.util.Scanner;

public class exercicio12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        int jogador = jogadaJogador();
        int computador = jogadaComputador();
        String vencedor = verificarVencedor(jogador, computador);
        mostrarResultado(jogador, computador, vencedor);
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("=== PEDRA, PAPEL OU TESOURA ===");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
    }

    public static int jogadaComputador() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static int jogadaJogador() {
        System.out.print("Escolha sua jogada (1-3): ");
        return sc.nextInt();
    }

    public static String verificarVencedor(int jogador, int computador) {
        if (jogador < 1 || jogador > 3) return "Jogada inválida!";
        if (jogador == computador) return "Empate!";
        if ((jogador == 1 && computador == 3) ||
            (jogador == 2 && computador == 1) ||
            (jogador == 3 && computador == 2)) {
            return "Você venceu!";
        }
        return "Computador venceu!";
    }

    public static void mostrarResultado(int jogador, int computador, String resultado) {
        String[] opcoes = {"", "Pedra", "Papel", "Tesoura"};
        if (jogador >= 1 && jogador <= 3) {
            System.out.println("Você escolheu: " + opcoes[jogador]);
            System.out.println("Computador escolheu: " + opcoes[computador]);
        }
        System.out.println("Resultado: " + resultado);
    }
}


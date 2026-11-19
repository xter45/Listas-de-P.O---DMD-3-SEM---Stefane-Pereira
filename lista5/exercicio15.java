package lista5;

import java.util.Random;
import java.util.Scanner;

public class exercicio15 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        iniciarJogo();
    }

    public static void iniciarJogo() {
        String jogador = criarJogador();
        int vidaJogador = 100;
        int vidaInimigo = 100;

        while (!verificarVitoria(vidaJogador, vidaInimigo)) {
            mostrarMenu(jogador, vidaJogador, vidaInimigo);
            int acao = sc.nextInt();
            int[] vidas = executarTurno(acao, vidaJogador, vidaInimigo);
            vidaJogador = vidas[0];
            vidaInimigo = vidas[1];
        }

        encerrarJogo(jogador, vidaJogador);
        sc.close();
    }

    public static String criarJogador() {
        System.out.print("Digite o nome do guerreiro: ");
        return sc.nextLine();
    }

    public static void mostrarMenu(String jogador, int vidaJogador, int vidaInimigo) {
        System.out.println("\n----------------------------");
        System.out.println(jogador + ": " + vidaJogador + " HP | Monstro: " + vidaInimigo + " HP");
        System.out.println("1 - Atacar | 2 - Curar");
        System.out.print("Sua escolha: ");
    }

    public static int[] executarTurno(int acao, int vidaJogador, int vidaInimigo) {
        if (acao == 1) {
            int dano = random.nextInt(15) + 10;
            vidaInimigo = Math.max(0, vidaInimigo - dano);
            System.out.println("Você atacou e causou " + dano + " de dano!");
        } else if (acao == 2) {
            int cura = random.nextInt(12) + 8;
            vidaJogador = Math.min(100, vidaJogador + cura);
            System.out.println("Você recuperou " + cura + " de vida!");
        } else {
            System.out.println("Ação inválida! Perdeu a vez.");
        }

        if (vidaInimigo > 0) {
            int danoInimigo = random.nextInt(14) + 6;
            vidaJogador = Math.max(0, vidaJogador - danoInimigo);
            System.out.println("O Monstro atacou e causou " + danoInimigo + " de dano!");
        }

        return new int[]{vidaJogador, vidaInimigo};
    }

    public static boolean verificarVitoria(int vidaJogador, int vidaInimigo) {
        return vidaJogador <= 0 || vidaInimigo <= 0;
    }

    public static void encerrarJogo(String jogador, int vidaJogador) {
        System.out.println("\n=== FIM DE JOGO ===");
        if (vidaJogador > 0) {
            System.out.println("Vitória! " + jogador + " derrotou o monstro!");
        } else {
            System.out.println("Derrota! " + jogador + " foi vencido.");
        }
    }
}

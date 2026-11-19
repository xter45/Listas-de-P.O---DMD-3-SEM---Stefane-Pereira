package lista5;

import java.util.Scanner;

public class exercicio16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tabuleiro = criarTabuleiro();
        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean venceu = false;

        while (jogadas < 9 && !venceu) {
            exibirTabuleiro(tabuleiro);
            int[] posicao = lerJogada(jogadorAtual);

            if (!validarJogada(tabuleiro, posicao[0], posicao[1])) {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            registrarJogada(tabuleiro, posicao[0], posicao[1], jogadorAtual);
            jogadas++;
            venceu = verificarVitoria(tabuleiro, jogadorAtual);

            if (!venceu) {
                jogadorAtual = alternarJogador(jogadorAtual);
            }
        }

        exibirTabuleiro(tabuleiro);
        exibirResultadoFinal(venceu, jogadorAtual);
        sc.close();
    }

    public static char[][] criarTabuleiro() {
        return new char[][]{
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + (j < 2 ? "|" : ""));
            }
            System.out.println(i < 2 ? "\n  -----" : "");
        }
    }

    public static int[] lerJogada(char jogador) {
        System.out.print("Jogador " + jogador + " - Linha (0-2): ");
        int linha = sc.nextInt();
        System.out.print("Jogador " + jogador + " - Coluna (0-2): ");
        int coluna = sc.nextInt();
        return new int[]{linha, coluna};
    }

    public static boolean validarJogada(char[][] tabuleiro, int linha, int coluna) {
        return linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2 && tabuleiro[linha][coluna] == ' ';
    }

    public static void registrarJogada(char[][] tabuleiro, int linha, int coluna, char jogador) {
        tabuleiro[linha][coluna] = jogador;
    }

    public static boolean verificarVitoria(char[][] t, char j) {
        for (int i = 0; i < 3; i++) {
            if ((t[i][0] == j && t[i][1] == j && t[i][2] == j) ||
                (t[0][i] == j && t[1][i] == j && t[2][i] == j)) {
                return true;
            }
        }
        return (t[0][0] == j && t[1][1] == j && t[2][2] == j) ||
               (t[0][2] == j && t[1][1] == j && t[2][0] == j);
    }

    public static char alternarJogador(char jogadorAtual) {
        return (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public static void exibirResultadoFinal(boolean venceu, char vencedor) {
        if (venceu) {
            System.out.println("\nParabéns! Jogador " + vencedor + " venceu!");
        } else {
            System.out.println("\nEmpate (Deu velha)!");
        }
    }
}

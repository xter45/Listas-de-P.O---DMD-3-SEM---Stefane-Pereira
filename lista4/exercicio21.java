package lista4;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean venceu = false;

        while (jogadas < 9 && !venceu) {
            System.out.println("\n  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + (j < 2 ? "|" : ""));
                }
                System.out.println(i < 2 ? "\n  -----" : "");
            }

            System.out.print("Jogador " + jogadorAtual + " - Linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Jogador " + jogadorAtual + " - Coluna (0-2): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            for (int i = 0; i < 3; i++) {
                if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                    (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                    venceu = true;
                }
            }
            if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
                venceu = true;
            }

            if (venceu) {
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        if (!venceu) {
            System.out.println("Empate (Deu velha)!");
        }
        sc.close();
    }
}




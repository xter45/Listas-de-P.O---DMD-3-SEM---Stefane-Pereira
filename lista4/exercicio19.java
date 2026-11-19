package lista4;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz É identidade.");
        } else {
            System.out.println("A matriz NÃO é identidade.");
        }
        sc.close();
    }
}




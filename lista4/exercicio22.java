package lista4;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] lista = new int[9];
        int k = 0;
        boolean repetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                lista[k++] = matriz[i][j];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (lista[i] == lista[j]) {
                    repetido = true;
                    break;
                }
            }
        }

        if (repetido) {
            System.out.println("A matriz possui números repetidos.");
        } else {
            System.out.println("A matriz NÃO possui números repetidos.");
        }
        sc.close();
    }
}




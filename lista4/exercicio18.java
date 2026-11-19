package lista4;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] soma = new int[3][3];

        System.out.println("Matriz 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m2[i][j] = sc.nextInt();
                soma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Matriz Soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}


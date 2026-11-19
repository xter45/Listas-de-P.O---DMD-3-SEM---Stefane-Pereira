package lista4;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X para buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + x + " está presente no array.");
        } else {
            System.out.println("O valor " + x + " NÃO está presente no array.");
        }
        sc.close();
    }
}


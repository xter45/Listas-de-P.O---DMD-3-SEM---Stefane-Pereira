package lista4;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X para contar: ");
        int x = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                contador++;
            }
        }

        System.out.println("O valor " + x + " aparece " + contador + " vez(es).");
        sc.close();
    }
}




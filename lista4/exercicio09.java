package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}




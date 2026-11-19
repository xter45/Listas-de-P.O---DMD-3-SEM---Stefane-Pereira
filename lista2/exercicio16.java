package lista2;

import java.util.Scanner;

public class exercicio16 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
        System.out.println(nota + ": " + (valor / nota));
        valor %= nota;
        }
        sc.close();
    }
}



package lista5;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        exibirTabuada(lerNumero());
    }

    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static void mostrarLinha(int numero, int i) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    public static void exibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) mostrarLinha(numero, i);
    }
}

package lista5;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(numero, par);
    }

    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }

    public static void mostrarResultado(int num, boolean par) {
        if (par) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}

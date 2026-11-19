package lista5;

import java.util.Scanner;

public class exercicio05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        int opcao = (int) lerNumero("Escolha uma opção: ");
        double n1 = lerNumero("Digite o 1º número: ");
        double n2 = lerNumero("Digite o 2º número: ");

        switch (opcao) {
            case 1: System.out.println("Resultado: " + somar(n1, n2)); break;
            case 2: System.out.println("Resultado: " + subtrair(n1, n2)); break;
            case 3: System.out.println("Resultado: " + multiplicar(n1, n2)); break;
            case 4: System.out.println("Resultado: " + dividir(n1, n2)); break;
            default: System.out.println("Opção inválida.");
        }
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
    }

    public static double lerNumero(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) { System.out.println("Erro: divisão por zero."); return 0; }
        return a / b;
    }
}

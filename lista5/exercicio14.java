package lista5;

import java.util.Scanner;

public class exercicio14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double saldo = 500.00;
        int opcao;

        do {
            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = depositar(saldo);
                    break;
                case 3:
                    saldo = sacar(saldo);
                    break;
                case 4:
                    encerrarSistema();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n=== CAIXA ELETRÔNICO ===");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void consultarSaldo(double saldo) {
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }

    public static double depositar(double saldo) {
        System.out.print("Valor do depósito: R$ ");
        double valor = sc.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito efetuado!");
        } else {
            System.out.println("Valor inválido.");
        }
        return saldo;
    }

    public static double sacar(double saldo) {
        System.out.print("Valor do saque: R$ ");
        double valor = sc.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        return saldo;
    }

    public static void encerrarSistema() {
        System.out.println("Obrigado por utilizar nosso caixa eletrônico!");
    }
}

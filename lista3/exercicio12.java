package lista3;

import java.util.Scanner;

public class exercicio12 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int opcao;
do {
System.out.println("1 - Somar\n2 - Subtrair\n3 - Sair");
System.out.print("Escolha uma opção: ");
opcao = sc.nextInt();

if (opcao == 1 || opcao == 2) {
System.out.print("Digite o 1º número: ");
double a = sc.nextDouble();
System.out.print("Digite o 2º número: ");
double b = sc.nextDouble();
if (opcao == 1) System.out.println("Soma: " + (a + b));
else System.out.println("Subtração: " + (a - b));
} else if (opcao != 3) {
System.out.println("Opção inválida!");
}
} while (opcao != 3);

System.out.println("Programa encerrado.");
sc.close();
}
	}



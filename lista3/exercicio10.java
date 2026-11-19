package lista3;

import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int soma = 0;
int num;

do {
System.out.print("Digite um número (0 para sair): ");
num = sc.nextInt();
soma += num;
} while (num != 0);

System.out.println("Soma total: " + soma);
sc.close();
	    }
	}



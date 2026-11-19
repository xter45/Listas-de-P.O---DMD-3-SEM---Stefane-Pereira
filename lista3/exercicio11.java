package lista3;

import java.util.Scanner;

public class exercicio11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num;

do {
System.out.print("Digite um número entre 1 e 10: ");
num = sc.nextInt();
} while (num < 1 || num > 10);

System.out.println("Número válido: " + num);
sc.close();
	    }
}



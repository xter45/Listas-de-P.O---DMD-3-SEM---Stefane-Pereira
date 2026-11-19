package lista3;

import java.util.Scanner;

public class exercicio08 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Quantos números deseja informar? ");
int qtd = sc.nextInt();
double soma = 0;

for (int i = 1; i <= qtd; i++) {
 System.out.print("Digite o " + i + "º número: ");
soma += sc.nextDouble();
	        }
double media = soma / qtd;
System.out.println("Média: " + media);
 sc.close();
	    }
	}



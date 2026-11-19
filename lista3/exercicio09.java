package lista3;


import java.util.Scanner;

public class exercicio09 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite um número inteiro positivo: ");
int num = sc.nextInt();
long fatorial = 1;

for (int i = 1; i <= num; i++) {
fatorial *= i;
	        }
System.out.println(num + "! = " + fatorial);
sc.close();
	    }
	}


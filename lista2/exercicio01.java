package lista2;

	import java.util.Scanner;

public class exercicio01 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite um número inteiro: ");
int num = sc.nextInt();

if (num > 0) {
System.out.println("Positivo");
	        } else if (num < 0) {
	            System.out.println("Negativo");
	        } else {
	            System.out.println("Zero");
	        }
 sc.close();
	    }
	}

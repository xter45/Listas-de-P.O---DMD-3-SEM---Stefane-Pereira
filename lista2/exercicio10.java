package lista2;
import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double v = sc.nextDouble();
System.out.println("Valor final: R$ " + (v >= 100 ? v * 0.9 : v));
sc.close();
	        }
	}


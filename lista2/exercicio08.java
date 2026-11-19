package lista2;

import java.util.Scanner;

public class exercicio08 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
System.out.println("O maior número é: " + Math.max(n1, Math.max(n2, n3)));
sc.close();
    }
}



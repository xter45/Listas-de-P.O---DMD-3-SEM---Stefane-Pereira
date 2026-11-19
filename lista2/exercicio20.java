package lista2;

import java.util.Scanner;

public class exercicio20 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto = 0;
        if (salario > 5000) imposto = salario * 0.20;
        else if (salario > 2000) imposto = salario * 0.10;
        System.out.println("Imposto: R$ " + imposto);
        sc.close();
    }
}



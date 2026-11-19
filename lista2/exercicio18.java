package lista2;

import java.util.Scanner;

public class exercicio18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Sair");
            int op = sc.nextInt();
            if (op == 3) break;
            double a = sc.nextDouble(), b = sc.nextDouble();
            switch (op) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            default: System.out.println("Opção inválida");
            }
        }
sc.close();
    }
}

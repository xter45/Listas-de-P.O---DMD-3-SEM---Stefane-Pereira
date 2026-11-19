package lista2;

import java.util.Scanner;

public class exercicio11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double n1 = sc.nextDouble(), n2 = sc.nextDouble();
char op = sc.next().charAt(0);
switch (op) {
            case '+': System.out.println(n1 + n2); break;
            case '-': System.out.println(n1 - n2); break;
            case '*': System.out.println(n1 * n2); break;
            case '/': System.out.println(n2 != 0 ? n1 / n2 : "Erro: divisão por zero"); break;
            default: System.out.println("Operação inválida");
        }
sc.close();
    }
}


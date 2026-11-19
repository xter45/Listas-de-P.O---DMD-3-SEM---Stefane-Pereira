package lista2;

import java.util.Scanner;

public class exercicio07 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double media = (sc.nextDouble() + sc.nextDouble()) / 2;
System.out.println(media >= 6 ? "Aprovado" : media >= 4 ? "Recuperação" : "Reprovado");
sc.close();
    }
}


package lista2;

import java.util.Scanner;

public class exercicio15 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble(), altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) System.out.println("Abaixo do peso");
        else if (imc <= 24.9) System.out.println("Normal");
        else if (imc <= 29.9) System.out.println("Sobrepeso");
        else System.out.println("Obesidade");
        sc.close();
    }
}


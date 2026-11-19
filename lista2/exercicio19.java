package lista2;

import java.util.Scanner;

public class exercicio19 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp < 15) System.out.println("Frio");
        else if (temp <= 25) System.out.println("Agradável");
        else System.out.println("Quente");
        sc.close();
    }
}



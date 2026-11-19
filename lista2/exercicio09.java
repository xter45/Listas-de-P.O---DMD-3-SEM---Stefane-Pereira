package lista2;

import java.util.Scanner;

public class exercicio09 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String u = sc.next(), s = sc.next();
System.out.println(u.equals("admin") && s.equals("1234") ? "Acesso permitido" : "Acesso negado");
sc.close();
    }
}



package lista2;

import java.util.Scanner;

public class exercicio17 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
for (int i = 0; i < 3; i++) {
String u = sc.next(), s = sc.next();
if (u.equals("admin") && s.equals("1234")) {
System.out.println("Acesso permitido");
sc.close();
return;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Conta bloqueada");
        sc.close();
    }
}


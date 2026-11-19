package lista2;

import java.util.Scanner;

public class exercicio21 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String usuario = sc.next();
String senha = sc.next();

if (usuario.equals("admin") && senha.equals("1234")) {
double saldo = 0;
while (true) {
System.out.println("1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
int op = sc.nextInt();
if (op == 4) break;
switch (op) {

case 1:
System.out.println("Saldo: R$ " + saldo);
break;

case 2:
double deposito = sc.nextDouble();
saldo += deposito;
System.out.println("Depósito realizado");
break;

case 3:
double saque = sc.nextDouble();
if (saque <= saldo) {
saldo -= saque;
System.out.println("Saque realizado");
} else {
System.out.println("Saldo insuficiente");
}
break;
default:
System.out.println("Opção inválida");
	                }
	            }
} else {
System.out.println("Acesso negado");
	        }
sc.close();
	    }
	}


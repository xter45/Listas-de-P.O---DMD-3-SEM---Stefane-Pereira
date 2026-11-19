package lista5;

import java.util.Random;
import java.util.Scanner;

public class exercicio13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = criarPersonagem();
        int vida = 100;

        mostrarStatus(nome, vida);
        int danoCausado = atacar();
        System.out.println(nome + " atacou e causou " + danoCausado + " de dano!");

        vida = receberDano(vida, 35);
        mostrarStatus(nome, vida);

        vida = curar(vida, 20);
        mostrarStatus(nome, vida);

        sc.close();
    }

    public static String criarPersonagem() {
        System.out.print("Digite o nome do personagem: ");
        return sc.nextLine();
    }

    public static void mostrarStatus(String nome, int vida) {
        System.out.println("\n--- STATUS ---");
        System.out.println("Personagem: " + nome);
        System.out.println("Vida: " + vida + "/100");
    }

    public static int atacar() {
        Random random = new Random();
        return random.nextInt(20) + 10;
    }

    public static int receberDano(int vidaAtual, int dano) {
        System.out.println("\n" + "Você recebeu " + dano + " de dano!");
        int novaVida = vidaAtual - dano;
        return Math.max(0, novaVida);
    }

    public static int curar(int vidaAtual, int cura) {
        System.out.println("\n" + "Você se curou em " + cura + " pontos!");
        int novaVida = vidaAtual + cura;
        return Math.min(100, novaVida);
    }
}


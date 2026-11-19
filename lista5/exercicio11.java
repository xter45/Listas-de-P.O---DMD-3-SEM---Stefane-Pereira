package lista5;

import java.util.Random;
import java.util.Scanner;

public class exercicio11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroSecreto = sortearNumero();
        int palpite;
        int tentativas = 0;

        do {
            palpite = lerPalpite();
            tentativas++;
            if (!verificarAcerto(numeroSecreto, palpite)) {
                mostrarDica(numeroSecreto, palpite);
            }
        } while (!verificarAcerto(numeroSecreto, palpite));

        mostrarVitoria(numeroSecreto, tentativas);
        sc.close();
    }

    public static int sortearNumero() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static int lerPalpite() {
        System.out.print("Digite seu palpite (1 a 100): ");
        return sc.nextInt();
    }

    public static boolean verificarAcerto(int numeroSecreto, int palpite) {
        return numeroSecreto == palpite;
    }

    public static void mostrarDica(int numeroSecreto, int palpite) {
        if (palpite < numeroSecreto) {
            System.out.println("Dica: O número secreto é MAIOR.");
        } else {
            System.out.println("Dica: O número secreto é MENOR.");
        }
    }

    public static void mostrarVitoria(int numeroSecreto, int tentativas) {
        System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativa(s)!");
    }
}


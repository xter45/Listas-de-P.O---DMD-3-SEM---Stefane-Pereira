package lista5;

import java.util.Scanner;

public class exercicio04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = lerNota(1);
        double n2 = lerNota(2);
        double n3 = lerNota(3);
        double media = calcularMedia(n1, n2, n3);
        String situacao = verificarSituacao(media);
        mostrarResultado(media, situacao);
        sc.close();
    }

    public static double lerNota(int ordem) {
        System.out.print("Digite a " + ordem + "ª nota: ");
        return sc.nextDouble();
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6.0) return "Aprovado";
        if (media >= 4.0) return "Recuperação";
        return "Reprovado";
    }

    public static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f | Situação: %s%n", media, situacao);
    }
}


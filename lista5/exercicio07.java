package lista5;

public class exercicio07 {
    public static void main(String[] args) {
        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    public static void mostrarNumeros() {
        System.out.println("Números de 1 até 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void mostrarPares() {
        System.out.println("Números pares de 1 até 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void mostrarImpares() {
        System.out.println("Números ímpares de 1 até 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

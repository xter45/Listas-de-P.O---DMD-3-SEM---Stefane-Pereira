package lista5;

public class exercicio02 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int resultado = somar(n1, n2);
        mostrarResultado(resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void mostrarResultado(int soma) {
        System.out.println(soma);
    }
}


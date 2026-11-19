package lista5;

import java.util.Scanner;

public class exercicio10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario = lerUsuario();
        String senha = lerSenha();
        boolean valido = validarLogin(usuario, senha);
        mostrarResultado(valido);
        sc.close();
    }

    public static String lerUsuario() {
        System.out.print("Digite o usuário: ");
        return sc.nextLine();
    }

    public static String lerSenha() {
        System.out.print("Digite a senha: ");
        return sc.nextLine();
    }

    public static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    public static void mostrarResultado(boolean valido) {
        if (valido) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado! Usuário ou senha inválidos.");
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=NÚMEROS PRIMOS-=-=-=-=-=-=-=-=-=");

        int numero;
        do {
            System.out.print("Digite um número: ");

            while (!sc.hasNextInt()) {
                System.out.println("É válido apenas número, tente novamente.");
                sc.next();
                System.out.print("Digite um número: ");
            }

            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("Número inválido. Digite novamente.");
            }

        } while (numero <= 0);

        System.out.println("Números primos até " + numero + ":");
        verifica(numero);

    }

    public static void verifica(int numero) {
        for (int i = 2; i <= numero; i++) {
            if (Primo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

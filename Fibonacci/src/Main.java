import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=SEQUÊNCIA DE FIBONACCI-=-=-=-=-=-=-=");

        System.out.print("Digite um número: ");
        int n = sc.nextInt();


        System.out.println("Os primeiros " + n + " números da Sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(sequencia(i) + " ");
        }
    }

    public static int sequencia(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return sequencia(numero - 1) + sequencia(numero - 2);
        }
    }
}

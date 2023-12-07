import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-=-=-=-=-=-=-=COLISÃO DE TRENS-=-=-=-=-=-=-=");
            System.out.print("Posição do trem A (KM 0-10000): ");
            double posicaoA = obterEntrada(sc);

            System.out.print("Posição do trem B (KM 0-10000): ");
            double posicaoB = obterEntrada(sc);

            System.out.print("Velocidade do trem A (-300 a 300 km/h): ");
            double velocidadeA = obterVelocidade(sc);

            System.out.print("Velocidade do trem B (-300 a 300 km/h): ");
            double velocidadeB = obterEntrada(sc);

            calcularColisao(posicaoA, posicaoB, velocidadeA, velocidadeB);
        } catch (InputMismatchException e) {
            System.out.println("Você digitou um caractere inválido. Por favor, digite novamente:");
        } finally {
            System.out.println("-=-=-=-=-=-=-=FIM DO PROGRAMA-=-=-=-=-=-=-=-=-=");
        }
    }

    private static double obterEntrada(Scanner scanner) {
        double entrada;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.print("Você digitou um caractere inválido. Por favor, digite novamente: ");
                scanner.next();
            }
            entrada = scanner.nextDouble();
            if (entrada < 0 || entrada > 10000) {
                System.out.println("O número deve ser maior ou igual a zero e menor que 10000.");
            }
        } while (entrada < 0 || entrada > 10000);
        return entrada;
    }

    private static double obterVelocidade(Scanner scanner) {
        double entrada;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
            entrada = scanner.nextDouble();
            if (entrada < -300 || entrada > 300) {
                System.out.println("Velocidade inválida. Digite um valor entre -300 e 300.");
            }
        } while (entrada < -300 || entrada > 300);
        return entrada;
    }

    private static void calcularColisao(double posicaoA, double posicaoB, double velocidadeA, double velocidadeB) {
        double tempoColisao = (posicaoB - posicaoA) / (velocidadeA - velocidadeB);

        if (tempoColisao >= 0 && tempoColisao <= 10000 / 300) {
            double posicaoColisao = posicaoA + velocidadeA * tempoColisao;
            System.out.printf("A colisão de trens acontecerá no KM %.0f e ocorrerá após %.0f segundos.\n", posicaoColisao, tempoColisao * 3600);
        } else {
            System.out.println("Os trens não colidirão no intervalo de 0 a 10000 KM.");
        }
    }
}

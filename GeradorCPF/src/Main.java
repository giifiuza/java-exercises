import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=CPF-=-=-=-=-=-=-=-=");
        System.out.print("Digite os 9 primeiros dígitos do CPF: ");
        String cpfUser = sc.next();

        if (cpfUser.length() != 9 || !cpfUser.matches("\\d+")) {
            System.out.println("Entrada inválida. Digite novamente.");
        } else {
            int[] pesos = {10, 11};
            String cpfCerto = cpfUser;

            for (int x = 0; x < 2; x++) {
                int soma = 0;
                int peso = pesos[x];

                for (int i = 0; i < cpfCerto.length(); i++) {
                    soma += (cpfCerto.charAt(i) - '0') * peso;
                    peso--;
                }

                int digitos = (soma % 11 < 2) ? 0 : (11 - soma % 11);
                cpfCerto += digitos;
            }

            System.out.println("CPF corrigido: " + cpfCerto);
        }

    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<>();

        Random rand = new Random();

        System.out.println("-=-=-=-= ELIMINAR METADE -=-=-=-=");
        
        System.out.print("Quantas pessoas serão adicionadas: ");
        int numeroPessoas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < (numeroPessoas)+1; i++) {
            System.out.printf("Digite o %sº nome: ", i);
            String nome = sc.nextLine();
            listaNomes.add(nome);
        }

        int tam = listaNomes.size();
        int numeroDiv;
        if ( tam % 2 == 0){
            numeroDiv = tam/2;
        } else {
            numeroDiv = (tam/2) +1;
        }

        ArrayList<String> Sorteados = new ArrayList<>();

        for(int i = 0; i<numeroDiv; i++){
            int sorteado = rand.nextInt(listaNomes.size());
            Sorteados.add(listaNomes.get(sorteado));

        }

        System.out.println(Sorteados);

    }
}
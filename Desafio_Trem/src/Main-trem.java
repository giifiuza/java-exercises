import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double posA, posB, veloA, veloB;

        while (true){

            System.out.print("Posição do trem A (0-10000): ");
            posA = sc.nextDouble();

            System.out.print("Posição do trem B (0-10000): ");
            posB = sc.nextDouble();

            if( posB > 10000 || posA >  10000){
                System.out.println("Valor inválido, digite novamente");
            }else {
                break;
            }
        }

        while(true){
            System.out.print("Velocidade trem A(0-300Km/h):  ");
            veloA = sc.nextDouble();

            System.out.print("Velocidade trem B(0-300Km/h): ") ;
            veloB = sc.nextDouble()* (-1);

            if(veloA > 300 || veloB > 300){
                System.out.println("Valor inválido, digite novamente");
            }else{
                break;
            }

            if (veloA == 0.0 && veloB == 0.0){
                System.out.println("Velocidades são iguais a 0, os trens não vão colidir.");
            }

        }








    }
}

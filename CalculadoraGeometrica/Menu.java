package ArrayList.Exercises.CalculadoraGeometrica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    double raio;


    void Menu(){

        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("\n-=-=-=-=Calculadora Geométrica-=-=-=-=-");
        System.out.print("[1] - Planas\n" +
                "[2] - Espaciais\n" +
                "Choose an option: ");
        int op = sc.nextInt();
        sc.nextLine();
        while (true){
            switch (op){
                case 1:
                    System.out.println("\n-=-=-=-=Figuras Planas-=-=-=-=-");
                    System.out.print("[1] - Quadrado\n" +
                            "[2] - Circulo\n" +
                            "[3] - Triangulo\n" +
                            "[4] - Retangulo\n" +
                            "[5] - Hexagono Regular\n" +
                            "Choose an option: ");
                    int opcao = sc.nextInt();

                    switch (opcao){
                        case 1:
                            System.out.print("\n-=-=-=-=Calcule-=-=-=-=\n" +
                                    "[1] - Area\n" +
                                    "[2] - Perimetro\n" +
                                    "Choose an option: ");
                            int option = sc.nextInt();

                            switch (option) {
                                case 1:
                                    System.out.print("Input the side: ");
                                    double lado = sc.nextInt();
                                    Quadrado quadrado = new Quadrado(lado);
                                    System.out.printf("%.2f", quadrado.areaQuadrado());
                                    break;
                                case 2:
                                    System.out.print("Input the side: ");
                                    double ladoP = sc.nextInt();
                                    Quadrado pquad = new Quadrado(ladoP);
                                    System.out.printf("%.2f", pquad.perimetroQuadrado());

                            }

                        case 2:
                            System.out.print("\n-=-=-=-=Calcule-=-=-=-=\n" +
                                    "[1] - Area\n" +
                                    "[2] - Perimetro\n" +
                                    "Choose an option: ");
                            int op2 = sc.nextInt();

                            switch (op2) {
                                case 1:
                                    System.out.print("Input the raio: ");
                                    double raio = sc.nextInt();
                                    Circulo circulo = new Circulo(raio);
                                    System.out.printf("%.2f",circulo.calcularArea(), "\n");
                                    break;
                                case 2:
                                    System.out.print("Input the raio: ");
                                    double raioP = sc.nextInt();
                                    Circulo pcir = new Circulo(raioP);
                                    System.out.printf("%.2f",pcir.calcularPerimetro(), "\n");

                            }

                        case 3:
                            System.out.print("\n-=-=-=-=Calcule-=-=-=-=\n" +
                                    "[1] - Area\n" +
                                    "[2] - Perimetro\n" +
                                    "Choose an option: ");
                            int op3 = sc.nextInt();

                            switch (op3) {
                                case 1:
                                    System.out.print("Input the base: ");
                                    double baseT = sc.nextDouble();
                                    System.out.print("Input the height: ");
                                    double altuT = sc.nextInt();
                                    System.out.print("Input the first side: ");
                                    double ladoT = sc.nextDouble();
                                    System.out.print("Input the second side: ");
                                    double ladoT2 = sc.nextDouble();
                                    Triangulo triangA = new Triangulo(baseT, altuT, ladoT, ladoT2);
                                    System.out.printf("%.2f", triangA.calcularAreaT(), "\n");
                                    break;

                                case 2:
                                    double altuuT = 0;
                                    System.out.print("Input the first side: ");
                                    double ladosT = sc.nextDouble();
                                    System.out.print("Input the second side: ");
                                    double ladosT2 = sc.nextDouble();
                                    System.out.print("Input the base: ");
                                    double baseeT = sc.nextDouble();
                                    Triangulo triangP = new Triangulo(altuuT, baseeT, ladosT, ladosT2);
                                    System.out.printf("%.2f", triangP.calcularPerimetroT(), "\n");
                                    break;
                            }
                        case 4:
                            System.out.print("\n-=-=-=-=Calcule-=-=-=-=\n" +
                                    "[1] - Area\n" +
                                    "[2] - Perimetro\n" +
                                    "Choose an option: ");
                            int op4 = sc.nextInt();

                            switch (op4){
                                case 1:
                                    System.out.print("Input the base: ");
                                    double baseR = sc.nextDouble();
                                    System.out.print("Input the height: ");
                                    double altuR = sc.nextInt();
                                    Retangulo retanA = new Retangulo(baseR, altuR);

                            }




                    }
                case 2:
                    System.out.println("\n-=-=-=-=Figuras Especiais-=-=-=-=-");
                    System.out.print("[1] - Cilindro\n" +
                            "[2] - Cone\n" +
                            "[3] - Cubo\n" +
                            "[4] - Esfera\n" +
                            "[5] - Paralelepipedo\n" +
                            "[6] - Piramide (Base quadrada)\n" +
                            "Choose an option: ");
                    int option = sc.nextInt();

                    switch (option){
                        case 1:
                            System.out.print("\nInput the height: ");
                            double alturaCil = sc.nextDouble();
                            System.out.print("Input the radius: ");
                            double raioCil = sc.nextDouble();
                            Cilindro cilindro = new Cilindro(raioCil, alturaCil);
                            System.out.printf("%.2f", cilindro.calcularVolume(), "\n");
                            System.out.printf("%.2f", cilindro.calcularArea(), "\n");
                        case 2:
                            System.out.print("Input the height: ");
                            double alturaCone = sc.nextDouble();
                            System.out.print("Input the geratriz: ");
                            double g = sc.nextDouble();
                            System.out.print("Input the radius: ");
                            double raioCone = sc.nextDouble();
                            Cone cone = new Cone(raio,alturaCone,g);
                            System.out.printf("%.2f", cone.calcularVolume());
                            System.out.printf("%.2f", cone.calcularArea());
                        case 3:
                            System.out.print("Input the aresta: ");
                            double aresta = sc.nextDouble();
                            Cubo cubo = new Cubo(aresta);
                            System.out.printf("%.2f", cubo.calcularVolume());
                            System.out.printf("%.2f", cubo.calcularArea());

                        case 4:

                    }

            }
        }
        } catch (Exception e) {
            System.out.println("Opção Inválida, tente novamente!\n");
        }

        }
    }






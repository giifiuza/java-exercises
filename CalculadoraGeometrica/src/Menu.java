
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    double raio;


    void Menu(){

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\n-=-=-=-=Calculadora Geométrica-=-=-=-=-");
                System.out.print("[1] - Planas\n" +
                        "[2] - Espaciais\n" +
                        "Choose an option: ");

                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("\n-=-=-=-=Figuras Planas-=-=-=-=-");
                        System.out.print("[1] - Quadrado\n" +
                                "[2] - Circulo\n" +
                                "[3] - Triangulo\n" +
                                "[4] - Retangulo\n" +
                                "[5] - Hexagono Regular\n" +
                                "Choose an option: ");

                        int opcao = sc.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("");
                                System.out.print("Input the side: ");
                                double lado = sc.nextInt();
                                Quadrado quadrado = new Quadrado(lado);
                                System.out.println("");
                                System.out.printf("Area é %.2f", quadrado.areaQuadrado(), "\n");
                                System.out.println("");
                                Quadrado pquad = new Quadrado(lado);
                                System.out.printf("Perímetro é %.2f", pquad.perimetroQuadrado());
                                System.out.println("");
                                Menu();
                                break;

                            case 2:
                                System.out.println("");
                                System.out.print("Input the raio: ");
                                double raio = sc.nextInt();
                                Circulo circulo = new Circulo(raio);
                                System.out.println("");
                                System.out.printf("Area é %.2f",circulo.calcularArea(), "\n");
                                System.out.println("");
                                Circulo pcir = new Circulo(raio);
                                System.out.printf("Perímetro é %.2f",pcir.calcularPerimetro(), "\n");
                                System.out.println("");
                                Menu();
                                break;

                            case 3:
                                System.out.println("");
                                System.out.print("Input the base: ");
                                double baseT = sc.nextDouble();
                                System.out.print("Input the height: ");
                                double altuT = sc.nextInt();
                                System.out.print("Input the first side: ");
                                double ladoT = sc.nextDouble();
                                System.out.print("Input the second side: ");
                                double ladoT2 = sc.nextDouble();
                                Triangulo triangA = new Triangulo(baseT, altuT, ladoT, ladoT2);
                                System.out.println("");
                                System.out.printf("Area é %.2f", triangA.calcularAreaT(), "\n");
                                System.out.println("");
                                double altuuT = 0;
                                Triangulo triangP = new Triangulo(altuuT, baseT, ladoT, ladoT2);
                                System.out.printf("Perímetro é %.2f", triangP.calcularPerimetroT(), "\n");
                                System.out.println("");
                                Menu();
                                break;

                            case 4:
                                System.out.println("");
                                System.out.print("Input the base: ");
                                double baseR = sc.nextDouble();
                                System.out.print("Input the height: ");
                                double altuR = sc.nextInt();
                                Retangulo retanA = new Retangulo(baseR, altuR);
                                System.out.println("");
                                System.out.printf("Area é %.2f", retanA.areaRetangulo(), "\n");
                                System.out.println("");
                                System.out.printf("Perímetro %.2f", retanA.perimetroRetangulo(), "\n");
                                System.out.println("");
                                Menu();

                            case 5:
                                System.out.println("");
                                System.out.print("Input the side: ");
                                double ladoHex = sc.nextDouble();

                                HexagonoRegular hexagono = new HexagonoRegular(ladoHex);
                                System.out.println("");
                                System.out.printf("Area é %.2f", hexagono.areaHexagono(), "\n");
                                System.out.println("");
                                System.out.printf("Perímetro %.2f", hexagono.perimetroHexagono(), "\n");
                                System.out.println("");
                                Menu();
                                break;
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
                                System.out.println("");
                                System.out.print("\nInput the height: ");
                                double alturaCil = sc.nextDouble();
                                System.out.print("Input the radius: ");
                                double raioCil = sc.nextDouble();
                                System.out.println("");
                                Cilindro cilindro = new Cilindro(raioCil, alturaCil);
                                System.out.printf("Volume é %.2f", cilindro.calcularVolume(), "\n");
                                System.out.println("");
                                System.out.printf("Area é %.2f", cilindro.calcularArea(), "\n");
                                System.out.println("");
                                Menu();
                                break;

                            case 2:
                                System.out.println("");
                                System.out.print("Input the height: ");
                                double alturaCone = sc.nextDouble();
                                System.out.print("Input the geratriz: ");
                                double g = sc.nextDouble();
                                System.out.print("Input the radius: ");
                                double raioCone = sc.nextDouble();
                                Cone cone = new Cone(raio,alturaCone,g);
                                System.out.println("");
                                System.out.printf("Volume é %.2f", cone.calcularVolume());
                                System.out.println("");
                                System.out.printf("Área é %.2f", cone.calcularArea());
                                System.out.println("");
                                Menu();
                                break;

                            case 3:
                                System.out.println("");
                                System.out.print("Input the aresta: ");
                                double aresta = sc.nextDouble();
                                Cubo cubo = new Cubo(aresta);
                                System.out.println("");
                                System.out.printf("%.2f", cubo.calcularVolume());
                                System.out.println("");
                                System.out.printf("%.2f", cubo.calcularArea());
                                System.out.println("");
                                Menu();
                                break;

                            case 4:
                                System.out.println("");
                                System.out.print("Input the radius: ");
                                double radius = sc.nextDouble();
                                Esfera esfera = new Esfera(radius);
                                System.out.println("");
                                System.out.printf("Volume é %.2f", esfera.calcularVolume());
                                System.out.println("");
                                System.out.printf("Area é %.2f", esfera.calcularArea());
                                System.out.println("");
                                Menu();
                                break;

                            case 5:
                                System.out.println("");
                                System.out.print("Input the length: ");
                                double comprimento = sc.nextDouble();
                                System.out.print("Input the width: ");
                                double largura = sc.nextDouble();
                                System.out.print("Input the height: ");
                                double altura = sc.nextDouble();
                                Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento,largura,altura);
                                System.out.println("");
                                System.out.printf("Volume é %.2f", paralelepipedo.calcularVolume());
                                System.out.println("");
                                System.out.printf("Área é %.2f", paralelepipedo.calcularArea());
                                System.out.println("");
                                Menu();
                                break;

                            case 6:
                                System.out.println("");
                                System.out.print("Input the base side: ");
                                double ladoBase = sc.nextDouble();
                                System.out.print("Input the height: ");
                                double h = sc.nextDouble();
                                Piramide piramide = new Piramide(ladoBase,h);
                                System.out.println("");
                                System.out.printf("Volume é %.2f", piramide.calcularVolume());
                                System.out.println("");
                                System.out.printf("Área é %.2f", piramide.calcularArea());
                                System.out.println("");
                                Menu();
                                break;
                        }
                    default:
                        System.out.println("Opção Inválida, tente novamente!\n");
                        break;

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção Inválida, tente novamente!\n");
            Menu();
        }

    }
}






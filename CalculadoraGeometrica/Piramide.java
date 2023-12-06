package ArrayList.Exercises.CalculadoraGeometrica;

public class Piramide {
   double areaB;
   double areal;
   double altura;

    public Piramide(double areaB, double areal, double altura) {
        this.areaB = areaB;
        this.areal = areal;
        this.altura = altura;
    }

    double calcularVolume(){
        return (areaB*altura)/3;
    }

    double calcularArea(){
        return areal + areaB;
    }
}

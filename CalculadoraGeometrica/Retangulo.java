package ArrayList.Exercises.CalculadoraGeometrica;

public class Retangulo {
    double base;
    double lado;

    Retangulo(double base, double lado){
        this.base = base;
        this.lado = lado;
    }

    double areaRetangulo(){
        return lado*base;
    }

    double perimetroRetangulo(){
        return lado*2+base*2;
    }
}

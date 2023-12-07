
public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = lado;
    }

    double areaQuadrado(){
        return lado*lado;
    }

    double perimetroQuadrado(){
        return lado+lado+lado+lado;
    }
}

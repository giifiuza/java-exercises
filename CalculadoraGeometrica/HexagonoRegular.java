package ArrayList.Exercises.CalculadoraGeometrica;

public class HexagonoRegular {
    double lado;

    HexagonoRegular(double lado){
        this.lado = lado;
    }

    double areaHexagono(){
        return (3*lado*lado*Math.sqrt(3))/2;
    }

    double perimetroHexagono(){
        return 6*lado;
    }
}

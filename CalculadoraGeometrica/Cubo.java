package ArrayList.Exercises.CalculadoraGeometrica;

public class Cubo {
    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    double calcularArea(){
        return 6*(Math.pow(aresta, 2));
    }

    double calcularVolume(){
        return Math.pow(aresta, 3);
    }
}

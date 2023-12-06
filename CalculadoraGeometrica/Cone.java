package ArrayList.Exercises.CalculadoraGeometrica;

public class Cone {
    double raio;
    double altura;
    double geratriz;

    Cone(double raio, double altura, double geratriz) {
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    double calcularArea(){
        return (Math.PI*raio*(raio+geratriz));
    }

    double calcularVolume(){
        return (Math.PI*Math.pow(raio, 2)*altura)/3;
    }

}

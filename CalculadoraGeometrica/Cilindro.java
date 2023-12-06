package ArrayList.Exercises.CalculadoraGeometrica;

public class Cilindro {
    double raio;
    double altura;

    Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularArea(){
        return (2*(Math.PI)*raio*altura*2*(Math.PI)*Math.pow(raio, 2));
    }

    double calcularVolume(){
        return ((Math.PI)*Math.pow(raio, 2)*altura);
    }
}

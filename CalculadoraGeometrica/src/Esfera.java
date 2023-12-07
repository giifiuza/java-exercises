
public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        return 4*Math.PI*Math.pow(raio, 2);
    }

    double calcularVolume(){
        return (4*Math.PI*Math.pow(raio, 3))/3;
    }
}

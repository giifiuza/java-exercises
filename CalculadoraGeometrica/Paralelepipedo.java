package ArrayList.Exercises.CalculadoraGeometrica;

public class Paralelepipedo {
    double comprimento;
    double largura;
    double altura;

    public Paralelepipedo(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea(){
        return (2*altura*largura)+(2*altura*comprimento)+(2*comprimento*largura);
    }

    double calcularVolume(){
        return comprimento*altura*largura;
    }
}

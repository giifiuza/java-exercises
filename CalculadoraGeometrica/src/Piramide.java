public class Piramide {
    double ladoBase;
    double altura;

    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    double calcularVolume() {
        double areaBase = Math.pow(ladoBase, 2);
        return (areaBase * altura) / 3;
    }

    double calcularArea() {
        double areaBase = Math.pow(ladoBase, 2);
        double areaLateral = ladoBase * Math.sqrt(Math.pow(ladoBase / 2, 2) + Math.pow(altura, 2));
        return areaBase + areaLateral;
    }
}

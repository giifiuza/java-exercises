package ArrayList.Exercises.CalculadoraGeometrica;

public class Triangulo {
    double base;
    double altura;
    double lado1;
    double lado2;

    Triangulo(double base, double altura, double lado1, double lado2){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularAreaT(){
        return base*altura/2;
    }

    double calcularPerimetroT(){
        return lado1+lado2+base;
    }
}

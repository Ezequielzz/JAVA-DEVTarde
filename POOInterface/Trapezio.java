package POOInterface;

public class Trapezio implements FigurasGeometricas{ //
    
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    @Override
    public double getArea() {
        int area = (baseMaior+baseMenor) * altura / 2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getPerimetro() {
        int perimetro = baseMaior + baseMenor + lado1+lado2;
        return perimetro;
    }
    
}

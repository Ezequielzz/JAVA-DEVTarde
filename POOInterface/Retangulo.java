package POOInterface;

public class Retangulo implements FigurasGeometricas {

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    int base;

    int altura;

    @Override
    public double getArea() {
        int area = base*altura;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        int perimetro = (base*2) + (altura*2);
        return perimetro;
    }
}

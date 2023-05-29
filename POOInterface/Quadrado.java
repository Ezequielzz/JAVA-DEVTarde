package POOInterface;

public class Quadrado implements FigurasGeometricas {
    int lado;

    public Quadrado(int lado) { // construtor com um parametro
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() { //calcula area do quadrado
        int area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        
        return "quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado*4;
        return perimetro;
    }
        
}

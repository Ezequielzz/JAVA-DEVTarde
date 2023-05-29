package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(7);
        Retangulo figura2 = new Retangulo(10, 8);
        Trapezio figura3 = new Trapezio(8, 4, 7, 5, 5);

        System.out.println("Nome da Figura é " + figura1.getNomeFigura()
                + "\n Área = " + figura1.getArea() +"m²"
                + "\n PerÍmetro = " + figura1.getPerimetro() + "m");

                System.out.println("Nome da Figura é " + figura2.getNomeFigura() 
                + "\n Área = " + figura2.getArea() +"m²"
                + "\n PerÍmetro = " + figura2.getPerimetro() + "m");

                System.out.println("Nome da Figura é " + figura3.getNomeFigura() 
                + "\n Área = " + figura3.getArea() +"m²"
                + "\n PerÍmetro = " + figura3.getPerimetro() + "m");
    }
}

package CalculadoraVelocidadeScanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a Distância Percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("A distância percorrida foi de " + distanciaPercorrida + " km");
        System.out.println("Informe o Tempo Gasto na Viagem");
        double tempoGasto = sc.nextDouble();
        System.out.println("Otempo Gasto na Viagem foi de"
                + tempoGasto + " horas");
        sc.close();
        double VelocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A Velocidade Media foi de "
                + VelocidadeMedia + " km/h");
    }
 
}
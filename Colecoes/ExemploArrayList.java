package Colecoes;

import java.util.*;

import javax.swing.JOptionPane;

public class ExemploArrayList {

    // criando ArrayList
    ArrayList<String> carros = new ArrayList<>();
    ArrayList<Integer> nAleatorio = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(10);

    public void teste1() {

        // Adicionando Elementos
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");

        // Percorrer a Lista (for)
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        // Percorrer a Lista com For-Each
        for (String s : carros) {
            System.out.println(s);
        }

        // Imprimindo a Lista Completa
        System.out.println(carros);

        // Ordenando a Lista (.sort(Collections))
        Collections.sort(carros); // Ordenação em Ordem de A-Z
        System.out.println(carros);

        Collections.reverse(carros); // Ordenação em Ordem de Z-A
        System.out.println(carros);

        // Limpando a Lista
        carros.clear();
        System.out.println(carros);
    }

    public void exercicio1() {
        // Criar um ArrayList de Nº Inteiros
        // Escrever 5nº aleatórios - ordenar e imprimir

        nAleatorio.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Um Número", "Número Aleatório", 3)));
        nAleatorio.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Um Número", "Número Aleatório", 3)));
        nAleatorio.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Um Número", "Número Aleatório", 3)));
        nAleatorio.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Um Número", "Número Aleatório", 3)));
        System.out.println(nAleatorio);
        Collections.sort(nAleatorio);
        System.out.println(nAleatorio);

    }
}

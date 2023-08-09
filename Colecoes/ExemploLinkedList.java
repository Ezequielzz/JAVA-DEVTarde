package Colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList<String> pessoas = new LinkedList<>();

    public void teste2() {
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");

        // Adiciona na primeira posição
        pessoas.addFirst("Cecília");

        // Remove o últmo nome
        pessoas.removeLast();

        // Imprime a Lista
        System.out.println(pessoas);
    }
}

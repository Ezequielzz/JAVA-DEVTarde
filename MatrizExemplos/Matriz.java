package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // exemplo de criação/preenchimento/impressão de matriz
        // declarar minha matriz de 2 dimensões
        int tab[][] = new int[10][9];
        // preencher a matriz
        for (int i = 0; i < 10; i++) {
            // Laço vai percorrer a primeira dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // Laço vai percorrer a segunda dimensão da matriz
                // System.out.print("tab[" + i + "][" + j + "] = ");
                tab[i][j] = rd.nextInt(9); // preencher o valor na posição

            }
        }
        // Imprimir a minha matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print("tab[" + i + "][" + j + "]=" + tab[i][j]);
            }
        }

        // imprimindo em formato de matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println(" |");
        }
    }

    public void exemplo2() {
        int tab[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;

                }
            }
        }

        for (int i = 0; i < 5; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println(" |");

        }
    }

    public void exemplo3() {
        // declarar a matriz
        int tab[][] = new int[4][4];
        // preenchimento
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tab[i][j] = rd.nextInt(5);
            }
        }
        // imprimir a matriz
        for (int i = 0; i < 4; i++) {// linha
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {// coluna
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println(" |");
        }

        System.out.println();
        for (int i = 0; i < 4; i++) {// linha
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {// coluna
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[j][i] + " ");
            }
            System.out.println(" |");
        }
        // soma da diagonal
        int soma = 0;
        int superior = 0;
        int inferior = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i == j) {
                    soma += tab[i][j];
                } else if (i>j) { // inferior diagonal
                    inferior+=tab[i][j];
                } else {
                    superior+=tab[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é " + soma);
        System.out.println("A soma da diagonal principal é " + inferior);
        System.out.println("A soma da diagonal principal é " + superior);

    }
}

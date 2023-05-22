package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random(0);

    /**
     * 
     */
    public void extra1() {

        // declaração do tamanho da linha e coluna

        int x = 0, y = 0;

        System.out.println("Determine o tamanho da linha: ");
        x = sc.nextInt();
        System.out.println("Determine o tamanho da coluna: ");
        y = sc.nextInt();
        System.out.println();
        // criar a matriz
        int[][] matriz = new int[x][y];
        // preencher a matriz com random
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(0, 9);
            }
        }
        // imprimir a matriz
        System.out.println("Matriz Aleatoria");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println("Matriz[" + (i + 1) + "] Matriz[" + (j + 1) + "]: " + matriz[i][j]);
                System.out.println("");
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        System.out.println("Matriz com a Regra do I e J");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println("Matriz[" + (i + 1) + "] Matriz[" + (j + 1) + "]: " + matriz[i][j]);
                System.out.println("");
            }
        }
    }

    public void extra2() {
        int nSorteado = 0, nDigitado = 0, cont = 0;
        nSorteado = rd.nextInt(0, 1000);

        while (nDigitado != nSorteado) {
            System.out.println("Informe um Valor de 0 a 1000");
            nDigitado = sc.nextInt();
            System.out.println();
            cont++;

            if (nDigitado == nSorteado) {
                System.out.println("///////////////////////////");
                System.out.println();
                System.out.println("Você Acertou em " + cont + " tentativas");
                System.out.println();
            } else if (nDigitado > nSorteado) {
                System.out.println("///////////////////////////");
                System.out.println();
                System.out.println("o Valor sorteado é menor que " + nDigitado);
                System.out.println();
            } else {
                System.out.println("///////////////////////////");
                System.out.println();
                System.out.println("o Valor sorteado é maior que " + nDigitado);
                System.out.println();
            }

        }
    }

    public void extra3() {
        int vetor[] = new int[rd.nextInt(100, 1000)];
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1, 100);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Numeros pares no vetor [" + (i + 1) + "]: " + vetor[i]);
                System.out.println();

                if (vetor[i] % 2 != 0) {
                    cont++;
                }
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares nas posições impares: " + cont);
        System.out.println();
        cont = 0;

        System.out.println();
        System.out.println("///////////////////////////////////////////");
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println("Numeros impares no vetor [" + (i + 1) + "]: " + vetor[i]);
                System.out.println();

                if (i % 2 == 0) {
                    cont++;
                }
            }
        }
        System.out.println();
                System.out.println("Quantidade de pares nas posições impares: " + cont);
    }
}
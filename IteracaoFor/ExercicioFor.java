package IteracaoFor;

import java.util.Random;
import java.util.Scanner;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe para o vetor de índice" + (i + 1) + ": ");
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O elemento do vetor no indice" + (i + 1) + "é: ");
        }
    }

    public void exercicio2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor [" + (i + 1) + "]=");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + (i + 1) + "]=" + vetor[i]);
        }
    }

    public void exercicio3() {
        double notas[] = new double[4]; // vetor para as notas
        // vou preencher as notas do vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do aluno:");
            notas[i] = sc.nextDouble();
        }
        double media = 0; // variavel para calcular as medias
        // calcular a media e imprimir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + "= " + notas[i]);
            media += notas[i]; // acumulando o valor das notas na variavel media
        }
        media /= notas.length; // dividir media pelo nº de notas do vetor
        System.out.println("A media do aluno é " + media);
    }

    public void exercicio4() {
        // lendo as vogais
        // lendo o vetor de consoantes
        String[] vetor = new String[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um caractere: ");
            vetor[i] = sc.next();
        }
        int consoantes = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals("a") || vetor[i].equals("e") || vetor[i].equals("i") || vetor[i].equals("o")
                    || vetor[i].equals("u")) {
            } else {
                consoantes++;
                System.out.println(vetor[i] + " é a consoante");
            }
            System.out.println("O nº de consoantes é " + consoantes);
        }
    }

    public void exercicio4e() {
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();
        palavra.toLowerCase();
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            } else {
                cont++;
                System.out.println(c + " é consoante");
            }
        }
        System.out.println("O número de consoantes é " + cont);
    }

    public void exercicio5() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int vetorNPar[] = new int[20];
        int vetorNImpar[] = new int[20];
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                vetorNPar[i] = vetorNumeros[i];
            } else {
                vetorNImpar[i] = vetorNumeros[i];
            }
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor [" + i + "]=" + vetorNumeros[i]);
            System.out.println("vetorPar [" + i + "]=" + vetorNPar[i]);
            System.out.println("vetorImpar [" + i + "]=" + vetorNImpar[i]);
        }
    }

    // exercicio com contador
    public void exercicio5e() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contImpar = 0;
        int contPar = 0;
        // contando quantos numeros pares e quantos numeros impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        // criando os vetores com o tamnho correto
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        // distribuindo os valores nos vetores
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                vetorPar[contPar] = vetorNumeros[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetorNumeros[i];
                contImpar++;
            }
        }
    }

    public void extra1() {
        Random rd = new Random();
        int[][] vetor = new int[4][4];

        // preenche a matriz com o resultado da multiplicação
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vetor[i][j] = (i + 1) * (j + 1);
            }
        }

        // imprime a matriz na tela
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vetor[i][j] = rd.nextInt(0, 10);
            }
            System.out.println();
        }
    }

    public void extra2() {
        Random rd = new Random();

        int[][] vetor = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vetor[i][j] = rd.nextInt(0, 10);
            }
        }

    }

    public void extra3() {
        int[][] vetor = new int[5][5];

        System.out.println("Digite um valor de 0 a 9;");
                int valorAleatorio = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                vetor[i][j] = rd.nextInt(0, 10);
                if (valorAleatorio == 0 || valorAleatorio == 1 || valorAleatorio == 2 || valorAleatorio == 3 
                || valorAleatorio == 4 || valorAleatorio == 5 || valorAleatorio == 6 ||
                 valorAleatorio == 7 || valorAleatorio == 8 || valorAleatorio == 9) {
                    System.out.println("Valor encontrado = " + valorAleatorio);
                 } else {System.out.println("Valor não encontrado");
                }
                
                
            }
        }
    }
    

    public void extra4() {

        int[][] vetor = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }
}

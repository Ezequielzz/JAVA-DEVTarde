package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {

    Scanner sc = new Scanner(System.in);

    public void Exemplo1() {
        int i = 0;
        while (i < 1000000) {
            System.out.println("O nº da iteração é " + i);
            i++;
        }
    }

    public void Exemplo2() {
        int vetor[] = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Informe o valor do índice " + i + " do vetor");
            vetor[i] = sc.nextInt();
            i++;
        }
        i=0;
        while (i < 10) {
            System.out.println("O vetor [" + i + "]=" + vetor[i]);
            i++;
        }
    }

    public void Exemplo3() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(10);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            if (nDigitado==valorSorteado) {
                System.out.println("Cravou, craque!");
                tenteNovamente = false;
            } else {
                System.out.println("Errou burro pacarai KKKKKKKKK");
            }
        }
    }
}


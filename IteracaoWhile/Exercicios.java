package IteracaoWhile;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        int vetorA[]=  new int[]{5,7,9,10,13};
        int vetorB[]= new int[5];
        int i=0;
        while (i < 5) {
            vetorB[i]=vetorA[i];
            System.out.println("O vetor B["+i+"]"+vetorB[i]);
            i++;
        }

    }

   public void EduardoSindico2() {
    int vetorA[] = new int []{0,1,2,3,4,5,6,7};
    int vetorB[] = new int [8];
    int i=0;
    while (i < 8) {
        vetorB[i]=vetorA[i]*2;
        System.out.println("O valor do vetor B é igual a "+vetorB[i]);
        i++;
    }
   } 

   public void EduardoSindico3() {
    int vetorA[] = new int []{0,2,3,4,5,6,7,8,9,10,11,12,13,14,};
    int vetorB[] = new int [15];
    int i=0;
    while (i < 15) {
        vetorB[i]=vetorA[i] * vetorA[i];
        System.out.println("O valor do vetor B é igual a "+vetorB[i]);
        i++;
    }
}

   public void EduardoSindico4() {
    int vetorA[] = new int []{0,2,3,4,5,6,7,8,9,10,11,12,13,14};
    double vetorB[] = new double[15];
    int i=0;
    while(i < 15){
        vetorB[i]=Math.sqrt(vetorA[i]);
        System.out.println("O vetor B["+i+"]="+vetorB[i]);
        i++;
    }
   }

   public void EduardoSindico5() {
    

   }

   public void EduardoSindico6() {
    int vetorA[]=new int[]{0,2,3,4,5,6,7,8,9,};
    int vetorB[]=new int[]{0,2,3,4,5,6,7,8,9,};
    int vetorC[]=new int[10];
    int i=0;
    while(i<10){
        vetorC[i]=vetorA[i]=vetorB[i];
        System.out.println("O vetor C["+i+"]="+vetorC[i]);
        i++;
    }
}

}
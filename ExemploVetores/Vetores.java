package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        // Criar um Vetor com 5 nº inteiros
        int vetorInt[] = new int [5]; //vetor vazio
        int vetorInt2[] = new int[]{1,2,3,4,5};//vetor com valores preenchidos
        // preenchendo o vetorInt o 1º
        System.out.println("Preencha o Vetor de 5 Posições");
        vetorInt[0]=sc.nextInt(); //1ª indice 0
        vetorInt[1]=sc.nextInt(); //2ª indice 1
        vetorInt[2]=sc.nextInt(); //3ª indice 2
        vetorInt[3]=sc.nextInt(); //4ª indice 3
        vetorInt[4]=sc.nextInt(); //5ª indice 4
        System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorInt[0]);
        System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorInt[1]);
        System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorInt[2]);
        System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorInt[3]);
        System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorInt[4]);
    }

        public void metodo2() {
            double vetorDouble[] = new double [10];
            System.out.println("Preencha o Vetor de 10 posições");
            vetorDouble[0]=sc.nextDouble();
            vetorDouble[1]=sc.nextDouble();
            vetorDouble[2]=sc.nextDouble();
            vetorDouble[3]=sc.nextDouble();
            vetorDouble[4]=sc.nextDouble();
            vetorDouble[5]=sc.nextDouble();
            vetorDouble[6]=sc.nextDouble();
            vetorDouble[7]=sc.nextDouble();
            vetorDouble[8]=sc.nextDouble();
            vetorDouble[9]=sc.nextDouble();
       System.out.println("O Valor da 10ª Posição Índice 9 é "+vetorDouble[9]);
        System.out.println("O Valor da 9ª Posição Índice 8 é "+vetorDouble[8]);
        System.out.println("O Valor da 8ª Posição Índice 7 é "+vetorDouble[7]);
        System.out.println("O Valor da 7ª Posição Índice 6 é "+vetorDouble[6]);
        System.out.println("O Valor da 6ª Posição Índice 5 é "+vetorDouble[5]);
        System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorDouble[4]);
        System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorDouble[3]);
        System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorDouble[2]);
        System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorDouble[1]);
        System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorDouble[0]);

        }

    public void exercicio1() {
        int vetorA[] = new int [5];
        System.out.println("Preencha o Vetor de 5 posições");
            vetorA[0]=sc.nextInt();
            vetorA[1]=sc.nextInt();
            vetorA[2]=sc.nextInt();
            vetorA[3]=sc.nextInt();
            vetorA[4]=sc.nextInt();
            System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorA[0]);
            System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorA[1]);
            System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorA[2]);
            System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorA[3]);
            System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorA[4]);

            int vetorB[] = new int [5];
        System.out.println("Preencha o Vetor de 5 posições");
            vetorB[0]=vetorA[0];
            vetorB[1]=vetorA[1];
            vetorB[2]=vetorA[2];
            vetorB[3]=vetorA[3];
            vetorB[4]=vetorA[4];
            System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorA[0]);
            System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorA[1]);
            System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorA[2]);
            System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorA[3]);
            System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorA[4]);
    
    }

    public void exercicio2() {
        int vetorA[] = new int [8];
        System.out.println("Preencha o Vetor de 8 posições");
            vetorA[0]=sc.nextInt();
            vetorA[1]=sc.nextInt();
            vetorA[2]=sc.nextInt();
            vetorA[3]=sc.nextInt();
            vetorA[4]=sc.nextInt();
            vetorA[5]=sc.nextInt();
            vetorA[6]=sc.nextInt();
            vetorA[7]=sc.nextInt();
            System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorA[0]);
            System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorA[1]);
            System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorA[2]);
            System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorA[3]);
            System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorA[4]);
            System.out.println("O Valor da 6ª Posição Índice 5 é "+vetorA[5]);
            System.out.println("O Valor da 7ª Posição Índice 6 é "+vetorA[6]);
            System.out.println("O Valor da 8ª Posição Índice 7 é "+vetorA[7]);

        int vetorB[] = new int [8];
        System.out.println("Preencha o Vetor de 8 posições");
            vetorB[0]= 2 * vetorA[0];
            vetorB[1]= 2 * vetorA[1];
            vetorB[2]= 2 * vetorA[2];
            vetorB[3]= 2 * vetorA[3];
            vetorB[4]= 2 * vetorA[4];
            vetorB[5]= 2 * vetorA[5];
            vetorB[6]= 2 * vetorA[6];
            vetorB[7]= 2 * vetorA[7];

}

    public void exercicio3() {
        int vetorA[] = new int [15];
        System.out.println("Preencha o Vetor de 8 posições");
            vetorA[0]=sc.nextInt();
            vetorA[1]=sc.nextInt();
            vetorA[2]=sc.nextInt();
            vetorA[3]=sc.nextInt();
            vetorA[4]=sc.nextInt();
            vetorA[5]=sc.nextInt();
            vetorA[6]=sc.nextInt();
            vetorA[7]=sc.nextInt();
            vetorA[8]=sc.nextInt();
            vetorA[9]=sc.nextInt();
            vetorA[10]=sc.nextInt();
            vetorA[11]=sc.nextInt();
            vetorA[12]=sc.nextInt();
            vetorA[13]=sc.nextInt();
            vetorA[14]=sc.nextInt();
            System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorA[0]);
            System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorA[1]);
            System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorA[2]);
            System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorA[3]);
            System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorA[4]);
            System.out.println("O Valor da 6ª Posição Índice 5 é "+vetorA[5]);
            System.out.println("O Valor da 7ª Posição Índice 6 é "+vetorA[6]);
            System.out.println("O Valor da 8ª Posição Índice 7 é "+vetorA[7]);
            System.out.println("O Valor da 9ª Posição Índice 8 é "+vetorA[8]);
            System.out.println("O Valor da 10ª Posição Índice 9 é "+vetorA[9]);
            System.out.println("O Valor da 11ª Posição Índice 10 é "+vetorA[10]);
            System.out.println("O Valor da 12ª Posição Índice 11 é "+vetorA[11]);
            System.out.println("O Valor da 13ª Posição Índice 12 é "+vetorA[12]);
            System.out.println("O Valor da 14ª Posição Índice 13 é "+vetorA[13]);
            System.out.println("O Valor da 15ª Posição Índice 14 é "+vetorA[14]);

        int vetorB[] = new int [15];
        System.out.println("Preencha o Vetor de 8 posições");
            vetorB[0]= vetorA[0] * vetorA[0];
            vetorB[1]= vetorA[1] * vetorA[1];
            vetorB[2]= vetorA[2] * vetorA[2];
            vetorB[3]= vetorA[3] * vetorA[3];
            vetorB[4]= vetorA[4] * vetorA[4];
            vetorB[5]= vetorA[5] * vetorA[5];
            vetorB[6]= vetorA[6] * vetorA[6];
            vetorB[7]= vetorA[7] * vetorA[7];
            vetorB[8]= vetorA[8] * vetorA[8];
            vetorB[9]= vetorA[9] * vetorA[9];
            vetorB[10]= vetorA[10] * vetorA[10];
            vetorB[11]= vetorA[11] * vetorA[11];
            vetorB[12]= vetorA[12] * vetorA[12];
            vetorB[13]= vetorA[13] * vetorA[13];
            vetorB[14]= vetorA[14] * vetorA[14];
    }

    public void exercicio4() {
        int vetorA[] = new int [15];
        System.out.println("Preencha o Vetor de 8 posições");
            vetorA[0]=sc.nextInt();
            vetorA[1]=sc.nextInt();
            vetorA[2]=sc.nextInt();
            vetorA[3]=sc.nextInt();
            vetorA[4]=sc.nextInt();
            vetorA[5]=sc.nextInt();
            vetorA[6]=sc.nextInt();
            vetorA[7]=sc.nextInt();
            vetorA[8]=sc.nextInt();
            vetorA[9]=sc.nextInt();
            vetorA[10]=sc.nextInt();
            vetorA[11]=sc.nextInt();
            vetorA[12]=sc.nextInt();
            vetorA[13]=sc.nextInt();
            vetorA[14]=sc.nextInt();
            System.out.println("O Valor da 1ª Posição Índice 0 é "+vetorA[0]);
            System.out.println("O Valor da 2ª Posição Índice 1 é "+vetorA[1]);
            System.out.println("O Valor da 3ª Posição Índice 2 é "+vetorA[2]);
            System.out.println("O Valor da 4ª Posição Índice 3 é "+vetorA[3]);
            System.out.println("O Valor da 5ª Posição Índice 4 é "+vetorA[4]);
            System.out.println("O Valor da 6ª Posição Índice 5 é "+vetorA[5]);
            System.out.println("O Valor da 7ª Posição Índice 6 é "+vetorA[6]);
            System.out.println("O Valor da 8ª Posição Índice 7 é "+vetorA[7]);
            System.out.println("O Valor da 9ª Posição Índice 8 é "+vetorA[8]);
            System.out.println("O Valor da 10ª Posição Índice 9 é "+vetorA[9]);
            System.out.println("O Valor da 11ª Posição Índice 10 é "+vetorA[10]);
            System.out.println("O Valor da 12ª Posição Índice 11 é "+vetorA[11]);
            System.out.println("O Valor da 13ª Posição Índice 12 é "+vetorA[12]);
            System.out.println("O Valor da 14ª Posição Índice 13 é "+vetorA[13]);
            System.out.println("O Valor da 15ª Posição Índice 14 é "+vetorA[14]);

        int vetorB[] = new int [15];
        System.out.println("Preencha o Vetor de 15 posições");
            vetorB[0]= vetorA[0] * vetorA[0];
            vetorB[1]= vetorA[1] * vetorA[1];
            vetorB[2]= vetorA[2] * vetorA[2];
            vetorB[3]= vetorA[3] * vetorA[3];
            vetorB[4]= vetorA[4] * vetorA[4];
            vetorB[5]= vetorA[5] * vetorA[5];
            vetorB[6]= vetorA[6] * vetorA[6];
            vetorB[7]= vetorA[7] * vetorA[7];
            vetorB[8]= vetorA[8] * vetorA[8];
            vetorB[9]= vetorA[9] * vetorA[9];
            vetorB[10]= vetorA[10] * vetorA[10];
            vetorB[11]= vetorA[11] * vetorA[11];
            vetorB[12]= vetorA[12] * vetorA[12];
            vetorB[13]= vetorA[13] * vetorA[13];
            vetorB[14]= vetorA[14] * vetorA[14];
        }
    
}
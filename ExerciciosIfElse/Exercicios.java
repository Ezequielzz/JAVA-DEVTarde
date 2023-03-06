package ExerciciosIfElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o 1º Valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Informe o 2º Valor:");
        double valor2 = sc.nextDouble();
        if (valor1 > valor2) {
            System.out.println("O 1º valor é Maior " + valor1);
        } else {
            System.out.println("O 2º valor é Maior " + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Informe seu ano de nascimento");
        int anoDeNascimento = sc.nextInt();
        int idade = 2023 - anoDeNascimento;
        if (idade >= 16) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }

    }

    public void exercicio3() {
        System.out.println("Informe sua senha");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        System.out.println("Informe a quantidade de maçãs compradas");
        int maca = sc.nextInt();
        if (maca<12)
        {
            double total = maca*0.30;
            System.out.println("O total é " + total);
        } else {
            double total = maca*0.25;
            System.out.println("O total é " + total);
        }
    }
}
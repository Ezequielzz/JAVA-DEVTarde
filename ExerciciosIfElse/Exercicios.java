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
        if (maca < 12) {
            double total = maca * 0.30;
            System.out.println("O total é " + total);
        } else {
            double total = maca * 0.25;
            System.out.println("O total é " + total);
        }
    }

    public void exercicio5() {
        System.out.println("Informe o 1º valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Informe o 2º valor:");
        double valor2 = sc.nextDouble();
        System.out.println("Informe o 3º valor:");
        double valor3 = sc.nextDouble();
        if (valor1 > valor2 && valor1 > valor3 && valor3 < valor2) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
        } else if (valor1 > valor3 && valor1 > valor2 && valor2 < valor3) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
        } else if (valor2 > valor1 && valor2 > valor3 && valor3 < valor1) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
        } else if (valor2 > valor3 && valor2 > valor1 && valor1 < valor3) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);
        } else if (valor3 > valor1 && valor3 > valor2 && valor2 < valor1) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        } else if (valor3 > valor2 && valor3 > valor1 && valor1 < valor2) {
            System.out.println("Ordem Crescente:");
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
        }
    }

    public void exercicio6() {
        System.out.println("Insira o seu sexo, 1 para Masculino 2 para Feminino:");
        int sexo = sc.nextInt();
        System.out.println("Insira sua altura:");
        double altura = sc.nextDouble();
        if (sexo == 1) {
            double pesoIdeal1 = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é:" + pesoIdeal1);
        } else if (sexo == 2) {
            double pesoIdeal2 = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é:" + pesoIdeal2);
        } else {
            System.out.println("Pressione numero 1 ou 2");
        }
    }

    public void exercicio7() {
        System.out.println("Insira a nota 1 do Aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Insira a nota 2 do aluno:");
        int nota2 = sc.nextInt();
        System.out.println("O aluno está aprovado por média?");
        double media = (nota1 + nota2) / 2;
        if (media>=50) {
            System.out.println("O aluno está aprovado por média!");
        } else {
            System.out.println("O aluno não está aprovado por média.");
        }
        System.out.println("Insira a frêquencia do aluno:");
        int frequencia = sc.nextInt();
        System.out.println("O aluno está aprovado por frequência?");
        if (frequencia>=75) {
            System.out.println("O aluno está aprovado por frequência!");
        } else {
            System.out.println("O aluno não está aprovado por frequência.");
        }
        if (media>=50 && frequencia>=75) {
        System.out.println("O aluno está aprovado no curso!");
        } else {
            System.out.println("O aluno não está aprovado no curso.");
        }
    }

}
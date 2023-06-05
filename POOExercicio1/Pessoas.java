package POOExercicio1;

import java.util.Scanner;

public class Pessoas {

    // declarar atributos
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double altura;
    private int dia;
    private int mes;
    private int ano;

    // metodos
    // construtor mesmo nome da classe
    public Pessoas(String nome, double altura, int dia, int mes, int ano) {
        this.nome = nome;
        this.altura = altura;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // getters and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // metodos imprimir
    public void imprimirDados() {
        System.out.println("Informe seu Nome: " + nome);
        System.out.println("Informe sua Altura: " + altura);
        System.out.println("Informe o Dia do Seu Nascimento: " + dia);
        System.out.println("Informe o Mês do Seu Nascimento: " + mes);
        System.out.println("Informe o Ano do Seu Nascimento: " + ano);
        System.out.println("Sua idade é: " + idade());

    }

    // metodo calcular a idade
    public int idade() {
        int calculo;
        if (dia <= 5 && mes <= 6) {
            calculo = 2023 - ano;
            return calculo;
        } else {
            calculo = (2023 - ano) - 1;
        }
        return calculo;
    }

}

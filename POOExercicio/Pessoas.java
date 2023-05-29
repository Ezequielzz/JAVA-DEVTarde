package POOExercicio;

import java.util.Scanner;

public class Pessoas {

    
    

    Scanner sc = new Scanner(System.in);
    private String nome;
    private double altura;
    private int dia;
    private int mes;
    private int ano;
    public int idade = ano - 2023;

    public void imprimirDados() {
        System.out.println("Informe seu Nome: " +nome );
        System.out.println("Informe sua Altura: " + altura);
        System.out.println("Informe o Dia do Seu Nascimento: " + dia);
        System.out.println("Informe o Mês do Seu Nascimento: " + mes);
        System.out.println("Informe o Ano do Seu Nascimento: " + ano);
        System.out.println("Sua idade é: " + idade);
    
        
}

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

}

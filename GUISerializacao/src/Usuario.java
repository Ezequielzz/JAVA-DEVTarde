import java.io.Serializable;

public class Usuario implements Serializable {
    private String nome;
    private int idade;
    private int hora;
    private int dia;
    private int mes;

    

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public Usuario(String nome, int idade, int hora, int dia, int mes) {
        this.nome = nome;
        this.idade = idade;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
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
    
}

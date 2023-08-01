package RevisaoFPOO.Cadastro;

public abstract class Animais {
    
    // atributos
    String nome;
    double peso;
    String especie;
    String sexo;
    String proprietario;
    int idade;

    //metodos

    // construtor preenchido
    public Animais(String nome, String proprietario, String sexo, String especie, double peso, int idade) {
        this.peso = peso; // > refernte ao metodo
        // referente ao atributo
        this.proprietario = proprietario;
        this.sexo = sexo;
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
    }
     // construtor vazio

    public Animais() {
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}

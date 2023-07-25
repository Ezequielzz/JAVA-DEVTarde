package RevisaoFPOO.Cadastro;

public class Animais {
    
    // atributos
    String porte;
    String proprietario;
    String genero;
    String especie;
    double peso;

    //metodos

    // construtor preenchido
    public Animais(String porte, String proprietario, String genero, String especie, double peso) {
        this.porte = porte; // > refernte ao metodo
        // referente ao atributo
        this.proprietario = proprietario;
        this.genero = genero;
        this.especie = especie;
        this.peso = peso;
    }
     // construtor vazio

    public Animais() {
    }

    // getters and setters

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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


}

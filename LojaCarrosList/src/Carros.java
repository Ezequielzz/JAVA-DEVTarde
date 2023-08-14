public class Carros {
    String Marca;
    String Modelo;
    String Ano;
    String Cor;
    String Placa;

    public Carros() {
    }

    public Carros(String marca, String modelo, String placa, String ano, String cor) {
        Marca = marca;
        Modelo = modelo;
        Placa = placa;
        Ano = ano;
        Cor = cor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

}

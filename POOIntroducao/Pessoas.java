package POOIntroducao;

public abstract class Pessoas {
    // atributos
    protected String nome;
    protected String endereco;
    protected String rg;

    public String getNome() {
        return nome;
    }

    // metodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
package main.java.Model;

public class Vendas {
    
    //Atributos
    private String produto;
    private String quantidade;
    private String codigoProduto;
    // private String cliente; ???
    
    public Vendas(String produto, String quantidade, String codigoProduto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.codigoProduto = codigoProduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    


}

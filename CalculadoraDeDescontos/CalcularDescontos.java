package CalculadoraDeDescontos;

/**
 * CalcularDescontos
 */
public class CalcularDescontos {

    public void calcula20(){
    double precoProduto;
    precoProduto = 200;
    int desconto = 20;
    double precoComDesconto = precoProduto - 
    (precoProduto*desconto/100);
    System.out.println("O Valor do Produto com Desconto é " +precoComDesconto+ " R$");
}
    public void calcula30(){
        double precoProduto;
        precoProduto = 200;
        int desconto = 30;
        double precoComDesconto = precoProduto - 
        (precoProduto*desconto/100);
        System.out.println("O Valor do Produto com Desconto é " +precoComDesconto+ " R$");
}

}
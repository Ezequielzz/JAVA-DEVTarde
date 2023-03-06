package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfElse {
    Scanner sc = new Scanner(System.in); // If Desencadeado

    public void DecisaoIf() {
        System.out.println("Informe o preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProduto>100 então desconto=5%
        if (precoProduto >= 100 && precoProduto < 200) {
            desconto = 5.0;
        }
        // se precoProduto>=200 <300 então desconto=10%
        if (precoProduto >= 200 && precoProduto < 300) {
            desconto = 10.0;
        }
        // se precoProduto>=300 então desconto=15%
        if (precoProduto >= 300) {
            desconto = 15;
        }
        // realizar a conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é R$ " + precoFinal);

    }

    // If Encadeado (If-Else)
    public void DecisaoIfElse() {
        System.out.println("Informe o preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto;
        // Estrutura de decisão encadeada if-else
        if (precoProduto>=300) { //1º condição
            desconto = 15;
        } else if (precoProduto>=200) { //2ºcondição
            desconto = 10;
        } else if (precoProduto>=100) { //3ºcondição
            desconto = 5;
        } 
        else {
            desconto = 0;

        }
        // realizar a conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é R$ " + precoFinal);

    }
}
    
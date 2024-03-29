package main.java.Model;

public class Vendas {
        // Atributos
        private String produto;
        private String codigo;
        private String valorUnit;
        private String quantidade;
        private String data;
    
        // Construtor
        public Vendas(String produto, String codigo, String valorUnit, String quantidade, String data) {
            this.produto = produto;
            this.codigo = codigo;
            this.valorUnit = valorUnit;
            this.quantidade = quantidade;
            this.data = data;
        }
    
        public String getProduto() {
            return produto;
        }
    
        public void setProduto(String produto) {
            this.produto = produto;
        }
    
        public String getCodigo() {
            return codigo;
        }
    
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
    
        public String getValorUnit() {
            return valorUnit;
        }
    
        public void setValorUnit(String valorUnit) {
            this.valorUnit = valorUnit;
        }
    
        public String getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(String quantidade) {
            this.quantidade = quantidade;
        }

        public String getData() {
            return data;
        }
    
        public void setData(String data) {
            this.data = data;
        }
     
}

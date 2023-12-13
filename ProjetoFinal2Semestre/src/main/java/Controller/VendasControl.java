package main.java.Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import main.java.Connection.VendasDAO;
import main.java.Model.Vendas;

public class VendasControl {
    // Atributos
    private List<Vendas> vendas;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public VendasControl(List<Vendas> vendas, DefaultTableModel tableModel, JTable table) {
        this.vendas = vendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        vendas = new VendasDAO().listarTodos();
        // Obtém os venda atualizados do banco de dados
        for (Vendas venda : vendas) {

            if (venda.getProduto().equals("") && venda.getCodigo().equals("")
                    && venda.getValorUnit().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente", "Informação Inválida", 1);
            } else {
                // Adiciona os dados de cada venda como uma nova linha na tabela Swing
                tableModel.addRow(new Object[] { venda.getProduto(), venda.getCodigo(), venda.getValorUnit(), venda.getQuantidade() });
            }

        }
    }

    // Método para cadastrar um novo venda no banco de dados
    public void cadastrar(String produto, String codigo, String valorUnit, String quantidade) {
        new VendasDAO().cadastrar(produto, codigo, valorUnit, quantidade);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um venda no banco de dados
    public void atualizar(String produto, String codigo, String valorUnit, String quantidade) {
        new VendasDAO().atualizar(produto, codigo, valorUnit, quantidade);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um venda do banco de dados
    public void apagar(String codigo) {
        new VendasDAO().apagar(codigo);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}

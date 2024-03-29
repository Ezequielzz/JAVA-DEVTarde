package main.java.Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import main.java.Connection.ClientesDAO;
import main.java.Model.Clientes;

public class ClientesControl {

    // Atributos
    private List<Clientes> clientes;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public ClientesControl(List<Clientes> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os clientes atualizados do banco de dados
        for (Clientes cliente : clientes) {

            if (cliente.getNome().equals("") && cliente.getIdade().equals("") && cliente.getSexo().equals("") && cliente.getRg().equals("")
                    && cliente.getCpf().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente", "Informação Inválida", 1);
            } else {
                // Adiciona os dados de cada cliente como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getIdade(),

                    cliente.getSexo(), cliente.getRg(), cliente.getCpf() });
            }

        }
    }

    // Método para cadastrar um novo cliente no banco de dados
    public void cadastrar(String nome, String idade, String sexo, String rg, String cpf) {
        new ClientesDAO().cadastrar(nome, idade, sexo, rg, cpf);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um cliente no banco de dados
    public void atualizar(String nome, String idade, String sexo, String rg, String cpf) {
        new ClientesDAO().atualizar(nome, idade, sexo, rg, cpf);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização

        
    }

    // Método para apagar um cliente do banco de dados
    public void apagar(String cpf) {
        new ClientesDAO().apagar(cpf);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}

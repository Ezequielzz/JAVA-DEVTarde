package main.java.Controller;

import javax.swing.JOptionPane;
import main.java.Connection.ClientesDAO;
import main.java.Model.Clientes;

public class ClientesControl {

    // Método para a Verificação do Nome
    public boolean validarNome(String nome) {

        // Regex para verificar se o nome contém caracteres especiais
        if (!nome.matches("^[\\p{L} .'-]+$")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

        return true;
    }

    // Método para verificar se o cliente já está cadastrado no banco de dados
    public boolean clienteCadastrado(String cpfCliente) {
        ClientesDAO clientesDAO = new ClientesDAO();
        for (Clientes cliente : clientesDAO.listarTodos()) {
            if (cliente.getCpfCliente().equals(cpfCliente)) {
                return true; // O cliente já está cadastrado
            }
        }
        return false; // O cliente não está cadastrado
    }

    // Método para cadastrar um novo cliente no banco de dados
    public void cadastrar(String nomeCliente, String cpfCliente) {

        try {
            if (validarNome(nomeCliente)) {
                if (!clienteCadastrado(cpfCliente)) {
                    new ClientesDAO().cadastrar(nomeCliente, cpfCliente); // Realiza o cadastro no banco de dados
                    JOptionPane.showMessageDialog(null, "Novo Cliente Cadastrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente Já Cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Nome Inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }

    // Método para atualizar os dados de um cliente no banco de dados
    public void atualizar(String nomeCliente, String cpfCliente) {
        new ClientesDAO().atualizar(nomeCliente, cpfCliente); // Realiza a atualização no banco de dados
    }

}

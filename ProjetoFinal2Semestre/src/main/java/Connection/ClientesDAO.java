package main.java.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.java.Model.Clientes;

public class ClientesDAO {
    // Atributos
    private Connection connection;
    private List<Clientes> clientes;

    // Construtor
    public ClientesDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Métodos do CRUD
    // criar Tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS clientes_mercado (NOME VARCHAR(255), CPF VARCHAR(255) PRIMARY KEY)";

        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Clientes> listarTodos() {
        PreparedStatement stmt = null;
        // Declaração do objeto PreparedStatement para executar a consulta

        ResultSet rs = null;
        // Declaração do objeto ResultSet para armazenar os resultados da consulta

        clientes = new ArrayList<>();
        // Cria uma lista para armazenar os clientes recuperados do banco de dados

        try {
            stmt = connection.prepareStatement("SELECT * FROM clientes_mercado");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto clientes com os valores do
                // registro

                Clientes cliente = new Clientes(
                        rs.getString("nomeCliente"),
                        rs.getString("cpfCliente"));
                clientes.add(cliente); // Adiciona o objeto clientes à lista de clientes
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);

            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return clientes; // Retorna a lista de clientes recuperados do banco de dados
    }

    // Método para verificar se um cliente já está cadastrado pelo CPF
    public boolean clienteExiste(String cpfCliente) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            connection = ConnectionFactory.getConnection();
            stmt = connection.prepareStatement("SELECT * FROM clientes_mercado WHERE cpf = ?");
            stmt.setString(1, cpfCliente);
            rs = stmt.executeQuery();

            return rs.next(); // Retorna verdadeiro se encontrar algum cliente com o CPF
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar cliente no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
    }

    // Cadastrar Carro no banco
    public void cadastrar(String nomeCliente, String cpfCliente) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO clientes_mercado (nome, cpf) VALUES (?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nomeCliente);
            stmt.setString(2, cpfCliente);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String nomeCliente, String cpfCliente) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela cpf
        String sql = "UPDATE clientes_mercado SET nome = ? WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nomeCliente);
            stmt.setString(2, cpfCliente);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(String cpfCliente) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela cpf
        String sql = "DELETE FROM clientes_mercado WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpfCliente);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

}

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

    // Atributosy
    private Connection connection;
    private List<Clientes> clientes;

    // Construtor
    public ClientesDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Métodos do CRUD
    // criar Tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS clientes_lojacarros2 (NOME VARCHAR(255),IDADE VARCHAR(255),SEXO VARCHAR(255),RG VARCHAR(255),CPF VARCHAR(255) PRIMARY KEY)";

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
            stmt = connection.prepareStatement("SELECT * FROM clientes_lojacarros2");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto clientes com os valores do
                // registro

                Clientes cliente = new Clientes(
                        rs.getString("nome"),
                        rs.getString("idade"),
                        rs.getString("sexo"),
                        rs.getString("rg"),
                        rs.getString("cpf"));
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

    // Cadastrar Carro no banco
    public void cadastrar(String nome, String idade, String sexo, String rg, String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO clientes_lojacarros2 (nome, idade, sexo, rg, cpf) VALUES (?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, idade);
            stmt.setString(3, sexo);
            stmt.setString(4, rg);
            stmt.setString(5, cpf);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String nome, String idade, String sexo, String rg, String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE clientes_lojacarros2 SET nome = ?, idade = ?, sexo = ?, rg = ? WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, idade);
            stmt.setString(3, sexo);
            stmt.setString(4, rg);
            // placa é chave primaria não pode ser alterada.
            stmt.setString(5, cpf);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM clientes_lojacarros2 WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

}

package main.java.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.java.Model.Vendas;

public class VendasDAO {
    // Atributos
    private Connection connection;
    private List<Vendas> vendas;

    // Construtor
    public VendasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Métodos do CRUD
    // criar Tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS vendas_mercado (PRODUTO VARCHAR(255), CODIGO VARCHAR(255), VALORUNIT VARCHAR(255), QUANTIDADE VARCHAR(255), DATA VARCHAR(255))";

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
    public List<Vendas> listarTodos() {
        PreparedStatement stmt = null;
        // Declaração do objeto PreparedStatement para executar a consulta
        ResultSet rs = null;
        // Declaração do objeto ResultSet para armazenar os resultados da consulta
        vendas = new ArrayList<>();
        // Cria uma lista para armazenar os vendas recuperados do banco de dados
        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas_mercado");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto vendas com os valores do
                // registro

                Vendas venda = new Vendas(
                        rs.getString("produto"),
                        rs.getString("codigo"),
                        rs.getString("valorUnit"),
                        rs.getString("quantidade"),
                        rs.getString("data"));
                vendas.add(venda); // Adiciona o objeto vendas à lista de vendas
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);

            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return vendas; // Retorna a lista de vendas recuperados do banco de dados
    }

    // Cadastrar Carro no banco
    public void cadastrar(String produto, String codigo, String valorUnit, String quantidade, String data) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO vendas_mercado (produto, codigo, valorUnit, quantidade, data) VALUES (?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto);
            stmt.setString(2, codigo);
            stmt.setString(3, valorUnit);
            stmt.setString(4, quantidade);
            stmt.setString(5, data);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String produto, String codigo, String valorUnit, String quantidade, String data) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pelo código
        String sql = "UPDATE vendas_mercado SET produto = ?, codigo = ?, valorUnit = ?, quantidade = ? data = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto);
            stmt.setString(2, codigo);
            stmt.setString(3, valorUnit);
            stmt.setString(4, quantidade);
            stmt.setString(5, data);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
    

    // Apagar dados do banco
    public void apagar(String codigo) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela codigo
        String sql = "DELETE FROM vendas_mercado codigo = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, codigo);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}


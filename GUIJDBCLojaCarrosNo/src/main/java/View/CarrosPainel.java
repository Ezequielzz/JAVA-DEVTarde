package main.java.View;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import main.java.Connection.CarrosDAO;
import main.java.Controller.CarrosControl;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import main.java.Model.Carros;

public class CarrosPainel extends JPanel {
    // Atributos
    private JButton cadastrar, apagar, editar;
    private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField, carValorField;
    private List<Carros> carros;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor
    public CarrosPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Carros"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Marca:"));
        carMarcaField = new JTextField(20);
        inputPanel.add(carMarcaField);

        inputPanel.add(new JLabel("Modelo:"));
        carModeloField = new JTextField(20);
        inputPanel.add(carModeloField);

        inputPanel.add(new JLabel("Ano:"));
        carAnoField = new JTextField(20);
        inputPanel.add(carAnoField);

        inputPanel.add(new JLabel("Placa:"));
        carPlacaField = new JTextField(20);
        inputPanel.add(carPlacaField);

        inputPanel.add(new JLabel("Valor:"));
        carValorField = new JTextField(20);
        inputPanel.add(carValorField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Salvar Edição"));
        botoes.add(apagar = new JButton("Salvar Exclusão"));
        add(botoes);
        
        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Criar a tabela se ela não existir
        new CarrosDAO().criaTabela();
        // Atualizar a Tabela na Abertura da Janela
        atualizarTabela();

        // Tratamento de Eventos (Construtor)
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    carMarcaField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    carModeloField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    carAnoField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    carPlacaField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    carValorField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });

        CarrosControl operacoes = new CarrosControl(carros, tableModel, table);
        // Configura o metodo "cadastrar" do objeto operacoes com valores dos campos de
        // entrada

        cadastrar.addActionListener(e -> {

            String anoText = carAnoField.getText();
            String valorText = carValorField.getText();
            String placaText = carPlacaField.getText();

            boolean camposCadastroVazio = carMarcaField.getText().isEmpty() || carModeloField.getText().isEmpty()
                    || carPlacaField.getText().isEmpty();

            if ((!anoText.isEmpty() && !valorText.isEmpty())) {
                try {
                    int ano = Integer.parseInt(anoText);
                    int valor = Integer.parseInt(valorText);

                    if (camposCadastroVazio) {
                        JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida",
                                2);
                    }

                    else if (!validarPlaca(placaText)) {
                        JOptionPane.showMessageDialog(null, "Insira uma Placa Válida!", "Informação Inválida",
                                2);
                    }

                    else if (valor < 9000 || ano < 1970 && ano > 2024) {
                        JOptionPane.showMessageDialog(null, "Insira um Ano ou Valor Válido!", "Informação Inválida", 2);
                    }

                    else {
                        operacoes.cadastrar(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(),
                                carPlacaField.getText(), carValorField.getText());

                        // Limpa os campos de entrada após a operação de exclusão
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        carAnoField.setText("");
                        carPlacaField.setText("");
                        carValorField.setText("");
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida", 2);
            }
        });

        // Configura a ação do botão editar
        editar.addActionListener(e -> {
            // Chama o metodo "editar" do objeto operacoes com os valores dos campos de
            // entrada
            String anoText = carAnoField.getText();
            String valorText = carValorField.getText();

            boolean camposCadastroVazio = carMarcaField.getText().isEmpty() || carModeloField.getText().isEmpty()
                    || carPlacaField.getText().isEmpty();

            if ((!anoText.isEmpty() && !valorText.isEmpty())) {

                try {
                    int ano = Integer.parseInt(anoText);
                    int valor = Integer.parseInt(valorText);

                    if (camposCadastroVazio) {
                        JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida",
                                2);
                    }

                    else if (valor < 9000 || ano < 1970 && ano > 2024) {
                        JOptionPane.showMessageDialog(null, "Insira um Ano ou Valor Válido!", "Informação Inválida", 2);
                    }

                    else {

                        operacoes.atualizar(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(),
                                carPlacaField.getText(), carValorField.getText());
                        // Limpa os campos de entrada após a operação de edição
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        carAnoField.setText("");
                        carPlacaField.setText("");
                        carValorField.setText("");
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente!", "Informação Inválida", 2);
            }

        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(e -> {

            // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
            // "placa"

            boolean camposCadastroVazio = carMarcaField.getText().isEmpty() || carModeloField.getText().isEmpty()
                    || carPlacaField.getText().isEmpty();

            if (camposCadastroVazio) {
                JOptionPane.showMessageDialog(null, "Não é Possível Excluir Dados Vazios!", "Informação Inválida",
                        2);
            } else if (JOptionPane.showConfirmDialog(null, "Deseja excluir esse carro?",
                    "Excluindo Tarefa...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                operacoes.apagar(carPlacaField.getText());

                // Limpa os campos de entrada após a operação de exclusão
                carMarcaField.setText("");
                carModeloField.setText("");
                carAnoField.setText("");
                carPlacaField.setText("");
                carValorField.setText("");

            }
        });

    };

    // Métodos (Atualizar Tabela)
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),

                    carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

    private boolean validarPlaca(String placa) {
        String regex = "^[A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}|[A-Z0-9]{7}$"; // Expressão regular para placa antiga
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(placa);
        return matcher.matches();
    }

}

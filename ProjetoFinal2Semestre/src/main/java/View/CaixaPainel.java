package main.java.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import main.java.Connection.ClientesDAO;
import main.java.Connection.EstoqueDAO;
import main.java.Model.Estoque;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

public class CaixaPainel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;

    public CaixaPainel() {
        setLayout(new BorderLayout());

        JPanel panelTop = criarPainelTop();
        JScrollPane scrollPane = criarScrollPane();
        JPanel panelBotoes = criarPainelBotoes();
        JPanel panelClienteVIP = criarPainelClienteVIP();

        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.add(panelTop, BorderLayout.NORTH);
        panelCentral.add(scrollPane, BorderLayout.CENTER);

        add(panelCentral, BorderLayout.CENTER);
        add(panelBotoes, BorderLayout.SOUTH);
        add(panelClienteVIP, BorderLayout.EAST);
    }

    private JPanel criarPainelTop() {
        JPanel panelTop = new JPanel();

        JTextField campoCodigo = new JTextField(10);
        JButton botaoAdicionar = new JButton("Adicionar");

        botaoAdicionar.addActionListener(e -> {
            String codigo = campoCodigo.getText();
            preencherTabelaComProduto(codigo);
        });

        panelTop.add(new JLabel("Código do Produto:"));
        panelTop.add(campoCodigo);
        panelTop.add(botaoAdicionar);
        panelTop.add(new JButton("Remover"));

        return panelTop;
    }

    private void preencherTabelaComProduto(String codigo) {
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        Estoque produto = estoqueDAO.listarUm(codigo);

        if (produto != null) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] rowData = { produto.getProduto(), produto.getCodigo(), produto.getValorUnit() };
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!", "Ação Inválida!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JScrollPane criarScrollPane() {
        JPanel panelLista = new JPanel();
        panelLista.setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Produto", "Código", "Valor Unitário" });
        table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane scrollPane = new JScrollPane(table);
        panelLista.add(scrollPane);
        return scrollPane;
    }

    private JPanel criarPainelClienteVIP() {
        JPanel panelClienteVIP = new JPanel();
        panelClienteVIP.setLayout(new BoxLayout(panelClienteVIP, BoxLayout.Y_AXIS));

        JLabel labelClienteVIP = new JLabel("Cliente VIP:");
        labelClienteVIP.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField campoCPF = new JFormattedTextField(formatar("###.###.###-##"));
        campoCPF.setMaximumSize(new Dimension(150, 25));

        JButton botaoValidar = new JButton("Validar CPF");
        botaoValidar.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ActionListener para o botão "Validar CPF"
        botaoValidar.addActionListener(e -> {
            String cpf = campoCPF.getText();
            if (validarCPF(cpf)) {
                // Implemente aqui a lógica para validar o CPF
                if (clienteExisteNoBancoDeDados(cpf)) {
                    JOptionPane.showMessageDialog(null, "Cadastro Encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cadastro Não Encontrado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "CPF Inválido!", "Ação Inválida!", JOptionPane.ERROR_MESSAGE);
            }
        });

        panelClienteVIP.add(Box.createVerticalStrut(20));
        panelClienteVIP.add(labelClienteVIP);
        panelClienteVIP.add(Box.createVerticalStrut(10));
        panelClienteVIP.add(campoCPF);
        panelClienteVIP.add(Box.createVerticalStrut(10));
        panelClienteVIP.add(botaoValidar);

        return panelClienteVIP;
    }

    private JPanel criarPainelBotoes() {
        JPanel panelBotoes = new JPanel();
        JButton botaoFinalizarCompra = new JButton("Finalizar Compra");
        panelBotoes.add(botaoFinalizarCompra);
        return panelBotoes;
    }

    private MaskFormatter formatar(String mascara) {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(mascara);
        } catch (ParseException e) {
            System.out.println("Formatacao com erro" + e);
        }
        return mask;
    }

    // Método para validar o formato do CPF
    private boolean validarCPF(String cpf) {
        // Verificção de CPF (Não era necessário)
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"); // Exemplo simples de validação de formato
    }

    // Método para verificar se o cliente existe no banco de dados pelo CPF
    private boolean clienteExisteNoBancoDeDados(String cpf) {
        return new ClientesDAO().clienteExiste(cpf);
    }

}

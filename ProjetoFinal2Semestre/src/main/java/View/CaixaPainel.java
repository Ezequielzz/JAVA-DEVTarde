package main.java.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import main.java.Connection.ClientesDAO;
import main.java.Connection.EstoqueDAO;
import main.java.Controller.VendasControl;
import main.java.Model.Estoque;
import main.java.Model.Vendas;

import java.util.List;

import java.awt.*;
import java.text.ParseException;

public class CaixaPainel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;
    private List<Vendas> vendas;
    private boolean clienteVIP = false;
    private JTextField campoQuantidade;
    private JTextField campoData;

    public CaixaPainel() {
        // Define o layout principal como BorderLayout
        setLayout(new BorderLayout());

        // Cria e adiciona os componentes aos diferentes painéis
        JPanel panelTop = painelTop();
        JScrollPane scrollPane = scrollPane();
        JPanel panelBotoes = painelBotoes();
        JPanel panelClienteVIP = painelClienteVIP();

        // Cria um painel central com BorderLayout e adiciona os painéis a ele
        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.add(panelTop, BorderLayout.NORTH);
        panelCentral.add(scrollPane, BorderLayout.CENTER);

        // Adiciona os painéis ao painel principal usando BorderLayout
        add(panelCentral, BorderLayout.CENTER);
        add(panelBotoes, BorderLayout.SOUTH);
        add(panelClienteVIP, BorderLayout.EAST);
    }

    // Método para criar e retornar o painel com campos de entrada para código do
    // produto e quantidade
    private JPanel painelTop() {
        JPanel panelTop = new JPanel();

        JTextField campoCodigo = new JTextField(10);
        campoQuantidade = new JTextField(5);
        campoData = new JTextField(10);

        JButton botaoAdicionar = new JButton("Adicionar");
        JButton botaoRemover = new JButton("Remover");

        // ActionListener para o botão "Adicionar"
        botaoAdicionar.addActionListener(e -> {
            String codigo = campoCodigo.getText();
            String quantidade = campoQuantidade.getText();
            String data = campoData.getText();

            if (quantidade.isEmpty() || data.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!", "Ação Inválida!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                preencherTabela(codigo); // Chama o método para preencher a tabela com o produto
            }

        });

        botaoRemover.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) { // Verifica se alguma linha está selecionada na tabela
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(selectedRow); // Remove a linha selecionada da tabela
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um item para remover!", "Ação Inválida!",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        panelTop.add(new JLabel("Código do Produto:"));
        panelTop.add(campoCodigo);
        panelTop.add(new JLabel("Quantidade:"));
        panelTop.add(campoQuantidade);
        panelTop.add(new JLabel("Data:"));
        panelTop.add(campoData);
        panelTop.add(botaoAdicionar);
        panelTop.add(botaoRemover);

        return panelTop;
    }

    // Método para criar e retornar o JScrollPane com a tabela
    private JScrollPane scrollPane() {
        JPanel panelLista = new JPanel();
        panelLista.setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Produto", "Código", "Valor Unitário", "Quantidade", "Data" });
        table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane scrollPane = new JScrollPane(table);
        panelLista.add(scrollPane);
        return scrollPane;
    }

    // Instância do controlador para operações de vendas
    private VendasControl operacoes = new VendasControl(vendas, tableModel, table);

    // Método para criar e retornar o painel para entrada de CPF do cliente VIP
    private JPanel painelClienteVIP() {
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
                // Verifica se o cliente é VIP no banco de dados
                if (clienteExistente(cpf)) {
                    clienteVIP = true;
                    JOptionPane.showMessageDialog(null, "Cadastro Encontrado!");
                } else {
                    clienteVIP = false;
                    JOptionPane.showMessageDialog(null, "Cadastro Não Encontrado!");
                }
            } else {
                clienteVIP = false;
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

    // Método para criar e retornar o painel com botões, incluindo finalização da
    // compra
    private JPanel painelBotoes() {
        JPanel panelBotoes = new JPanel();
        JButton botaoAvancarCompra = new JButton("Avançar Compra");
        panelBotoes.add(botaoAvancarCompra);

        botaoAvancarCompra.addActionListener(e -> {
            // Criando um JDialog para exibir informações adicionais
            JDialog dialog = new JDialog();
            double totalCompra = valorTotal();

            dialog.setTitle("Detalhes da Compra");
            dialog.setSize(300, 200);

            // Criando um JPanel para adicionar ao JDialog
            JPanel panelDetalhesCompra = new JPanel();
            panelDetalhesCompra.setLayout(new GridLayout(4, 1));

            // Label para exibir o total da compra
            JLabel labelDetalhes = new JLabel("Total da Compra: " + String.format("%.2f", totalCompra));
            panelDetalhesCompra.add(labelDetalhes);

            // JComboBox para selecionar o método de pagamento
            JComboBox<String> comboBoxPagamento = new JComboBox<>();
            comboBoxPagamento.addItem("Dinheiro");
            comboBoxPagamento.addItem("Cartão");
            panelDetalhesCompra.add(comboBoxPagamento);

            // Botão para finalizar a compra
            JButton botaoFinalizarCompra = new JButton("Finalizar Compra");
            botaoFinalizarCompra.addActionListener(actionEvent -> {
                JOptionPane.showMessageDialog(null, "Compra Finalizada!");

                enviarDadosParaBanco();

                dialog.dispose(); // Fecha o JDialog após finalizar a compra
            });
            panelDetalhesCompra.add(botaoFinalizarCompra);

            // Adicionando o JPanel ao JDialog
            dialog.add(panelDetalhesCompra);

            // Tornando o JDialog visível
            dialog.setVisible(true);
        });

        return panelBotoes;
    }

    // Método para formatar a máscara de entrada de CPF
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
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    // Método para verificar se o cliente existe no banco de dados pelo CPF
    private boolean clienteExistente(String cpf) {
        return new ClientesDAO().clienteExiste(cpf);
    }

    // Método para calcular o total dos valores na tabela, considerando desconto VIP
    private double valorTotal() {
        double total = 0.0;
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Object value = tableModel.getValueAt(i, 2);
            Object quantidade = tableModel.getValueAt(i, 3); // Obtém a quantidade da coluna 3 (supondo que seja a
                                                             // coluna da quantidade)

            if (value instanceof Double && quantidade instanceof String) {
                double valorUnitario = (Double) value;
                int qtde = Integer.parseInt((String) quantidade);

                total += valorUnitario * qtde;
            } else if (value instanceof String && quantidade instanceof String) {
                try {
                    double valorUnitario = Double.parseDouble((String) value);
                    int qtde = Integer.parseInt((String) quantidade);

                    total += valorUnitario * qtde;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        if (clienteVIP) {
            total *= 0.85; // Aplica o desconto de 15%
        }

        return total;
    }

    // Método para preencher a tabela com as informações do produto
    private void preencherTabela(String codigo) {
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        Estoque produto = estoqueDAO.listarUm(codigo);

        if (produto != null) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Verifica se o Cliente é Vip para aplicar o desconto
            if (clienteVIP) {
                double valorUnitario = Double.parseDouble(produto.getValorUnit());
                valorUnitario *= 0.85; // Aplica o desconto de 15%
                produto.setValorUnit(String.valueOf(valorUnitario)); // Converte de volta para String
            }

            // Adiciona os dados do produto à tabela
            Object[] rowData = { produto.getProduto(), produto.getCodigo(), produto.getValorUnit(),
                    campoQuantidade.getText(), campoData.getText() };
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!", "Ação Inválida!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para enviar dados da tabela para o banco de dados
    private void enviarDadosParaBanco() {
        int rowCount = tableModel.getRowCount();
        EstoqueDAO estoqueDAO = new EstoqueDAO();

        for (int i = 0; i < rowCount; i++) {
            String produto = (String) tableModel.getValueAt(i, 0);
            String codigo = (String) tableModel.getValueAt(i, 1);
            String valorUnit = (String) tableModel.getValueAt(i, 2);
            String quantidade = (String) tableModel.getValueAt(i, 3);
            String data = (String) tableModel.getValueAt(i, 4);

            operacoes.cadastrar(produto, codigo, valorUnit, quantidade, data);

            // Atualiza a quantidade no estoque subtraindo a quantidade vendida
            Estoque estoqueProduto = estoqueDAO.listarUm(codigo);
            int quantidadeDisponivel = Integer.parseInt(estoqueProduto.getEquantidade());
            int quantidadeVendida = Integer.parseInt(quantidade);
            int novaQuantidade = quantidadeDisponivel - quantidadeVendida;

            // Atualiza a quantidade disponível no estoque após a venda
            estoqueDAO.atualizar(produto, codigo, valorUnit, Integer.toString(novaQuantidade));
        }
    }

}

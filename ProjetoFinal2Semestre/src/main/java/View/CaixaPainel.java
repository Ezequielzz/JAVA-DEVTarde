package main.java.View;

import javax.swing.*;
import java.awt.*;

public class CaixaPainel extends JPanel {
    public CaixaPainel() {
        setLayout(new BorderLayout());

        JPanel panelTop = criarPainelTop();
        JPanel panelLista = new JPanel(new GridLayout(0, 1));
        JScrollPane scrollPane = new JScrollPane(panelLista);
        JPanel panelBotoes = criarPainelBotoes();
        JPanel panelClienteVIP = criarPainelClienteVIP();

        add(panelTop, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);   
        add(panelBotoes, BorderLayout.SOUTH);
        add(panelClienteVIP, BorderLayout.EAST);
    }

    private JPanel criarPainelTop() {
        JPanel panelTop = new JPanel();
        JLabel labelCodigo = new JLabel("Código do Produto:");
        JTextField campoCodigo = new JTextField(10);
        JLabel labelQuantidade = new JLabel("Quantidade:");
        JTextField campoQuantidade = new JTextField(5);
        JButton botaoAdicionar = new JButton("Adicionar");
        JButton botaoRemover = new JButton("Remover");
        panelTop.add(labelCodigo);
        panelTop.add(campoCodigo);
        panelTop.add(labelQuantidade);
        panelTop.add(campoQuantidade);
        panelTop.add(botaoAdicionar);
        panelTop.add(botaoRemover);
        return panelTop;
    }

    private JPanel criarPainelClienteVIP() {
        JPanel panelClienteVIP = new JPanel();
        panelClienteVIP.setLayout(new BoxLayout(panelClienteVIP, BoxLayout.Y_AXIS));

        JLabel labelClienteVIP = new JLabel("Cliente VIP:");
        labelClienteVIP.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField campoCPF = new JTextField(15);
        campoCPF.setMaximumSize(new Dimension(150, 25));

        JButton botaoValidar = new JButton("Validar CPF");
        botaoValidar.setAlignmentX(Component.CENTER_ALIGNMENT);

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
}

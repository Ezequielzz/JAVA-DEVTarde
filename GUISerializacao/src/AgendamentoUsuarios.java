import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoUsuarios extends JFrame {
    private JTextField inputNome;
    private JTextField inputIdade;
    private JTextField inputHora;
    private JTextField inputDia;
    private JTextField inputMes;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;

    public AgendamentoUsuarios() {
        
        setTitle("Cadastro de Usuários");
        setSize(850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Idade");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Dia");
        tableModel.addColumn("Mês");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);


        inputNome = new JTextField(20);
        inputIdade = new JTextField(5);
        inputHora = new JTextField(5);
        inputDia = new JTextField(5);
        inputMes = new JTextField(5);
        JButton agendarButton = new JButton("Agendar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton apagarTodosButton = new JButton("Apagar Todos");
        JButton salvarButton = new JButton("Salvar");
        JPanel inputPanel = new JPanel();


        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(inputIdade);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Dia:"));
        inputPanel.add(inputDia);
        inputPanel.add(new JLabel("Mês:"));
        inputPanel.add(inputMes);

        inputPanel.add(agendarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);


        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        File arquivo = new File("dados.txt");
        if (arquivo.exists()) {
            usuarios = Serializacao.deserializar("dados.txt");
            atualizarTabela();
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputIdade.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputHora.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputDia.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputMes.setText(table.getValueAt(linhaSelecionada, 1).toString());
                }
            }
        });

        OperacoesUsuarios operacoes = new OperacoesUsuarios(usuarios, tableModel, table);
        agendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.agendarUsuario(inputNome.getText(), inputIdade.getText(), inputHora.getText(), inputDia.getText(), inputMes.getText());
                inputNome.setText("");
                inputIdade.setText("");
                inputHora.setText("");
                inputDia.setText("");
                inputMes.setText("");
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada, inputNome.getText(), inputIdade.getText(), inputHora.getText(), inputDia.getText(), inputMes.getText());
                        

            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada);
            }
        });

        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios();
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] {
                usuario.getNome(),
                usuario.getIdade(),
                usuario.getHora(),
                usuario.getDia(), 
                usuario.getMes()  
            });
        }
    }

    public void run() {
        setVisible(true);
    }

}
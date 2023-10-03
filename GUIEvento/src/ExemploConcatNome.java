import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploConcatNome extends JFrame {
    public ExemploConcatNome() {
        super("Tratamento de Eventos");

        // Criação do JPanel
        JPanel painelPrincipal = new JPanel(new GridLayout(3, 2));

        // Criação dos Componentes
        JLabel nome = new JLabel("Nome:");
        JTextField inserirNome = new JTextField();
        JLabel sobrenome = new JLabel("Sobrenome:");
        JTextField inserirSobrenome = new JTextField();
        JLabel nomeCompleto = new JLabel("Nome Completo: ");
        JButton ok = new JButton("OK");

        // Add os Componentes ao painelPrincipal
        painelPrincipal.add(nome);
        painelPrincipal.add(inserirNome);
        painelPrincipal.add(sobrenome);
        painelPrincipal.add(inserirSobrenome);
        painelPrincipal.add(nomeCompleto);
        painelPrincipal.add(ok);

        // Metodo Encurtado
        // ok.addActionListener(e -> {
        // nomeCompleto.setText("Nome Completo: " + inserirNome.getText() + " " +
        // inserirSobrenome.getText());
        // inserirNome.setText("");
        // inserirSobrenome.setText("");
        // });

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nomeCompleto.setText("Nome Completo: " + inserirNome.getText() + " " + inserirSobrenome.getText());
                inserirNome.setText("");
                inserirSobrenome.setText("");
            }
        });

        // Set Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(painelPrincipal);
        this.setSize(350, 120); // Define o tamanho da janela
        this.setLocationRelativeTo(null); // Centralizar a janela na tela
        this.setVisible(true);
    }
}
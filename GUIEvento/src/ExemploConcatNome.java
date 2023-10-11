import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploConcatNome extends JFrame {

    private JLabel nome, sobrenome, nomeCompleto;
    private JTextField inserirNome, inserirSobrenome;

    

    public ExemploConcatNome() {
        super("Tratamento de Eventos");

        // Criação do JPanel
        JPanel painelPrincipal = new JPanel(new GridLayout(3, 2));

        // Criação dos Componentes
        nome = new JLabel("Nome:");
        inserirNome = new JTextField();
        sobrenome = new JLabel("Sobrenome:");
        inserirSobrenome = new JTextField();
        nomeCompleto = new JLabel("Nome Completo: ");
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

        // ok.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // nomeCompleto.setText("Nome Completo: " + inserirNome.getText() + " " +
        // inserirSobrenome.getText());
        // inserirNome.setText("");
        // inserirSobrenome.setText("");
        // }
        // });

            // Crie uma instância do seu Handler
        Handler handler = new Handler();

        // Adicione o Handler como ouvinte de ação para o botão 'ok'
        ok.addActionListener(handler);

        
        // Set Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(painelPrincipal);
        this.setSize(350, 120); // Define o tamanho da janela
        this.setLocationRelativeTo(null); // Centralizar a janela na tela
        this.setVisible(true);
    }

    public class Handler implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            nomeCompleto.setText("Nome Completo: " + inserirNome.getText() + " " + inserirSobrenome.getText());
            inserirNome.setText("");
            inserirSobrenome.setText("");
    
        }
    
    }
    
}
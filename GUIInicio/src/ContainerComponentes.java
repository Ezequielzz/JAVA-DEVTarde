import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ContainerComponentes extends JFrame {
    int cont = 0;
    
    public ContainerComponentes() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        //Criar outro Container
        JPanel painel1 = new JPanel();
        this.add(painel1);
        // Adcionar um JButton e um JLabel --> painel1
        JButton botao1 = new JButton("Clique Aqui");
        JLabel texto1 = new JLabel("Nº de Cliques");

        painel1.add(botao1);
        painel1.add(texto1);
        // Add uma ação para o botão (addActionListener)
        botao1.addActionListener( e -> {
            cont++;
            texto1.setText("Nº de Cliques é " + cont);

            add(new JButton("" + cont));});

        this.setVisible(true);
    }

}

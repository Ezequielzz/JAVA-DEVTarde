import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameUtilizando extends JFrame {
    
    public JFrameUtilizando() {
        super("Janela Principal");

        // Setando a Janela
        this.setBounds(500, 500, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Ajustando o Layout da Janela
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        // Adcionar Componentes
        for (int i = 0; i < 6; i++) {
            this.add(new JButton("" + i));
        }

        this.add(new TextField("Meus Textos", 15));
        //
        this.setVisible(true);
    }
}

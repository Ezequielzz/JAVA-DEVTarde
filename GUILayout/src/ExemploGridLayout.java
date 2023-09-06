import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        super("Janela Principal");

        // Add JPanel

        JPanel painel = new JPanel();
        this.add(painel);

        // Modificar o Layout do JPanel --> Flow para Grid

        GridLayout grid = new GridLayout(2,2);
        painel.setLayout(grid);

        // Add dos Componentes ao JPanel
        for (int i = 0; i < 4; i++) {
            painel.add(new JButton("" + i));
        }
        // Set Frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}

import java.awt.*;
import javax.swing.*;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        super("Janela");

        // Add Jpanel e definir o Layout
        JPanel painel = new JPanel(new BorderLayout());
        this.add(painel);

        // Add componentes
        painel.add(new JButton("South"), BorderLayout.SOUTH);
        painel.add(new JTextField(25), BorderLayout.NORTH);
        painel.add(new JButton("West"), BorderLayout.WEST);
        painel.add(new JButton("East"), BorderLayout.EAST);
        painel.add(new JButton("Center"), BorderLayout.CENTER);

        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
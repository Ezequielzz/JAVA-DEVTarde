import java.awt.*;
import javax.swing.*;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();
        this.add(new JLabel("Calculadora2"));

        JPanel painelPrincipal = new JPanel(new BorderLayout());
        this.add(painelPrincipal);

        JPanel painelCentral = new JPanel(new GridLayout(2,0));
        this.add(painelPrincipal);
        painelPrincipal.add(BorderLayout.CENTER);

        painelCentral.add(new JLabel("Insira sua Altura"));
        painelCentral.add(new JTextField(10));
    }
}

import javax.swing.JFrame;

public class JanelaP extends JFrame{
    public JanelaP() {
        super("Projeto");

        // JTabbedPane a Janela Principal 
        this.add(new JanelaAbas());

        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
    
}
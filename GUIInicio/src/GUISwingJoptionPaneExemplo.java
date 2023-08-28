import javax.swing.JOptionPane;

public class GUISwingJoptionPaneExemplo extends JOptionPane {
    String Informacao = "Minha Janela JOptionPane";
    public GUISwingJoptionPaneExemplo() {
        super();
        this.showMessageDialog(
            getComponentPopupMenu(), Informacao,
            Informacao, 0, icon);
    }
}
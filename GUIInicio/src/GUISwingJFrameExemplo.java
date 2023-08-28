import javax.swing.JFrame;

public class GUISwingJFrameExemplo extends JFrame {

    // Construtor
    public GUISwingJFrameExemplo() {
        super("Minha Primeira Janela GUI Swing");
        // Tamanho
        this.setSize(400, 400);
        // Fecha a janela no X
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Transoforma a Janla em Visívek
        this.setVisible(true);
    }
}

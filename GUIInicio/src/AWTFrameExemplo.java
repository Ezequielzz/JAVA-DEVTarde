import java.awt.Frame;

public class AWTFrameExemplo extends Frame {

    // Construtor
    public AWTFrameExemplo() {
        super("Minha Primeira Janela AWT");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(false);
    }
}

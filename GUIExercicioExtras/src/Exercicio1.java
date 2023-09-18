import java.util.logging.Handler;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exercicio1 extends JFrame {
    private String painel1 = "Card 1";
    private String painel2 = "Card 2";

    public Exercicio1() {
        // Construtor
        super("Exercicio 1 Extra");
        JPanel painelPrincipal = new JPanel();
        String botao[] = {painel1, painel2};
        JButton botaoBack = new JButton(botao[0]);
        JButton botaoNext = new JButton(botao[1]);

        painelPrincipal.add(botaoNext);

        // Criando os Cards
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bom dia só pra quem ganhou o jogo da ida da Copa do Brasil!"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("OOOOOHHH TOCA NO CALLERI QUE É GOL!!"));
    }
}

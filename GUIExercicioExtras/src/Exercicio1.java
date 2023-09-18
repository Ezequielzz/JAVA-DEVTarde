import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Exercicio1 extends JFrame {
    private String painel1 = "Card 1";
    private String painel2 = "Card 2";

    public Exercicio1() {
        // Construtor
        super("Exercicio 1 Extra");
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new FlowLayout());
        String botao[] = {painel1, painel2};
        JButton botaoBack = new JButton(botao[0]);
        JButton botaoNext = new JButton(botao[1]);

        painelPrincipal.add(botaoBack);
        painelPrincipal.add(botaoNext);

        // Criando os Cards
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bom dia só pra quem ganhou o jogo da ida da Copa do Brasil!"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("OOOOOHHH TOCA NO CALLERI QUE É GOL!!"));
    }
}

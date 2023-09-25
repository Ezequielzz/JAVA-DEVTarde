import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio1 extends JFrame {
    JPanel painel0;
    JPanel painel1;
    JPanel painel2;
    JPanel painel3;
    JButton botaoNext1;
    JButton botaoNext2;
    JButton botaoNext3;
    JButton botaoBack1;
    JButton botaoBack2;
    JButton botaoBack3;
    JLabel label1;
    JLabel label2;
    JLabel label3;

    public Exercicio1() {
        // Construtor
        super("Exercicio 1 Extra");
        painel0 = new JPanel(new CardLayout());
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();

        botaoNext1 = new JButton("Próximo");
        botaoNext1.setBackground(Color.GREEN);
        botaoNext2 = new JButton("Próximo");
        botaoNext2.setBackground(Color.GREEN);
        botaoNext3 = new JButton("Próximo");
        botaoNext3.setBackground(Color.GREEN);

        botaoBack1 = new JButton("Voltar");
        botaoBack1.setBackground(Color.RED);
        botaoBack2 = new JButton("Voltar");
        botaoBack2.setBackground(Color.RED);
        botaoBack3 = new JButton("Voltar");
        botaoBack3.setBackground(Color.RED);


        label1 = new JLabel("Card 1");
        label2 = new JLabel("Card 2");
        label3 = new JLabel("Card 3");

        painel1.add(botaoNext1);
        painel2.add(botaoNext2);
        painel3.add(botaoNext3);
        painel1.add(botaoBack1);
        painel2.add(botaoBack2);
        painel3.add(botaoBack3);
        painel1.add(label1);
        painel2.add(label2);
        painel3.add(label3);

        painel0.add(painel1);
        painel0.add(painel2);
        painel0.add(painel3);

        botaoNext1.addActionListener(e -> {
            painel1.setVisible(false);
            painel2.setVisible(true);
            painel3.setVisible(false);
        });

        botaoNext2.addActionListener(e -> {
            painel1.setVisible(false);
            painel2.setVisible(false);
            painel3.setVisible(true);
        });

        botaoNext3.addActionListener(e -> {
            painel1.setVisible(true);
            painel2.setVisible(false);
            painel3.setVisible(false);
        });


        botaoBack1.addActionListener(e -> {
            painel1.setVisible(false);
            painel2.setVisible(false);
            painel3.setVisible(true);
        });

        botaoBack2.addActionListener(e -> {
            painel1.setVisible(true);
            painel2.setVisible(false);
            painel3.setVisible(false);
        });

         botaoBack3.addActionListener(e -> {
             painel1.setVisible(false);
             painel2.setVisible(true);
             painel3.setVisible(false);
         });

        this.setDefaultCloseOperation(2);
        this.add(painel0);
        this.pack();
        this.setVisible(true);
    }

}

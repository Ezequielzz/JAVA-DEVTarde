import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExercicioGridLayout extends JFrame {
    public ExercicioGridLayout() {
        super("Janela Principal");

        // Add JPanel

        JPanel painel = new JPanel();
        this.add(painel);

        // Modificar o Layout do JPanel --> Flow para Grid

        JPanel painelCentral = new JPanel();
        BorderLayout border = new BorderLayout();
        GridLayout grid = new GridLayout(4, 4);
        painel.setLayout(grid);

        // Add dos Componentes ao JPanel
        JButton botao7 = new JButton("7");
        botao7.setBackground(Color.white);
        JButton botao8 = new JButton("8");
        botao8.setBackground(Color.white);
        JButton botao9 = new JButton("9");
        botao9.setBackground(Color.white);
        JButton botaoX = new JButton("X");
        botaoX.setBackground(Color.LIGHT_GRAY);
        JButton botao4 = new JButton("4");
        botao4.setBackground(Color.white);
        JButton botao5 = new JButton("5");
        botao5.setBackground(Color.white);
        JButton botao6 = new JButton("6");
        botao6.setBackground(Color.white);
        JButton botaoMenos = new JButton("-");
        botaoMenos.setBackground(Color.LIGHT_GRAY);
        JButton botao1 = new JButton("1");
        botao1.setBackground(Color.white);
        JButton botao2 = new JButton("2");
        botao2.setBackground(Color.white);
        JButton botao3 = new JButton("3");
        botao3.setBackground(Color.white);
        JButton botaoMais = new JButton("+");
        botaoMais.setBackground(Color.LIGHT_GRAY);
        JButton botaoBarra = new JButton("+/-");
        botaoBarra.setBackground(Color.LIGHT_GRAY);
        JButton botao0 = new JButton("0");
        botao0.setBackground(Color.white);
        JButton botaoVirgula = new JButton(",");
        botaoVirgula.setBackground(Color.LIGHT_GRAY);
        JButton botaoIgual = new JButton("=");
        botaoIgual.setBackground(Color.GREEN);

        painel.add(botao7);
        painel.add(botao8);
        painel.add(botao9);
        painel.add(botaoX);
        painel.add(botao4);
        painel.add(botao5);
        painel.add(botao6);
        painel.add(botaoMenos);
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(botaoMais);
        painel.add(botaoBarra);
        painel.add(botao0);
        painel.add(botaoVirgula);
        painel.add(botaoIgual);

        // Set Frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}

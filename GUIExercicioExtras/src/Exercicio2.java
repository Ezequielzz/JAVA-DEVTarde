import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio2 extends JFrame {

    private JTextField teclaDig, textoDig, textoEspelhado;

    Dimension tamanho = new Dimension(20, 10);
    Font fonte = new Font("Arial", Font.BOLD, 14);
    Font fonte2 = new Font("Arial", Font.BOLD, 13);

    public Exercicio2() {
        super("Espelhamento de Texto");

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(7, 1));
        painelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titulo = new JLabel("Espelhamento de Texto");
        titulo.setFont(fonte);
        titulo.setBorder(new EmptyBorder(0, 45, 10, 0));

        JLabel lteclaDig = new JLabel("Tecla Digitada");
        lteclaDig.setFont(fonte2);
        teclaDig = new JTextField();
        teclaDig.setPreferredSize(new Dimension(20, 10));

        JLabel ltextoDig = new JLabel("Texto Digitado");
        ltextoDig.setFont(fonte2);
        textoDig = new JTextField();

        JLabel ltextoEspelhado = new JLabel("Texto Espelhado");
        ltextoEspelhado.setFont(fonte2);
        textoEspelhado = new JTextField();

        painelPrincipal.add(titulo);
        painelPrincipal.add(lteclaDig);
        painelPrincipal.add(teclaDig);
        painelPrincipal.add(ltextoDig);
        painelPrincipal.add(textoDig);
        painelPrincipal.add(ltextoEspelhado);
        painelPrincipal.add(textoEspelhado);

        // Crie uma instância do seu Handler
        Handler handler = new Handler();

        // Adicione o Handler como ouvinte de ação para o campo de texto 'textoDig'
        textoDig.addKeyListener(handler);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 400, 300, 270);
        this.add(painelPrincipal);
    }

    public class Handler implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            textoEspelhado.setText(textoDig.getText());
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            char typedKey = e.getKeyChar();
            teclaDig.setText("" + typedKey);
            
        }
        
    }

    public void run(){
        this.setVisible(true);
    }

}

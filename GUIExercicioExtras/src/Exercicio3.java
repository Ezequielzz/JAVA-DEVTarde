import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {

    public Exercicio3() {
        
        JLabel titulo = new JLabel("Bem-Vindo! O que deseja fazer?");
        Font fonteTamanhoNovo = new Font("Serif", Font.PLAIN, 17);
        titulo.setFont(fonteTamanhoNovo);

        JLabel login = new JLabel("Login");
        JButton botaoLogin = new JButton("login");
        JLabel cadastro = new JLabel("Cadastro");
        JButton botaoCadastro = new JButton("cadastro");



        JPanel painelPrincipal = new JPanel();
        CardLayout cl = new CardLayout();
        painelPrincipal.setLayout(cl);

        JPanel painelSubPrincipal = new JPanel();
        painelPrincipal.add(painelSubPrincipal);
        painelSubPrincipal.setLayout(new BorderLayout());

        JPanel painelSuperior = new JPanel();
        painelSubPrincipal.add(painelSuperior, BorderLayout.NORTH);
        painelSuperior.setLayout(new GridLayout(2, 1));

        JPanel painelCentro = new JPanel();
        painelSubPrincipal.add(painelCentro, BorderLayout.CENTER);
        painelCentro.setLayout(new BorderLayout());

        JPanel painelOpcoes = new JPanel();
        painelCentro.add(painelOpcoes, BorderLayout.CENTER);
        painelOpcoes.setLayout(new GridLayout(4,1));

        JPanel painelInferior = new JPanel();
        painelSubPrincipal.add(painelInferior, BorderLayout.SOUTH);
        painelInferior.setLayout(new BorderLayout());

        painelSuperior.add(titulo);

        painelOpcoes.add(login);
        painelOpcoes.add(botaoLogin);
        painelOpcoes.add(cadastro);
        painelOpcoes.add(botaoCadastro);


        this.setDefaultCloseOperation(2);
        this.setBounds(800, 400, WIDTH, HEIGHT);
        this.add(painelPrincipal);
        this.pack();
        this.setVisible(true);
    }
}

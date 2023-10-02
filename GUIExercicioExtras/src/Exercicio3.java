import java.awt.*;
import javax.swing.*;

public class Exercicio3 extends JFrame {

    public Exercicio3() {
        super("Atividade Extra 3");

        // Cridndo Painel Principal e Setando Layout
        CardLayout cl = new CardLayout();
        JPanel painel0 = new JPanel();
        painel0.setLayout(cl);

        // Criando os Paineis e setando os Layouts
        JPanel painel1 = new JPanel();
        painel1.setLayout(new CardLayout());

        JPanel painelSub1 = new JPanel();
        painelSub1.setLayout(new BorderLayout());
        painel1.add(painelSub1);

        JPanel painelInfos = new JPanel();
        painelInfos.setLayout(new GridLayout(4, 1));
        painelSub1.add(painelInfos);


        
        // Criando e Add componentes
        Font fonte2 = new Font("Arial", Font.BOLD, 14);
        Font fonte1 = new Font("Arial", Font.BOLD, 17);
        Font fonte3 = new Font("Arial", Font.BOLD, 13);

        // Titulo e Fonte
        JLabel tituloPrincipal = new JLabel("Olá, Seja Bem-Vindo!");
        tituloPrincipal.setFont(fonte1);

        // Label e Botão Login
        JLabel labelLogin = new JLabel("Login");
        labelLogin.setFont(fonte2);
        JButton botaoLogin = new JButton("Vá para Login");
        botaoLogin.setFont(fonte3);

        // Lbael e Botão Cadastro
        JLabel labelCadastro = new JLabel("Cadastro");
        labelCadastro.setFont(fonte2);
        JButton botaoCadastro = new JButton("Vá para Cadastro");
        botaoCadastro.setFont(fonte3);


        painelSub1.add(tituloPrincipal, BorderLayout.NORTH);
        painelInfos.add(labelLogin);
        painelInfos.add(botaoLogin);
        painelInfos.add(labelCadastro);
        painelInfos.add(botaoCadastro);

        // Criando os Paineis e setando os Layouts
        JPanel painel2 = new JPanel();
        painel2.setLayout(new CardLayout());
        JPanel painelSub2 = new JPanel();
        painelSub2.setLayout(new BorderLayout());

        // Criando os Paineis e setando os Layouts
        JPanel painel3 = new JPanel();
        painel3.setLayout(new CardLayout());
        JPanel painelSub3 = new JPanel();
        painelSub3.setLayout(new BorderLayout());

        botaoLogin.addActionListener(e -> {
            cl.next(painel0);
        });

        painel0.add(painel1);
        painel0.add(painel2);
        painel0.add(painel3);

        this.setDefaultCloseOperation(2);
        this.setBounds(800, 400, WIDTH, HEIGHT);
        this.add(painel1);
        this.pack();
        this.setVisible(true);

    }
}
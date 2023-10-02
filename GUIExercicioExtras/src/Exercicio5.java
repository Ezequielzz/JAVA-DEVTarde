import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercicio5 extends JFrame {

    public Exercicio5() {
        super("Atividade Extra 5");

        // Criando Painel Principal e Setando Layout
        JPanel painelPrincipal = new JPanel();
        CardLayout cl = new CardLayout();
        painelPrincipal.setLayout(cl);

        // ---------- Painel Inicio ----------

        Font fonte = new Font("Arial", Font.BOLD, 14);
        Font fonte2 = new Font("Arial", Font.BOLD, 13);
        Font fonte3 = new Font("Arial", Font.BOLD, 12);

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelInicio = new JPanel();
        painelInicio.setLayout(new CardLayout());

        JPanel painelSubInicio = new JPanel();
        painelSubInicio.setLayout(new GridLayout(6, 1));
        painelInicio.add(painelSubInicio);
        // Adicionando um espaço entre o botão e a borda do painel
        painelSubInicio.setBorder(new EmptyBorder(20, 10, 20, 10));

        JLabel tituloInicio = new JLabel("Bem-Vindo ao Quiz ???!");
        tituloInicio.setBorder(new EmptyBorder(0, 45, 20, 5));
        tituloInicio.setFont(fonte);

        JLabel descricao1 = new JLabel("• Futebol Brasileiro");
        JLabel descricao2 = new JLabel("• Futebol Sul-Americano");
        JLabel descricao3 = new JLabel("• Futebol Euroupeu");
        JLabel descricao4 = new JLabel("• Futebol Mundial");

        JButton botaoIniciar = new JButton("Iniciar!");
        botaoIniciar.setBackground(Color.BLUE);
        botaoIniciar.setForeground(Color.WHITE);

        // Acionando os Componentes no Painel Inicio
        painelSubInicio.add(tituloInicio);
        painelSubInicio.add(descricao1);
        painelSubInicio.add(descricao2);
        painelSubInicio.add(descricao3);
        painelSubInicio.add(descricao4);
        painelSubInicio.add(botaoIniciar);

        // ---------- XXXXXXXXX ----------

        // ---------- Painel Jogo1 ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelJogo1 = new JPanel();
        painelJogo1.setLayout(new CardLayout());

        JPanel painelSubJogo1 = new JPanel();
        painelSubJogo1.setLayout(new GridLayout(7, 1));
        painelSubJogo1.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo1.add(painelSubJogo1);

        JLabel tituloJogo1 = new JLabel("QUIZ - Futebol Brasileiro");
        tituloJogo1.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo1.setFont(fonte);

        JLabel pergunta1 = new JLabel("Qual o Maior Artilheiro do São Paulo?");
        pergunta1.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta1.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo1 = new ButtonGroup();
        JRadioButton alternativa1 = new JRadioButton("Kaká");
        alternativa1.setFont(fonte3);
        JRadioButton alternativa2 = new JRadioButton("Müller");
        alternativa2.setFont(fonte3);
        JRadioButton alternativa3 = new JRadioButton("Serginho Chulapa");
        alternativa3.setFont(fonte3);
        JRadioButton alternativa4 = new JRadioButton("Calleri");
        alternativa4.setFont(fonte3);
        alternativa4.setBorder(new EmptyBorder(0, 5, 10, 0)); // Pequeno espaço entre botão e alternativa

        JButton enviar1 = new JButton("Enviar");
        enviar1.setBackground(Color.GREEN);
        enviar1.setFont(fonte2);

        // Add os RadioButtons no ButtonGroup
        alternativasJogo1.add(alternativa1);
        alternativasJogo1.add(alternativa2);
        alternativasJogo1.add(alternativa3);
        alternativasJogo1.add(alternativa4);

        // Acionando os Componentes no Painel Jogo1
        painelSubJogo1.add(tituloJogo1);
        painelSubJogo1.add(pergunta1);
        painelSubJogo1.add(alternativa1);
        painelSubJogo1.add(alternativa2);
        painelSubJogo1.add(alternativa3);
        painelSubJogo1.add(alternativa4);
        painelSubJogo1.add(enviar1);

        // ---------- XXXXXXXXX ----------



        // ---------- Painel Jogo2 ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelJogo2 = new JPanel();
        painelJogo2.setLayout(new CardLayout());

        JPanel painelSubJogo2 = new JPanel();
        painelSubJogo2.setLayout(new GridLayout(7, 1));
        painelSubJogo2.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo2.add(painelSubJogo2);

        JLabel tituloJogo2 = new JLabel("QUIZ - Futebol Brasileiro");
        tituloJogo2.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo2.setFont(fonte);

        JLabel pergunta2 = new JLabel("Qual o Maior Artilheiro do São Paulo?");
        pergunta2.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta2.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo2 = new ButtonGroup();
        JRadioButton alternativa5 = new JRadioButton("Kaká");
        alternativa5.setFont(fonte3);
        JRadioButton alternativa6 = new JRadioButton("Müller");
        alternativa6.setFont(fonte3);
        JRadioButton alternativa7 = new JRadioButton("Serginho Chulapa");
        alternativa7.setFont(fonte3);
        JRadioButton alternativa8 = new JRadioButton("Calleri");
        alternativa8.setFont(fonte3);
        alternativa8.setBorder(new EmptyBorder(0, 5, 10, 0)); // Pequeno espaço entre botão e alternativa

        JButton enviar2 = new JButton("Enviar");
        enviar2.setBackground(Color.GREEN);
        enviar2.setFont(fonte2);

        // Add os RadioButtons no ButtonGroup
        alternativasJogo2.add(alternativa5);
        alternativasJogo2.add(alternativa6);
        alternativasJogo2.add(alternativa7);
        alternativasJogo2.add(alternativa8);

        // Acionando os Componentes no Painel Jogo1
        painelSubJogo2.add(tituloJogo2);
        painelSubJogo2.add(pergunta2);
        painelSubJogo2.add(alternativa5);
        painelSubJogo2.add(alternativa6);
        painelSubJogo2.add(alternativa7);
        painelSubJogo2.add(alternativa8);
        painelSubJogo2.add(enviar2);

        // ---------- XXXXXXXXX ----------

        // Adicionando a Pilha de Cards
        painelPrincipal.add(painelInicio);
        painelPrincipal.add(painelJogo1);
        painelPrincipal.add(painelJogo2);


        // Tratamento de Eventos

        botaoIniciar.addActionListener(e -> {
            System.out.println("Botão Iniciar pressionado.");
            cl.next(painelPrincipal);
        });

        // Set e Configuração do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 400, WIDTH, HEIGHT);
        this.add(painelPrincipal);
        this.pack();
        this.setVisible(true);
    }
}
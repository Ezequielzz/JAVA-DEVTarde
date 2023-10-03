import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercicio5 extends JFrame {
    private int acertos = 0;
    private int chances = 3;

    public Exercicio5() {
        super("Atividade Extra 5");

        // Criando Painel Principal e Setando Layout
        JPanel painelPrincipal = new JPanel();
        CardLayout cl = new CardLayout();
        painelPrincipal.setLayout(cl);

        // Criando as Fontes
        Font fonte = new Font("Arial", Font.BOLD, 14);
        Font fonte2 = new Font("Arial", Font.BOLD, 13);
        Font fonte3 = new Font("Arial", Font.BOLD, 12);

        // ---------- Painel Inicio ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelInicio = new JPanel();
        painelInicio.setLayout(new CardLayout());

        JPanel painelSubInicio = new JPanel();
        painelSubInicio.setLayout(new GridLayout(6, 1));
        painelInicio.add(painelSubInicio);
        // Adicionando um espaço entre o botão e a borda do painel
        painelSubInicio.setBorder(new EmptyBorder(20, 10, 20, 10));

        JLabel tituloInicio = new JLabel("Bem-Vindo ao Quiz NWFootball!");
        tituloInicio.setBorder(new EmptyBorder(0, 15, 20, 5));
        tituloInicio.setFont(fonte);

        JLabel descricao1 = new JLabel("• Quiz Sobre Futebol Brasileiro");
        JLabel descricao2 = new JLabel("• Você tem 5 perguntas para responder");
        JLabel descricao3 = new JLabel("• Você tem 3 chances durante o Quiz");
        JLabel descricao4 = new JLabel("• Boa Sorte!");

        JButton botaoIniciar = new JButton("Iniciar!");
        botaoIniciar.setBackground(Color.ORANGE);

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
        painelSubJogo1.setLayout(new GridLayout(8, 1));
        painelSubJogo1.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo1.add(painelSubJogo1);

        JLabel tituloJogo1 = new JLabel("QUIZ - NWFootball");
        tituloJogo1.setBorder(new EmptyBorder(0, 60, 10, 10)); // Espaçamento do titulo
        tituloJogo1.setFont(fonte);

        // Criando Informações do Jogo
        JLabel infos1 = new JLabel("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
        infos1.setBorder(new EmptyBorder(10, 5, 10, 0));
        infos1.setFont(fonte2);

        JLabel pergunta1 = new JLabel("Qual o Time Brasileiro Com Mais Mundiais?");
        pergunta1.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta1.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo1 = new ButtonGroup();
        JRadioButton alternativa1 = new JRadioButton("Palmeiras");
        alternativa1.setFont(fonte3);
        JRadioButton alternativa2 = new JRadioButton("Santos");
        alternativa2.setFont(fonte3);
        JRadioButton alternativa3 = new JRadioButton("São Paulo");
        alternativa3.setFont(fonte3);
        JRadioButton alternativa4 = new JRadioButton("Flamengo");
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
        painelSubJogo1.add(infos1);
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
        painelSubJogo2.setLayout(new GridLayout(8, 1));
        painelSubJogo2.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo2.add(painelSubJogo2);

        JLabel tituloJogo2 = new JLabel("QUIZ - NWFootball");
        tituloJogo2.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo2.setFont(fonte);

        // Criando Informações do Jogo
        JLabel infos2 = new JLabel("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
        infos2.setBorder(new EmptyBorder(10, 5, 10, 0));
        infos2.setFont(fonte2);

        JLabel pergunta2 = new JLabel("Quem é o Maior Campeão da Copa do Brasil?");
        pergunta2.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta2.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo2 = new ButtonGroup();
        JRadioButton alternativa5 = new JRadioButton("Palmeiras");
        alternativa5.setFont(fonte3);
        JRadioButton alternativa6 = new JRadioButton("Cruzeiro");
        alternativa6.setFont(fonte3);
        JRadioButton alternativa7 = new JRadioButton("Santos");
        alternativa7.setFont(fonte3);
        JRadioButton alternativa8 = new JRadioButton("Flamengo");
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

        // Acionando os Componentes no Painel Jogo2
        painelSubJogo2.add(tituloJogo2);
        painelSubJogo2.add(infos2);
        painelSubJogo2.add(pergunta2);
        painelSubJogo2.add(alternativa5);
        painelSubJogo2.add(alternativa6);
        painelSubJogo2.add(alternativa7);
        painelSubJogo2.add(alternativa8);
        painelSubJogo2.add(enviar2);

        // ---------- XXXXXXXXX ----------

        // ---------- Painel Jogo3 ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelJogo3 = new JPanel();
        painelJogo3.setLayout(new CardLayout());

        JPanel painelSubJogo3 = new JPanel();
        painelSubJogo3.setLayout(new GridLayout(8, 1));
        painelSubJogo3.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo3.add(painelSubJogo3);

        JLabel tituloJogo3 = new JLabel("QUIZ - NWFootball");
        tituloJogo3.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo3.setFont(fonte);

        // Criando Informações do Jogo
        JLabel infos3 = new JLabel("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
        infos3.setBorder(new EmptyBorder(10, 5, 10, 0));
        infos3.setFont(fonte2);

        JLabel pergunta3 = new JLabel("Qual Time Foi Campeão do Brasileirão 2014?");
        pergunta3.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta3.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo3 = new ButtonGroup();
        JRadioButton alternativa9 = new JRadioButton("Cruzeiro");
        alternativa9.setFont(fonte3);
        JRadioButton alternativa10 = new JRadioButton("São Paulo");
        alternativa10.setFont(fonte3);
        JRadioButton alternativa11 = new JRadioButton("Palmeiras");
        alternativa11.setFont(fonte3);
        JRadioButton alternativa12 = new JRadioButton("Corinthians");
        alternativa12.setFont(fonte3);
        alternativa12.setBorder(new EmptyBorder(0, 5, 10, 0)); // Pequeno espaço entre botão e alternativa

        JButton enviar3 = new JButton("Enviar");
        enviar3.setBackground(Color.GREEN);
        enviar3.setFont(fonte2);

        // Add os RadioButtons no ButtonGroup
        alternativasJogo3.add(alternativa9);
        alternativasJogo3.add(alternativa10);
        alternativasJogo3.add(alternativa11);
        alternativasJogo3.add(alternativa12);

        // Acionando os Componentes no Painel Jogo3
        painelSubJogo3.add(tituloJogo3);
        painelSubJogo3.add(infos3);
        painelSubJogo3.add(pergunta3);
        painelSubJogo3.add(alternativa9);
        painelSubJogo3.add(alternativa10);
        painelSubJogo3.add(alternativa11);
        painelSubJogo3.add(alternativa12);
        painelSubJogo3.add(enviar3);

        // ---------- XXXXXXXXX ----------

        // ---------- Painel Jogo4 ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelJogo4 = new JPanel();
        painelJogo4.setLayout(new CardLayout());

        JPanel painelSubJogo4 = new JPanel();
        painelSubJogo4.setLayout(new GridLayout(8, 1));
        painelSubJogo4.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo4.add(painelSubJogo4);

        JLabel tituloJogo4 = new JLabel("QUIZ - NWFootball");
        tituloJogo4.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo4.setFont(fonte);

        // Criando Informações do Jogo
        JLabel infos4 = new JLabel("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
        infos4.setBorder(new EmptyBorder(10, 5, 10, 0));
        infos4.setFont(fonte2);

        JLabel pergunta4 = new JLabel("Qual Time é o Maior Campeão Estadual?");
        pergunta4.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta4.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo4 = new ButtonGroup();
        JRadioButton alternativa13 = new JRadioButton("ABC");
        alternativa13.setFont(fonte3);
        JRadioButton alternativa14 = new JRadioButton("Paysandu");
        alternativa14.setFont(fonte3);
        JRadioButton alternativa15 = new JRadioButton("Bahia");
        alternativa15.setFont(fonte3);
        JRadioButton alternativa16 = new JRadioButton("Santos");
        alternativa16.setFont(fonte3);
        alternativa16.setBorder(new EmptyBorder(0, 5, 10, 0)); // Pequeno espaço entre botão e alternativa

        JButton enviar4 = new JButton("Enviar");
        enviar4.setBackground(Color.GREEN);
        enviar4.setFont(fonte2);

        // Add os RadioButtons no ButtonGroup
        alternativasJogo4.add(alternativa13);
        alternativasJogo4.add(alternativa14);
        alternativasJogo4.add(alternativa15);
        alternativasJogo4.add(alternativa16);

        // Acionando os Componentes no Painel Jogo4
        painelSubJogo4.add(tituloJogo4);
        painelSubJogo4.add(infos4);
        painelSubJogo4.add(pergunta4);
        painelSubJogo4.add(alternativa13);
        painelSubJogo4.add(alternativa14);
        painelSubJogo4.add(alternativa15);
        painelSubJogo4.add(alternativa16);
        painelSubJogo4.add(enviar4);

        // ---------- XXXXXXXXX ----------

        // ---------- Painel Jogo5 ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelJogo5 = new JPanel();
        painelJogo5.setLayout(new CardLayout());

        JPanel painelSubJogo5 = new JPanel();
        painelSubJogo5.setLayout(new GridLayout(8, 1));
        painelSubJogo5.setBorder(new EmptyBorder(0, 10, 10, 10)); // Margens na janela
        painelJogo5.add(painelSubJogo5);

        JLabel tituloJogo5 = new JLabel("QUIZ - NWFootball");
        tituloJogo5.setBorder(new EmptyBorder(0, 40, 10, 10)); // Espaçamento do titulo
        tituloJogo5.setFont(fonte);

        // Criando Informações do Jogo
        JLabel infos5 = new JLabel("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
        infos5.setBorder(new EmptyBorder(10, 5, 10, 0));
        infos5.setFont(fonte2);

        JLabel pergunta5 = new JLabel("Quem foi o Campeão da Copa do Brasil de 1999?");
        pergunta5.setBorder(new EmptyBorder(0, 5, 15, 5)); // Espaçamento entre pergunta e alternativas
        pergunta5.setFont(fonte2);

        // Criando os Componentes
        ButtonGroup alternativasJogo5 = new ButtonGroup();
        JRadioButton alternativa17 = new JRadioButton("Grêmio");
        alternativa17.setFont(fonte3);
        JRadioButton alternativa18 = new JRadioButton("Palmeiras");
        alternativa18.setFont(fonte3);
        JRadioButton alternativa19 = new JRadioButton("Juventude");
        alternativa19.setFont(fonte3);
        JRadioButton alternativa20 = new JRadioButton("Santo André");
        alternativa20.setFont(fonte3);
        alternativa20.setBorder(new EmptyBorder(0, 5, 10, 0)); // Pequeno espaço entre botão e alternativa

        JButton enviar5 = new JButton("Enviar");
        enviar5.setBackground(Color.GREEN);
        enviar5.setFont(fonte2);

        // Add os RadioButtons no ButtonGroup
        alternativasJogo5.add(alternativa17);
        alternativasJogo5.add(alternativa18);
        alternativasJogo5.add(alternativa19);
        alternativasJogo5.add(alternativa20);

        // Acionando os Componentes no Painel Jogo5
        painelSubJogo5.add(tituloJogo5);
        painelSubJogo5.add(infos5);
        painelSubJogo5.add(pergunta5);
        painelSubJogo5.add(alternativa17);
        painelSubJogo5.add(alternativa18);
        painelSubJogo5.add(alternativa19);
        painelSubJogo5.add(alternativa20);
        painelSubJogo5.add(enviar5);

        // ---------- XXXXXXXXX ----------

        // ---------- Painel Final ----------

        // Criando os Painéis e Setando os Layouts dos Paineis
        JPanel painelFinal = new JPanel();
        painelFinal.setLayout(new CardLayout());

        JPanel painelSubFinal = new JPanel();
        painelSubFinal.setLayout(new GridLayout(7, 1, 0, 5));
        painelFinal.add(painelSubFinal);
        // Adicionando um espaço entre o botão e a borda do painel
        painelSubFinal.setBorder(new EmptyBorder(20, 10, 20, 10));

        JLabel tituloFinal = new JLabel("Finalizar Quiz NWFootball");
        tituloFinal.setBorder(new EmptyBorder(0, 70, 20, 5));
        tituloFinal.setFont(fonte);

        JLabel infoAcertos = new JLabel("Você Acertou  " + acertos + "/5!");
        infoAcertos.setFont(fonte2);

        JLabel infoChances = new JLabel("Você Encerrou Com  " + chances + "/3 Chances!");
        infoChances.setFont(fonte2);

        JLabel infoFinalizar = new JLabel("Gostaria de Tentar Novamente ou Encerrar?");
        tituloFinal.setBorder(new EmptyBorder(0, 0, 20, 0));
        infoFinalizar.setFont(fonte2);

        JButton botaoFinalizar = new JButton("Voltar Para a Tela Inicial");
        botaoFinalizar.setFont(fonte2);
        botaoFinalizar.setBackground(Color.ORANGE);

        JButton botaoEncerrar = new JButton("Encerrar");
        botaoEncerrar.setFont(fonte2);
        botaoEncerrar.setBackground(Color.RED);

        // Acionando os Componentes no Painel Inicio
        painelSubFinal.add(tituloFinal);
        painelSubFinal.add(infoAcertos);
        painelSubFinal.add(infoChances);
        painelSubFinal.add(infoFinalizar);
        painelSubFinal.add(botaoFinalizar);
        painelSubFinal.add(botaoEncerrar);

        // ---------- XXXXXXXXX ----------

        // Adicionando a Pilha de Cards
        painelPrincipal.add(painelInicio);
        painelPrincipal.add(painelJogo1);
        painelPrincipal.add(painelJogo2);
        painelPrincipal.add(painelJogo3);
        painelPrincipal.add(painelJogo4);
        painelPrincipal.add(painelJogo5);
        painelPrincipal.add(painelFinal);

        // Tratamento de Eventos

        botaoIniciar.addActionListener(e -> {
            cl.next(painelPrincipal);
        });

        enviar1.addActionListener(e -> {
            if (!alternativa3.isSelected() && !alternativa2.isSelected() && !alternativa1.isSelected()
                    && !alternativa4.isSelected()) {
                infos1.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3 - Selecione uma Opção!");

            } else if (alternativa3.isSelected() && !alternativa2.isSelected() && !alternativa1.isSelected()
                    && !alternativa4.isSelected()) {
                acertos++;
                infos2.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
                cl.next(painelPrincipal);

            } else {
                chances--;
                infos2.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
                cl.next(painelPrincipal);
            }
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances!");

        });

        enviar2.addActionListener(e -> {
            if (!alternativa6.isSelected() && !alternativa5.isSelected() && !alternativa7.isSelected()
                    && !alternativa8.isSelected()) {
                infos2.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3 - Selecione uma Opção!");

            } else if (alternativa6.isSelected() && !alternativa5.isSelected() && !alternativa7.isSelected()
                    && !alternativa8.isSelected()) {
                acertos++;
                infos3.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
                cl.next(painelPrincipal);

            } else {
                chances--;
                infos3.setText("Acertos: " + acertos + "/5 " + "Chances: " + chances + "/3");
                cl.next(painelPrincipal);
            }
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances!");
        });

        enviar3.addActionListener(e -> {
            if (alternativa9.isSelected() && !alternativa10.isSelected() && !alternativa11.isSelected()
                    && !alternativa12.isSelected()) {
                acertos++;
            } else {
                chances--;
            }
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances!");
            cl.next(painelPrincipal);
        });

        enviar4.addActionListener(e -> {
            if (alternativa13.isSelected() && !alternativa14.isSelected() && !alternativa15.isSelected()
                    && !alternativa16.isSelected()) {
                acertos++;
            } else {
                chances--;
            }
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances!");
            cl.next(painelPrincipal);
        });

        enviar5.addActionListener(e -> {
            if (alternativa19.isSelected() && !alternativa18.isSelected() && !alternativa17.isSelected()
                    && !alternativa20.isSelected()) {
                acertos++;
            } else {
                chances--;
            }
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances!");
            cl.next(painelPrincipal);
        });

        botaoFinalizar.addActionListener(e -> {
            acertos = 0;
            chances = 3;
            infoAcertos.setText("Você Acertou " + acertos + "/5!");
            infoChances.setText("Você Encerrou Com " + chances + "/3 Chances");
            cl.next(painelPrincipal);
        });

        botaoEncerrar.addActionListener(e -> {
            System.exit(0);
        });

        // Set e Configuração do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(800, 400, WIDTH, HEIGHT);
        this.setResizable(false);
        this.add(painelPrincipal);
        this.pack();
        this.setVisible(true);
    }
}

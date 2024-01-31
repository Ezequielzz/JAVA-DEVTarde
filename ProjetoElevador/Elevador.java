import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elevador extends JFrame {

    private JLabel labelAndarEsquerdaS2; // label para o andar E1
    private JLabel labelAndarEsquerdaS1; // label para o andar E1
    private JLabel labelAndarEsquerda1; // label para o andar E1
    private JLabel labelAndarEsquerda2; // label para o andar E2
    private JLabel labelAndarEsquerda3; // label para o andar E3
    private JLabel labelAndarEsquerda4; // label para o andar E4
    private JLabel labelAndarEsquerda5; // label para o andar E5
    private JLabel labelAndarEsquerda6; // label para o andar E6
    private int andarAtualE1;
    private int andarAtualE2;

    private ImageIcon imagemIconOriginal = new ImageIcon(Elevador.class.getResource("/resource/elevadorIcon.png"));
    private ImageIcon imagemIconOriginal2 = new ImageIcon(Elevador.class.getResource("/resource/elevadorIcon2.png"));

    // Método para redimensionar a imagem
    private ImageIcon redimensionarImagem(int largura, int altura) {
        Image imagemOriginal = imagemIconOriginal.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemRedimensionada);
    }

    public Elevador() {
        // Painel Geral com BorderLayout
        JPanel painelGeral = new JPanel(new BorderLayout());

        // Painel Principal com GridLayout
        JPanel painelElevadores = new JPanel(new GridLayout(6, 6, 10, 10)); // 3 linhas, 6 colunas, com espaçamento de
                                                                            // 10 pixels
        JPanel painelAndaresEsquerda = new JPanel(new GridLayout(6, 1, 10, 10));
        JPanel painelAndaresDireita = new JPanel(new GridLayout(6, 1, 10, 10));

        // Adiciona labels para representar os andares à esquerda
        for (int i = 5; i >= 0; i--) {
            JLabel labelAndarEsquerda = new JLabel("E1 Andar " + (i + 1));
            painelAndaresEsquerda.add(labelAndarEsquerda);

            // Atribui as labels às labels dos andares
            if (i == 0) {
                labelAndarEsquerda1 = labelAndarEsquerda;
            } else if (i == 1) {
                labelAndarEsquerda2 = labelAndarEsquerda;
            } else if (i == 2) {
                labelAndarEsquerda3 = labelAndarEsquerda;
            } else if (i == 3) {
                labelAndarEsquerda4 = labelAndarEsquerda;
            } else if (i == 4) {
                labelAndarEsquerda5 = labelAndarEsquerda;
            } else if (i == 5) {
                labelAndarEsquerda6 = labelAndarEsquerda;
            }
        }

        // ícones de elevadores e botões
        for (int i = 5; i >= 0; i--) {
            final int buttonIndex = i; // cópia final de i
            JLabel elevadorIcon = new JLabel(redimensionarImagem(90, 90));
            painelElevadores.add(elevadorIcon);

            JButton botao = new JButton("Botão " + (i + 1));

            // ActionListener ao botão
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Modifica o texto da label associada quando o botão é clicado
                    if (buttonIndex + 1 == 1) {
                        andarAtualE1 = 1;
                        labelAndarEsquerda1.setText("E1 Andar 1 - Elevador Aberto");
                        labelAndarEsquerda2.setText("E1 Andar 2");
                        labelAndarEsquerda3.setText("E1 Andar 3");
                        labelAndarEsquerda4.setText("E1 Andar 4");
                        labelAndarEsquerda5.setText("E1 Andar 5");
                        labelAndarEsquerda6.setText("E1 Andar 6");
                    } else if (buttonIndex + 1 == 2) {
                        andarAtualE1 = 2;
                        labelAndarEsquerda2.setText("E1 Andar 2 - Elevador Aberto");
                        labelAndarEsquerda1.setText("E1 Andar 1");
                        labelAndarEsquerda3.setText("E1 Andar 3");
                        labelAndarEsquerda4.setText("E1 Andar 4");
                        labelAndarEsquerda5.setText("E1 Andar 5");
                        labelAndarEsquerda6.setText("E1 Andar 6");
                    } else if (buttonIndex + 1 == 3) {
                        andarAtualE1 = 3;
                        labelAndarEsquerda3.setText("E1 Andar 3 - Elevador Aberto");
                        labelAndarEsquerda1.setText("E1 Andar 1");
                        labelAndarEsquerda2.setText("E1 Andar 2");
                        labelAndarEsquerda3.setText("E1 Andar 3");
                        labelAndarEsquerda4.setText("E1 Andar 4");
                        labelAndarEsquerda5.setText("E1 Andar 5");
                        labelAndarEsquerda6.setText("E1 Andar 6");
                    }
                }
            });

            painelElevadores.add(botao);

            JLabel elevadorIcon2 = new JLabel(redimensionarImagem(90, 90));
            painelElevadores.add(elevadorIcon2);
        }

        // Adiciona labels para representar os andares à direita
        for (int i = 3; i >= 1; i--) {
            JLabel labelAndarDireita = new JLabel("E2 Andar " + i, SwingConstants.LEFT);
            painelAndaresDireita.add(labelAndarDireita);
        }

        // Adiciona os painéis à esquerda e à direita ao Painel Principal
        painelGeral.add(painelAndaresEsquerda, BorderLayout.WEST);
        painelGeral.add(painelElevadores, BorderLayout.CENTER);
        painelGeral.add(painelAndaresDireita, BorderLayout.EAST);

        // Adiciona o Painel Geral à Janela
        add(painelGeral);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Elevador elevador = new Elevador();
            elevador.setSize(1200, 300); // Ajuste o tamanho da janela conforme necessário
            elevador.setVisible(true);
        });
    }
}

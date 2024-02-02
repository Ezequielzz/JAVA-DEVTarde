import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elevador extends JFrame {

    // Labels para o Elevador1
    private JLabel labelAndarEsquerdaS2;
    private JLabel labelAndarEsquerdaS1;
    private JLabel labelAndarEsquerda1;
    private JLabel labelAndarEsquerda2;
    private JLabel labelAndarEsquerda3;
    private JLabel labelAndarEsquerda4;
    private JLabel labelAndarEsquerda5;
    private JLabel labelAndarEsquerda6;
    private JLabel labelAndarDireitaS2;
    private JLabel labelAndarDireitaS1;
    private JLabel labelAndarDireita1;
    private JLabel labelAndarDireita2;
    private JLabel labelAndarDireita3;
    private JLabel labelAndarDireita4;
    private JLabel labelAndarDireita5;
    private JLabel labelAndarDireita6;
    private int andarAtualE1;
    private int andarAtualE2;

    private ImageIcon imagemIconOriginal = new ImageIcon(Elevador.class.getResource("/resource/elevadorIcon.png"));
    private ImageIcon imagemIconAberto = new ImageIcon(Elevador.class.getResource("/resource/elevadorIcon2.png"));

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
        JPanel painelElevadores = new JPanel(new GridLayout(8, 8, 10, 10)); // 3 linhas, 6 colunas, com espaçamento de
                                                                            // 10 pixels
        JPanel painelAndaresEsquerda = new JPanel(new GridLayout(8, 1, 10, 10));
        JPanel painelAndaresDireita = new JPanel(new GridLayout(8, 1, 10, 10));

        // Adiciona labels para representar os andares à esquerda
        for (int i = 7; i >= 0; i--) {
            JLabel labelAndarEsquerda = new JLabel("E1 Andar " + (i + 1));
            painelAndaresEsquerda.add(labelAndarEsquerda);

            // Atribui as labels às labels dos andares
            if (i == 0) {
                labelAndarEsquerdaS2 = labelAndarEsquerda;
            } else if (i == 1) {
                labelAndarEsquerdaS1 = labelAndarEsquerda;
            } else if (i == 2) {
                labelAndarEsquerda1 = labelAndarEsquerda;
            } else if (i == 3) {
                labelAndarEsquerda2 = labelAndarEsquerda;
            } else if (i == 4) {
                labelAndarEsquerda3 = labelAndarEsquerda;
            } else if (i == 5) {
                labelAndarEsquerda4 = labelAndarEsquerda;
            } else if (i == 6) {
                labelAndarEsquerda5 = labelAndarEsquerda;
            } else if (i == 7) {
                labelAndarEsquerda6 = labelAndarEsquerda;
            }
        }

        // Adiciona labels para representar os andares à direita
        for (int i = 7; i >= 0; i--) {
            JLabel labelAndarDireita = new JLabel("E2 Andar " + (i + 1));
            painelAndaresDireita.add(labelAndarDireita);

            // Atribui as labels às labels dos andares
            if (i == 0) {
                labelAndarDireitaS2 = labelAndarDireita;
            } else if (i == 1) {
                labelAndarDireitaS1 = labelAndarDireita;
            } else if (i == 2) {
                labelAndarDireita1 = labelAndarDireita;
            } else if (i == 3) {
                labelAndarDireita2 = labelAndarDireita;
            } else if (i == 4) {
                labelAndarDireita3 = labelAndarDireita;
            } else if (i == 5) {
                labelAndarDireita4 = labelAndarDireita;
            } else if (i == 6) {
                labelAndarDireita5 = labelAndarDireita;
            } else if (i == 7) {
                labelAndarDireita6 = labelAndarDireita;
            }
        }

        // ícones de elevadores e botões
        for (int i = 7; i >= 0; i--) {
            final int buttonIndex = i; // cópia final de i

            JButton botao = new JButton("Botão " + (i + 1));

            // tratamento de evento do botão
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int andarChamado = buttonIndex + 1;

                    // Calculando a distância de elevadores
                    int distanciaE1 = calcularDistancia(andarAtualE1, andarChamado);
                    int distanciaE2 = calcularDistancia(andarAtualE2, andarChamado);

                    // Modifica o texto da label associada quando o botão é clicado
                    if (buttonIndex + 1 == 1) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 1;

                            labelAndarEsquerdaS2.setText("E1 Andar S2 - Elevador Aberto");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");

                        } else {
                            andarAtualE2 = 1;

                            labelAndarDireitaS2.setText("E2 Andar S2 - Elevador Aberto");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }

                    } else if (buttonIndex + 1 == 2) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 2;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1 - Elevador Aberto");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 2;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1 - Elevador Aberto");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 3) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 3;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1 - Elevador Aberto");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 3;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1 - Elevador Aberto");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 4) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 4;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2 - Elevador Aberto");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 4;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2 - Elevador Aberto");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 5) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 5;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3 - Elevador Aberto");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 5;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3 - Elevador Aberto");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 6) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 6;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4 - Elevador Aberto");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 6;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4 - Elevador Aberto");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 7) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 7;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5 - Elevador Aberto");
                            labelAndarEsquerda6.setText("E1 Andar 6");
                        } else {
                            andarAtualE2 = 7;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5 - Elevador Aberto");
                            labelAndarDireita6.setText("E2 Andar 6");
                        }
                    } else if (buttonIndex + 1 == 8) {
                        if (distanciaE1 < distanciaE2) {
                            andarAtualE1 = 8;

                            labelAndarEsquerdaS2.setText("E1 Andar S2");
                            labelAndarEsquerdaS1.setText("E1 Andar S1");
                            labelAndarEsquerda1.setText("E1 Andar 1");
                            labelAndarEsquerda2.setText("E1 Andar 2");
                            labelAndarEsquerda3.setText("E1 Andar 3");
                            labelAndarEsquerda4.setText("E1 Andar 4");
                            labelAndarEsquerda5.setText("E1 Andar 5");
                            labelAndarEsquerda6.setText("E1 Andar 6 - Elevador Aberto");
                        } else {
                            andarAtualE2 = 8;

                            labelAndarDireitaS2.setText("E2 Andar S2");
                            labelAndarDireitaS1.setText("E2 Andar S1");
                            labelAndarDireita1.setText("E2 Andar 1");
                            labelAndarDireita2.setText("E2 Andar 2");
                            labelAndarDireita3.setText("E2 Andar 3");
                            labelAndarDireita4.setText("E2 Andar 4");
                            labelAndarDireita5.setText("E2 Andar 5");
                            labelAndarDireita6.setText("E2 Andar 6 - Elevador Aberto");
                        }
                    }
                }
            });
            JLabel elevadorIconE1 = new JLabel(redimensionarImagem(70, 70));
            painelElevadores.add(elevadorIconE1);
            painelElevadores.add(botao);

            JLabel elevadorIconE2 = new JLabel(redimensionarImagem(70, 70));
            painelElevadores.add(elevadorIconE2);
        }

        // Adiciona os painéis à esquerda e à direita ao Painel Principal
        painelGeral.add(painelAndaresEsquerda, BorderLayout.WEST);
        painelGeral.add(painelElevadores, BorderLayout.CENTER);
        painelGeral.add(painelAndaresDireita, BorderLayout.EAST);

        // Adiciona o Painel Geral à Janela
        add(painelGeral);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    private int calcularDistancia(int andarAtual, int andarChamado) {
        return Math.abs(andarAtual - andarChamado);
    }

    public void run() {
        this.setSize(1200, 300);
        this.setVisible(true);
    }
}

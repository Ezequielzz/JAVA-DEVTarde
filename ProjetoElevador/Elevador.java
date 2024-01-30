import javax.swing.*;
import java.awt.*;

public class Elevador extends JFrame {

    private int andarAtual;
    private JButton botaoElevador;

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
        JPanel painelElevadores = new JPanel(new GridLayout(3, 6, 10, 10)); // 3 linhas, 6 colunas, com espaçamento de 10 pixels
        JPanel painelAndaresEsquerda = new JPanel(new GridLayout(3, 1, 10, 10));
        JPanel painelAndaresDireita = new JPanel(new GridLayout(3, 1, 10, 10));

        // Adiciona labels para representar os andares à esquerda
        for (int i = 3; i >= 1; i--) {
            JLabel labelAndarEsquerda = new JLabel("E1 Andar " + i, SwingConstants.RIGHT);
            painelAndaresEsquerda.add(labelAndarEsquerda);
        }

        // Adiciona ícones de elevadores e botões
        for (int i = 2; i >= 0; i--) {
            JLabel elevadorIcon = new JLabel(redimensionarImagem(90, 90));
            painelElevadores.add(elevadorIcon);

            JButton botao = new JButton("Botão " + (i + 1));
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
            elevador.setSize(1200, 300);  // Ajuste o tamanho da janela conforme necessário
            elevador.setVisible(true);
        });
    }
}

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {

    public ExemploFlowLayout() {
        // Frame GridLayout criado
        JFrame janela1 = new JFrame("Janela 1");
        // Modificar O Layout do Frame
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);
        // Criando os Componentes
        JLabel texto1 = new JLabel("Informe o Nº de Botões");
        JTextField painel1 = new JTextField("Insira o Nº", 25);
        JButton botao1 = new JButton("Enviar");

        // Add os Componentes
        janela1.add(texto1);
        janela1.add(painel1);
        janela1.add(botao1);

         // Add uma ação para o botão (addActionListener)
         botao1.addActionListener(e -> {
            int quant = Integer.parseInt(painel1.getText());
            for (int i = 1; i < quant; i++) {
                janela1.add(new JButton("" + i));
                janela1.pack();
            }
         });

        // Set Frame
        janela1.setDefaultCloseOperation(2);
        janela1.pack();
        janela1.setVisible(true);

    }
}

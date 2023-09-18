import java.awt.*;
import javax.swing.*;

public class Calculadora2 extends JFrame {
    public Calculadora2() {
        super("Calculadora de IMC");
        
        // Add JFrame principal
        JFrame painelPrincipal = new JFrame();
        painelPrincipal.setLayout(new BorderLayout());

            // Definindo as Posições no BorderLayout
            JPanel painelSuperior = new JPanel(); // Criando Painel Superior
            painelPrincipal.add(painelSuperior,BorderLayout.NORTH); // Inserindo o Painel Superior no NORTE do Painel Principal

            JPanel painelCentro = new JPanel(); // Criando Painel Superior
            painelPrincipal.add(painelCentro,BorderLayout.CENTER); // Inserindo o Painel Central no CENTRO do Painel Principal

            JPanel painelInferior = new JPanel(); // Criando Painel Inferior
            painelPrincipal.add(painelInferior,BorderLayout.SOUTH); // Inserindo o Painel Inferior no SUL do Painel Principal

            // Criando o Painel de Informações e o Inserindo no CENTRO
            JPanel painelInfos = new JPanel();
            painelInfos.setLayout(new BorderLayout());
            painelCentro.add(painelInfos);

            JPanel painelRecebimento = new JPanel();
            painelInfos.add(painelSuperior,BorderLayout.NORTH);
            painelRecebimento.setLayout(new GridLayout(4,1));
            painelRecebimento.add(new TextField(30));
            painelRecebimento.add(new JLabel("Informe sua Altura"));
            painelRecebimento.add(new TextField(8));
            painelRecebimento.add(new JLabel("Informe seu Peso"));
            painelRecebimento.add(new TextField(8));


        // Set Frame
        // painelPrincipal.setBounds(470,100,336,440);
        painelPrincipal.setDefaultCloseOperation(2);
        painelPrincipal.setVisible(true);
        painelPrincipal.pack();
        // painelPrincipal.setResizable(false);
    }
}

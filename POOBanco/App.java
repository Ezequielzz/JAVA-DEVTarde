package POOBanco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        banco1.iniciar();
        boolean ligado = true;
        int acao = 0;

            while (ligado) {
                JOptionPane.showMessageDialog(null, "1 - Criar Conta\n 2 - Buscar Conta\n 3 - Sair");
                acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ação"));

                switch (acao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "4 - Conta PF\n 5 - Conta PJ");
                        acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ação"));

                    switch (acao) {
                        case 4:

                        // criar um vetor de objetos com X valores
                        Banco conta[] = new Banco[3];

                        // criar os objetos e preencher os valores
                        // laço de repetição
                        for (int i = 0; i < conta.length; i++) {
                        // construir o objeto
                        conta[i] = new Banco();
                        
                        conta[i].setNome(JOptionPane.showInputDialog("Digite o Nome:"));
                        conta[i].setNome(JOptionPane.showInputDialog("Digite o Endereço:"));
                        conta[i].setNome(JOptionPane.showInputDialog("Digite o CPF:"));

                        break;

                        case 5:

                        conta[i].setNome(JOptionPane.showInputDialog("Digite o Nome:"));
                        conta[i].setNome(JOptionPane.showInputDialog("Digite o Endereço:"));
                        conta[i].setNome(JOptionPane.showInputDialog("Digite o CNPJ:"));
                        }

                
                        default:
                        JOptionPane.showMessageDialog(null, "Ação Inválida");
                        break;
                
            }

                        case 2:

                        acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Ação"));
                

                        break;

                    default:
                        break;
        }
                }
            }
}

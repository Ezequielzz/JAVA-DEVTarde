package POOBanco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Conta[] Conta = new Conta[3];
        int acao1 = 0;
        int cont = 0;
        boolean naoEncontrei = true;
        boolean ligado = true;

            while (ligado) {
                JOptionPane.showMessageDialog(null, "Menu Banco");
                JOptionPane.showMessageDialog(null, "1 - Criar Conta 2 - Buscar Conta");
                acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));
                
                switch (acao1) {
                    case 1:
                        for (int i = 0; i < Conta.length; i++) {
                            Conta[i] = new Conta();
                            Conta[i].criarConta(); 
                        }
                        
                        break;
                
                    default:
                        break;
                }
            }

            }
}

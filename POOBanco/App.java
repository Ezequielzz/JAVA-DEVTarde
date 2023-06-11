package POOBanco;

import javax.swing.JOptionPane;

public class App extends Conta {
    public static void main(String[] args) {

        Conta[] conta = new Conta[1];
        Conta banco1 = new Conta();
        int acao1 = 0;
        int cont = 0;
        boolean naoEncontrei = true;
        boolean naoEncontrei2 = true;
        boolean ligado = true;

        while (ligado) {
            JOptionPane.showMessageDialog(null, "Menu Banco");
            JOptionPane.showMessageDialog(null, "1 - Criar Conta  2 - Buscar Conta  3 - Acessar Conta  4 - Sair");
            acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            switch (acao1) {
                case 1:
                    for (int i = 0; i < conta.length; i++) {
                        conta[i] = new Conta();
                        conta[i].criarConta();
                    }

                    break;

                case 2:

                    String nomeBuscado = JOptionPane.showInputDialog("Digite um Nome Para Buscar");
                    while (naoEncontrei) {
                        if (nomeBuscado.equals(conta[cont].getNome())) {
                            naoEncontrei = false;
                            JOptionPane.showMessageDialog(null, "Informações da Conta \n Nome: " + conta[cont].getNome()
                                    + "\n Idade: " + conta[cont].getIdade() + "\n Saldo: " + conta[cont].getSaldo());

                        acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação \n 5 - Depositar"));
                        } if (acao1==5) {
                            banco1.deposito();
                        }
                    }

                    break;

                case 3:
                   String nomeBuscado1 = JOptionPane.showInputDialog("Digite o Nome da Sua Conta");
                    while (naoEncontrei2) {
                        if (nomeBuscado1.equals(conta[cont].getNome())) {
                            naoEncontrei = false;

                            String senhaDigitada = JOptionPane.showInputDialog(null, "Digite Sua Senha de Acesso");
                            if (senhaDigitada.equals(conta[cont].getSenha())) {
                                JOptionPane.showMessageDialog(null,
                                        "Informações da Conta \n Nome: " + conta[cont].getNome()
                                                + "\n Idade: " + conta[cont].getIdade() + "\n Saldo: "
                                                + conta[cont].getSaldo());

                                acao1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe a Ação \n 1 - Sacar  2 - Depositar  3 - Emprestimo"));

                                switch (acao1) {
                                    case 1:
                                        banco1.saque();

                                        break;

                                    case 2:
                                        banco1.deposito();

                                        break;

                                    case 3:
                                        banco1.emprestimo();

                                        break;

                                    default:
                                        JOptionPane.showInputDialog(null, "Informe Uma Ação Válida2");
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Senha Inválida");
                            }
                        }
                    }

                case 4:
                    ligado = false;

                default:
                    break;
            }
        }

    }
}

package POOBanco;

import javax.swing.JOptionPane;

public class App extends Conta {
    public static void main(String[] args) {

        Conta[] conta = new Conta[1];
        int contaAtual = 0;
        int acao1 = 0;
        int acao = 0;
        boolean encontrei = true;
        boolean encontrei2 = true;
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
                    int cont = 0;
                    String nomeBuscado = JOptionPane.showInputDialog("Digite um Nome Para Buscar");
                    while (cont < conta.length) {
                        encontrei = true; // Redefine a variável naoEncontrei como verdadeira

                        if (nomeBuscado.equals(conta[cont].getNome())) {
                            encontrei = false;
                            contaAtual = cont;

                            JOptionPane.showMessageDialog(null, "Informações da Conta \n Nome: " + conta[contaAtual].getNome()
                                                + "\n Idade: " + conta[contaAtual].getIdade() + "\n Tipo da Conta: "
                                                + conta[contaAtual].getTipoConta() + "\n Saldo: "
                                                + conta[contaAtual].getSaldo());

                            acao = Integer
                                    .parseInt(JOptionPane.showInputDialog(null,
                                            "Informe a Ação \n 1 - Depositar  2 - Sair"));

                            switch (acao) {
                                case 1:
                                    conta[cont].deposito();
                                    break;

                                case 2:
                                    ligado = false;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                                    break;
                            }
                        }

                        cont++;
                    }
                    break;

                case 3:
                    cont = 0;
                    String nomeBuscado2 = JOptionPane.showInputDialog("Digite o Nome da Sua Conta");
                    while (cont < conta.length) {
                        encontrei2 = true; // Redefine a variável naoEncontrei2 como verdadeira

                        if (nomeBuscado2.equals(conta[cont].getNome())) {
                            encontrei2 = false;
                            contaAtual = cont;

                            String senhaDigitada = JOptionPane.showInputDialog(null, "Digite Sua Senha de Acesso");
                            if (senhaDigitada.equals(conta[contaAtual].getSenha())) {
                                JOptionPane.showMessageDialog(null,
                                        "Informações da Conta \n Nome: " + conta[contaAtual].getNome()
                                                + "\n Idade: " + conta[contaAtual].getIdade() + "\n Tipo da Conta: "
                                                + conta[contaAtual].getTipoConta() + "\n Saldo: "
                                                + conta[contaAtual].getSaldo());

                                acao1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe a Ação \n 1 - Sacar  2 - Depositar  3 - Emprestimo  4 - Sair"));

                                switch (acao1) {
                                    case 1:
                                        conta[cont].saque();
                                        break;

                                    case 2:
                                        conta[cont].deposito();
                                        break;

                                    case 3:
                                        conta[cont].emprestimo();
                                        break;

                                    case 4:
                                        ligado = false;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Senha Inválida.");
                            }
                        }

                        cont++;
                    }
                    break;

                case 4:
                    ligado = false;

                default:
                    JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                    break;
            }
        }

    }
}

package POOBanco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // Declaração de Atributos
        Conta[] conta = new Conta[1];
        int contaAtual = 0;
        int acao1 = 0;
        int acao = 0;
        boolean encontrei = true;
        boolean encontrei2 = true;
        boolean ligado = true;

        // Menu Banco
        while (ligado) {
            JOptionPane.showMessageDialog(null, "Menu Banco");
            JOptionPane.showMessageDialog(null, "Menu Banco \n1 - Criar Conta  2 - Buscar Conta  3 - Acessar Conta  4 - Sair");
            acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            // Busca da Conta no Vetor
            switch (acao1) {
                case 1:
                    for (int i = 0; i < conta.length; i++) {
                        conta[i] = new Conta();
                        conta[i].criarConta();  // Acessando o Método de Criação de Conta
                    }

                    break;

                // Método Busca de Conta
                case 2:
                    int cont = 0;
                    String nomeBuscado = JOptionPane.showInputDialog("Busca de Conta \nDigite um Nome Para Buscar");
                    while (cont < conta.length) {
                        encontrei = true; // Redefine a variável encontrei como verdadeira

                        if (nomeBuscado.equals(conta[cont].getNome())) {
                            encontrei = false;
                            contaAtual = cont;

                            JOptionPane.showMessageDialog(null, "Busca de Conta \nInformações da Conta \n Nome: " + conta[contaAtual].getNome()
                                                + "\n Idade: " + conta[contaAtual].getIdade() + "\n Tipo da Conta: "
                                                + conta[contaAtual].getTipoConta() + "\n Saldo: "
                                                + conta[contaAtual].getSaldo());

                            acao = Integer
                                    .parseInt(JOptionPane.showInputDialog(null,
                                            "Busca de Conta \nInforme a Ação \n 1 - Depositar  2 - Sair"));
                            // Método de Deposito
                            switch (acao) {
                                case 1:
                                    conta[cont].deposito();
                                    break;
                            // Ação Desligar
                                case 2:
                                JOptionPane.showMessageDialog(null, "Saindo do Aplicativo do Banco.");
                                    ligado = false;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                                    break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Busca de Conta \nConta Não Encontrada.");
                        }

                        cont++; // Adiciona valor ao contador se uma conta não for encontrada
                    }
                    break;

                // Método Acessar Conta
                case 3:
                    cont = 0;
                    String nomeBuscado2 = JOptionPane.showInputDialog("Acesso de Conta \nDigite o Nome da Sua Conta");
                    while (cont < conta.length) {
                        encontrei2 = true; // Redefine a variável encontrei2 como verdadeira

                        if (nomeBuscado2.equals(conta[cont].getNome())) {
                            encontrei2 = false;
                            contaAtual = cont;

                            String senhaDigitada = JOptionPane.showInputDialog(null, "Acesso de Conta \nDigite Sua Senha de Acesso");
                            if (senhaDigitada.equals(conta[contaAtual].getSenha())) {
                                JOptionPane.showMessageDialog(null,
                                        "Acesso de Conta \nInformações da Conta \n Nome: " + conta[contaAtual].getNome()
                                                + "\n Idade: " + conta[contaAtual].getIdade() + "\n Tipo da Conta: "
                                                + conta[contaAtual].getTipoConta() + "\n Saldo: "
                                                + conta[contaAtual].getSaldo());

                                // Métodos da Classe Conta
                                acao1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Acesso de Conta \nInforme a Ação \n 1 - Sacar  2 - Depositar  3 - Emprestimo  4 - Sair"));

                                switch (acao1) {

                                    // Método de Saque
                                    case 1:
                                        conta[cont].saque();
                                        break;

                                    case 2:
                                        // Método de Deposito
                                        conta[cont].deposito();
                                        break;

                                    case 3:
                                        // Método de Emprestimo
                                        conta[cont].emprestimo();
                                        break;

                                    case 4:
                                        // Ação Desligar
                                        JOptionPane.showMessageDialog(null, "Saindo do Aplicativo do Banco.");
                                        ligado = false;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Acesso de Conta \nSenha Inválida.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Acesso de Conta \nConta Não Encontrada.");
                        }

                        cont++; // Adiciona valor ao contador se uma conta não for encontrada
                    }
                    break;

                case 4:
                JOptionPane.showMessageDialog(null, "Saindo do Aplicativo do Banco.");
                    ligado = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Informe Uma Ação Válida.");
                    break;
            }
        }

    }
}

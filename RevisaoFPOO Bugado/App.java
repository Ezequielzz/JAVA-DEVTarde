

import javax.swing.JOptionPane;

import RevisaoFPOO.Agendamento.Agendamento;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

public class App {

    public static void main(String[] args) {

        // Objetos
        Gato[] gatos = new Gato[1];
        Cachorro[] cachorros = new Cachorro[1];
        OutrosAnimais[] outros = new OutrosAnimais[1];
        Agendamento agendamentos[] = new Agendamento[100];// vetor dos agendamentos
        int contGato = 0, contCachorro = 0, contOutros = 0, contAgenda = 0;
        int acao2 = 0;
        int acao = 0;
        boolean ligado = true;

        while (ligado) {
            JOptionPane.showMessageDialog(null,
                    "----- Help PET ----- \n 1 - Cadastrar\n 2 - Agendar Consulta\n 3 - Buscar Cadastro\n 4 - Sair");
            acao = Integer
                    .parseInt(JOptionPane.showInputDialog(null,
                            "     ----- Help PET ----- \n                   Informe a Ação"));

            switch (acao) {
                // Cadastro
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "----- Cadastro Help PET ----- \n 1 - Canino\n 2 - Felino\n 3 - Outros\n 4 - Sair");
                    acao2 = Integer
                            .parseInt(JOptionPane.showInputDialog(null,
                                    "     ----- Help PET ----- \n                   Informe a Ação"));

                    switch (acao2) {
                        case 1:
                            for (int i = 0; i < cachorros.length; i++) {
                                cachorros[contCachorro] = new Cachorro();
                                cachorros[contCachorro].cadastrarCachorro(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 2:
                            for (int i = 0; i < gatos.length; i++) {
                                gatos[contGato] = new Gato();
                                gatos[contGato].cadastrarGato(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 3:
                            for (int i = 0; i < outros.length; i++) {
                                outros[contOutros] = new OutrosAnimais();
                                outros[contOutros].cadastrarOutros(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, "Saindo do Cadastro...");
                            ligado = false;
                            break;


                        default:
                            break;
                    }

                    break;
                // Agendamento
                case 2:
                    // Verificar se já existe o cadastro
                    boolean cadastroOk = false;
                    String proprietarioAgenda = JOptionPane.showInputDialog("Informe o Nome do Dono do PET");
                    //
                    for (int i = 0; i < contGato; i++) {
                        if (gatos[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = true;
                            break;
                        }
                    }
                    for (int i = 0; i < contCachorro; i++) {
                        if (cachorros[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = true;
                            break;
                        }
                    }
                    for (int i = 0; i < contOutros; i++) {
                        if (outros[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = true;
                            break;
                        }
                    }
                    // 1º verificação ok - cadastro realizado
                    // 2º verificação
                    boolean agendaOk = true;
                    do {
                        String dataAgenda = JOptionPane.showInputDialog("Informe a data do Agendamento");
                        String horaAgenda = JOptionPane.showInputDialog("Informe a hora do Agendamento");
                        for (int i = 0; i <= contAgenda; i++) {
                            if (agendamentos[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                                JOptionPane.showMessageDialog(null, "Horario já Agendado, Escolha outro");
                            } else {
                                agendaOk = false;
                            }
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"agendamento Realizado");
                            agendamentos[contAgenda] = new Agendamento();
                            agendamentos[contAgenda].setData(dataAgenda);
                            agendamentos[contAgenda].setHora(horaAgenda);
                            contAgenda++;
                    } while (agendaOk); 
                        

                    // Busca
                case 3:

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    ligado = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Informe uma Ação Válida");
                    break;

            }
        }
    }
}
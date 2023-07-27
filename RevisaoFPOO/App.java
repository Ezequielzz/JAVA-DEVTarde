package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

public class App {

    public static void main(String[] args) {

        // Objetos
        Gato[] gatos = new Gato[1];
        Cachorro[] cachorros = new Cachorro[1];
        OutrosAnimais[] outros = new OutrosAnimais[1];
        int contGato = 0, contCachorro = 0, contOutros = 0;
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
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "----- Cadastro Help PET ----- \n 1 - Canino\n 2 - Felino\n 3 - Outros\n 4 - Sair");
                    acao2 = Integer
                            .parseInt(JOptionPane.showInputDialog(null,
                                    "     ----- Help PET ----- \n                   Informe a Ação"));



                    switch (acao2) {
                        case 1:
                            for (int i = 0; i < cachorros.length; i++) {
                                cachorros[i] = new Cachorro();
                                cachorros[i].cadastrarCachorro(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 2:
                            for (int i = 0; i < gatos.length; i++) {
                                gatos[i] = new Gato();
                                gatos[i].cadastrarGato(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 3:
                            for (int i = 0; i < outros.length; i++) {
                                outros[i] = new OutrosAnimais();
                                outros[i].cadastrarOutros(); // Acessando o Método de Criação de Conta
                            }
                            break;

                        case 4:
                        JOptionPane.showMessageDialog(null, "Saindo do Cadastro...");
                        ligado = false;
                        break;

                        default:
                    }

                    break;

                case 2:

                    break;

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

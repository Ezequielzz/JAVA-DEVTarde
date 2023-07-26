package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

public class App {

    public static void main(String[] args) {

        // Objetos
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        OutrosAnimais outrosAnimais = new OutrosAnimais();

        int acao = 0;
        boolean ligado = true;

        while (ligado) {
            JOptionPane.showMessageDialog(null,
                    "----- Menu Cadastro Animal ----- \n 1 - Canino\n 2 - Felino\n 3 - Outros\n 4 - Sair");
            acao = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "----- Menu Cadastro Animal ----- \n        Informe a Ação"));

            switch (acao) {
                case 1:
                    cachorro.cadastrarCachorro(); // Utilizo o Objeto de cada classe para puxar o método
                    break;

                case 2:
                    gato.cadastrarGato();
                    break;

                case 3:
                    outrosAnimais.cadastrarGato();
                    break;

                case 4:
                JOptionPane.showMessageDialog(null, "Saindo do Cadastro...");
                    ligado = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Informe uma Ação Válida");
                    break;
            }
        }
    }
}
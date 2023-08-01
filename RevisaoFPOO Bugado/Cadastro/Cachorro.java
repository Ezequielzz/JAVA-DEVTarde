package RevisaoFPOO.Cadastro;

import javax.swing.JOptionPane;

public class Cachorro extends Animais {

    int acao = 0;

    public void cadastrarCachorro() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Canino ----- \n        Preencha os Campos");

        setProprietario(JOptionPane
                .showInputDialog("      ----- Menu Cadastro Canino ----- \n      Informe o Nome do Proprietário"));
        setNome(JOptionPane.showInputDialog("      ----- Menu Cadastro Canino ----- \n      Informe o Nome do Animal"));
        setIdade(Integer.parseInt(JOptionPane
                .showInputDialog("      ----- Menu Cadastro Canino ----- \n      Informe a Idade do Animal")));
        setEspecie(
                JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe a Raça do Animal"));
        setSexo(JOptionPane.showInputDialog("      ----- Menu Cadastro Canino ----- \n      Informe o Sexo do Animal"));
        setPeso(Integer.parseInt(JOptionPane
                .showInputDialog("      ----- Menu Cadastro Canino ----- \n       Informe o Peso do Animal")));

        JOptionPane.showMessageDialog(null,
                "----- Menu Cadastro Canino ----- \n      Informações do Animal\n Proprietário: " + getProprietario()
                        + "\n Nome: " + getNome() + "\n Idade: " + getIdade() + "\n Espécie: " + getEspecie()
                        + "\n Sexo: " + getSexo() + "\n Peso: " + getPeso() + "kg");
    }
}

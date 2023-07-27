package RevisaoFPOO.Cadastro;

import javax.swing.JOptionPane;

public class Gato extends Animais {

    public void cadastrarGato() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Felino ----- \n      Preencha os Campos");

        setProprietario(
                JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe o Nome do Proprietário"));
        setNome(JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe o Nome do Animal"));
        setIdade(Integer.parseInt(
                JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe a Idade do Animal")));
        setEspecie(JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe a Raça do Animal"));
        setSexo(JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe o Sexo do Animal"));
        setPeso(Integer.parseInt(
                JOptionPane.showInputDialog("      ----- Menu Cadastro Felino ----- \n      Informe o Peso do Animal")));

        JOptionPane.showMessageDialog(null,
                "----- Menu Cadastro Felino ----- \n      Informações do Animal\n Proprietário: " + getProprietario()
                        + "\n Nome: " + getNome() + "\n Idade: " + getIdade() + "\n Espécie: " + getEspecie() + "\n Sexo: " + getSexo() + "\n Peso: " + getPeso()+"kg");
    }
}

package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String userName;
        String senha;
        String dataNascimento;
        while (tenteNovamente) {
            try {
                senha = JOptionPane.showInputDialog("Informe uma Senha");
                userName = JOptionPane.showInputDialog("Informe Seu Nome de Usuário");
                dataNascimento = JOptionPane.showInputDialog("Informe sua data de NAscimento [dd/mm/aaaa]");
                dataNascimento = dataNascimento.replace("/", "");
                
                if (senha.length() < 8) {
                    throw new Exception("Sua Senha Deve Ter no Mínimo 8 Caracteres.");
                }
                if (senha.equals(userName)) {
                    throw new Exception("Sua Senha Não Pode ser Igual a Senha.");
                }
                if (senha.equals(dataNascimento)) {
                    throw new Exception("Sua Data de Nascimento Não Pode ser Igual a Senha.");
                }
                
                tenteNovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadastrada com Sucesso!", "Senha", 1);
                JOptionPane.showMessageDialog(null, "Nome de Usuário Cadastrada com Sucesso!", "Nome de Usuário", 1);
                JOptionPane.showMessageDialog(null, "Nome de Data de Nascimento Cadastrada com Sucesso!", "Data de Nascimento", 1);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", 0);
            }
        }
    }
}

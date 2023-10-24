import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
    public MainFrame() {

        // Set do Frame
        super("Frame Principal");
        setDefaultCloseOperation(2);

        // Criando as Abas
        JTabbedPane abas = new JTabbedPane();
        abas.add("Cadastro Usuários", new CadastroUsuarios());

        // Criando Aba de Agendamentos
        abas.add("Cadastro Usuários", new AgendamentoUsuario());

        add(abas);

    }

    public void run() {
        setVisible(true);
        pack();
    }
}

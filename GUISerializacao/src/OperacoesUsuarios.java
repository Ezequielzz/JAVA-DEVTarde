import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesUsuarios {
    private List<Usuario> usuarios;
    private DefaultTableModel tableModel;
    private JTable table;

    public OperacoesUsuarios(List<Usuario> usuarios, DefaultTableModel tableModel, JTable table) {
        this.usuarios = usuarios;
        this.tableModel = tableModel;
        this.table = table;
    }

    public void cadastrarUsuario(String nome, String idade) {
        int idadeInt = Integer.parseInt(idade);
        Usuario usuario = new Usuario(nome, idadeInt);
        usuarios.add(usuario);
        atualizarTabela();
    }

    public void agendarUsuario(String nome, String idade, String hora, String dia, String mes) {
        int idadeInt = Integer.parseInt(idade);
        int horaInt = Integer.parseInt(hora);
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        Usuario usuario = new Usuario(nome, idadeInt, horaInt, diaInt, mesInt);
        usuarios.add(usuario);
        atualizarTabela();
    }

    public void atualizarUsuario(int linhaSelecionada, String nome, String idade) {
        if (linhaSelecionada != -1) {
            int idadeInt = Integer.parseInt(idade);
            Usuario usuario = new Usuario(nome, idadeInt);
            usuarios.set(linhaSelecionada, usuario);
            atualizarTabela();
        }
    }

    public void apagarUsuario(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            usuarios.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosUsuarios() {
        usuarios.clear();
        atualizarTabela();
    }

    public void salvarUsuarios() {
        Serializacao.serializar("dados.txt", usuarios);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });
        }
    }

    private void atualizarAgenda(inputNome.Text(), inputIdade.Text(), inputHora.Text(), inputDia.Text(), inputMes.Text()) {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] {
                usuario.getNome(),
                usuario.getIdade(),
                usuario.getHora(),
                usuario.getDia(),
                usuario.getMes()
            });
        }
    }

    
}
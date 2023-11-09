package App;
import Connection.ConnectionDAO;

public class App {
    public static void main(String[] args) throws Exception {
        // new ConnectionDAO().criaTabela();
        // new ConnectionDAO().inserir("Calleri", "calleri9@gmail.com");
        // new ConnectionDAO().apagarID(1);
        // new ConnectionDAO().atualizarID(2, "Calleri", "toca.nocalleri@gmail.com");
        new ConnectionDAO().listarTodos();
    }
}

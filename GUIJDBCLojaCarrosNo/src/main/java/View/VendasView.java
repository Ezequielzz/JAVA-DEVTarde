package main.java.View;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import main.java.Connection.CarrosDAO;
import main.java.Model.Carros;
import main.java.Connection.ClientesDAO;
import main.java.Model.Clientes;

public class VendasView extends JPanel {
    JComboBox<String> carrosComboBox;
    JComboBox<String> clientesComboBox;
    List<Carros> carros;
    List<Clientes> clientes;

    public VendasView() {
        carrosComboBox = new JComboBox<>();
        clientesComboBox = new JComboBox<>();

        // Preencha o JComboBox com os carros
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca()
                    + " " + carro.getModelo()
                    + " " + carro.getPlaca());
        }
        add(carrosComboBox);

        // Preencha o JComboBox com os carros
        clientes = new ClientesDAO().listarTodos();
        clientesComboBox.addItem("Selecione o Cliente");
        for (Clientes cliente : clientes) {
            clientesComboBox.addItem(cliente.getNome()
                    + " " + cliente.getCpf());
        }
        add(clientesComboBox);
    }
}

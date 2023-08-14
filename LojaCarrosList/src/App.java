import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Classe Carros - Atributos e Métodos
        // Manipular no App
        // 4 - Apagar um Carro Cadastrado
        boolean ligado = true;
        List<Carros> listaCarros = new ArrayList();
        Carros c = new Carros();
        int acao = 0;

        while (ligado) {
            acao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu Incial\n 1 - Cadastrar Veículo 2 - Listar Cadastros 3 - Consultar Veívulo 4 - Apagar Cadastros",
                    "--- Ignite Motorsport ---", 2));

            switch (acao) {
                case 1: {
                    // 1 - Cadastrar novo Carro
                    
                    c.setMarca(JOptionPane.showInputDialog(null, "Menu Cadastro de Carro\n Informe a Marca do Veículo", "--- Ignite Motorsport ---", 2));
                    c.setModelo(JOptionPane.showInputDialog(null, "Menu Cadastro de Carro\n Informe o Modelo do Veículo", "--- Ignite Motorsport ---", 2));
                    c.setPlaca(JOptionPane.showInputDialog(null, "Menu Cadastro de Carro\n Informe o Modelo do Veículo", "--- Ignite Motorsport ---", 2));
                    c.setAno(JOptionPane.showInputDialog(null, "Menu Cadastro de Carro\n Informe o Ano de Fabricação do Veículo", "--- Ignite Motorsport ---", 2));
                    c.setCor(JOptionPane.showInputDialog(null, "Menu Cadastro de Carro\n Informe a Cor do Veículo", "--- Ignite Motorsport ---", 2));

                    listaCarros.add(c);
                }
                    break;

                case 2: {
                     // 2 - Listar Carros Cadastrados
                    String listar = "";
                    for (Carros carros : listaCarros) {
                        listar += carros.getMarca() + " " + carros.getModelo() + " " + carros.getPlaca() + " " + carros.getAno()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, listar);
                }
                    break;    
                
                case 3:
                    // 3 - Consultar um Carro Cadastrado
                    
                    break;

                default:
                    break;
            }
        }
    }
}
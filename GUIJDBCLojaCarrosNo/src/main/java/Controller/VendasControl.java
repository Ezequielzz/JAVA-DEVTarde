// package main.java.Controller;

// import javax.swing.JOptionPane;
// import javax.swing.JTable;
// import javax.swing.table.DefaultTableModel;

// import main.java.Connection.VendasDAO;
// import main.java.Model.Vendas;

// public class VendasControl {

//     // Atributos
//     private List<Vendas> vendas;
//     private DefaultTableModel tableModel;
//     private JTable table;

//     // Construtor
//     public VendasControl(List<Vendas> vendas, DefaultTableModel tableModel, JTable table) {
//         this.vendas = vendas;
//         this.tableModel = tableModel;
//         this.table = table;
//     }

//     // Método para atualizar a tabela de exibição com dados do banco de dados
//     private void atualizarTabela() {
//         tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
//         vendas = new VendasDAO().listarTodos();
//         // Obtém os vendas atualizados do banco de dados
//         for (Vendas venda : vendas) {

//             if (venda.getNome().equals("") && venda.getIdade().equals("") && venda.getSexo().equals("") && venda.getRg().equals("")
//                     && venda.getCpf().equals("")) {
//                         JOptionPane.showMessageDialog(null, "Preencha os Campos Corretamente", "Informação Inválida", 1);
//             } else {
//                 // Adiciona os dados de cada venda como uma nova linha na tabela Swing
//             tableModel.addRow(new Object[] { venda.getNome(), venda.getIdade(),

//                     venda.getSexo(), venda.getRg(), venda.getCpf() });
//             }

//         }
//     }

//     // Método para cadastrar um novo venda no banco de dados
//     public void cadastrar(String nome, String idade, String sexo, String rg, String cpf) {
//         new VendasDAO().cadastrar(nome, idade, sexo, rg, cpf);
//         // Chama o método de cadastro no banco de dados
//         atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
//     }

//     // Método para atualizar os dados de um venda no banco de dados
//     public void atualizar(String nome, String idade, String sexo, String rg, String cpf) {
//         new VendasDAO().atualizar(nome, idade, sexo, rg, cpf);
//         // Chama o método de atualização no banco de dados
//         atualizarTabela(); // Atualiza a tabela de exibição após a atualização

        
//     }

//     // Método para apagar um venda do banco de dados
//     public void apagar(String cpf) {
//         new VendasDAO().apagar(cpf);
//         // Chama o método de exclusão no banco de dados
//         atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
//     }
// }
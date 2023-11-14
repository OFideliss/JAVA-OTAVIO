package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Model.Clientes;
import Model.Clientes;

public class ClientesControl {
    // Atributos
    private List<Clientes> clientes;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public ClientesControl(List<Clientes> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Métodos do modelo CRUD
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getEmail(),

                    cliente.getEndereco(), cliente.getIdade(), cliente.getTelefone(), cliente.getCpf() });
        }
    }

    // Método para cadastrar um novo cliente no banco de dados
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {
        new CarrosDAO().apagar(placa);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}

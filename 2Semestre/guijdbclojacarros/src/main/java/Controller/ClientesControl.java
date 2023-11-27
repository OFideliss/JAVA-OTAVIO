package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.ClientesDAO;
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
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getIdade(), cliente.getCpf() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String nome, String idade, String cpf) {
        // Verificação se existe algum campo vazio
        if (nome.isEmpty() || idade.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }

        // Validação de dados para a marca
        if (!ApenasLetras(nome)) {
            JOptionPane.showMessageDialog(null, "Seu nome não pode conter números.");
            return;
        }

        // Verifica se a idade é um valor válido - Apenas números
        if (!ApenasNumeros(idade)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite uma idade válida (Apenas números)");
            return;
        }

        if (!ApenasNumeros(cpf)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um CPF válida (Apenas números)");
            return;
        }

        // Chama o método de cadastro no banco de dados
        new ClientesDAO().cadastrar(nome, idade, cpf);
        // Atualiza a tabela de exibição após o cadastro
        atualizarTabela();
        // Mensagem confirmando o cadastro
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String nome, String idade, String cpf) {

        if (nome.isEmpty() || idade.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }

        // Validação de dados para a marca
        if (!ApenasLetras(nome)) {
            JOptionPane.showMessageDialog(null, "Seu nome não pode conter números.");
            return;
        }

        // Verifica se a idade é um valor válido - Apenas números
        if (!ApenasNumeros(idade)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite uma idade válida (Apenas números)");
            return;
        }

        if (!ApenasNumeros(cpf)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um CPF válida (Apenas números)");
            return;
        }

        // Chama o método de atualização no banco de dados
        new ClientesDAO().atualizar(nome, idade, cpf);
        // Atualiza a tabela de exibição após a atualização
        atualizarTabela();
        // Mensagem confirmando o edição
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso.");
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String cpf) {
        // Chama o método de exclusão no banco de dados
        new ClientesDAO().apagar(cpf);
        // Atualiza a tabela de exibição após a exclusão
        atualizarTabela();
        // Mensagem confirmando o edição
        JOptionPane.showMessageDialog(null, "Cliente apagado com sucesso.");
    }

    // ======================Validação de Dados==========================
    // Método interno para validação de dados númericos
    private boolean ApenasNumeros(String string) {
        return string.matches("\\d*"); // Verifica se a string contém apenas dígitos
    }

    public boolean ApenasLetras(String texto) {
        return texto.matches("\\p{L}+"); // Verifica se a string contém apenas letras e carcteres exceto numeros
    }

}

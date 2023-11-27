package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Model.Carros;

public class CarrosControl {
    // Atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public CarrosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Métodos do modelo CRUD
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),

                    carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {

        // Verificação se existe algum campo vazio
        if (marca.isEmpty() || modelo.isEmpty() || ano.isEmpty() || placa.isEmpty() || valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }

        // Validação de dados
        if (!ApenasNumeros(ano)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um Ano válido (Apenas números)");
            return;
        } else {
            // Converte a String para inteiro
            int intAno = Integer.parseInt(ano);
            // Verifica o intervalo do ano
            if (intAno < 1970 || intAno > 2023) {
                // Ano não esta no intervalo
                JOptionPane.showMessageDialog(null, "Ano inválido - Digite um ano entre 1970 e 2023");
                return;
            }
        }
        // Verifica se o preco é um valor válido - Apenas números
        if (!ApenasNumeros(valor)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um Valor válido (Apenas números)");
            return;
        }

        // Validação de dados para a marca
        if (!ApenasLetras(marca)) {
            JOptionPane.showMessageDialog(null, "Marca inválido.");
            return;
        }

        // Validação de dados para a modelo
        if (!ApenasLetras(modelo)) {
            JOptionPane.showMessageDialog(null, "Modelo inválido.");
            return;
        }

        // Chama o método de cadastro no banco de dados
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        // Atualiza a tabela de exibição após o cadastro
        atualizarTabela();
        // Mensagem confirmando o cadastro
        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso.");
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        if (marca.isEmpty() || modelo.isEmpty() || ano.isEmpty() || placa.isEmpty() || valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }

        // Validação de dados
        if (!ApenasNumeros(ano)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um Ano válido (Apenas números)");
            return;
        } else {
            // Converte a String para inteiro
            int intAno = Integer.parseInt(ano);
            // Verifica o intervalo do ano
            if (intAno < 1970 || intAno > 2023) {
                // Ano não esta no intervalo
                JOptionPane.showMessageDialog(null, "Ano inválido - Digite um ano entre 1970 e 2023");
                return;
            }
        }
        // Verifica se o preco é um valor válido - Apenas números
        if (!ApenasNumeros(valor)) {
            // Se ano não for um número, não realiza o cadastro e mostra uma mensagem
            JOptionPane.showMessageDialog(null, "Digite um Valor válido (Apenas números)");
            return;
        }

        // Validação de dados para a marca
        if (!ApenasLetras(marca)) {
            JOptionPane.showMessageDialog(null, "Marca inválido.");
            return;
        }

        // Validação de dados para a modelo
        if (!ApenasLetras(modelo)) {
            JOptionPane.showMessageDialog(null, "Modelo inválido.");
            return;
        }

        // Chama o método de atualização no banco de dados
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor);
        // Atualiza a tabela de exibição após a atualização
        atualizarTabela();
        // Mensagem confirmando o edição
        JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso.");
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {

        // Chama o método de exclusão no banco de dados
        new CarrosDAO().apagar(placa);
        // Atualiza a tabela de exibição após a exclusão
        atualizarTabela();
        // Mensagem confirmando o edição
        JOptionPane.showMessageDialog(null, "Carro apagado com sucesso.");
    }

    // ======================Validação de Dados==========================
    // Método interno para validação de dados númericos
    private boolean ApenasNumeros(String string) {
        return string.matches("\\d*"); // Verifica se a string contém apenas dígitos
    }

    public boolean ApenasLetras(String texto) {
        return texto.matches("[a-zA-Z]+"); // Verifica se a string contém apenenas letras e/ou caracteres especiais
    }

}

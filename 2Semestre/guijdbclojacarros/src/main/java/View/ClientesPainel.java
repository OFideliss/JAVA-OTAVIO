package View;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.ClientesControl;
import Connection.ClientesDAO;
import Model.Clientes;

public class ClientesPainel extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField clienteNomeField, clienteIdadeField, clienteCPFField;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    //
    // Construtor(GUI-JPanel)
    public ClientesPainel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));
        inputPanel.add(new JLabel("Nome"));
        clienteNomeField = new JTextField(20);
        inputPanel.add(clienteNomeField);
        inputPanel.add(new JLabel("Idade"));
        clienteIdadeField = new JTextField(3);
        inputPanel.add(clienteIdadeField);
        inputPanel.add(new JLabel("CPF"));
        clienteCPFField = new JTextField(20);
        inputPanel.add(clienteCPFField);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);
        // tabela de clientes
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Idade", "CPF" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();
        atualizarTabela();

        // Tratamento de eventos -- dentro construtor
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    clienteNomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    clienteIdadeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    clienteCPFField.setText((String) table.getValueAt(linhaSelecionada, 2));
                }
            }
        });

        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados

        // Tratamento do botão cadastrar
        cadastrar.addActionListener(e -> {
            operacoes.cadastrar(clienteNomeField.getText(),
                    clienteIdadeField.getText(), clienteCPFField.getText());
            clienteNomeField.setText("");
            clienteIdadeField.setText("");
            clienteCPFField.setText("");
        });

        // Tratamento do botão editar
        editar.addActionListener(e -> {
            operacoes.atualizar(clienteNomeField.getText(),
                    clienteIdadeField.getText(), clienteCPFField.getText());
             clienteNomeField.setText("");
            clienteIdadeField.setText("");
            clienteCPFField.setText("");
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(e -> {
            operacoes.apagar( clienteCPFField.getText());
            // Limpa os campos de entrada após a operação de exclusão
            clienteNomeField.setText("");
            clienteIdadeField.setText("");
            clienteCPFField.setText("");
        });

    }

    // Métodos (Atualizar tabela)
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os clientes atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada cliente como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getIdade(),

                    cliente.getCpf() });
        }
    }
}

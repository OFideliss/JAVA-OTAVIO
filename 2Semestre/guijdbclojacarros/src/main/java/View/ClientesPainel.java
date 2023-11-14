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

import Connection.ClientesDAO;
import Controller.CarrosControl;
import Model.Clientes;

public class ClientesPainel extends JPanel {
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField clienteNomeField, clienteEmailField, clienteEnderecoField, clienteIdadeField,
            clienteTelefoneField, clienteCPFField;
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
        inputPanel.add(new JLabel("Email"));
        clienteEmailField = new JTextField(20);
        inputPanel.add(clienteEmailField);
        inputPanel.add(new JLabel("CEP"));
        clienteEnderecoField = new JTextField(10);
        inputPanel.add(clienteEnderecoField);
        inputPanel.add(new JLabel("Idade"));
        clienteIdadeField = new JTextField(3);
        inputPanel.add(clienteIdadeField);
        inputPanel.add(new JLabel("Telefone"));
        clienteTelefoneField = new JTextField(15);
        inputPanel.add(clienteTelefoneField);
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
                new String[] { "Nome", "Email", "CEP", "Idade", "Telefone", "CPF" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();

        // Tratamento de eventos -- dentro construtor
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    clienteNomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    clienteEmailField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    clienteEnderecoField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    clienteIdadeField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    clienteTelefoneField.setText((String) table.getValueAt(linhaSelecionada, 4));
                    clienteCPFField.setText((String) table.getValueAt(linhaSelecionada, 5));
                }
            }
        });

    }
}

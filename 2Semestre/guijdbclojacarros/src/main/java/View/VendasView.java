package View;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Model.Carros;
import Model.Clientes;

public class VendasView extends JPanel {
    JComboBox<String> carrosComboBox;
    List<Carros> carros;
    // Clientes
    JComboBox<String> clientesComboBox;
    List<Clientes> clientes;

    public VendasView() {
        super();
        carrosComboBox = new JComboBox<>();
        // Preencha o JComboBox com os carros
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca()
                    + " " + carro.getModelo()
                    + " " + carro.getPlaca());
        }
        add(carrosComboBox);

        // Clientes
        clientesComboBox = new JComboBox<>();
        // Preencha o JComboBox com os clientes
        clientes = new ClientesDAO().listarTodos();
        clientesComboBox.addItem("Selecione o Cliente");
        for (Clientes cliente : clientes) {
            clientesComboBox.addItem(cliente.getNome()
                    + " " + cliente.getCpf());
        }
        add(clientesComboBox);

        // Botão
        JButton vender = new JButton("Confirmar Venda");
        add(vender);
        
    }






    public void atualizarComboBoxCarro() {
        // Preencha o JComboBox com os carros
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.removeAllItems();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca()
                    + " " + carro.getModelo()
                    + " " + carro.getPlaca());
        }
    }

    public void atualizarComboBoxCliente() {
        // Preencha o JComboBox com os carros
        clientes = new ClientesDAO().listarTodos();
        clientesComboBox.removeAllItems();
        clientesComboBox.addItem("Selecione o Carro");
        for (Clientes cliente : clientes) {
            clientesComboBox.addItem(cliente.getNome()
                    + " " + cliente.getCpf());
        }
    }

}

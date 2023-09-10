package LojaCarrosList.src;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar uma classe Carros - Atributos e os métodos
        // App
        // List<Carros> listaCarros = new ArrayList<>();
        // =============================================================
        // 1. Cadastrar Carros
        // 2. Listar os Carros
        // 3. Consultar Carro
        // 4. Apagar Carro
        // =============================================================
        //
        // Criando lista de objetos
        List<Carros> listaCarros = new ArrayList<>();
        boolean aberto = true;
        //
        while (aberto) {
            int acao = Integer
                    .parseInt(JOptionPane.showInputDialog("Escolha a operação desejada:\n"
                            + " 1 - Cadastrar um novo carro \n" +
                            " 2 - Listar Carros \n" +
                            " 3 - Consultar"));

            if (acao == 1) {
                // criar um objeto
                String marcaCar = JOptionPane.showInputDialog("Marca do carro:");
                String modeloCar = JOptionPane.showInputDialog("Modelo do carro:");
                String anoCar = JOptionPane.showInputDialog("Ano do carro:");
                String corCar = JOptionPane.showInputDialog("Cor do carro:");
                Carros car = new Carros(marcaCar, modeloCar, anoCar, corCar);
                listaCarros.add(car); // adcicionar na ultima posição

            }
            // ====================================================
            if (acao == 2) {
                String listar = "";
                for (Carros carros : listaCarros) {
                    listar += carros.imprimirLN();
                }
                JOptionPane.showMessageDialog(null, listar);

            }
            // ====================================================
            if (acao == 3) {
                String listar = "";
                int i = 0;
                for (Carros carros : listaCarros) {
                    listar += i + carros.imprimirLN();
                    i++;
                }
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o carro:\n" + listar));
                listaCarros.get(acao2).imprimir();
            }
            // ====================================================
            if (acao == 4) {
                String listar = "";
                int i = 0;
                for (Carros carros : listaCarros) {
                    listar += i + carros.imprimirLN();
                    i++;
                }
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o carro para excluir:\n" + listar));
                listaCarros.get(acao2).imprimir();
                listaCarros.remove(acao2);
            }
        }
    }
}

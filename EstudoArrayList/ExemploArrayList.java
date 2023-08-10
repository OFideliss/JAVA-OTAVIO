package EstudoArrayList;

import java.util.*;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    // atributo
    // Declarando o ArrayList do tipo String
    ArrayList<String> carros = new ArrayList<>();

    //
    // método
    public void teste() {
        // adicionar valores ao ArrayList
        carros.add("Uno");
        carros.add("Chevette");
        carros.add("Celta");
        carros.add("Monza");
        carros.add("Gol");
        //
        // Collections.sort(ordena em ordem alfabética ou númerica)
        Collections.sort(carros);
        //
        // Imprimir toda a lista
        System.out.println(carros);
        //
        // Imprimir valor do index 4 (Quinta posição)
        System.out.println(carros.get(4));
        //
        // Percorrendo a lista com o FOR-I
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        //
        // Collections.reverse(invertendo as listas)
        Collections.reverse(carros);
        //
        // Percorrendo a lista com FOR-EACH
        for (String i : carros) {
            System.out.println(i);
        }
        //
        // Apagar a lista
        carros.clear();
        System.out.println(carros);
    }

    //
    // método
    public void exercicio() {
        // criar um ArrayList do tipo Inteiro e acrescenter 5 valores
        ArrayList<Integer> num = new ArrayList<>(); // usar Integer para declarar variavel do tipo inteiro(int)
        // adicionar valores ao ArrayList
        // num.add(1);
        // num.add(2);
        // num.add(3);
        // num.add(4);
        // num.add(5);
        // Preenchendo o ArrayList com um FORI
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor")));
        }
        //
        // Collections.sort(ordena em ordem alfabética ou númerica)
        Collections.sort(num);
        //
        // imprimir o Arraylist
        System.out.println(num);
        //
        // Collections.reverse(invertendo as listas)
        Collections.reverse(num);
        //
        // imprimir com o FOR-EACH
        for (int i : num) {
            System.out.println(i);
        }
//teste
//teste
//teste
    }
}

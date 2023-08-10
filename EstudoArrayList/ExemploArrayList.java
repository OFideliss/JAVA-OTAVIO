package EstudoArrayList;

import java.util.ArrayList;

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
        // Imprimir toda a lista
        System.out.println(carros);
        // Imprimir valor do index 4 (Quinta posição)
        System.out.println(carros.get(4));
        // Percorrendo a lista com o FOR-I
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        // Percorrendo a lista com FOR-EACH
        for (String i : carros) {
            System.out.println(i);
        }
        // Apagar a lista
        carros.clear();
        System.out.println(carros);
    }

    //
    // método
    public void exercicio() {
        // criar um ArrayList do tipo Inteiro e acresventer 5 valores
        ArrayList<Integer> inteiro = new ArrayList<>();
        // adicionar valores ao ArrayList
        inteiro.add(1);
        inteiro.add(2);
        inteiro.add(3);
        inteiro.add(4);
        inteiro.add(5);

        // imprimir o Arraylist
        System.out.println(inteiro);

        // imprimir com o FOR-EACH
        for (Integer i : inteiro) {
            System.out.println(i);
        }

    }
}

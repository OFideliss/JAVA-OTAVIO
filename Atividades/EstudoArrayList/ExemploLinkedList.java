package EstudoArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {
    //Atributos
    LinkedList <String> pessoas = new LinkedList<>();
    //
    //método
    public void teste() {
        pessoas.add("Maria");
        pessoas.add("Joana");
        pessoas.add("Pedro");
        //
        //adicionando na primeira posição
        pessoas.addFirst("Ana");
        //
        //imprimir o primeiro valor
        System.out.println(pessoas.getFirst());
    }
}

package POOExercicio2;

import java.util.Random;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSliderUI;

public class App {
    // chamar main
    public static void main(String[] args) {
        Random rd = new Random(0); // chamando a função Random (Sortea numeros aleatorios)
        Scanner sc = new Scanner(System.in);
        ; // chamando função Scanner
          // construir vetor de 10 objetos
        Agenda pessoas[] = new Agenda[4]; // o tipo agora é o nome da classe criada 

        // preencher o vetor/array
        for (int i = 0; i < pessoas.length; i++) {

            // criar o construtor de objetos
            pessoas[i] = new Agenda(); // construtor vazio
            // preencher os atributos
            pessoas[i].setNome(JOptionPane.showInputDialog("Nome:")); // abre um pop-up pedindo o nome
            pessoas[i].setAltura(rd.nextDouble(1.5, 2.1)); // sortea um numero entre 1,5 e 2,1
            pessoas[i].setIdade(rd.nextInt(18, 100)); // sortea um numero entre 18 e 100
        }

        // fazer um buscador
        // enquanto não achar o nome da pessoa

        // pedindo ao usuario o nome que quer encontrar
        // criando variavel e armazenando o nome digitado
        String procuraNome = JOptionPane.showInputDialog("Nome que deseja buscar:");
        int contadorPosicao = 0;

        while (!procuraNome.equals(pessoas[contadorPosicao].getNome())) { // enquanto o nome desejado for difente do
                                                                          // nome do
            // objeto continue procurando
            // a procurar a posição e os dados
            contadorPosicao++;
            System.out.println(contadorPosicao);
        }

        // Imprime a posição
        System.out.println("O nome digitado esta na posição: " + (contadorPosicao + 1));

        // Imprime os dados
        System.out.println("Nome: " + pessoas[contadorPosicao].getNome());
        System.out.println("Idade: " + pessoas[contadorPosicao].getIdade());
        System.out.println("Altura: " + pessoas[contadorPosicao].getAltura());

    }
}


package EstudoArrayList;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    //
    // Atributos
    HashMap<String, String> capitalEstados = new HashMap<>();

    //
    // método
    public void teste() {
        capitalEstados.put("SP", "São Paulo");
        capitalEstados.put("MG", "Belo Horizonte");
        capitalEstados.put("RJ", "Rio de Janeiro");
        capitalEstados.put("ES", "Vitória");
        //
        boolean jogo = true;
        //
        while (jogo) {
            String estado = JOptionPane.showInputDialog("Digite a sigla  do Estado");
            //
            JOptionPane.showMessageDialog(null, capitalEstados.get(estado));
        }
    }

    //
    // Exercicio Nome e idade
    public void exercicio() {
        //
        // declarar o HasMap
        HashMap<String, Integer> nomeIdade = new HashMap<>();
        //
        // preenchendo o HasMap
        nomeIdade.put("Andre", 20);
        nomeIdade.put("Lucas", 31);
        nomeIdade.put("Julio", 24);
        nomeIdade.put("Douglas", 48);
        //
        boolean jogo = true;
        //
        // percorrendo com o while
        while (jogo) {
            String nome = JOptionPane.showInputDialog("Digite o nome"); // pedir o nome
            JOptionPane.showMessageDialog(null, nomeIdade.get(nome)); // retornar a idade do nome digitado
            //
            // sair do while
            if (nome.equals("sair")) {
                jogo = false;
            }
        }

        // Usando KeySet para percorrer o vetor HasMap
        for (String nome : nomeIdade.keySet()) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + ", " + nomeIdade.get(nome));
        }
    }

}

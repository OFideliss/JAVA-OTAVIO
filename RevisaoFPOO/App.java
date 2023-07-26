package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;
import SA2Banco.ContaFisica;
import SA2Banco.ContaJuridica;

/**
 * App
 */

public class App {

    public static void main(String[] args) {
        // ==========================================================
        // criar um vetor de objetos
        Gato gato[] = new Gato[10]; // vetor para os gatos
        Cachorro cachorro[] = new Cachorro[10]; // vetor para os cachorros
        Outros outros[] = new Outros[10]; // vetor para os outros animais, por exemplo, o demonio da tasmania
        //
        // ==========================================================
        // Começar cadastro do Veterinário
        boolean aberto = true;
        int contGato = 0;
        int contGachorro = 0;
        int contOutros = 0;
        //
        while (aberto) {
            boolean escolherAnimal = true;
            // pedir ao colaborador qual a primeira ação deseja realizar
            int acao1 = Integer.parseInt(JOptionPane
                    .showInputDialog("Olá, Seja bem vindo(a). Informe qual operação deseja realizar:"
                            + "\n 1- Cadastrar Animal"
                            + "\n 2- Pesquisar no Sistema"
                            + "\n 3- Sair"));

            if (acao1 == 1) {
                while (escolherAnimal) { // Perguntar ao colaborador qual a especie do animal
                    int acao2 = Integer.parseInt(JOptionPane
                            .showInputDialog("Qual animal deseja cadastrar?:"
                                    + "\n 1- Cachorro"
                                    + "\n 2- Gato"
                                    + "\n 3- Outro"
                                    + "\n 4- Sair"));
                    // if para a operação escolhida
                    if (acao2 == 1) { // Caso o animal seja cachorro
                        // criar um objeto
                        cachorro[contGachorro] = new Cachorro(); // chamando construtor vazio

                        // preencher os atributos do objeto a ser criado
                        cachorro[contGachorro]
                                .setNome(JOptionPane.showInputDialog("Informe o nome do cachorro:"));
                        cachorro[contGachorro]
                                .setEspecie(JOptionPane.showInputDialog("Informe a especie do cachorro:"));
                        cachorro[contGachorro]
                                .setProprietario(
                                        JOptionPane.showInputDialog("Informe o nome do proprietário do cachorro:"));
                        cachorro[contGachorro]
                                .setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do cachorro:")));
                        //
                        // acrescimo no contador
                        
                    }
                }
            }
        }
    }

}
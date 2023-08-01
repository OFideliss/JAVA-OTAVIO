package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;
import RevisaoFPOO.Agenda.Agenda;

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
                Agenda agendas[] = new Agenda[100]; // Armazenar
                //
                // ==========================================================
                // Começar cadastro do Veterinário
                boolean aberto = true;
                int contGato = 0;
                int contCachorro = 0;
                int contOutros = 0;
                int contAgenda = 0;
                //
                while (aberto) {
                        boolean escolherAnimal = true;
                        // pedir ao colaborador qual a primeira ação deseja realizar
                        int acao1 = Integer.parseInt(JOptionPane
                                        .showInputDialog(
                                                        "Olá, Seja bem vindo(a). Informe qual operação deseja realizar:"
                                                                        + "\n 1- Cadastrar Animal"
                                                                        + "\n 2- Consulta"
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
                                                cachorro[contCachorro] = new Cachorro(); // chamando construtor vazio

                                                // preencher os atributos do objeto a ser criado
                                                cachorro[contCachorro]
                                                                .setNome(JOptionPane.showInputDialog(
                                                                                "Informe o nome do cachorro:"));
                                                cachorro[contCachorro]
                                                                .setEspecie(JOptionPane.showInputDialog(
                                                                                "Informe a especie do cachorro:"));
                                                cachorro[contCachorro]
                                                                .setProprietario(
                                                                                JOptionPane.showInputDialog(
                                                                                                "Informe o nome do proprietário do cachorro:"));
                                                cachorro[contCachorro]
                                                                .setPeso(Integer.parseInt(JOptionPane.showInputDialog(
                                                                                "Informe o peso do cachorro:")));
                                                cachorro[contCachorro].setRegistroAnimal(1000 + contCachorro); // RA do
                                                                                                               // animal
                                                //
                                                // acrescimo no contador
                                                JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso"
                                                                + "\n RA: "
                                                                + cachorro[contCachorro].getRegistroAnimal());
                                                contCachorro++;
                                                escolherAnimal = false;
                                        }
                                        if (acao2 == 2) { // Caso o animal seja gato
                                                // criar um objeto
                                                gato[contGato] = new Gato(); // chamando construtor vazio

                                                // preencher os atributos do objeto a ser criado
                                                gato[contGato]
                                                                .setNome(JOptionPane.showInputDialog(
                                                                                "Informe o nome do gato:"));
                                                gato[contGato]
                                                                .setEspecie(JOptionPane.showInputDialog(
                                                                                "Informe a especie do gato:"));
                                                gato[contGato]
                                                                .setProprietario(
                                                                                JOptionPane.showInputDialog(
                                                                                                "Informe o nome do proprietário do gato:"));
                                                gato[contGato]
                                                                .setPeso(Integer.parseInt(JOptionPane.showInputDialog(
                                                                                "Informe o peso do gato:")));
                                                gato[contGato].setRegistroAnimal(2000 + contCachorro); // RA do animal
                                                //
                                                // acrescimo no contador
                                                JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso"
                                                                + "\n RA: " + gato[contGato].getRegistroAnimal());
                                                contGato++;
                                                escolherAnimal = false;
                                        }
                                        if (acao2 == 3) { // Caso seja outro animal
                                                // criar um objeto
                                                outros[contOutros] = new Outros(); // chamando construtor vazio

                                                // preencher os atributos do objeto a ser criado
                                                outros[contOutros]
                                                                .setNome(JOptionPane.showInputDialog(
                                                                                "Informe o nome do animal:"));
                                                outros[contOutros]
                                                                .setEspecie(JOptionPane.showInputDialog(
                                                                                "Informe a especie do animal:"));
                                                outros[contOutros]
                                                                .setProprietario(
                                                                                JOptionPane.showInputDialog(
                                                                                                "Informe o nome do proprietário do(a) animal"));
                                                outros[contOutros]
                                                                .setPeso(Integer.parseInt(JOptionPane.showInputDialog(
                                                                                "Informe o peso do animal:")));
                                                outros[contOutros].setRegistroAnimal(3000 + contCachorro); // RA do
                                                                                                           // animal
                                                //
                                                // Acrescimo no contador
                                                JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso"
                                                                + "\n RA: " + outros[contOutros].getRegistroAnimal());
                                                contOutros++;
                                                escolherAnimal = false;
                                        }
                                }
                        }
                        if (acao1 == 2) { // Agendar consulta
                                //
                                // verificar se o animal existe no sistema
                                boolean cadastroOK = false;
                                int numeroRA = Integer.parseInt(
                                                JOptionPane.showInputDialog("Digite o numero RA do animal"));
                                for (int i = 0; i < contCachorro; i++) { // buscar no vetor de cachorros
                                        if (cachorro[i].getRegistroAnimal() == numeroRA) {
                                                // mensagem confirmação
                                                JOptionPane.showMessageDialog(null, "Pet encontrado");
                                                cadastroOK = true;
                                                break;
                                        }

                                }
                                for (int i = 0; i < contGato; i++) { // buscar no vetor de cachorros
                                        if (gato[i].getRegistroAnimal() == numeroRA) {
                                                // mensagem confirmação
                                                JOptionPane.showMessageDialog(null, "Pet encontrado");
                                                cadastroOK = true;
                                                break;
                                        }

                                }
                                for (int i = 0; i < contOutros; i++) { // buscar no vetor de cachorros
                                        if (outros[i].getRegistroAnimal() == numeroRA) {
                                                // mensagem confirmação
                                                JOptionPane.showMessageDialog(null, "Pet encontrado");
                                                cadastroOK = true;
                                                break;
                                        }

                                }
                                //
                                // terminar a agenda da consulta
                                boolean agendar = true;
                                while (agendar) {
                                        String dataAgenda = JOptionPane
                                                        .showInputDialog("Informe a data do agendamento");
                                        String horaAgenda = JOptionPane
                                                        .showInputDialog("Informe a hora do agendamento");
                                        if (contAgenda == 0) {
                                                agendas[contAgenda] = new Agenda();
                                                agendas[contAgenda].setData(dataAgenda);
                                                agendas[contAgenda].setHora(horaAgenda);
                                                JOptionPane.showMessageDialog(null,
                                                                "Agendamento realizado com sucesso");
                                                agendar = false;
                                        } else {
                                                for (int i = 0; i < contAgenda; i++) {
                                                        if (agendas[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                                                                // não pode agendar
                                                                JOptionPane.showMessageDialog(null,
                                                                                "Horário já preenchido");
                                                                break;
                                                        } else {
                                                                agendas[contAgenda] = new Agenda();
                                                                agendas[contAgenda].setData(dataAgenda);
                                                                agendas[contAgenda].setHora(horaAgenda);
                                                                JOptionPane.showMessageDialog(null,
                                                                                "Agendamento realizado com sucesso");
                                                                agendar = false;
                                                        }
                                                }
                                        }
                                }

                        }

                        if (acao1 == 3 || acao1 >= 4) {
                                aberto = false;
                        }
                }
        }

}
package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {

        // objetos
        Alunos aluno01 = new Alunos();
        Pessoas pessoas01 = new Pessoas();
        Funcionarios funcionario01 = new Funcionarios();
        Professores professor01 = new Professores();

        // set
        pessoas01.setNome("Alberto Silva");
        aluno01.setNome("Alberto Silva");
        funcionario01.setnRegistro(57857);
        professor01.setPeriodos("Noturno");
    }
}

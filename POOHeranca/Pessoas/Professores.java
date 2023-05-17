package POOHeranca.Pessoas;

public class Professores extends Funcionarios { // Subclasse Professores herda atributos da subclasse Funcionarios, que
                                                // por sua vez herda atributos da superclasse Pessoas

    // atributos
    private String periodos;
    private String disciplinas;

    // métodos gets sets
    public String getPeriodos() {
        return periodos;
    }

    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

}

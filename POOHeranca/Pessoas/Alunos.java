package POOHeranca.Pessoas;

public class Alunos extends Pessoas { // Subclasse de Pessoas // Herda funções e atributos da superclasse Pessoas
    // atributos especificos
    private int nMatricula;
    private String curso;
    private String tuma;

    // métodos
    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTuma() {
        return tuma;
    }

    public void setTuma(String tuma) {
        this.tuma = tuma;
    }

}

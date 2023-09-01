package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas { // subclasse herda atributos da superclasse Pessoas

    // atributos especificos
    int nRegistro; // não utilizo private, pois esses atributos tambem vao ser usados na subclasse
                   // Professores
    String setor;

    // métodos gets sets
    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}

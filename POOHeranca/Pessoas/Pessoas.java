package POOHeranca.Pessoas;

public class Pessoas { // Superclasse - atributos genéricos

    // atributos da superclasse
    String nome;
    String endereco;
    String nCPF;
    int idade;

    // métodos - gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getnCPF() {
        return nCPF;
    }

    public void setnCPF(String nCPF) {
        this.nCPF = nCPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

package RevisaoFPOO.Cadastro;

public abstract class Animal {
    // Atributos
    String nome;
    double peso;
    String especie;
    String proprietario;
    int registroAnimal;

    //
    // Métodos
    //
    // construtor cheio
    public Animal(String nome, double peso, String especie, String proprietario, int registroAnimal) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
        this.proprietario = proprietario;
        this.registroAnimal = registroAnimal;
    }

    //
    // construtor vazio
    public Animal() {
    }

    //
    // sets and gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getRegistroAnimal() {
        return registroAnimal;
    }

    public void setRegistroAnimal(int registroAnimal) {
        this.registroAnimal = registroAnimal;
    }

}

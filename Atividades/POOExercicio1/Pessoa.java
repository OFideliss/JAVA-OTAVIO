package POOExercicio1;

public class Pessoa {
    // criar atributos (nome,altura e data de nascimento)
    String nome;
    double altura;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    // criar construtores // construtor é um método
    public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public Pessoa() { // construtor vazio
    }

    // construir get e set //get e set são métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // criar outros métodos
    // existem dois tipos de métodos void(não retorna nada) e return(retorna)

    public void imprimir() { // método para imprimir os dados
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
    }

    public int getIdade() {
        int idade;
        if (diaNascimento <= 30 && mesNascimento <= 5) {
            idade = 2023 - anoNascimento;
        } else {
            idade = 2023 - anoNascimento - 1;
        }
        return idade;
    }
}

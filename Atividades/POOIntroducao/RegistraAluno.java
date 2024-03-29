package POOIntroducao;

public class RegistraAluno { // Classe: Registra Aluno
    // Atributos dos objetos
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    // Atributo da classe
    private static int contadorEstudante;

    // Métodos
    // criação de metodos do tipo "get" - acesso aos dados dos atributos
    // retorna o nome do estudante
    public String getNome() {
        return nome;
    }

    // retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }

    // retorna idade do estudante
    public int getIdade() {
        return idade;
    }

    // retorna a média do estudante
    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica
                + notaPortugues
                + notaCiencias) / 3;

        return resultado;
    }

    // retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

    // Métodos de modificação dos atributos "set"

    // define ou altera o nome do estudante
    public void setNome(String nome) {
        this.nome = nome;
    }

    // define ou altera o endereço do estudante
    public void setEndereco(String enderco) {
        this.endereco = enderco;
    }

    // define ou altera o idade do estudante
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // define ou altera a nota de matematica do estudante
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    // define ou altera a nota de portugues do estudante
    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    // define ou alteraa nota de ciencias do estudante
    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }
}

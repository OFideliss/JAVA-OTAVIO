package Model;

public class Clientes {
    //=============Atributos=============
    private String nome;
    private String email;
    private String endereco;
    private int idade;
    private int telefone;
    private int cpf;
    //=============Construtor=============
    public Clientes(String nome, String email, String endereco, int idade, int telefone, int cpf) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    //=============Get and Set=============
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

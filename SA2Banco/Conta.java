package SA2Banco;

//Criando uma super classe interface para criar os atributos de uma conta generica (tanto Fisica quando Juridica)
public class Conta {

    // Atributos da super classe conta
    String Nome; // armazena o nome do titular da conta/razão social
    int NumeroConta; // armazena o número da conta do usuario
    int Saldo; // armazena o saldo da conta

    // criando métodos
    // construtores
    public Conta(String nome) {
        Nome = nome;
    }

    // get e set
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }
}

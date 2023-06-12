package SA2Banco;

//Criando uma super classe para criar os atributos de uma conta generica (tanto Fisica quando Juridica)
public abstract class Conta {
    // Atributos da super classe conta
    String nome;
    int nConta;
    double saldo;

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}

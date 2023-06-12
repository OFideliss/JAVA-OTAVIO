package SA2Banco;

//Criando uma super classe para criar os atributos de uma conta generica (tanto Fisica quando Juridica)
public interface Conta {
    // Atributos da super classe conta
    public String getNome(); // armazena o nome do titular da conta/razão social

    public int getNumeroConta(); // armazena o número da conta do usuario

    public int getSaldo(); // armazena o saldo da conta
}

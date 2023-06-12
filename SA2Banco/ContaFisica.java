package SA2Banco;

// criando uma classe ContaFisica para as contas de pessoas Fisicas.

public class ContaFisica extends Conta {
    String nCPF;

    //set get
    public String getnCPF() {
        return nCPF;
    }

    public void setnCPF(String nCPF) {
        this.nCPF = nCPF;
    }

    
}

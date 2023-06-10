package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criar o objeto
        RegistraAluno aluno1 = new RegistraAluno(); // objeto

        // modificar os atributos (set)
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Limeira");
        aluno1.setIdade(20);
        aluno1.setNotaMatematica(10);
        aluno1.setNotaPortugues(10);
        aluno1.setNotaCiencias(10);

        // acessar os atributos (get)
        System.out.println("Nome:" + aluno1.getNome());
        System.out.println("Endereço:" + aluno1.getEndereco());
        System.out.println("Idade:" + aluno1.getIdade());
        System.out.println("Média:" + aluno1.getMedia());
    }
}

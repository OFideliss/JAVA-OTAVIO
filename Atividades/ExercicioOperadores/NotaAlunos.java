package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void mediaFrequencia() {
        System.out.println("Informe a nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println("A média do Aluno foi de: " + mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno esta aprovado por nota? " + mediaAprovado);
        System.out.println("Informe a frequência do Aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno esta aprovado por frequência? " + frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado == true) && (frequenciaAprovado == true);
        System.out.println("O Aluno esta aprovado no curso? " + aprovacaoFinal);
    }

}

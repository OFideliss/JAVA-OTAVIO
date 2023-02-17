package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void notaFrequencia() {
        System.out.println("Informe a nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno");
        int nota2 = sc.nextInt();
        System.out.println("Informe a frequência do Aluno");
        int frequencia = sc.nextInt();
        double mediaAritmetica = (nota1 + nota2) / 2;
        System.out.println("A média do Aluno foi de: "

                + mediaAritmetica);
        int minimoNota = 50;
        double alunoAprovado = mediaAritmetica >= minimoNota;
        System.out.println("O Aluno foi aprovado?"
                + alunoAprovado);
    }

}

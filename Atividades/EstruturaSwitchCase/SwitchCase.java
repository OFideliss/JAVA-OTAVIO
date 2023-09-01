package EstruturaSwitchCase;  // Arquivo de Classe

import java.util.Scanner;

public class SwitchCase {    //Classe 
    Scanner sc = new Scanner(System.in); 

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " é Vogal");
                break;
            case "e":
            System.out.println(letra+" é vogal");
            break;
            case "i":
            System.out.println(letra+" é vogal");
            break;
            case "o":
            System.out.println(letra+" é vogal");
            break;
            case "u":
            System.out.println(letra+" é vogal");
            break;
            default: System.out.println(letra+" é consoante");
            break;

        }
    }
    public void mes() {
        System.out.println("Digite um numero de 1 a 12 para descobrir o mês correspondente");
        int mes= sc.nextInt();
        switch(mes) {
            case 0:
            System.out.println("E existe mês zero??????????????");
            break;
            case 1 :
            System.out.println("O número digitado corresponde ao mês Janeiro");
            break;
            case 2 :
            System.out.println("O número digitado corresponde ao mês Fevereiro");
            break;
            case 3 :
            System.out.println("O número digitado corresponde ao mês Março");
            break;
            case 4 :
            System.out.println("O número digitado corresponde ao mês Abril");
            break;
            case 5 :
            System.out.println("O número digitado corresponde ao mês Maio");
            break;
            case 6 :
            System.out.println("O número digitado corresponde ao mês Junho");
            break;
            case 7 :
            System.out.println("O número digitado corresponde ao mês Julho");
            break;
            case 8 :
            System.out.println("O número digitado corresponde ao mês Agosto");
            break;
            case 9 :
            System.out.println("O número digitado corresponde ao mês Setembro");
            break;
            case 10 :
            System.out.println("O número digitado corresponde ao mês Outubro");
            break;
            case 11:
            System.out.println("O número digitado corresponde ao mês Novembro");
            break;
            case 12:
            System.out.println("O número digitado corresponde ao mês Dezembro");
            break;
            default: System.out.println("So existem 12 meses!!!Porque você digitou "+mes+"??????????????");


        }
    }
}
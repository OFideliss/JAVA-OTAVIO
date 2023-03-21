package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

public class While { // Classe
    Scanner sc = new Scanner(System.in);

    public void exemplo1() { // Método
        int interacao = 0;
        while (interacao < 10) {
            interacao += 1;
            System.out.println("O número da interação  é: " + interacao);
        }
    }
    public void adivinhar() { // Método
        Random rd = new Random(); // Objeto "rd" da Classe "Random", Random = introduzir número aleátorio
        int nSorteado = rd.nextInt(10); // Número aleatorio de 0 a 10
        boolean tenteNovamente;
        while(tenteNovamente) {
            System.out.println("Digite um número: ");
            int nDigitado = sc.nextInt();
            if(nDigitado == nSorteado) {
                System.out.println("Acerto Meseravi");
                tenteNovamente = false;
            } else {
                System.out.println("Errouu");
                tenteNovamente =  true;
            }
        }
    }
}

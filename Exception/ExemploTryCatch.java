package Exception;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean teste = true;
        while (teste) {
            try {
                System.out.print("Digite um valor inteiro..:");
                int numero1 = sc.nextInt();
                System.out.print("Digite um valor inteiro..:");
                int numero2 = sc.nextInt();
                System.out.println(numero1 + " + "
                        + numero2 + "= " + (numero1 + numero2));
                        teste = false;
            } catch (Exception e) {
                System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
                break;
            }
        }
    }
}
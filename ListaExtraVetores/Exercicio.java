package ListaExtraVetores;

import java.util.Scanner; // Sempre declarar quando for usar o Scanner

public class Exercicio {

    public void exercicio1() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25 };
        int vetorB[] = new int[5];

        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];

        System.out.println("O vetorB é:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
    }

    public void exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 };
        int vetorB[] = new int[8];

        vetorB[0] = vetorA[0] * 2;
        vetorB[1] = vetorA[1] * 2;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 2;
        vetorB[4] = vetorA[4] * 2;
        vetorB[5] = vetorA[5] * 2;
        vetorB[6] = vetorA[6] * 2;
        vetorB[7] = vetorA[7] * 2;

        System.out.println("O vetorB é:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);

    }

    public void exercicio3() {

        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
        int vetorB[] = new int[15];

        vetorB[0] = vetorA[0] * vetorA[0];
        vetorB[1] = vetorA[1] * vetorA[1];
        vetorB[2] = vetorA[2] * vetorA[2];
        vetorB[3] = vetorA[3] * vetorA[3];
        vetorB[4] = vetorA[4] * vetorA[4];
        vetorB[5] = vetorA[5] * vetorA[5];
        vetorB[6] = vetorA[6] * vetorA[6];
        vetorB[7] = vetorA[7] * vetorA[7];
        vetorB[8] = vetorA[8] * vetorA[8];
        vetorB[9] = vetorA[9] * vetorA[9];
        vetorB[10] = vetorA[10] * vetorA[10];
        vetorB[11] = vetorA[11] * vetorA[11];
        vetorB[12] = vetorA[12] * vetorA[12];
        vetorB[13] = vetorA[13] * vetorA[13];
        vetorB[14] = vetorA[14] * vetorA[14];

        System.out.println("O vetorB é:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
        System.out.println(vetorB[10]);
        System.out.println(vetorB[11]);
        System.out.println(vetorB[12]);
        System.out.println(vetorB[13]);
        System.out.println(vetorB[14]);

    }

    public void exercicio4() {

        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
        double vetorB[] = new double[15];

        vetorB[0] = Math.sqrt(vetorA[0]);
        vetorB[1] = Math.sqrt(vetorA[1]);
        vetorB[2] = Math.sqrt(vetorA[2]);
        vetorB[3] = Math.sqrt(vetorA[3]);
        vetorB[4] = Math.sqrt(vetorA[4]);
        vetorB[5] = Math.sqrt(vetorA[5]);
        vetorB[6] = Math.sqrt(vetorA[6]);
        vetorB[7] = Math.sqrt(vetorA[7]);
        vetorB[8] = Math.sqrt(vetorA[8]);
        vetorB[9] = Math.sqrt(vetorA[9]);
        vetorB[10] = Math.sqrt(vetorA[10]);
        vetorB[11] = Math.sqrt(vetorA[11]);
        vetorB[12] = Math.sqrt(vetorA[12]);
        vetorB[13] = Math.sqrt(vetorA[13]);
        vetorB[14] = Math.sqrt(vetorA[14]);

        System.out.println("O vetorB é:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
        System.out.println(vetorB[10]);
        System.out.println(vetorB[11]);
        System.out.println(vetorB[12]);
        System.out.println(vetorB[13]);
        System.out.println(vetorB[14]);

    }

    public void exercicio5() {

        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorB[] = new int[10];

        vetorB[0] = vetorA[0] * 0;
        vetorB[1] = vetorA[1] * 1;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 3;
        vetorB[4] = vetorA[4] * 4;
        vetorB[5] = vetorA[5] * 5;
        vetorB[6] = vetorA[6] * 6;
        vetorB[7] = vetorA[7] * 7;
        vetorB[8] = vetorA[8] * 8;
        vetorB[9] = vetorA[9] * 9;

        System.out.println("O vetorB é:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);

    }

    public void exercicio6() {

        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorB[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorC[] = new int[10];

    }

}

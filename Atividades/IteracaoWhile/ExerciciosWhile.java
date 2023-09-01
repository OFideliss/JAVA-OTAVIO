package IteracaoWhile;

public class ExerciciosWhile {
    // resolvendo lista extra vetores
    public void exercicio1() { // vetorA = vetorB
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) { // Enquanto "i" for menor que o comprimento do "vetorA", a saber 5, pois é um
                                    // vetor de 5 indices.
            vetorB[i] = vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++; // incrementa 1

        }
    }

    public void exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 };
        int vetorB[] = new int[vetorA.length]; // vetorB terá o mesmo tamanho do vetor A
        int i = 0;
        while (i < vetorA.length) { // Enquanto "i" for menor que o comprimento do "vetorA", a saber 5, pois é um
                                    // vetor de 5 indices.
            vetorB[i] = vetorA[i] * 2;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++; // incrementa 1
        }

    }

    public void exercicio3() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++; // incrementa 1
        }
    }

    public void exercicio4() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++; // incrementa 1
        }
    }

    public void exercicio5() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorB[] = new int[10];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++; // incrementa 1
        }
    }

    public void exercicio6() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorB[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, };
        int vetorC[] = new int[10];
        int i = 0;
        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("VetorC[" + i + "]=" + vetorC[i]);
            i++; // incrementa 1
        }
    }

}
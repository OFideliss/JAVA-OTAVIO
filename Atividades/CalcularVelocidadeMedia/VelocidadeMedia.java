package CalcularVelocidadeMedia;

public class VelocidadeMedia {  // mesmo nome do arquivo 
    public static void main(String[] args) {
        int distanciaPercorrida = 150;     // Variável inteira (distancia)   
        int tempoGasto = 3;                // Variável inteira (tempo)
        double velocidadeMedia = distanciaPercorrida/tempoGasto;  // Variável que permite vírgula (velocidade media)
        System.out.println("A Velocidade Média é"+velocidadeMedia+"Km/h"); // Mostra velocidade media     (+) = concatenar 
    }
}

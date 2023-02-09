package Exercicio1Java; // Pasta em que o arquivo esta

public class CalculoCombustivel { // mesmo nome do arquivo
    public static void main(String[] args) {
        double DistanciaTotal = 200; // Variável aceita decimais (distancia)
        double ValorCombustivel = 5.; // Variável aceita decimais (Valor do Combustivel)
        double ConsumoKm = 8; // Variável que permite vírgula (Km por litro que o carro faz)
        double LitrosGastos = DistanciaTotal / ConsumoKm; // Litros gasto pelo percurso
        double ValorGasto = LitrosGastos * ValorCombustivel; // Valor gasto em combustivel
        System.out.println("O Valor total gasto em combustivel foi de " + "R$" + ValorGasto); // Mostra Valor gasto
                                                                                              // (+) = concatenar
    }
}

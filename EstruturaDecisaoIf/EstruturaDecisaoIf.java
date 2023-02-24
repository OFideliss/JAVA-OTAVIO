package EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);
    public void decisaoIf() {
        System.out.println("Qual o preço do produto? ");
        double precoProduto =sc.nextDouble();
        double percentualDesconto = 0.0;
        if (precoProduto>=200 && precoProduto<300) {  //Estrutura de decisão If ---- "Se o preço do produto for maior ou igual a 200 e menor que 300"
            percentualDesconto=10.0; // O novo desconto será de 10%
        }
        if (precoProduto>=100 && precoProduto<200) {   //Estrutura de decisão If ---- "Se o preço do produto for maior ou igual a 100 e menor que 200"
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0; // O desconto será de 5%
        }
        if(precoProduto>=300)  // /Estrutura de decisão If ---- "Se o preço do produto for maior ou igual a 100 e menor que 200"
        percentualDesconto = 15.0;

        // Regra de 3
        double desconto = (precoProduto * percentualDesconto)/100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O Produto sairá por R$:" + precoComDesconto);
    }
}

package page1;

import java.util.Scanner;

public class Exer3 {

/*
    Faça um programa para pagamento de comissão de vendedores de peças,
    levando-se em consideração que sua comissão será de 5% do total da
    venda e que você tem os seguintes dados:

    - Identificação do vendedor
    - Código da peça
    - Preço unitário da peça
    - Quantidade vendida
*/

    public static void exercicio3(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String vendedor = input.nextLine();

        System.out.print("Peça: ");
        String peca = input.nextLine();

        System.out.print("Preço unitario da peça: ");
        double valorPeca = input.nextDouble();

        System.out.print("Quantidade de peças vendidas: ");
        int quantidadeVendidada = input.nextInt();

        System.out.printf("%s você vendeu %d %s, somando um total de R$%.2f", vendedor, quantidadeVendidada, peca, (quantidadeVendidada * valorPeca));
        System.out.printf("\nSua comissão é no valor de: R$%.2f", (0.05 * (quantidadeVendidada * valorPeca)));


    }
}

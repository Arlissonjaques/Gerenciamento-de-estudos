package entra.processamento.saida;

import java.util.Scanner;

public class Exer3 {

    public static void exercicio3(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String vendedor = input.nextLine();
        System.out.print("Peça: ");
        String peca = input.nextLine();
        System.out.print("Preço unitario da peça: ");
        double valorPeca = input.nextDouble();
        System.out.print("Quantidade de peças vendidas: ");
        int quantidaVendidad = input.nextInt();

        System.out.printf("%s você vendeu %d %s, somando um total de R$%.2f", vendedor, quantidaVendidad, peca, (quantidaVendidad * valorPeca));
        System.out.printf("\nSua comissão é no valor de: R$%.2f", (0.05 * (quantidaVendidad * valorPeca)));


    }
}

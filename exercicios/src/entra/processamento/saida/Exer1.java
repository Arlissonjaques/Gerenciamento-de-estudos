package entra.processamento.saida;

import java.util.Scanner;

public class Exer1 {

    public static void exercicio1(){

        Scanner input = new Scanner(System.in);

        System.out.print("Valor maximo: ");
        double quantidade_maxima = input.nextDouble();

        System.out.print("Valor minimo: ");
        double quantidade_minima = input.nextDouble();

        double estoque_medio = (quantidade_maxima + quantidade_minima) / 2;

        System.out.printf("A média do seu estoque de: %.1f", estoque_medio);
    }
}

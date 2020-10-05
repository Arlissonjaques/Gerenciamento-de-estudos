package level1;

import java.util.Scanner;

public class Exer10 {
    /*
        10) Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
        entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
    */
    public static void exercicio10() {
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        double primeiro = input.nextDouble();
        System.out.print("Segundo numero: ");
        double segundo = input.nextDouble();

        if (primeiro > segundo){
            System.out.printf("%.1f e %.1f NÃO IGUAIS\n", primeiro, segundo);
            System.out.printf("%.1f MAIOR\n", primeiro);
            System.out.printf("%.1f MENOR\n", segundo);
        } else if(segundo > primeiro){
            System.out.printf("%.1f e %.1f NÃO IGUAIS\n", primeiro, segundo);
            System.out.printf("%.1f MAIOR\n", segundo);
            System.out.printf("%.1f MENOR\n", primeiro);
        }else{
            System.out.printf("%.1f e %.1f SÃO IGUAIS\n", primeiro, segundo);
        }


    }
}

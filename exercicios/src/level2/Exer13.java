package level2;

import java.util.Scanner;

public class Exer13 {
/*
    13) Escreva um programa que leia 3 números inteiros e imprima na tela os
        valores em ordem decrescente.
*/
    public static void exercicio13(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int first = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int second = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int third = input.nextInt();

        if(first > second && first > third){
            if(second > third){
                System.out.printf("Ordem decrescente: %d %d %d A1", first, second, third);
            }else
                System.out.printf("Ordem decrescente: %d %d %d A2", first, third, second);
        }

        else if(second > first && second > third){
            if(first > third){
                System.out.printf("Ordem decresente: %d %d %d B1", second, first, third);
            }else{
                System.out.printf("Ordem decresente: %d %d %d B2", second, third, first);
            }
        }

        else{
            if(third > first && third > second){
                System.out.printf("Ordem decresente: %d %d %d C1", third, second, first);
            }else{
                System.out.printf("Ordem decresente: %d %d %d C2", third, first, second);
            }
        }
    }
}

package level2;

import java.util.Scanner;

public class Exer14 {
/*
    14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
*/
    public static void exercicio14(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int first = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int second = input.nextInt();

        System.out.print("Diferença: ");
        for (int i = first+1; i < second; i++){
            System.out.print(i + " ");
        }
    }
}

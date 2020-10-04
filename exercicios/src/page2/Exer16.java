package page2;

import java.util.Scanner;

public class Exer16 {
/*
    16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
        menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
*/
    public static void exercicio16(){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        double first = input.nextDouble();
        System.out.print("Segundo numero: ");
        double second = input.nextDouble();

        if(first > second){
            System.out.printf("Maior: %.1f\n", first);
            System.out.printf("Menor: %.1f", second);
        }else if(first == second){
            System.out.println("São iguais");
        }else{
            System.out.printf("Maior: %.1f\n", second);
            System.out.printf("Menor: %.1f\n", first);
        }
    }
}

package page2;

import java.util.Scanner;

public class Exer12 {
/*
    12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
        O módulo de um número x é:
        x se x é maior ou igual a zero
        x * (-1) se x é menor que zero
*/

    public static void exercicio12(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero que deseja saber o modulo: ");
        int number = input.nextInt();

        if (number < 0)
            System.out.printf("O modulo de %d é: %d", number, number * (-1));
        else if(number == 0){
            System.out.printf("O modulo de %d é: %d", number, number);
        }else{
            System.out.printf("O modulo de %d é: %d", number, number);
        }
    }
}

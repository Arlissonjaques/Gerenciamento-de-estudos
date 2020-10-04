package page2;

import java.util.Scanner;

public class Exer17 {
/*
    17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
        entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
        Caso contrário, apresentar a mensagem “valor inválido”.
*/
    public static void exercicio17(){
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int number = input.nextInt();

        if(number < 0 || number > 9){
            System.out.println("Valor inválido!");
        }else{
            System.out.println("Valor válido!");
        }


    }
}

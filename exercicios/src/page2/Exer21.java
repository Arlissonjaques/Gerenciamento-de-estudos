package page2;

import java.util.Scanner;

public class Exer21 {
/*
    21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
        positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
*/
    public static void exercicio21(){
        Scanner input = new Scanner(System.in);

        int value = -1;

        while(value != 0){

            System.out.print("Digite o valor que deseja indentificar: ");

            value = input.nextInt();

            if(value < 0)
                System.out.printf("\n%d é negativo!\n", value);
            else
                System.out.printf("\n%d é positivo!\n", value);

            System.out.print("\nDeseja sair? \n\n1) - Sim\n2) - Não\n>>> ");
            value = input.nextInt();

            if (value == 1)
                break;
        }
    }
}

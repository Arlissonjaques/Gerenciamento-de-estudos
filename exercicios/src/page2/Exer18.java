package page2;

import java.util.Scanner;

public class Exer18 {
/*
    18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
        igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
        um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
        seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
*/
    public static void exercicio18(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int codigo = input.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
            case 3:
                System.out.println("Três");
            default:
                System.out.println("Opção invalida!");
        }

    }
}

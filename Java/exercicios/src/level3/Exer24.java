package level3;

import java.util.Scanner;

public class Exer24 {
/*
    24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
        realizar:
        1 – Verificar se um dos números lidos é ou não múltiplo do outro
        2 – Verificar se os dois números lidos são pares
        3 – Verificar se a média dos dois números é maior ou igual a 7.
        4 – Sair
*/
    public static void exercicio24(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = input.nextInt();

        System.out.println("Que operação deseja realizar?:");
        System.out.println("1) – Verificar se um dos números lidos é ou não múltiplo do outro");
        System.out.println("2) – Verificar se os dois números lidos são pares");
        System.out.println("3) – Verificar se a média dos dois números é maior ou igual a 7.");
        System.out.println("4) – Sair");
        System.out.print(">>> ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                multiplos(num1, num2);
                break;
            case 2:
                pares(num1, num2);
                break;
            case 3:
                media(num1, num2);
                break;
        }
    }

    protected static void multiplos(int num1, int num2){
        int cont = 1;
        boolean eMultiplo = false;

        while(cont < num2){
            if(num1 * cont == num2){
                System.out.printf("%d é multiplo de %d!", num1, num2);
                eMultiplo = true;
            }
            cont += 1;
        }
        if(!eMultiplo){
            System.out.println("Não são multiplos!");
        }
    }

    protected static void pares(int num1, int num2){
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Ambos são par!");
        }
        else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Nem um é par");
        }
        else{
            System.out.println("Apenas um é par");
        }
    }

    protected static void media(int num1, int num2){

        int media = (num1 + num2) / 2;

        if(media > 7){
            System.out.println("A média é maior que 7");
        }else if(media == 7){
            System.out.println("A média é igual a 7");
        }else{
            System.out.println("A média é menor que 7");
        }
    }
}


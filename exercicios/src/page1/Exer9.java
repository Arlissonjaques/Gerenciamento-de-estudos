package page1;

import java.util.Scanner;

public class Exer9 {
/*
    9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
    pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/
    public static void exercicio9(){
        Scanner input = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = input.nextInt();
        System.out.print("Meses: ");
        int meses = input.nextInt();
        System.out.print("Dias: ");
        int dias = input.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.printf("Você possui um total de: %d dias!", totalDias);

    }
}

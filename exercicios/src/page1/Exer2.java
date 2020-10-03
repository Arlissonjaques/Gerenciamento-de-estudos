package page1;

import java.util.Scanner;

public class Exer2 {

/*
    2) Faça um programa que:
       - Leia a cotação do dólar
       - Leia um valor em dólares
       - Converta esse valor para Real
       - Mostre o resultado
*/

    public static void exercicio2(){

        Scanner input = new Scanner(System.in);

        System.out.print("Cotação atual do dolar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Valor em dolares: ");
        double dolar = input.nextDouble();

        double conversaoReal = cotacaoDolar * dolar;

        System.out.printf("%.2f Dolares são: ", dolar);
        System.out.printf("%.2f Reais", conversaoReal);
    }
}


package level1;

import java.util.Scanner;

public class Exer7 {
/*
    Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
    temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
    variável C é a temperatura em graus Celsius.

*/
    public static void exercicio7(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºF a ser convertida: ");
        int fahrenheit = input.nextInt();

        int celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%d fahrenheit são %d celsius", fahrenheit, celsius);

    }
}

package level1;

import java.util.Scanner;

public class Exer6 {
/*
    6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
    temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
    Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*/
    public static void exercicio6(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC a ser convertida: ");
        int celsius = input.nextInt();

        int fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("%d celsius são %d fahrenheit", celsius, fahrenheit);

    }
}

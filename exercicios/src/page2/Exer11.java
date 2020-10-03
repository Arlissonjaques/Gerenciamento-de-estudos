package page2;

import java.util.Scanner;

public class Exer11 {
/*
     11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
    possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
*/
    public static void exercicio11(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        double c = b;
        b = a;
        a = c;

        System.out.printf("A agora vale: %.1f\n", a);
        System.out.printf("B agora vale: %.1f", b);
    }
}

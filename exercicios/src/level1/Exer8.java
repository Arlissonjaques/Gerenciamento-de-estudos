package level1;

import java.util.Scanner;

public class Exer8 {

    public static void exercicio8() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = input.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = input.nextDouble();

        double volume = 3.141559 * raio * raio * altura;

        System.out.printf("O valor do volume é de: %.2f", volume);
    }
}


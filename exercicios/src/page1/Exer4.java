package page1;


import java.util.Scanner;


public class Exer4 {
/*
        4) Ler quatro valores numéricos inteiros e apresentar o
        resultado dois a dois da adição e multiplicação entre os
        valores lidos, baseando-se na utilização do conceito de
        propriedade distributiva. Dica: se forem lidas as variáveis
        A, B, C e D, devem ser somados e multiplicados os valores de
        A com B, A com C e A com D; depois B com C, B com D e por
        último C com D. Note que para cada operação serão utilizadas
        seis combinações. Assim sendo, devem ser realizadas doze
        operações de processamento, sendo seis para as adições e seis
        para as multiplicações.
*/
    public static void exercicio4(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        System.out.print("Digite o valor de D: ");
        int d = input.nextInt();

        System.out.println("*** Adição ***\n");

        System.out.printf("A + B = %d", (a + b));
        System.out.printf("\nA + C = %d", (a + c));
        System.out.printf("\nA + D = %d\n", (a + d));

        System.out.printf("\nB + C = %d", (b + c));
        System.out.printf("\nB + D = %d\n", (b + d));

        System.out.printf("\nC + D = %d\n\n", (c + d));

        System.out.println("*** Multiplicação ***\n");

        System.out.printf("\nA * B = %d", (a * b));
        System.out.printf("\nA * C = %d", (a * c));
        System.out.printf("\nA * D = %d\n", (a * d));

        System.out.printf("\nB * C = %d", (b * c));
        System.out.printf("\nB * D = %d\n", (b * d));

        System.out.printf("\nC * D = %d\n", (c * d));


    }
}

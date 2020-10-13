package level2;

import java.util.Scanner;

public class Exer20 {
/*
    20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
        variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
        multiplicado pelo maior e o maior valor dividido pelo menor.
*/
    public static void exercicio20(){
        Scanner input = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = input.nextInt();
        a = check(a);

        System.out.print("Valor de B: ");
        int b = input.nextInt();
        b = check(b);

        System.out.print("Valor de C: ");
        int c = input.nextInt();
        c = check(c);

        System.out.println("Menor multiplicado pelo Maior: " + bigger(a, b, c) * smaller(a, b, c));
        System.out.println("Maior subtraido pelo menor: " + bigger(a, b, c) / smaller(a, b, c));



    }

    protected static int check(int number){

        if(number < 0) {
            while (number < 0){
                Scanner input = new Scanner(System.in);

                System.out.println("Opção invalida!");
                System.out.print("Digite o valor novamente: ");
                number = input.nextInt();

                if (number > 0){
                    return number;
                }
            }
        }

        return number;
    }

    protected static int bigger(int a, int b, int c){

        if (a > b && a > c) {
            System.out.println("O maior é A");
            return a;
        }
        else if(b > a && b > c) {
            System.out.println("O maior é B");
            return b;
        }
        else {
            System.out.println("O maior é C");
            return c;
        }
    }

    protected static int smaller(int a, int b, int c){

        if (a < b && a < c) {
            System.out.println("O menor é A");
            return a;
        }
        else if(b < a && b < c) {
            System.out.println("O menor é B");
            return b;
        }
        else {
            System.out.println("O menor é C");
            return c;
        }
    }
}

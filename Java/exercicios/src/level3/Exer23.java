package level3;

import java.util.Scanner;

public class Exer23 {

    public static void exercicio23(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = input.nextInt();

        System.out.println("Que operação deseja realizar?:");

        System.out.println("1) - Adição");
        System.out.println("2) - Subtração");
        System.out.println("3) - Multiplicação");
        System.out.println("4) - Divisão");
        System.out.print(">>> ");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("%d + %d = %d", num1, num2, (num1+num2));
                break;
            case 2:
                System.out.printf("%d - %d = %d", num1, num2, (num1-num2));
                break;
            case 3:
                System.out.printf("%d * %d = %d", num1, num2, (num1*num2));
                break;
            case 4:
                System.out.printf("%d / %d = %d", num1, num2, (num1/num2));
                break;
        }
    }
}

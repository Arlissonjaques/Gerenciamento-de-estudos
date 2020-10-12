package level2;

import java.util.Scanner;

public class Exer15 {
/*
    15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
        aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
        do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
        apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
        apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
        aluno.
*/
    public static void exercicio15(){
        Scanner input = new Scanner(System.in);

        System.out.print("1° Nota: ");
        double first = input.nextDouble();
        System.out.print("2° Nota: ");
        double second = input.nextDouble();
        System.out.print("3° Nota: ");
        double third = input.nextDouble();
        System.out.print("4° Nota: ");
        double fourth = input.nextDouble();

        double average = (first + second + third + fourth) / 4;

        if (average >= 7){
            System.out.println("Parabéns! Você foi aprovado!!!");
        }else{
            System.out.println("Opa, você precisa fazer recuperação!");
            System.out.print("Nota da recuperação: ");
            double recovery = input.nextDouble();
            average = (average + recovery) / 2;

            if (average >= 7){
                System.out.println("Ufa, você foi aprovado na recuperação!!");
            }else{
                System.out.printf("Infelismente você foi reprovado sua média: %.1f", average);
            }
        }




    }
}

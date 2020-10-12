package level2;

import java.util.Scanner;

public class Exer19 {
/*
    19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
        lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
        eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
        contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
        ocorrência.
*/
    public static void exercicio19(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double c = input.nextDouble();

        if(checkSides(a, b, c)){
            if(a == b && b == c)
                System.out.println("Equilátero");
            else if(a == b || a == c || b == c)
                System.out.println("Isósceles");
            else
                System.out.println("Escaleno");
        }else{
            System.out.println("Esses valores não são de um triângulo!");
        }
    }

    protected static boolean checkSides(double a, double b, double c){

        if(a < b+c && b < a+c && c < a+b)
            return true;
        else
            return false;
    }
}

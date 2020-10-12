package level2;

import java.util.Scanner;

public class Exer22 {
/*
    22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
        resultado.
 */
    public static void exercicio22(){
        Scanner input = new Scanner(System.in);

        int a, b, value;

        System.out.print("Digite um valor: ");
        value = input.nextInt();

        if(value > 0){
            a = value;
            System.out.printf("%d é positivo, valor armazenado em A!\nValor de A: %d", value, a);
        }else{
            b = value;
            System.out.printf("%d é negativo, valor armazenado em B!\nValor de B: %d", value, b);
        }
    }
}

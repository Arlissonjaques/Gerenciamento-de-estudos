package entra.processamento.saida;

import java.util.Scanner;

public class Exer5 {

    public static void exercicio5(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo de duração da viagem: ");
        double tempo = input.nextDouble();
        System.out.print("Digite a velocidade média: ");
        double velocidade = input.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.printf("Velocidade média: %.2f Km/h\n", velocidade);
        System.out.printf("Tempo gasto: %.2fh\n", tempo);
        System.out.printf("Distancia percorrida: %.2f Km\n", distancia);
        System.out.printf("Quantidade de combustivel ultizado: %.2fL", litrosUsados);
    }
}

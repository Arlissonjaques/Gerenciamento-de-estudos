package page1;

import java.util.Scanner;

public class Exer5 {
/*
    5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
    12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
    Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
    Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
    fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
    tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*/
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

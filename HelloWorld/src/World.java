import java.util.Scanner;

class World{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String parOuImpar;

        System.out.println("Digite o numero desejado: ");
        int numero = input.nextInt();

        parOuImpar = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println(parOuImpar);

        input.close();
    }
}
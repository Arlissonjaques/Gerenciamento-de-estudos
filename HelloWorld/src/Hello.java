import java.util.Scanner;



public class Hello {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n\n\nSeja Bem-vindo!\n");
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua primeira nota: ");
        float primeiraNota = teclado.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float segundaNota = teclado.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;

        System.out.printf("%s sua nota é: %.1f\n", nome, media);

        teclado.close();

        if(media >= 7){
            System.out.println("Parabens! Você foi aprovado! :D");
        }
        if (media <= 4){
            System.out.println("Infelismente voce foi reprovado! :(");
        }
        else{
            System.out.println("Você tera que fazer recuperaçao! :/");
        }

    }
}

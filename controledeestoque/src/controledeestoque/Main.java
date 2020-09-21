package controledeestoque;
import produto.Produto;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        produto.nome = entrada.nextLine();

        System.out.print("Price: ");
        produto.preco = entrada.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantidade = entrada.nextInt();


        // System.out.printf("\nProduct data: %s, R$ %.2f, %d units, Total: R$ %.2f", produto.nome, produto.preco, produto.quantidade, (produto.quantidade * produto.preco));

        
        // System.out.print("\nEnter the number of products to be added in stock: ");
        // int novoValor = entrada.nextInt();
        // produto.adicionarProduto(novoValor);

        // System.out.print("\nEnter the number of products to be removed from stock: ");
        // int valorRemover = entrada.nextInt();
        // produto.removerProduto(valorRemover);

        entrada.close();
    }
}

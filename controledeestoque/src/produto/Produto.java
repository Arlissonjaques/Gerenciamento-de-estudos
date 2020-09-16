package produto;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;
    public double total = quantidade * preco;

    public void ValorTotalNoEstoque(){

    }

    public void adicionarProduto(int quantidade){
        
        int novaQuantidade = this.quantidade += quantidade;

        System.out.printf("Updated data: %s, R$ %.2f, %d units, Total: %.2f\n", nome, preco, novaQuantidade, (novaQuantidade * preco));
    }

    public void removerProduto(int quantidade){

        int QuantidadePraRemover = this.quantidade - quantidade;

        System.out.printf("Updated data: %s, R$ %.2f, %d units, Total: %.2f\n", nome, preco, QuantidadePraRemover, (QuantidadePraRemover * preco));
    }
}

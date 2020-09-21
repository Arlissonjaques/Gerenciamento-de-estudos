package produto;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;
    public double total = quantidade * preco;

    public void ValorTotalNoEstoque(){

    }

    public void adicionarProduto(int quantidade){
        
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){

        this.quantidade -= quantidade;
    }

    public String toString(){

        return nome;
    }
}

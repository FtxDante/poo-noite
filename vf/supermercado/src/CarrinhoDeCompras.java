import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> carrinho;
    private ArrayList<Integer> quantidade;
    private double valorTotal;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
        this.quantidade = new ArrayList<>();
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int qtd) {
        if(qtd <= 0) {
            throw new IllegalArgumentException("Quantidade inválida para o produto: " + produto.getNome());
        }
        produto.removerDaPrateleira(qtd);
        this.carrinho.add(produto);
        this.quantidade.add(qtd);
        this.valorTotal += qtd * produto.getPreco();
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        for (int i = 0; i < carrinho.size(); i++) {
            if(carrinho.get(i) == produto) {
                int qtd = quantidade.get(i);
                double preco = produto.getPreco();
                carrinho.remove(i);
                quantidade.remove(i);
                produto.devolverParaAPrateleira(qtd);
                valorTotal -= preco * qtd;
            }
        }
    }

    public void removerTodosOsProdutosDoCarrinho() {
        for (int i = 0; i < carrinho.size(); i++) {
            Produto produto = this.carrinho.get(i);
            int qtd = quantidade.get(i);
            double preco = produto.getPreco();
            carrinho.remove(i);
            quantidade.remove(i);
            produto.devolverParaAPrateleira(qtd);
            valorTotal -= preco * qtd;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }
}

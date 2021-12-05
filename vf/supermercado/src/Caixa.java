import java.util.ArrayList;

public class Caixa {
    private NotasFiscais notaFiscal;
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;


    public Caixa(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.notaFiscal = new NotasFiscais(cliente, carrinho.getCarrinho());
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public void recebeCarrinho() {
        double valorCarrinho = carrinho.getValorTotal();
        double valorCarteira = cliente.getTotalDinheiro();
        if(valorCarrinho > valorCarteira) {
            carrinho.removerTodosOsProdutosDoCarrinho();
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.cliente.pagar(valorCarrinho);
        this.cliente.adicionarNotaFiscal(this.notaFiscal);
        this.notaFiscal.imprimirNota();
    }


}

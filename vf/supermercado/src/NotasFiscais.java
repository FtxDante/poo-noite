import java.util.ArrayList;
import java.util.UUID;

public class NotasFiscais {
    private final ArrayList<Produto> listaDeProdutos;
    private final String CPF;
    private final String chaveNF;
    private double valorDeCompra;

    public NotasFiscais(Cliente cliente, ArrayList<Produto> produtos) {
        this.listaDeProdutos = produtos;
        this.CPF = cliente.getCpf();
        this.chaveNF = UUID.randomUUID().toString();
    }

    public void imprimirNota() {
        System.out.println("_________________________");
        System.out.println("CPF: " + this.CPF);
        System.out.println("Ordem: " + this.chaveNF);
        System.out.println("Pedido: ");
        double precoTotal = 0;
        for(Produto item : this.listaDeProdutos) {
            if(item != null) {
                System.out.println("Item: " + item.getNome());
                System.out.println("Preço: " + item.getPreco());
                precoTotal += item.getPreco();
            }
        }
        System.out.println("Preço Total: " + precoTotal);
        System.out.println("_________________________");
    }

    @Override
    public String toString() {
        return "chaveNF: " + chaveNF;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto Mingal = new Produto("Mingal","Nestlé",5, 1000,10);
        Produto Nescau = new Produto("Nescau", "Nestlé", 5, 99,2);
        Produto Bombom = new Produto("Bombom Garoto", "Nestle", 1, 100, 5);

        Cliente cliente1 = new Cliente("Dante", "9696969-69", 10);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Saldo: " + cliente1.getTotalDinheiro());
        System.out.println("Mingal qtd: " + Mingal.getQuantidadeDisponivel());
        System.out.println("Nescau qtd: " + Nescau.getQuantidadeDisponivel());

        carrinho.adicionarProdutoAoCarrinho(Mingal, 1);
        carrinho.adicionarProdutoAoCarrinho(Nescau, 1);

        Caixa caixa = new Caixa(cliente1, carrinho);
        try{
        caixa.recebeCarrinho();
        } catch (Exception e) {
            System.out.println("Exceção: "+ e.getMessage());
        }
        System.out.println("Mingal qtd: " + Mingal.getQuantidadeDisponivel());
        System.out.println("Nescau qtd: " + Nescau.getQuantidadeDisponivel());
        System.out.println("Saldo: " + cliente1.getTotalDinheiro());
        System.out.println("NotasFiscais do cliente "+ cliente1.getNome() + ": " + cliente1.getComprasFeitas());
    }
}

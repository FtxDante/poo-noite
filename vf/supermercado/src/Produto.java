import java.util.ArrayList;
import java.util.UUID;

public class Produto {
    private final String nome;
    private final String marca;
    private final String codigoDeBarras;
    private final Categorias categorias;
    private int quantidadeDisponivel;
    private double preco;
    private String categoriaProduto;

    public Produto(String nome, String marca,int index, int quantidadeDisponivel, double preco) {
        this.categorias = new Categorias();
        this.nome = nome;
        this.marca = marca;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.codigoDeBarras = UUID.randomUUID().toString();
        this.categoriaProduto = categorias.defineCategoria(index);
    }
    public void removerDaPrateleira(int quantidade) {
        if(quantidade > quantidadeDisponivel) {
            throw new Error("Não há estoque o suficiente para o item: " + this.nome);
        }
        this.quantidadeDisponivel -= quantidade;
    }

    public void devolverParaAPrateleira(Number quantidade) {
        this.quantidadeDisponivel += (int) quantidade;
    }

    @Override
    public String toString() {
        return "Produto (" + nome + ")";
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getCategoria() {
        return categoriaProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
}

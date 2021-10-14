public abstract class Imovel {
    private final String endereco;
    private double preco;
    Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void calculaPreco();
}

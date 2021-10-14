public class ImovelVelho extends Imovel {
    ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public void calculaPreco(){
        super.setPreco(super.getPreco() * 0.1 - super.getPreco());
    }

}

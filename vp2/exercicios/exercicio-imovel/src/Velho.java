public class Velho extends Imovel {
    Velho(String adress, Float price) {
        super(adress, price);
        this.setPrice(price);
    }

    @Override
    public void setPrice(Float price) {
        Float desconto = super.getPrice() * 0.2f;
        super.setPrice(price - desconto);
    }
}

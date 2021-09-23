public class Novo extends Imovel{
    Novo(String adress, Float price) {
        super(adress, price);
        this.setPrice(price);
    }

    @Override
    public void setPrice(Float price) {
        Float additional = super.getPrice() * 0.2f;
        super.setPrice(price + additional);
    }
}

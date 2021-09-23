public class Imovel {
    private final String adress;
    private Float price;

    Imovel(String adress, Float price){
        this.adress = adress;
        this.price = price;
    }

    public String getAdress() {
        return adress;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

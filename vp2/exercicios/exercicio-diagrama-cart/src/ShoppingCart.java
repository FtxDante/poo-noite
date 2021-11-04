import java.util.Arrays;

public class ShoppingCart {
    private Item items[];
    private Customer customerName;

    public ShoppingCart(){
        this.items = new Item[50];
    }

    public void addItem (Item ItemToAdd, int Quantity){
        items[items.length] = ItemToAdd;
    }

    public void removeItem (Item ItemToRemove){
        //
    }

    public double getTotal(){
        return 2;
    }

    public void setQuantity(Item item,int NewQuantity){
        //
    }

    public void purchase(){
        //
    }

}

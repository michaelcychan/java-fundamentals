package shoppinglist;

public class ShoppingItem {
    private String itemName;
    private Double itemPrice;

    public ShoppingItem(String name, Double price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    public String getName(){
        return this.itemName;
    }

    public Double getPrice(){
        return this.itemPrice;
    }
}

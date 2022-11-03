package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<ShoppingItem> list;

    public ShoppingList(){
        this.list = new ArrayList<ShoppingItem>(){};
    }

    public ArrayList<ShoppingItem> getItems() {
        return this.list;
    }


}

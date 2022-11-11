package checkout;

import java.util.Hashtable;
import java.util.Set;
import java.util.regex.*;

public class Shop {

    Hashtable<Character, Integer> priceList = new Hashtable<>();
    Hashtable<Character, Integer> discountCountList = new Hashtable<>();
    Hashtable<Character, Integer> discountAmountList = new Hashtable<>();

    Hashtable<Character, Integer> itemCount = new Hashtable<>();
    int totalPrice = 0;

    public int checkout(String cart){
        if (isInvalidInput(cart)) {
            return -1;
        } else {
            return calculatePrice(cart);
        }
    }

    private void countItems(String cart) {
        for (int i = 0; i < cart.length(); i++) {
            if (itemCount.get(cart.charAt(i)) == null) {
                itemCount.put(cart.charAt(i), 1);
            } else {
                itemCount.put(cart.charAt(i), itemCount.get(cart.charAt(i)) + 1);
            }
        }
    }

    private int calculatePrice(String cart){
        setPriceList();
        setDiscountList();
        countItems(cart);

        Set<Character> items = itemCount.keySet();
        for (Character item: items) {
            totalPrice += priceList.get(item) * itemCount.get(item);
            if (discountCountList.get(item) != null) {
                totalPrice += Math.floorDiv(itemCount.get(item), discountCountList.get(item) ) * discountAmountList.get(item);
            }
        }
        return totalPrice;
    }

    private void setPriceList(){
        priceList.put('A', 50);
        priceList.put('B', 30);
        priceList.put('C', 20);
        priceList.put('D', 15);
    }

    private boolean isInvalidInput(String cart){
        Pattern pattern = Pattern.compile("[^A-Z]+");
        Matcher matcher = pattern.matcher(cart);
        return matcher.find();
    }

    private void setDiscountList() {
        discountCountList.put('A', 3);
        discountAmountList.put('A', -20);
    }
}

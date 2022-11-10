package checkout;

import java.util.Hashtable;
import java.util.regex.*;

public class Shop {

    static Hashtable<Character, Integer> priceList = new Hashtable<Character, Integer>();
    public static int checkout(String cart){
        if (isInvalidInput(cart)) {
            return -1;
        } else {
            return calculatePrice(cart);
        }
    }

    private static int calculatePrice(String cart){
        setPriceList();
        int totalPrice = 0;
        for (int i = 0; i < cart.length(); i++) {
            if (priceList.get(cart.charAt(i)) != null) {
                totalPrice += priceList.get(cart.charAt(i));
            }
        }
        return totalPrice;
    }

    private static void setPriceList(){
        priceList.put('A', 50);
        priceList.put('B', 30);
        priceList.put('C', 20);
        priceList.put('D', 15);
    }

    private static boolean isInvalidInput(String cart){
        Pattern pattern = Pattern.compile("[^A-Z]+");
        Matcher matcher = pattern.matcher(cart);
        return matcher.find();
    }

    private static int getDiscount(String cart) {

        return 0;
    }
}

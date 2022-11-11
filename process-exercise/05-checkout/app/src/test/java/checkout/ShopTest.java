package checkout;

import org.junit.Test;
import static org.junit.Assert.*;
public class ShopTest {
    @Test
    public void testCheckoutWrongCapitalInput(){
        int expected = -1;
        Shop shop = new Shop();
        int actual = shop.checkout("aBc");
        assertEquals("This input with capitalisation is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutWrongCharInput(){
        int expected = -1;
        Shop shop = new Shop();
        int actual = shop.checkout("-B8x");
        assertEquals("This input is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutNumericInput(){
        int expected = -1;
        Shop shop = new Shop();
        int actual = shop.checkout("18");
        assertEquals("This numeric input is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutBasicCorrectInputOneA(){
        int expected = 50;
        Shop shop = new Shop();
        int actual = shop.checkout("A");
        assertEquals("One A costs 50", expected, actual);
    }

    @Test
    public void testCheckoutBasicCorrectInputTwoAs(){
        int expected = 100;
        Shop shop = new Shop();
        int actual = shop.checkout("AA");
        assertEquals("Two A's cost 100", expected, actual);
    }

    @Test
    public void testCheckoutOneItemEachType(){
        int expected = 115;
        Shop shop = new Shop();
        int actual = shop.checkout("ABCD");
        assertEquals("ABCD cost 115", expected, actual);
    }
    @Test
    public void testCheckoutOneThreeAWithDiscount(){
        int expected = 130;
        Shop shop = new Shop();
        int actual = shop.checkout("AAA");
        assertEquals("Three As cost 130 with discount", expected, actual);
    }

}

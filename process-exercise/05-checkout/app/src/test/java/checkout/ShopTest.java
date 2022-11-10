package checkout;

import org.junit.Test;
import static org.junit.Assert.*;
public class ShopTest {
    @Test
    public void testCheckoutWrongCapitalInput(){
        int expected = -1;
        int actual = Shop.checkout("aBc");
        assertEquals("This input with capitalisation is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutWrongCharInput(){
        int expected = -1;
        int actual = Shop.checkout("-B8x");
        assertEquals("This input is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutNumericInput(){
        int expected = -1;
        int actual = Shop.checkout("18");
        assertEquals("This numeric input is invalid and should return -1", expected, actual);
    }

    @Test
    public void testCheckoutBasicCorrectInputOneA(){
        int expected = 50;
        int actual = Shop.checkout("A");
        assertEquals("One A costs 50", expected, actual);
    }

    @Test
    public void testCheckoutBasicCorrectInputTwoAs(){
        int expected = 100;
        int actual = Shop.checkout("AA");
        assertEquals("Two A's cost 50", expected, actual);
    }
}

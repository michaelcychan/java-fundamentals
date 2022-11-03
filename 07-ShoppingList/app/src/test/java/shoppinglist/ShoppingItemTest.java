package shoppinglist;


import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingItemTest {
    @Test public void testItemInitiation(){
        ShoppingItem item = new ShoppingItem("Monkey Nut", 1.99);
        assertEquals("The item should  return its name", "Monkey Nut", item.getName());
        assertEquals("The item should return its price", Double.valueOf(1.99), item.getPrice());
    }
}

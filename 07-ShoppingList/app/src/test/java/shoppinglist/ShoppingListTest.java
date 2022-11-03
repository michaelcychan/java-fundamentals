package shoppinglist;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class ShoppingListTest {
    @Test public void testInitialisingState() {
        ShoppingList list = new ShoppingList();

        ShoppingItem mockedItem = mock(ShoppingItem.class);

        ArrayList<ShoppingItem> expected = new ArrayList<>(){};
        assertEquals("New List instance has an empty item list", expected, list.getItems());
    }
}
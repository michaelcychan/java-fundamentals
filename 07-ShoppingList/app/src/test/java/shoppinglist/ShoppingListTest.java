package shoppinglist;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingListTest {
    @Test public void testInitialisingState() {
        ShoppingList list = new ShoppingList();
        ArrayList<ShoppingItem> expected = new ArrayList<>(){};
        assertEquals("New List instance has an empty item list", expected, list.getItems());
    }
    @Test public void testAddOneItem() {
        ShoppingList list = new ShoppingList();
        ShoppingItem mockedItem = mock(ShoppingItem.class);
        ArrayList<ShoppingItem> expected = new ArrayList<>(Arrays.asList(mockedItem));

        list.addItem(mockedItem);
        assertEquals("List has one added item after addItem()", expected, list.getItems());
    }

    @Test public void testAddMultipleItems() {
        ShoppingList list = new ShoppingList();
        ShoppingItem mockedItem = mock(ShoppingItem.class);
        ShoppingItem mockedItem2 = mock(ShoppingItem.class);
        ShoppingItem mockedItem3 = mock(ShoppingItem.class);
        ArrayList<ShoppingItem> expected = new ArrayList<>(Arrays.asList(mockedItem, mockedItem2, mockedItem3));

        list.addItem(mockedItem);
        list.addItem(mockedItem2);
        list.addItem(mockedItem3);
        assertEquals("List has one added item after addItem()", expected, list.getItems());
    }
}
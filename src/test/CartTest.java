package test;

import main.models.Cart;
import main.models.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CartTest {

    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }


    @Test
    public void itemAddedTest() {
        Assertions.assertTrue(cart.contains(new Item("Pepsi", 1.99)));
    }

    @Test
    public void skipsDuplicate() {
        Assertions.assertFalse(cart.add(new Item("Pepsi", 1.99)));
    }

    @Test
    public void removedItemTest() {
        cart.remove("Pepsi");
        Assertions.assertFalse(cart.contains(new Item("Pepsi", 1.99)));
    }

    @Test
    public void subtotalIsValid() {

        Assertions.assertEquals(3.98, cart.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        Assertions.assertEquals(0.52, cart.getTax(3.98));
    }

    @Test
    public void totalIsValid() {
        Assertions.assertEquals(4.50, cart.getTotal(3.98, cart.getTax(3.98)));
    }

    @Test(expected = IllegalStateException.class)
    public void invalidRemoveState() {
        cart.clear();
        cart.remove("Pepsi");
    }

    @Test(expected = IllegalStateException.class)
    public void invalidCheckoutState() {
        cart.clear();
        cart.checkout();
    }






}

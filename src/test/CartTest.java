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




}

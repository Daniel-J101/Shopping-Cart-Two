package main;

import main.models.Cart;
import main.models.Item;

public class Main {
    public static void main(String[] args) {

        Cart cart;
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));

        cart.remove("Pepsi");
        cart.remove("Crush");
        cart.remove("Pepsi");
    }
}

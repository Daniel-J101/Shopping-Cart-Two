package main.models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero");
        }

        this.name = name;
        this.price = price;
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero");
        }
        this.price = price;
    }

    public String toString() {
        return name + ": $" + price + "   ";
    }

    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Item))
            return false;
        Item item = (Item) obj;

        return name.equals(item.name) && price == item.price;
    }

}
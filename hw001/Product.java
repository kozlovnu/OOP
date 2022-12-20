package Homework.hw001;

public class Product {
    private String name;
    private String volume;
    private int price;

    public Product(String name, String volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public Product(String string, Object object, Object object2, Object object3) {
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", volume=" + volume + ", price=" + price + "]";
    }

}

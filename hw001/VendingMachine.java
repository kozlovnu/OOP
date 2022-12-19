package Homework.hw001;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void getProduct(){
        
    }

    public Product findProduct (String name, String volume, int temperature) {
        for (Product product : products) {
            if (!(product instanceof HotDrinksProduct))
                continue;

            HotDrinksProduct hotDrink = (HotDrinksProduct) product;

            if (product.getName ().equals (name) && hotDrink.getTemperature () == temperature)
                return product;
        }
        throw new IllegalStateException("Товар не найден!");
        // return null;
    }
}

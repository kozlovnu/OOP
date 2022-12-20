package Homework.hw001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewVendingMachine extends VendingMachine {

    private List<Product> products = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public NewVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product findProduct(String name, String volume, int temperature) {
        for (Product product : products) {
            if (!(product instanceof HotDrinksProduct))
                continue;

            HotDrinksProduct hotDrink = (HotDrinksProduct) product;

            if (product.getName().equals(name) && product.getVolume().equals(volume)
                    && hotDrink.getTemperature() == temperature)
                return product;
        }
        throw new IllegalStateException("Product isn't found!");
    }

    @Override
    public void getProduct(Product product) {
        System.out.printf("Deposit %d rub\n", product.getPrice());
        float deposit = 0f;
        int x = 1;
        while (x == 1) {
            int cash = scanner.nextInt();
            deposit += cash;
            if (deposit < product.getPrice()) {
                System.out.printf("You need to deposit %f\n", product.getPrice() - deposit);

            } else if (deposit > product.getPrice()) {
                System.out.printf("Your change %f\n", deposit - product.getPrice());
                System.out.println("Take your product.");
                
                x = 0;
            } else {
                System.out.println("Take your product. Thank you");
                
                x = 0;
            }
        }

        System.out.println("Thank you for shopping with us");
    }

}

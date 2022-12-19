package Homework.hw001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewVendingMachine extends VendingMachine {

    private List <Product> products = new ArrayList<>();

    public NewVendingMachine(List<Product> products) {
        this.products = products;
    }

    Scanner scanner = new Scanner(System.in);
    
    public float enterTemperature(){
        System.out.println("Enter the temperature");
        float temperature = scanner.nextFloat();
        return temperature;
    }
    @Override
    public void addProduct(Product product) {
        
        List <HotDrinksProduct> productList = new ArrayList<HotDrinksProduct>();
        productList.add(new HotDrinksProduct(scanner.nextLine(), scanner.nextFloat(), scanner.nextFloat()));
    }

    @Override
    public List<Product> showProduct(float temperature) {
        System.out.println("Chosen product is: " + products.contains(temperature));
        return products;
    }

    @Override
    public void buyProduct(Product product) {
        // TODO Auto-generated method stub
        
    }

    
}

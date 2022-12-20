package Homework.hw001;

import java.util.List;

public abstract class VendingMachine {
    
    public abstract Product findProduct (String name, String volume, int temperature);

    public abstract void getProduct(Product products);
}


package Homework.hw001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new NewVendingMachine (Arrays.asList (
            new Product ("закуска", null, null, null),
            new HotDrinksProduct ("cola", "0.5", 99, 15 ),
            new HotDrinksProduct ("cola", "1", 159, 15),
            new HotDrinksProduct ("americano", "0.2", 99, 90),
            new HotDrinksProduct ("capuccino", "0.2", 129, 90)
        ));

        // System.out.println (machine.findProduct ("cola", "0.5",15));
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter name of product");
        String name = scaner.nextLine();
        System.out.println("Enter volume of product");
        String volume = scaner.nextLine();
        System.out.println("Enter temperature of product");
        int temperature = scaner.nextInt();

        Product product = machine.findProduct(name, volume, temperature);
        machine.getProduct(product);
    }
}

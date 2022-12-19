package Homework.hw001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine (Arrays.asList (
            new Product ("закуска", null),
            new HotDrinksProduct ("кола", "0.5", 15),
            new HotDrinksProduct ("вода", "1", 15),
            new HotDrinksProduct ("чай", "0.2", 90)
        ));

        System.out.println (machine.findProduct ("кола", "0.5",15));
    }
}

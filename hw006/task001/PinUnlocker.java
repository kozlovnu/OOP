package Homework.hw006.task001;

import java.util.Scanner;

public class PinUnlocker implements Unlocker {
    private int pin;

    @Override
    public void unlock() {

        if (pin == 0) {
            System.out.println("Set pin!");
        } else {

            while (true) {
                System.out.println("Enter pin to unlock");
                if (readPin() == pin) {
                    System.out.println("Phone unlocked!");
                    break;
                }
            }
        }
    }

    public void setPin() {
        System.out.println("Enter numbers to set pin");
        this.pin = readPin();
    }

    private int readPin() {
        int pin;
        Scanner scanner = new Scanner(System.in);
        pin = scanner.nextInt();

        return pin;
    }

}

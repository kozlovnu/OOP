package Homework.hw006.task001;

import java.util.Scanner;

public class FingerprintUnlocker implements Unlocker {
    private String fingerprint;

    @Override
    public void unlock() {

        while (true) {
            System.out.println("Put your finger to unlock");

            if (readFinger().equals(fingerprint)) {
                System.out.println("Phone unlocked!");
                break;
            }
        }

    }

    public void setFingerprint() {
        System.out.println("Put your finger to set fingerID");
        this.fingerprint = readFinger();

    }

    private String readFinger() {
        String finger;
        Scanner scanner = new Scanner(System.in);
        finger = scanner.nextLine();

        return finger;
    }

}

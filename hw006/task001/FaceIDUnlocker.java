package Homework.hw006.task001;

import java.util.Scanner;

public class FaceIDUnlocker implements Unlocker {

    private String faceID;

    @Override
    public void unlock() {

        if (faceID == null) {
            System.out.println("Set faceID!");
        } else {

            while (true) {
                System.out.println("Show your face to unlock");
                if (readFace().equals(this.faceID)) {
                    System.out.println("Phone unlocked!");
                    break;
                }
            }
        }
    }

    private String readFace() {
        String face;
        Scanner scanner = new Scanner(System.in);
        face = scanner.nextLine();

        return face;
    }

    public void setFaceID() {
        System.out.println("Show your face to set faceID");
        this.faceID = readFace();

    }

    public String getFaceID() {
        return faceID;
    }

}

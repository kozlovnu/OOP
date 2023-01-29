package Homework.hw006.task001;

public class Main {
    public static void main(String[] args) {
        // unlock with faceID
        FaceIDUnlocker faceID = new FaceIDUnlocker();
        faceID.setFaceID();
        System.out.println("Saved faceID: " + faceID.getFaceID());
        //  faceID.getFaceID();
        
        faceID.unlock();

        // unlock with fingerprint
        FingerprintUnlocker fingerprint = new FingerprintUnlocker();
        fingerprint.setFingerprint();
        fingerprint.unlock();

        // unlock whithout password
        NoPassUnlocker unlocker = new NoPassUnlocker();
        unlocker.unlock();

        // unlock with pin

        PinUnlocker pin = new PinUnlocker();
        pin.setPin();
        pin.unlock();

    }
}

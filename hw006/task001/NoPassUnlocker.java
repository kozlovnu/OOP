package Homework.hw006.task001;

public class NoPassUnlocker implements Unlocker {


    @Override
    public void unlock() {
        System.out.println("Unlocked whithout password");        
    }
    
}

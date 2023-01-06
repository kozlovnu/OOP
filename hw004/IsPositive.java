package Homework.hw004;

public class IsPositive implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item > 0;
    }
    
}

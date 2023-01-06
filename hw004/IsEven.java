package Homework.hw004;

public class IsEven<T> implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
    
}

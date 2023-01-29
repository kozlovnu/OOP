package Homework.hw006.task002;

import java.util.ArrayList;
import java.util.List;

public class MutableList <T> extends AbstractList<T> {

    private List<T> list;

    

    public MutableList() {
        this.list = new ArrayList<>();
    }

    public void set (int i, T newValue){
        list.set(i, newValue);
    }

    public void add (T newValue){
        list.add(newValue);
    }

    public void remove (T value){
        list.remove(value);
    }

    @Override
    public T get(int i) {
        
        return list.get(i);
    }

    @Override
    public Integer getSize() {
        return list.size();
    }

    @Override
    public void printList() {
        System.out.println(list.toString());        
    }
    
    
}

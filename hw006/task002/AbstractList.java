package Homework.hw006.task002;

import java.util.List;

public abstract class AbstractList <T> {
    private List<T> list;
    
    public abstract Integer getSize();
    public abstract T get (int i);
    public abstract void printList();
    
}

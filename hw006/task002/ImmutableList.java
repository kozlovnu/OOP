package Homework.hw006.task002;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList extends AbstractList<Integer> {

    private List<Integer> list = new ArrayList<>();
    
    ImmutableList() {
        this.list.add(3);
        this.list.add(14);
        this.list.add(99);
        this.list.add(76);
    }

    // private List<Integer> setList(){
    //     list.add(3);
    //     list.add(4);
    //     list.add(12);
    //     list.add(88);

    //     return list;
    // }

    @Override
    public Integer getSize() {
        return list.size();
    }

    @Override
    public Integer get(int i) {
        return list.get(i);
    }

    @Override
    public void printList() {
        System.out.println(list.toString());        
    }
    


}

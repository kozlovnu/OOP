package Homework.hw006.task002;

public class Main {
    public static void main(String[] args) {
        ImmutableList list = new ImmutableList();
        System.out.println(list.get(0));
        System.out.println(list.getSize());
        list.printList();

        MutableList<Integer> mutableList = new MutableList<>();
        mutableList.add(15);
        mutableList.add(73);
        mutableList.add(123);
        mutableList.add(98);
        mutableList.add(129);
        mutableList.set(0, 999);

        mutableList.printList();
        System.out.println(mutableList.get(1));
        System.out.println(mutableList.getSize());
        mutableList.remove(98);
        mutableList.printList();
        
    }
}

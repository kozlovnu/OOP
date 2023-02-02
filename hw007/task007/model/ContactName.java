package Homework.hw007.task007.model;

public class ContactName {
    private String name;
    private int id;
    public ContactName(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "name= " + name + ", id=" + id;
    }
    
}

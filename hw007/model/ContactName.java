package Homework.hw007.model;

public class ContactName {
    protected int id;
    protected String name = null;
    public ContactName(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "ContactName [id=" + id + ", name=" + name + "]";
    }

            


}

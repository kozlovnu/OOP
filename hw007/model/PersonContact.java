package Homework.hw007.model;

public class PersonContact extends ContactName {

    private String lastName = null;

    public PersonContact(int id, String name, String lastName) {
        super(id, name);
        this.lastName = lastName;
    }
    
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "[id = " + id + ", name = " + name + ", last name = " + lastName + "]";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

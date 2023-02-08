package Homework.hw007.task007.model.user;

public class PersonContactName extends ContactName {
    private String lastName;

    public PersonContactName(String name, int id, String lastName) {
        super(name, id);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name= " + super.getName() + ", lastname= " + lastName + ", id= " + super.getId();
    }
    
    
}

package Homework.hw007.task007.model.user;

public class OrganizationContactName extends ContactName {

    private String taxpayerId;

    public OrganizationContactName(int id, String name, String taxpayerId) {
        super(name, id);
        this.taxpayerId = taxpayerId;
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
        return "name= " + super.getName() + ", taxpayer id= " + taxpayerId + ", id= " + super.getId();
    }

}

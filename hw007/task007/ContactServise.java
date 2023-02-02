package Homework.hw007.task007;

import Homework.hw007.task007.model.ContactName;

public class ContactServise {
    private ContactName name;
    private ContactType phone;

    public ContactServise(ContactName name, ContactType phone) {
        this.name = name;
        this.phone = phone;
    }

    public ContactName getName() {
        return name;
    }

    public ContactType getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name.toString() + " ," + phone.toString();
    }

    public void setName(ContactName name) {
        this.name = name;
    }

    public void setPhone(ContactType phone) {
        this.phone = phone;
    }

}

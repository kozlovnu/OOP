package Homework.hw007.model.contacts;

import java.util.Map;

public class EmailContactType extends ContactType<String> {

    @Override
    public Map<String, String> getContact() {
        return super.getContact();
    }

    @Override
    public String getContactType() {
        return super.getContactType();
    }

    public String setEmail(String name, String domen){
        String email = name + "@" + domen;
        return email;
    }

    @Override
    public Map<String, String> setContact(String contactType, String details) {
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

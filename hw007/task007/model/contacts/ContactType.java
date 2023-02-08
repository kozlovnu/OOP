package Homework.hw007.task007.model.contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactType <T> {
    private String contactType;
    private Map<String, T> contact;

    public ContactType() {
        this.contact = new HashMap<>();
    }

    public String getContactType() {
        return contactType;
    }

    public Map<String, T> setContact(String contactType, T details) {

        contact.put(contactType, details);
        return contact;
    }

    public Map<String, T> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return contact.entrySet().toString();
    }

}

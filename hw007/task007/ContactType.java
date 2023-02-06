package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactType {
    private String contactType;
    private Map<String, List<String>> contact;

    public ContactType() {
        this.contact = new HashMap<>();
    }

    public String getContactType() {
        return contactType;
    }

    public Map<String, List<String>> setContact(String contactType, String details) {
        if (!contact.containsKey(contactType)) {
            contact.put(contactType, new ArrayList<>());
        }
        contact.get(contactType).add(details);
        return contact;
    }

    public List<String> getDetailsList() {
        return contact.get(contactType);
    }

    public Map<String, List<String>> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return contact.entrySet().toString();
    }

}

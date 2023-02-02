package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactType {
    private String contactType = "phone";
    private List<String> detailsList;
    private Map<String, List<String>> contact;

    public ContactType() {
        this.detailsList = new ArrayList<>();
        this.contact = new HashMap<>();
    }

    public String getContactType() {
        return contactType;
    }

    public Map<String, List<String>> setContact(String details){
        detailsList.add(details);
        contact.put(this.contactType, this.detailsList);
        return contact;
    }


    public List<String> getDetailsList() {
        return detailsList;
    }

    public Map<String, List<String>> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return contactType + "= " + contact.get(contactType) + "]";
    }

    

}

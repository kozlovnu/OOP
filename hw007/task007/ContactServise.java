package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Homework.hw007.task007.model.contacts.ContactType;
import Homework.hw007.task007.model.user.ContactName;

public class ContactServise {
    private ContactName name;
    private ContactType contactType;
    private Map<String, String> contact;
    private Map<ContactName, Map<String, String>> map;

    public ContactServise() {
        this.map = new HashMap<>();
        this.contact = new HashMap<>();
    }

    @Override
    public String toString() {
        return name.toString() + " ," + contact.toString();
    }

    public Map<ContactName, Map<String, String>> addContact(ContactName contactName,
            ContactType contactType /* String contactType, String contactDetails */) {
        // contact = contactType;
        if (!map.containsKey(contactName)) {
            map.put(contactName, new HashMap<>());
        }
        if (!map.get(contactName).containsKey(contactType.getContactType())) {
            map.get(contactName).put(contactType.getContactType(), new ArrayList<>());
        }
        map.get(contactName).put(contactType.getContactType(), contactType.getDetailsList());
        return map;

    }

    public void setName(ContactName name) {
        this.name = name;
    }

    public Map<String, List<String>> setContact(ContactType contactType) {
        contact.put(contactType.getContactType(), contactType.getDetailsList());
        return contact;
    }

    public int getContactSize() {
        return map.size();
    }

    public int getcontactListSize(){
        return contact.size();
    }

    // перенести в viewer
    public void showContact() {
        // Map<ContactName, Map<String, List<String>>> log =
        // contactType.getContact();
        for (ContactName contactName : map.keySet()) {
            System.out.println(contactName + ":");
            // Map<String, List<String>> contacts = map.get(contactName);
            // for (String contactType : contacts.keySet()) {
            //     System.out.println(contacts.get(contactType).toString());
            // }
            // System.out.println();
        }
    }

    public void showContactDetails(ContactName name){
        
       System.out.println(map.get(name).values().toString());
    }

    public void printContactList(){
        for (String contactType : contact.keySet()){
            System.out.println(contactType + ": " + contact.get(contactType));
        }
    }

}

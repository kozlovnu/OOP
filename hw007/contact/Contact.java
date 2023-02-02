package Homework.hw007.contact;

import java.util.HashMap;
import java.util.Map;

import Homework.hw007.model.ContactName;

public class Contact {

    Map<ContactName, Map<String, String>> contactMethod;

    public Contact() {
        this.contactMethod = new HashMap<>();
    }

    public Map<ContactName, Map<String, String>> addContact(ContactName contactName, String contactType,
            String details) {
        
        if (!contactMethod.containsKey(contactName)) {
            contactMethod.put(contactName, new HashMap<>());
        }
        if (!contactMethod.get(contactName).containsKey(contactType)){
            contactMethod.get(contactName).put(contactType, details);
        }
        
        // contactMethod.get(contactName).get(contactType).put(details);
        return contactMethod;
    }

    public Map<ContactName, Map<String, String>> getContactMethod() {
        return contactMethod;
    }

    public void printContact(){
        
        for (ContactName name : contactMethod.keySet()){
            System.out.println(name + ":");
            Map<String, String> contacts = contactMethod.get(name);
            for (String contactType : contacts.keySet()){
                System.out.println("\s" + contactType + ": " + contacts.get(contactType));
            }
            System.out.println();
        }
    }

}

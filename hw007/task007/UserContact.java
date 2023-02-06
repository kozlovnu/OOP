package Homework.hw007.task007;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Homework.hw007.task007.model.ContactName;

public class UserContact {

    private Map<ContactName, Map<String, List<String>>> userContacts;

    public UserContact() {

        userContacts = new HashMap<>();
    }

    public Map<ContactName, Map<String, List<String>>> addUserContact(ContactName contactName, ContactType contact) {
        if (!userContacts.containsKey(contactName)) {
            userContacts.put(contactName, new HashMap<>());
        }
        Map<String, List<String>> contacts = contact.getContact();
        for (String contactType : contacts.keySet()) {
            userContacts.get(contactName).put(contactType, contacts.get(contactType));
        }
        return userContacts;
    }

    public Map<ContactName, Map<String, List<String>>> getUserContacts() {
        return userContacts;
    }

    // перенести во viewer
    public void printUserContacts() {
        for (ContactName contactName : userContacts.keySet()) {
            System.out.println(contactName + ":");
            Map<String, List<String>> contacts = userContacts.get(contactName);
            for (String contactType : contacts.keySet()) {
                System.out.println(contactType + ": " + contacts.get(contactType).toString());
            }
            System.out.println();
        }
    }

}

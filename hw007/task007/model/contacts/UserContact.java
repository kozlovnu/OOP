package Homework.hw007.task007.model.contacts;

import java.util.HashMap;
import java.util.Map;

import Homework.hw007.task007.model.user.ContactName;

public class UserContact <T> {

    private Map<ContactName, Map<String, T>> userContacts;

    public UserContact() {

        userContacts = new HashMap<>();
    }

    public Map<ContactName, Map<String, T>> addUserContact(ContactName contactName, ContactType<T> contact) {
        if (!userContacts.containsKey(contactName)) {
            userContacts.put(contactName, new HashMap<>());
        }
        Map<String, T> contacts = contact.getContact();
        for (String contactType : contacts.keySet()) {
            userContacts.get(contactName).put(contactType, contacts.get(contactType));
        }
        return userContacts;
    }

    public Map<ContactName, Map<String, T>> getUserContacts() {
        return userContacts;
    }

    // перенести во viewer
    public void printUserContacts() {
        for (ContactName contactName : userContacts.keySet()) {
            System.out.println(contactName + ":");
            Map<String, T> contacts = userContacts.get(contactName);
            for (String contactType : contacts.keySet()) {
                System.out.println(contactType + ": " + contacts.get(contactType).toString());
            }
            System.out.println();
        }
    }

}

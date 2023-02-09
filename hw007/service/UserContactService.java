package Homework.hw007.service;

import java.util.HashMap;
import java.util.Map;

import Homework.hw007.model.contacts.ContactType;
import Homework.hw007.model.user.ContactName;

public class UserContactService<T> {

    private Map<ContactName, Map<String, T>> userContacts;

    public UserContactService() {

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

    public Map<ContactName, Map<String, T>> deleteUserContact(ContactName name) {
        userContacts.remove(name);
        return userContacts;
    }

}

package Homework.hw007.task007.view;

import java.util.Map;

import Homework.hw007.task007.model.contacts.UserContact;
import Homework.hw007.task007.model.user.ContactName;

public class ContactsView {
    ContactName name;

    public void printContactsNames(UserContact<String> contact){
        for (ContactName contactName : contact.getUserContacts().keySet()){
            System.out.println(contactName);
        }
    }

    public void printChosenContact(ContactName name, UserContact<String> contact){
        // if (contact.getUserContacts().containsValue(contact))
        // contact.getUserContacts().get(name);
        for (ContactName contactName : contact.getUserContacts().keySet()) {
        
            Map<String, String> contacts = contact.getUserContacts().get(contactName);
            if (contactName == name){
                System.out.println(name + ":");
            for (String contactType : contacts.keySet()) {
                System.out.println(contactType + ": " + contacts.get(contactType).toString());
            }
            System.out.println();
        }
        }
        // System.out.println(contact.getUserContacts().get(name));
    }

    public void printAllContacts(UserContact<String> contact) {
        for (ContactName contactName : contact.getUserContacts().keySet()) {
            System.out.println(contactName + ":");
            Map<String, String> contacts = contact.getUserContacts().get(contactName);
            for (String contactType : contacts.keySet()) {
                System.out.println(contactType + ": " + contacts.get(contactType).toString());
            }
            System.out.println();
        }
    }
}

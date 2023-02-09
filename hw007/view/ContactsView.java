package Homework.hw007.view;

import java.util.Map;

import Homework.hw007.model.user.ContactName;
import Homework.hw007.service.UserContactService;

public class ContactsView {
    ContactName name;

    public void printContactsNames(UserContactService<String> contact){
        for (ContactName contactName : contact.getUserContacts().keySet()){
            System.out.println(contactName);
        }
    }

    public void printChosenContact(ContactName name, UserContactService<String> contact){

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
    }

    public void printOneContact(String finder, UserContactService<String> contact){
        for (ContactName contactName : contact.getUserContacts().keySet()){
            if (contactName.getName().equals(finder)){
                System.out.println(contactName + ":");
                Map<String, String> contacts = contact.getUserContacts().get(contactName);
                for (String contactType : contacts.keySet()){
                    System.out.println(contactType + ": " + contacts.get(contactType).toString());
                }
            }
        }
    }

    public void printAllContacts(UserContactService<String> contact) {
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

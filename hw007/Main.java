package Homework.hw007;

import Homework.hw007.contact.AdressContact;
import Homework.hw007.contact.Contact;
import Homework.hw007.contact.ContactList;
import Homework.hw007.model.ContactName;
import Homework.hw007.model.PersonContact;
import Homework.hw007.task007.ContactType;

public class Main {
    public static void main(String[] args) {
        ContactName person = new PersonContact(1, "Nikita", "Kozlov");

        Contact personContact = new Contact();
        personContact.addContact(person, "adress", "Spb, Prosvescheniya st., 99");
        personContact.addContact(person, "adress1", "Spb, Khudozhnikov st., 27");

        ContactType contactType = new ContactType();
        contactType.setContact("89112221133");
        contactType.setContact("89219991177");
        System.out.println(contactType.toString());
        
        // Fill contacts for person
        // personContact.setAdress(new AdressContact("adress"));
        // personContact.fillList();

        // System.out.println(person.toString());
        personContact.printContact();
    }
}

package Homework.hw007.task007;

import Homework.hw007.task007.model.PersonContactName;

public class Main {
 public static void main(String[] args) {
    PersonContactName name = new PersonContactName("Nikita", 1, "Kozlov");
    PersonContactName name2 = new PersonContactName("Kirill", 2, "Petrov");
   //  ContactServise contact = new ContactServise(phone);
   //  contact.setName(name);
    ContactType phone = new ContactType();
    phone.setContact("home phone","12345");
    phone.setContact("mobile phone","89119991122");

    ContactServise contact = new ContactServise();
    contact.setName(name);

   //  contact.addContact(name, phone);

   ContactType adress = new AdressContacType();
   adress.setContact("home adress","Spb");
   adress.setContact("job adress","Moscow");
   
   contact.addContact(name, phone);
   contact.addContact(name, adress);
   contact.addContact(name2, adress);
   
   contact.setContact(adress);
   contact.setContact(phone);

  UserContact userContact = new UserContact(name);
  userContact.addUserContact(adress);
  userContact.addUserContact(phone);

  UserContact userContact2 = new UserContact(name2);
  userContact2.addUserContact(adress);
  userContact2.addUserContact(phone);

  // System.out.println(phone.getContactType());
  // System.out.println(phone.getDetailsList().toArray().toString());

  userContact.printUserContacts();
  userContact2.printUserContacts();

  adress.setContact("home adress", "NY");

  userContact.printUserContacts();
  userContact2.printUserContacts();

  //  System.out.println(phone.toString());
  //  System.out.println(adress.toString());

  //  contact.showContactDetails(name);
   
   // System.out.println(contact.getContactSize());
   //  System.out.println(contact.toString()); 
   // contact.printContactList();
   //  contact.showContact();
    
 }   
}

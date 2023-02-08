package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.List;

import Homework.hw007.contact.EmailContact;
import Homework.hw007.task007.model.contacts.AdressContacType;
import Homework.hw007.task007.model.contacts.ContactType;
import Homework.hw007.task007.model.contacts.EmailContactType;
import Homework.hw007.task007.model.contacts.TelegramContactType;
import Homework.hw007.task007.model.contacts.UserContact;
import Homework.hw007.task007.model.contacts.VkPageContactType;
import Homework.hw007.task007.model.user.OrganizationContactName;
import Homework.hw007.task007.model.user.PersonContactName;
import Homework.hw007.task007.view.ContactsView;

public class Main {
  public static void main(String[] args) {
    PersonContactName name = new PersonContactName("Nikita", 1, "Kozlov");
    PersonContactName name2 = new PersonContactName("Kirill", 2, "Petrov");

    OrganizationContactName company1 = new OrganizationContactName(3, "Apple", "780571122");

    ContactType<String> phone = new ContactType<>();
    phone.setContact("home phone", "12345");
    phone.setContact("mobile phone", "89119991122");

    AdressContacType adress = new AdressContacType();
    adress.setContact("home adress", adress.setAdress("Russia", "SPb", "Nevskiy", "1", "5"));
    adress.setContact("job adress", adress.setAdress("Finland", "Helsinki", "Malminkatu", "5A", "10"));

    TelegramContactType telegram = new TelegramContactType();
    telegram.setContact("telegram", "n_kozlov");

    VkPageContactType vkPage = new VkPageContactType();
    vkPage.setContact("home page", "n_kozlov");

    EmailContactType email = new EmailContactType();
    email.setContact("private email", email.setEmail("n_kozlov", "gmail.com"));
    

    ContactType<String> company1Phone = new ContactType<>();
    company1Phone.setContact("office phone", "88127772211");
    company1Phone.setContact("fax", "88127772211");


    UserContact userContact = new UserContact();
    userContact.addUserContact(name, adress);
    userContact.addUserContact(name, phone);
    userContact.addUserContact(name, telegram);
    userContact.addUserContact(name, vkPage);
    userContact.addUserContact(name, email);


    userContact.addUserContact(name2, adress);
    userContact.addUserContact(name2, phone);
    userContact.addUserContact(company1, company1Phone);

    ContactsView view = new ContactsView();
    // view.printContactsNames(userContact);
    view.printChosenContact(name, userContact);
    // view.printAllContacts(userContact);
    // userContact.printUserContacts();


    System.out.println("***********************************");

    // adress.setContact("home adress", "NY");
    // userContact.addUserContact(name2, adress);

    // userContact.printUserContacts();

  }
}

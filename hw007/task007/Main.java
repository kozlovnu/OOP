package Homework.hw007.task007;

import Homework.hw007.task007.model.PersonContactName;

public class Main {
 public static void main(String[] args) {
    PersonContactName name = new PersonContactName("Nikita", 1, "Kozlov");
    
    ContactServise contact = new ContactServise(null, null);
    contact.setName(name);
    ContactType phone = new ContactType();
    phone.setContact("12345");
    phone.setContact("89119991122");
    contact.setPhone(phone);

   ContactType adress = new AdressContacType();
   adress.setContact("Spb");
   adress.setContact("Moscow");
   contact.setPhone(adress);


    System.out.println(contact.getPhone());
    System.out.println(contact.toString()); 
    
 }   
}

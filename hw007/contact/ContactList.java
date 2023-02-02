package Homework.hw007.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    List<ContactMethod> contactList = new ArrayList<>();
    AdressContact adress;
    EmailContact email;
    PhoneNumberContact phoneNumber;
    TelegramContact telegram;
    VkPageContact vkPage;
    
    

    public ContactList(List<ContactMethod> contactList) {
        this.contactList = contactList;
    }

    public List<ContactMethod> getContactList() {
        return contactList;
    }

    public List<ContactMethod> fillList(){
        contactList.add(adress);
        contactList.add(email);
        contactList.add(phoneNumber);
        contactList.add(telegram);
        contactList.add(vkPage);
        
        return contactList;
    }

    public void setContactList(List<ContactMethod> contactList) {
        this.contactList = contactList;
    }

    public void setAdress(AdressContact adress) {
        this.adress = adress;
    }

    public void setEmail(EmailContact email) {
        this.email = email;
    }

    public void setPhoneNumber(PhoneNumberContact phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTelegram(TelegramContact telegram) {
        this.telegram = telegram;
    }

    public void setVkPage(VkPageContact vkPage) {
        this.vkPage = vkPage;
    }

    public AdressContact getAdress() {
        return adress;
    }

    public EmailContact getEmail() {
        return email;
    }

    public PhoneNumberContact getPhoneNumber() {
        return phoneNumber;
    }

    public TelegramContact getTelegram() {
        return telegram;
    }

    public VkPageContact getVkPage() {
        return vkPage;
    }
}

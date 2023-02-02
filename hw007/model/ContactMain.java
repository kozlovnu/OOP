package Homework.hw007.model;

import Homework.hw007.contact.AdressContact;
import Homework.hw007.contact.EmailContact;
import Homework.hw007.contact.PhoneNumberContact;
import Homework.hw007.contact.TelegramContact;
import Homework.hw007.contact.VkPageContact;

public class ContactMain {
    private ContactName name;
    private AdressContact adress;
    private EmailContact email;
    private PhoneNumberContact phoneNumber;
    private TelegramContact telegram;
    private VkPageContact vkPage;
    public ContactMain(ContactName name, AdressContact adress, EmailContact email, PhoneNumberContact phoneNumber,
            TelegramContact telegram, VkPageContact vkPage) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.telegram = telegram;
        this.vkPage = vkPage;
    }
    public ContactName getName() {
        return name;
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

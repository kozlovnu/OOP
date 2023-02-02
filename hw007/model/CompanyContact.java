package Homework.hw007.model;

import Homework.hw007.contact.AdressContact;
import Homework.hw007.contact.EmailContact;
import Homework.hw007.contact.PhoneNumberContact;
import Homework.hw007.contact.TelegramContact;
import Homework.hw007.contact.VkPageContact;

public class CompanyContact extends ContactName {

    private String taxpayerId = null;
    private String legalAdress = null;

    // public CompanyContact(String name, String taxpayerId, String legalAdress, PhoneNumberContact phoneNumber,
    //         EmailContact email, TelegramContact telegram,
    //         VkPageContact vkPage, AdressContact adress) {
    //     super(name, phoneNumber, email, telegram, vkPage, adress);
    //     this.taxpayerId = taxpayerId;
    //     this.legalAdress = legalAdress;
    // }

    public CompanyContact(int id, String name, String taxpayerId, String legalAdress) {
        super(id, name);
        this.taxpayerId = taxpayerId;
        this.legalAdress = legalAdress;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    public String getLegalAdress() {
        return legalAdress;
    }

    public void setLegalAdress(String legalAdress) {
        this.legalAdress = legalAdress;
    }

}

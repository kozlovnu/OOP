package Homework.hw007.model.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdressContacType extends ContactType<String> {

    @Override
    public Map<String, String> getContact() {
        return super.getContact();
    }

    @Override
    public String getContactType() {
        return super.getContactType();
    }

    public String setAdress(String country, String city, String street, String builging, String apartment) {
        List<String> adress = new ArrayList<>();
        adress.add(country);
        adress.add(city);
        adress.add(street);
        adress.add(builging);
        adress.add(apartment);
        return adress.toString();
    }

    @Override
    public Map<String, String> setContact(String contactType, String details) {
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

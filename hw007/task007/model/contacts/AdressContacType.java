package Homework.hw007.task007.model.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdressContacType extends ContactType<List<String>> {

    @Override
    public Map<String, List<String>> getContact() {
        // TODO Auto-generated method stub
        return super.getContact();
    }

    @Override
    public String getContactType() {
        // TODO Auto-generated method stub
        return super.getContactType();
    }

    public List<String> setAdress(String country, String city, String street, String builging, String apartment) {
        List<String> adress = new ArrayList<>();
        adress.add(country);
        adress.add(city);
        adress.add(street);
        adress.add(builging);
        adress.add(apartment);
        return adress;
    }

    @Override
    public Map<String, List<String>> setContact(String contactType, List<String> details) {
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

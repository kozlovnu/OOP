package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdressContacType extends ContactType {
    private String contactType;

    List<String> detailsList;
    private Map<String, List<String>> contact;




    public AdressContacType() {
        // this.contactType = contactType;
        this.detailsList = new ArrayList<>();
        this.contact = new HashMap<>();
    }

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

    @Override
    public List<String> getDetailsList() {
        // TODO Auto-generated method stub
        return super.getDetailsList();
    }



    @Override
    public Map<String, List<String>> setContact(String contactType, String details) {
        // TODO Auto-generated method stub
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
